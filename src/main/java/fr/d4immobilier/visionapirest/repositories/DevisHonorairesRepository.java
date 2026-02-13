package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.DevisHonoraires;
import jakarta.ejb.Stateless;

@Stateless
public class DevisHonorairesRepository extends GenericRepository<DevisHonoraires, Long> {
    
    @Override
    protected Class<DevisHonoraires> getEntityClass() {
        return DevisHonoraires.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
