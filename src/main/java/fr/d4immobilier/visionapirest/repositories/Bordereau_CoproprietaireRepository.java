package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Bordereau_Coproprietaire;
import jakarta.ejb.Stateless;

@Stateless
public class Bordereau_CoproprietaireRepository extends GenericRepository<Bordereau_Coproprietaire, Long> {
    
    @Override
    protected Class<Bordereau_Coproprietaire> getEntityClass() {
        return Bordereau_Coproprietaire.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
