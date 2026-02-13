package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CompteEnBanquePersonne;
import jakarta.ejb.Stateless;

@Stateless
public class CompteEnBanquePersonneRepository extends GenericRepository<CompteEnBanquePersonne, Long> {
    
    @Override
    protected Class<CompteEnBanquePersonne> getEntityClass() {
        return CompteEnBanquePersonne.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
