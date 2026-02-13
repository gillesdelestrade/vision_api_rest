package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Bordereau;
import jakarta.ejb.Stateless;

@Stateless
public class BordereauRepository extends GenericRepository<Bordereau, Long> {
    
    @Override
    protected Class<Bordereau> getEntityClass() {
        return Bordereau.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
