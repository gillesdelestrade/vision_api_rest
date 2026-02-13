package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.DesistementCheque;
import jakarta.ejb.Stateless;

@Stateless
public class DesistementChequeRepository extends GenericRepository<DesistementCheque, Long> {
    
    @Override
    protected Class<DesistementCheque> getEntityClass() {
        return DesistementCheque.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
