package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.DestinataireCourrier;
import jakarta.ejb.Stateless;

@Stateless
public class DestinataireCourrierRepository extends GenericRepository<DestinataireCourrier, Long> {
    
    @Override
    protected Class<DestinataireCourrier> getEntityClass() {
        return DestinataireCourrier.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
