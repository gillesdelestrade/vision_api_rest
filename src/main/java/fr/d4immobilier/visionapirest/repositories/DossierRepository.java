package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Dossier;
import jakarta.ejb.Stateless;

@Stateless
public class DossierRepository extends GenericRepository<Dossier, Long> {
    
    @Override
    protected Class<Dossier> getEntityClass() {
        return Dossier.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
