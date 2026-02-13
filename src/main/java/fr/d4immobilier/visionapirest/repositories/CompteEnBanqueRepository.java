package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CompteEnBanque;
import jakarta.ejb.Stateless;

@Stateless
public class CompteEnBanqueRepository extends GenericRepository<CompteEnBanque, Long> {
    
    @Override
    protected Class<CompteEnBanque> getEntityClass() {
        return CompteEnBanque.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
