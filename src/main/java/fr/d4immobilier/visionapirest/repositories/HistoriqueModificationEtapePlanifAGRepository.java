package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.HistoriqueModificationEtapePlanifAG;
import jakarta.ejb.Stateless;

@Stateless
public class HistoriqueModificationEtapePlanifAGRepository extends GenericRepository<HistoriqueModificationEtapePlanifAG, Long> {
    
    @Override
    protected Class<HistoriqueModificationEtapePlanifAG> getEntityClass() {
        return HistoriqueModificationEtapePlanifAG.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
