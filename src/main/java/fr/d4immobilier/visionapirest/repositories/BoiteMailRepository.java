package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.BoiteMail;
import jakarta.ejb.Stateless;

@Stateless
public class BoiteMailRepository extends GenericRepository<BoiteMail, Long> {
    
    @Override
    protected Class<BoiteMail> getEntityClass() {
        return BoiteMail.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
