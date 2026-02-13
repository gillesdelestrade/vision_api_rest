package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.EtapeConsigne;
import jakarta.ejb.Stateless;

@Stateless
public class EtapeConsigneRepository extends GenericRepository<EtapeConsigne, Long> {
    
    @Override
    protected Class<EtapeConsigne> getEntityClass() {
        return EtapeConsigne.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
