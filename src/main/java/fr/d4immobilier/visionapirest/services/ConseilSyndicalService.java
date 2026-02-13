package fr.d4immobilier.visionapirest.services;

import fr.d4immobilier.visionapirest.dto.ConseilSyndicalDTO;
import fr.d4immobilier.visionapirest.dto.ConseilSyndicalDTO.BatimentDTO;
import fr.d4immobilier.visionapirest.dto.ConseilSyndicalDTO.MembreConseilDTO;
import fr.d4immobilier.visionapirest.entities.Batiment;
import fr.d4immobilier.visionapirest.entities.ConseilSyndical;
import fr.d4immobilier.visionapirest.entities.Personne;
import fr.d4immobilier.visionapirest.entities.Societe;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class ConseilSyndicalService {

    @PersistenceContext
    private EntityManager em;

    /**
     * Vérifie si une personne est membre du conseil syndical d'une copropriété
     */
    public boolean estAuConseilSyndical(Long personneId, Long coproprieteId) {
        // 1. Président personne
        List<?> result = em.createNativeQuery(
                "SELECT 1 FROM CONSEILSYNDICAL "
                + "WHERE PRESIDENT_ID = ?1 AND COPROPRIETE_ID = ?2")
                .setParameter(1, personneId)
                .setParameter(2, coproprieteId)
                .getResultList();

        if (!result.isEmpty()) {
            return true;
        }

        // 2. Représentant d'une société présidente
        result = em.createNativeQuery(
                "SELECT 1 FROM CONSEILSYNDICAL "
                + "INNER JOIN SOCIETE ON CONSEILSYNDICAL.PRESIDENTSOCIETE_ID = SOCIETE.ID "
                + "WHERE SOCIETE.REPRESENTANT_ID = ?1 AND COPROPRIETE_ID = ?2")
                .setParameter(1, personneId)
                .setParameter(2, coproprieteId)
                .getResultList();

        if (!result.isEmpty()) {
            return true;
        }

        // 3. Membre personne
        result = em.createNativeQuery(
                "SELECT 1 FROM CONSEILSYNDICAL_PERSONNE "
                + "INNER JOIN CONSEILSYNDICAL ON CONSEILSYNDICAL_PERSONNE.conseilsSyndicaux_ID = CONSEILSYNDICAL.ID "
                + "WHERE membres_ID = ?1 AND COPROPRIETE_ID = ?2")
                .setParameter(1, personneId)
                .setParameter(2, coproprieteId)
                .getResultList();

        if (!result.isEmpty()) {
            return true;
        }

        // 4. Représentant d'une société membre
        result = em.createNativeQuery(
                "SELECT 1 FROM CONSEILSYNDICAL_SOCIETE "
                + "INNER JOIN CONSEILSYNDICAL ON CONSEILSYNDICAL_SOCIETE.conseilsSyndicaux_ID = CONSEILSYNDICAL.ID "
                + "INNER JOIN SOCIETE ON CONSEILSYNDICAL_SOCIETE.membresSocietes_ID = SOCIETE.ID "
                + "WHERE REPRESENTANT_ID = ?1 AND COPROPRIETE_ID = ?2")
                .setParameter(1, personneId)
                .setParameter(2, coproprieteId)
                .getResultList();

        return !result.isEmpty();
    }

    /**
     * Vérifie si une société est membre du conseil syndical d'une copropriété
     */
    public boolean estAuConseilSyndicalSociete(Long societeId, Long coproprieteId) {
        // 1. Société présidente
        List<?> result = em.createNativeQuery(
                "SELECT 1 FROM CONSEILSYNDICAL "
                + "WHERE PRESIDENTSOCIETE_ID = ?1 AND COPROPRIETE_ID = ?2")
                .setParameter(1, societeId)
                .setParameter(2, coproprieteId)
                .getResultList();

        if (!result.isEmpty()) {
            return true;
        }

        // 2. Société membre
        result = em.createNativeQuery(
                "SELECT 1 FROM CONSEILSYNDICAL_SOCIETE "
                + "INNER JOIN CONSEILSYNDICAL ON CONSEILSYNDICAL_SOCIETE.conseilsSyndicaux_ID = CONSEILSYNDICAL.ID "
                + "WHERE membresSocietes_ID = ?1 AND COPROPRIETE_ID = ?2")
                .setParameter(1, societeId)
                .setParameter(2, coproprieteId)
                .getResultList();

        return !result.isEmpty();
    }

    public ConseilSyndicalDTO getConseilSyndicalAvecBatiments(Long coproprieteId) {
    // 1. Charger le ConseilSyndical avec le président et les membres Personne
    ConseilSyndical conseil;
    try {
        conseil = em.createQuery(
            "SELECT cs FROM ConseilSyndical cs " +
            "LEFT JOIN FETCH cs.president " +
            "LEFT JOIN FETCH cs.presidentSociete " +
            "LEFT JOIN FETCH cs.membres " +
            "WHERE cs.copropriete.id = :coproprieteId",
            ConseilSyndical.class)
            .setParameter("coproprieteId", coproprieteId)
            .getSingleResult();
    } catch (jakarta.persistence.NoResultException e) {
        return null;
    }
    
    // 2. Charger les membres Societes séparément
    List<Societe> membresSocietes = em.createQuery(
        "SELECT s FROM ConseilSyndical cs " +
        "JOIN cs.membresSocietes s " +
        "WHERE cs.id = :csId",
        Societe.class)
        .setParameter("csId", conseil.getId())
        .getResultList();
    
    System.out.println("conseil : " + conseil);
    
    // 3. Construire le DTO
    MembreConseilDTO president = toMembreDTO(
        conseil.getPresident(), 
        conseil.getPresidentSociete(), 
        coproprieteId
    );
    
    List<MembreConseilDTO> membres = new ArrayList<>();
    
    // Membres Personne (chargés via FETCH JOIN)
    for (Personne p : conseil.getMembres()) {
        membres.add(toMembrePersonneDTO(p, coproprieteId));
    }
    
    // Membres Societe (chargés séparément)
    for (Societe s : membresSocietes) {
        membres.add(toMembreSocieteDTO(s, coproprieteId));
    }
    
    return new ConseilSyndicalDTO(conseil.getId(), president, membres);
}

    private MembreConseilDTO toMembreDTO(Personne personne, Societe societe, Long coproprieteId) {
        if (personne != null) {
            return toMembrePersonneDTO(personne, coproprieteId);
        }
        if (societe != null) {
            return toMembreSocieteDTO(societe, coproprieteId);
        }
        return null;
    }

    private MembreConseilDTO toMembrePersonneDTO(Personne personne, Long coproprieteId) {
        List<BatimentDTO> batiments = em.createQuery(
                "SELECT DISTINCT b FROM CoproprietairePersonne cp "
                + "JOIN cp.lots l "
                + "JOIN l.batiment b "
                + "WHERE cp.personne.id = :personneId "
                + "AND l.copropriete.id = :coproprieteId", Batiment.class)
                .setParameter("personneId", personne.getId())
                .setParameter("coproprieteId", coproprieteId)
                .getResultList()
                .stream()
                .map(b -> new BatimentDTO(b.getId(), b.getLibelle()))
                .toList();

        return new MembreConseilDTO(
                personne.getId(),
                personne.getNom() + " " + personne.getPrenom(),
                "PERSONNE",
                batiments
        );
    }

    private MembreConseilDTO toMembreSocieteDTO(Societe societe, Long coproprieteId) {
        List<BatimentDTO> batiments = em.createQuery(
                "SELECT DISTINCT b FROM CoproprietaireSociete cs "
                + "JOIN cs.lots l "
                + "JOIN l.batiment b "
                + "WHERE cs.societe.id = :societeId "
                + "AND l.copropriete.id = :coproprieteId", Batiment.class)
                .setParameter("societeId", societe.getId())
                .setParameter("coproprieteId", coproprieteId)
                .getResultList()
                .stream()
                .map(b -> new BatimentDTO(b.getId(), b.getLibelle()))
                .toList();

        return new MembreConseilDTO(
                societe.getId(),
                societe.getRaisonSociale(),
                "SOCIETE",
                batiments
        );
    }

}
