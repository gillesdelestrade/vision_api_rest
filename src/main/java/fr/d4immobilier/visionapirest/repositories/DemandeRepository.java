package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Demande;
import jakarta.ejb.Stateless;

@Stateless
public class DemandeRepository extends GenericRepository<Demande, Long> {
    
    @Override
    protected Class<Demande> getEntityClass() {
        return Demande.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
