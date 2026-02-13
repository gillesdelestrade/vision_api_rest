package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CoproprietaireCopropriete;
import jakarta.ejb.Stateless;

@Stateless
public class CoproprietaireCoproprieteRepository extends GenericRepository<CoproprietaireCopropriete, Long> {
    
    @Override
    protected Class<CoproprietaireCopropriete> getEntityClass() {
        return CoproprietaireCopropriete.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
