package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Copropriete;
import jakarta.ejb.Stateless;
import java.util.List;
import java.util.Optional;

@Stateless
public class CoproprieteRepository extends GenericRepository<Copropriete, Long> {

    @Override
    protected Class<Copropriete> getEntityClass() {
        return Copropriete.class;
    }

    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
    /**
     * Trouve les copropriétés clientes gérées par un gestionnaire (gestionnaire
     * principal, sédentaire ou comptable)
     *
     * @param gestionnaireId
     * @return
     */
    public List<Copropriete> findClientsByGestionnaireId(Long gestionnaireId) {
        return em.createQuery(
                "SELECT DISTINCT c FROM Copropriete c "
                + "LEFT JOIN FETCH c.adresse "
                + "LEFT JOIN FETCH c.gestionnaire "
                + "LEFT JOIN FETCH c.gestionnaireSedentaire "
                + "LEFT JOIN FETCH c.comptable "
                + "WHERE c.statutCopropriete = :statut "
                + "AND (c.gestionnaire.id = :id "
                + "     OR c.gestionnaireSedentaire.id = :id "
                + "     OR c.comptable.id = :id) "
                + "ORDER BY c.trigramme ASC",
                Copropriete.class)
                .setParameter("statut", fr.d4immobilier.visionapirest.entities.StatutCopropriete.client)
                .setParameter("id", gestionnaireId)
                .getResultList();
    }

    /**
     * Méthode optimisée pour charger avec l'adresse ET les gestionnaires
     * (EAGER)
     */
    public Optional<Copropriete> findByIdWithAdresse(Long id) {
        try {
            Copropriete copropriete = em.createQuery(
                    "SELECT c FROM Copropriete c "
                    + "LEFT JOIN FETCH c.adresse "
                    + "LEFT JOIN FETCH c.gestionnaire "
                    + "LEFT JOIN FETCH c.gestionnaireSedentaire "
                    + "LEFT JOIN FETCH c.comptable "
                    + "WHERE c.id = :id", Copropriete.class)
                    .setParameter("id", id)
                    .getSingleResult();
            return Optional.of(copropriete);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    /**
     * SURCHARGE pour findAll() aussi
     */
    @Override
    public List<Copropriete> findAll() {
        return em.createQuery(
                "SELECT DISTINCT c FROM Copropriete c "
                + "LEFT JOIN FETCH c.adresse "
                + "LEFT JOIN FETCH c.gestionnaire "
                + "LEFT JOIN FETCH c.gestionnaireSedentaire "
                + "LEFT JOIN FETCH c.comptable "
                + "ORDER BY c.trigramme ASC", Copropriete.class)
                .getResultList();
    }

    /**
     * Liste toutes les copropriétés avec adresse
     */
    public List<Copropriete> findAllWithAdresse() {
        return findAll(); // Utilise maintenant la version surchargée qui charge tout
    }

    /**
     * Trouve les copropriétés clientes NON gérées par un gestionnaire
     */
    public List<Copropriete> findClientsNonGeresByGestionnaireId(Long gestionnaireId) {
        return em.createQuery(
                "SELECT DISTINCT c FROM Copropriete c "
                + "LEFT JOIN FETCH c.adresse "
                + "LEFT JOIN FETCH c.gestionnaire "
                + "LEFT JOIN FETCH c.gestionnaireSedentaire "
                + "LEFT JOIN FETCH c.comptable "
                + "WHERE c.statutCopropriete = :statut "
                + "AND (c.gestionnaire.id != :id OR c.gestionnaire IS NULL) "
                + "AND (c.gestionnaireSedentaire.id != :id OR c.gestionnaireSedentaire IS NULL) "
                + "AND (c.comptable.id != :id OR c.comptable IS NULL) "
                + "ORDER BY c.trigramme ASC",
                Copropriete.class)
                .setParameter("statut", fr.d4immobilier.visionapirest.entities.StatutCopropriete.client)
                .setParameter("id", gestionnaireId)
                .getResultList();
    }
}
