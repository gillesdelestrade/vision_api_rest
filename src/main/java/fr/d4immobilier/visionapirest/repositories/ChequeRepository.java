package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Cheque;
import jakarta.ejb.Stateless;

@Stateless
public class ChequeRepository extends GenericRepository<Cheque, Long> {
    
    @Override
    protected Class<Cheque> getEntityClass() {
        return Cheque.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
