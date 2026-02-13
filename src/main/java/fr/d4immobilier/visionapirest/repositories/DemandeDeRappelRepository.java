package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.DemandeDeRappel;
import jakarta.ejb.Stateless;

@Stateless
public class DemandeDeRappelRepository extends GenericRepository<DemandeDeRappel, Long> {
    
    @Override
    protected Class<DemandeDeRappel> getEntityClass() {
        return DemandeDeRappel.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
