package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CoproprietairePersonne;
import jakarta.ejb.Stateless;

@Stateless
public class CoproprietairePersonneRepository extends GenericRepository<CoproprietairePersonne, Long> {
    
    @Override
    protected Class<CoproprietairePersonne> getEntityClass() {
        return CoproprietairePersonne.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
