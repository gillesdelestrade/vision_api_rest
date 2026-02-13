package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.BoiteArchive;
import jakarta.ejb.Stateless;

@Stateless
public class BoiteArchiveRepository extends GenericRepository<BoiteArchive, Long> {
    
    @Override
    protected Class<BoiteArchive> getEntityClass() {
        return BoiteArchive.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
