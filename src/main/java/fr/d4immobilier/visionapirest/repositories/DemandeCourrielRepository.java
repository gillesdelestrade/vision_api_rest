package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.DemandeCourriel;
import jakarta.ejb.Stateless;

@Stateless
public class DemandeCourrielRepository extends GenericRepository<DemandeCourriel, Long> {
    
    @Override
    protected Class<DemandeCourriel> getEntityClass() {
        return DemandeCourriel.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
