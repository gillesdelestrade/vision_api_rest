package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.entities.MotNiPertinentNiPasPertinent;
import jakarta.ejb.Stateless;

@Stateless
public class MotNiPertinentNiPasPertinentRepository extends GenericRepository<MotNiPertinentNiPasPertinent, Long> {
    
    @Override
    protected Class<MotNiPertinentNiPasPertinent> getEntityClass() {
        return MotNiPertinentNiPasPertinent.class;
    }
    
    // Ajoutez ici des méthodes de recherche spécifiques si nécessaire
}
