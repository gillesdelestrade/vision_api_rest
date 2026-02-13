package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Banque;
import jakarta.ejb.Stateless;

@Stateless
public class BanqueRepository extends GenericRepository<Banque, Long> {
    
    @Override
    protected Class<Banque> getEntityClass() {
        return Banque.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
