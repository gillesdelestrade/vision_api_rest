package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.RejetPrelevement;
import jakarta.ejb.Stateless;

@Stateless
public class RejetPrelevementRepository extends GenericRepository<RejetPrelevement, Long> {
    
    @Override
    protected Class<RejetPrelevement> getEntityClass() {
        return RejetPrelevement.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
