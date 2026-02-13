package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.CodeBanqueCMC7;
import jakarta.ejb.Stateless;

@Stateless
public class CodeBanqueCMC7Repository extends GenericRepository<CodeBanqueCMC7, Long> {
    
    @Override
    protected Class<CodeBanqueCMC7> getEntityClass() {
        return CodeBanqueCMC7.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
