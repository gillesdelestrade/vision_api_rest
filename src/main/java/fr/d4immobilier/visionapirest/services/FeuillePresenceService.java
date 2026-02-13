package fr.d4immobilier.visionapirest.services;

import fr.d4immobilier.visionapirest.dto.FeuillePresenceDTO;
import fr.d4immobilier.visionapirest.dto.FeuillePresenceDTO.*;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.*;

@Stateless
public class FeuillePresenceService {

    @PersistenceContext
    private EntityManager em;

    private static final long TYPE_TANTIEME_GENERAL = 688801L;

    public FeuillePresenceDTO getFeuillePresence(Long coproprieteId) {

        // 1. Récupérer tous les tantièmes généraux avec lots et copropriétaires
        // Reproduit la requête SQL du TantiemeDAO.getTantiemes(copropriete, null)
        String sql = "SELECT TANTIEME.ID, TANTIEME.QUOTEPART, "
                + "LOT.ID, LOT.NATURE, LOT.NUMERODELOT, "
                + "coproprietaires_ID "
                + "FROM (LOT INNER JOIN LOT_COPROPRIETAIRE ON LOT.ID = LOT_COPROPRIETAIRE.lots_ID) "
                + "INNER JOIN TANTIEME ON LOT.ID = TANTIEME.LOT_ID "
                + "WHERE LOT.COPROPRIETE_ID = ?1 AND TYPETANTIEME_ID = ?2";

        List<Object[]> tantiemesRows = em.createNativeQuery(sql)
                .setParameter(1, coproprieteId)
                .setParameter(2, TYPE_TANTIEME_GENERAL)
                .getResultList();

        // Map : coproprietaireId -> Map<lotId, LotTantiemeDTO>
        LinkedHashMap<Long, LinkedHashMap<Long, LotTantiemeDTO>> mapCoproLots = new LinkedHashMap<>();
        // Map : coproprietaireId -> totalTantiemes
        HashMap<Long, Integer> mapTotaux = new HashMap<>();
        int totalTantiemesGlobal = 0;

        for (Object[] row : tantiemesRows) {
            Double quotePart = (Double) row[1];
            int qp = quotePart != null ? quotePart.intValue() : 0;
            Long lotId = (Long) row[2];
            String nature = row[3] != null ? (String) row[3] : "";
            String numeroDeLot = (String) row[4];
            Long coproprietaireId = (Long) row[5];

            totalTantiemesGlobal += qp;

            // Lots par copropriétaire
            mapCoproLots.computeIfAbsent(coproprietaireId, k -> new LinkedHashMap<>());
            LinkedHashMap<Long, LotTantiemeDTO> lotsMap = mapCoproLots.get(coproprietaireId);

            if (!lotsMap.containsKey(lotId)) {
                LotTantiemeDTO lotDto = new LotTantiemeDTO();
                lotDto.setId(lotId);
                lotDto.setNature(nature);
                lotDto.setNumeroDeLot(numeroDeLot);
                lotDto.setTantiemesGeneraux(qp);
                lotsMap.put(lotId, lotDto);
            }

            // Total par copropriétaire
            mapTotaux.merge(coproprietaireId, qp, Integer::sum);
        }

        // 2. Récupérer les infos des copropriétaires (nom, type, titre)
        HashMap<Long, CoproprietairePresenceDTO> mapCopros = getCoproprietairesInfos(mapCoproLots.keySet());

        // 3. Récupérer les adresses
        HashMap<Long, AdressePresenceDTO> mapAdresses = getAdressesCoproprietaires(coproprieteId);

        // 4. Assembler
        List<CoproprietairePresenceDTO> coproprietaires = new ArrayList<>();

        for (Long coproId : mapCoproLots.keySet()) {
            CoproprietairePresenceDTO dto = mapCopros.get(coproId);
            if (dto == null) {
                dto = new CoproprietairePresenceDTO();
                dto.setId(coproId);
                dto.setNom("Inconnu");
                dto.setType("INCONNU");
            }

            dto.setLots(new ArrayList<>(mapCoproLots.get(coproId).values()));
            dto.setTotalTantiemes(mapTotaux.getOrDefault(coproId, 0));
            dto.setAdresse(mapAdresses.get(coproId));

            coproprietaires.add(dto);
        }

        // Trier par nom
        coproprietaires.sort(Comparator.comparing(
                CoproprietairePresenceDTO::getNom,
                Comparator.nullsLast(String.CASE_INSENSITIVE_ORDER)
        ));

        // 5. Construire le résultat
        FeuillePresenceDTO result = new FeuillePresenceDTO();
        result.setCoproprietaires(coproprietaires);
        result.setTotalCoproprietaires(coproprietaires.size());
        result.setTotalTantiemes(totalTantiemesGlobal);

        return result;
    }

