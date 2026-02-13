package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.ARappelerEnvoiMail;
import jakarta.ejb.Stateless;

@Stateless
public class ARappelerEnvoiMailRepository extends GenericRepository<ARappelerEnvoiMail, Long> {
    
    @Override
    protected Class<ARappelerEnvoiMail> getEntityClass() {
        return ARappelerEnvoiMail.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
