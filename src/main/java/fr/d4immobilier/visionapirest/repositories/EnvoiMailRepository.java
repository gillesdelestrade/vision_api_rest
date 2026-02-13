package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.EnvoiMail;
import jakarta.ejb.Stateless;

@Stateless
public class EnvoiMailRepository extends GenericRepository<EnvoiMail, Long> {
    
    @Override
    protected Class<EnvoiMail> getEntityClass() {
        return EnvoiMail.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
