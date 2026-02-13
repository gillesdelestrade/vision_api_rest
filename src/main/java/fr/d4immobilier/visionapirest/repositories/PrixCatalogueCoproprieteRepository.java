package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.PrixCatalogueCopropriete;
import jakarta.ejb.Stateless;

@Stateless
public class PrixCatalogueCoproprieteRepository extends GenericRepository<PrixCatalogueCopropriete, Long> {
    
    @Override
    protected Class<PrixCatalogueCopropriete> getEntityClass() {
        return PrixCatalogueCopropriete.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
