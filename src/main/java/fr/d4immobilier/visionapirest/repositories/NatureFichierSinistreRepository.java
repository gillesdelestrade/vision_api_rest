package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.NatureFichierSinistre;
import jakarta.ejb.Stateless;

@Stateless
public class NatureFichierSinistreRepository extends GenericRepository<NatureFichierSinistre, Long> {
    
    @Override
    protected Class<NatureFichierSinistre> getEntityClass() {
        return NatureFichierSinistre.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
