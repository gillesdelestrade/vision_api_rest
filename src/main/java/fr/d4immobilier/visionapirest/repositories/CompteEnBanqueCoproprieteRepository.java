package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CompteEnBanqueCopropriete;
import jakarta.ejb.Stateless;

@Stateless
public class CompteEnBanqueCoproprieteRepository extends GenericRepository<CompteEnBanqueCopropriete, Long> {
    
    @Override
    protected Class<CompteEnBanqueCopropriete> getEntityClass() {
        return CompteEnBanqueCopropriete.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
