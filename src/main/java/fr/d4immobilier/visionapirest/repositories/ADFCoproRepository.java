package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ADFCopro;
import jakarta.ejb.Stateless;

@Stateless
public class ADFCoproRepository extends GenericRepository<ADFCopro, Long> {
    
    @Override
    protected Class<ADFCopro> getEntityClass() {
        return ADFCopro.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
