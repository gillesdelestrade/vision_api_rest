package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Etiquette;
import jakarta.ejb.Stateless;

@Stateless
public class EtiquetteRepository extends GenericRepository<Etiquette, Long> {
    
    @Override
    protected Class<Etiquette> getEntityClass() {
        return Etiquette.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
