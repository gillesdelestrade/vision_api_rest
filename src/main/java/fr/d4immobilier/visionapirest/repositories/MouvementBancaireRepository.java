package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.MouvementBancaire;
import jakarta.ejb.Stateless;

@Stateless
public class MouvementBancaireRepository extends GenericRepository<MouvementBancaire, Long> {
    
    @Override
    protected Class<MouvementBancaire> getEntityClass() {
        return MouvementBancaire.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
