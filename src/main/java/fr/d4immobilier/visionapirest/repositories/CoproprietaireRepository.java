package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.dto.CoproprietaireRechercheDTO;
import fr.d4immobilier.visionapirest.dto.CoproprieteResumeDTO;
import fr.d4immobilier.visionapirest.dto.LotResumeDTO;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.entities.CoproprietairePersonne;
import fr.d4immobilier.visionapirest.entities.CoproprietaireSociete;
import fr.d4immobilier.visionapirest.entities.Lot;
import jakarta.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class CoproprietaireRepository extends GenericRepository<Coproprietaire, Long> {
    
    @Override
    protected Class<Coproprietaire> getEntityClass() {
        return Coproprietaire.class;
    }
    
    /**
 * Recherche les copropriétaires par adresse mail
 */
public List<CoproprietaireRechercheDTO> findByEmail(String email) {
    List<CoproprietaireRechercheDTO> resultats = new ArrayList<>();
    
    // Chercher dans CoproprietairePersonne
    List<CoproprietairePersonne> coproprietairesPersonne = em.createQuery(
        "SELECT cp FROM CoproprietairePersonne cp " +
        "LEFT JOIN FETCH cp.personne " +
        "WHERE LOWER(cp.personne.mail1) = :email",
        CoproprietairePersonne.class)
        .setParameter("email", email.toLowerCase())
        .getResultList();
    
    for (CoproprietairePersonne cp : coproprietairesPersonne) {
        CoproprietaireRechercheDTO dto = new CoproprietaireRechercheDTO();
        dto.setId(cp.getId());
        dto.setNom(cp.getPersonne().getNom() + " " + cp.getPersonne().getPrenom());
        dto.setEmail(cp.getPersonne().getMail1());
        dto.setType("Personne");
        dto.setLots(findLotsWithCopropriete(cp.getId()));
        resultats.add(dto);
    }
    
    // Chercher dans CoproprietaireSociete
    List<CoproprietaireSociete> coproprietairesSociete = em.createQuery(
        "SELECT cs FROM CoproprietaireSociete cs " +
        "LEFT JOIN FETCH cs.societe " +
        "WHERE LOWER(cs.societe.mail1) = :email",
        CoproprietaireSociete.class)
        .setParameter("email", email.toLowerCase())
        .getResultList();
    
    for (CoproprietaireSociete cs : coproprietairesSociete) {
        CoproprietaireRechercheDTO dto = new CoproprietaireRechercheDTO();
        dto.setId(cs.getId());
        dto.setNom(cs.getSociete().getRaisonSociale());
        dto.setEmail(cs.getSociete().getMail1());
        dto.setType("Societe");
        dto.setLots(findLotsWithCopropriete(cs.getId()));
        resultats.add(dto);
    }
    
    return resultats;
}

/**
 * Récupère les lots d'un copropriétaire avec leur copropriété
 */
private List<LotResumeDTO> findLotsWithCopropriete(Long coproprietaireId) {
    List<Object[]> results = em.createQuery(
        "SELECT l.id, l.numeroDeLot, " +
        "       c.id, c.nom, c.trigramme " +
        "FROM Lot l " +
        "JOIN l.copropriete c " +
        "JOIN l.coproprietaires cp " +
        "WHERE cp.id = :coproprietaireId",
        Object[].class)
        .setParameter("coproprietaireId", coproprietaireId)
        .getResultList();
    
    List<LotResumeDTO> lots = new ArrayList<>();
    
    for (Object[] row : results) {
        LotResumeDTO lotDto = new LotResumeDTO();
        lotDto.setId((Long) row[0]);
        lotDto.setNumero((String) row[1]);
        lotDto.setCopropriete(new CoproprieteResumeDTO(
            (Long) row[2],
            (String) row[3],
            (String) row[4]
        ));
        lots.add(lotDto);
    }
    
    return lots;
}
}