    /**
     * Récupère nom, type et titre de chaque copropriétaire
     */
    private HashMap<Long, CoproprietairePresenceDTO> getCoproprietairesInfos(Set<Long> ids) {
        HashMap<Long, CoproprietairePresenceDTO> map = new HashMap<>();
        if (ids.isEmpty()) {
            return map;
        }

        // Construire la liste d'IDs pour la requête
        StringBuilder inClause = new StringBuilder();
        for (Long id : ids) {
            if (inClause.length() > 0) {
                inClause.append(",");
            }
            inClause.append(id);
        }

        String sql = "SELECT COPROPRIETAIRE.ID, COPROPRIETAIRE.DTYPE, "
                + "PERSONNE.NOM, PERSONNE.PRENOM, PERSONNE.TITRE, "
                + "SOCIETE.RAISONSOCIALE, SOCIETE.FORMEJURIDIQUE, "
                + "COPROPRIETE.NOM "
                + "FROM ((COPROPRIETAIRE "
                + "LEFT JOIN PERSONNE ON COPROPRIETAIRE.PERSONNE_ID = PERSONNE.ID) "
                + "LEFT JOIN SOCIETE ON COPROPRIETAIRE.SOCIETE_ID = SOCIETE.ID) "
                + "LEFT JOIN COPROPRIETE ON COPROPRIETAIRE.COPROPRIETE_ID = COPROPRIETE.ID "
                + "WHERE COPROPRIETAIRE.ID IN (" + inClause + ")";

        List<Object[]> rows = em.createNativeQuery(sql).getResultList();

        for (Object[] row : rows) {
            CoproprietairePresenceDTO dto = new CoproprietairePresenceDTO();
            dto.setId((Long) row[0]);
            String dtype = (String) row[1];

            if ("CoproprietairePersonne".equals(dtype)) {
                String nom = row[2] != null ? ((String) row[2]).trim() : "";
                String prenom = row[3] != null ? ((String) row[3]).trim() : "";
                dto.setNom(nom + " " + prenom);
                dto.setTitre(row[4] != null ? (String) row[4] : null);
                dto.setType("PERSONNE");
            } else if ("CoproprietaireSociete".equals(dtype)) {
                String forme = row[6] != null ? (String) row[6] + " " : "";
                String raison = row[5] != null ? ((String) row[5]).trim() : "";
                dto.setNom(forme + raison);
                dto.setType("SOCIETE");
            } else if ("CoproprietaireCopropriete".equals(dtype)) {
                dto.setNom(row[7] != null ? (String) row[7] : "");
                dto.setType("COPROPRIETE");
            }

            map.put(dto.getId(), dto);
        }

        return map;
    }

