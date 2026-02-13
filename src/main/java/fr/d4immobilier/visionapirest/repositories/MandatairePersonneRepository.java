package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.MandatairePersonne;
import jakarta.ejb.Stateless;

@Stateless
public class MandatairePersonneRepository extends GenericRepository<MandatairePersonne, Long> {
    
    @Override
    protected Class<MandatairePersonne> getEntityClass() {
        return MandatairePersonne.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
