package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Iban;
import jakarta.ejb.Stateless;

@Stateless
public class IbanRepository extends GenericRepository<Iban, Long> {
    
    @Override
    protected Class<Iban> getEntityClass() {
        return Iban.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
