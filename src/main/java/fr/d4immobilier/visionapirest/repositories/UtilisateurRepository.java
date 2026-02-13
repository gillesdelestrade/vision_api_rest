package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.Utilisateur;
import jakarta.ejb.Stateless;

@Stateless
public class UtilisateurRepository extends GenericRepository<Utilisateur, Long> {
    
    @Override
    protected Class<Utilisateur> getEntityClass() {
        return Utilisateur.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
