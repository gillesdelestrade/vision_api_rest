package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Consigne;
import jakarta.ejb.Stateless;

@Stateless
public class ConsigneRepository extends GenericRepository<Consigne, Long> {
    
    @Override
    protected Class<Consigne> getEntityClass() {
        return Consigne.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
