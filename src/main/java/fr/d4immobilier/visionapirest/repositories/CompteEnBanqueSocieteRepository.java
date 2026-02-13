package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CompteEnBanqueSociete;
import jakarta.ejb.Stateless;

@Stateless
public class CompteEnBanqueSocieteRepository extends GenericRepository<CompteEnBanqueSociete, Long> {
    
    @Override
    protected Class<CompteEnBanqueSociete> getEntityClass() {
        return CompteEnBanqueSociete.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
