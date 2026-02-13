package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.BordereauDeRemiseDeCheque;
import jakarta.ejb.Stateless;

@Stateless
public class BordereauDeRemiseDeChequeRepository extends GenericRepository<BordereauDeRemiseDeCheque, Long> {
    
    @Override
    protected Class<BordereauDeRemiseDeCheque> getEntityClass() {
        return BordereauDeRemiseDeCheque.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
