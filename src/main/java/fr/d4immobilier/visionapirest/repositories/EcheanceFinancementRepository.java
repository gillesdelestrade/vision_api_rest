package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.EcheanceFinancement;
import jakarta.ejb.Stateless;

@Stateless
public class EcheanceFinancementRepository extends GenericRepository<EcheanceFinancement, Long> {
    
    @Override
    protected Class<EcheanceFinancement> getEntityClass() {
        return EcheanceFinancement.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