    /**
     * Récupère les adresses de tous les copropriétaires d'une copropriété
     * Reproduit la logique de AdresseDAO.getAdressesCoproprietaires()
     */
    private HashMap<Long, AdressePresenceDTO> getAdressesCoproprietaires(Long coproprieteId) {
        HashMap<Long, AdressePresenceDTO> map = new HashMap<>();

        String sql = "SELECT COPROPRIETAIRE.ID, "
                + "ADRESSEP.NUMERODANSLAVOIE, ADRESSEP.TYPEDEVOIE, ADRESSEP.VOIE, "
                + "ADRESSEP.COMPLEMENTADRESSE, ADRESSEP.CODEPOSTAL, ADRESSEP.VILLE, "
                + "ADRESSES.NUMERODANSLAVOIE, ADRESSES.TYPEDEVOIE, ADRESSES.VOIE, "
                + "ADRESSES.COMPLEMENTADRESSE, ADRESSES.CODEPOSTAL, ADRESSES.VILLE, "
                + "ADRESSEC.NUMERODANSLAVOIE, ADRESSEC.TYPEDEVOIE, ADRESSEC.VOIE, "
                + "ADRESSEC.COMPLEMENTADRESSE, ADRESSEC.CODEPOSTAL, ADRESSEC.VILLE "
                + "FROM (LOT INNER JOIN (LOT_COPROPRIETAIRE INNER JOIN "
                + "(((COPROPRIETAIRE "
                + "LEFT JOIN (PERSONNE INNER JOIN ADRESSE AS ADRESSEP ON ADRESSEP.ID = PERSONNE.ADRESSE_ID) "
                + "ON COPROPRIETAIRE.PERSONNE_ID = PERSONNE.ID) "
                + "LEFT JOIN (SOCIETE INNER JOIN ADRESSE AS ADRESSES ON ADRESSES.ID = SOCIETE.ADRESSE_ID) "
                + "ON SOCIETE.ID = COPROPRIETAIRE.SOCIETE_ID) "
                + "LEFT JOIN (COPROPRIETE INNER JOIN ADRESSE AS ADRESSEC "
                + "ON COPROPRIETE.ADRESSE_ID = ADRESSEC.ID) "
                + "ON COPROPRIETAIRE.COPROPRIETE_ID = COPROPRIETE.ID) "
                + "ON LOT_COPROPRIETAIRE.coproprietaires_ID = COPROPRIETAIRE.ID) "
                + "ON LOT.ID = LOT_COPROPRIETAIRE.lots_ID) "
                + "WHERE LOT.COPROPRIETE_ID = ?1";

        List<Object[]> rows = em.createNativeQuery(sql)
                .setParameter(1, coproprieteId)
                .getResultList();

        for (Object[] row : rows) {
            Long id = (Long) row[0];
            if (map.containsKey(id)) {
                continue; // Déjà traité
            }
            AdressePresenceDTO adresse = new AdressePresenceDTO();

            // Priorité : Personne > Société > Copropriété
            if (row[1] != null || row[3] != null) {
                // Adresse personne
                adresse.setNumeroDansLaVoie(str(row[1]));
                adresse.setTypeDeVoie(typeDeVoieToString(row[2]));
                adresse.setVoie(str(row[3]));
                adresse.setComplementAdresse(str(row[4]));
                adresse.setCodePostal(str(row[5]));
                adresse.setVille(str(row[6]));
            } else if (row[7] != null || row[9] != null) {
                // Adresse société
                adresse.setNumeroDansLaVoie(str(row[7]));
                adresse.setTypeDeVoie(typeDeVoieToString(row[8]));
                adresse.setVoie(str(row[9]));
                adresse.setComplementAdresse(str(row[10]));
                adresse.setCodePostal(str(row[11]));
                adresse.setVille(str(row[12]));
            } else if (row[13] != null || row[15] != null) {
                // Adresse copropriété
                adresse.setNumeroDansLaVoie(str(row[13]));
                adresse.setTypeDeVoie(typeDeVoieToString(row[14]));
                adresse.setVoie(str(row[15]));
                adresse.setComplementAdresse(str(row[16]));
                adresse.setCodePostal(str(row[17]));
                adresse.setVille(str(row[18]));
            }

            map.put(id, adresse);
        }

        return map;
    }

    private String str(Object o) {
        return o != null ? ((String) o).trim() : "";
    }

    /**
     * Convertit le typeDeVoie (index enum) en libellé lisible
     */
    private String typeDeVoieToString(Object typeDeVoie) {
        if (typeDeVoie == null) {
            return "";
        }
        int index = ((Number) typeDeVoie).intValue();
        // Correspondance avec votre enum TypeDeVoie

        String[] types = {
            "rue", //0
            "boulevard", //1
            "avenue", //2
            "traverse", //3
            "chemin", //4
            "impasse", //5
            "allee", //6
            "quartier", //7
            "route", //8
            "lotissement", //9
            "montee", //10
            "cours", //11
            "promenade", //12
            "place", //13
            "quai", //14
            "faubourg", //15
            "", //16
            "allees", //17
            "passage"
        };

        if (index >= 0 && index < types.length) {
            return types[index];
        }
        return "";
    }
}
