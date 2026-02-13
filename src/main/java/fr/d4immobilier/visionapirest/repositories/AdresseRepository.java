package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Adresse;
import jakarta.ejb.Stateless;

@Stateless
public class AdresseRepository extends GenericRepository<Adresse, Long> {
    
    @Override
    protected Class<Adresse> getEntityClass() {
        return Adresse.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
