package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.PreuveDeDepotALaPoste;
import jakarta.ejb.Stateless;

@Stateless
public class PreuveDeDepotALaPosteRepository extends GenericRepository<PreuveDeDepotALaPoste, Long> {
    
    @Override
    protected Class<PreuveDeDepotALaPoste> getEntityClass() {
        return PreuveDeDepotALaPoste.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
