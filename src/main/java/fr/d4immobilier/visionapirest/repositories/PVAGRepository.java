package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.PVAG;
import jakarta.ejb.Stateless;

@Stateless
public class PVAGRepository extends GenericRepository<PVAG, Long> {
    
    @Override
    protected Class<PVAG> getEntityClass() {
        return PVAG.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
