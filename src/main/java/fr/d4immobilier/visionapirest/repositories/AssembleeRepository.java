package fr.d4immobilier.visionapirest.repositories;

import fr.d4immobilier.visionapirest.dto.AssembleeResumeDTO;
import fr.d4immobilier.visionapirest.entities.Assemblee;
import fr.d4immobilier.visionapirest.entities.Batiment;
import fr.d4immobilier.visionapirest.services.DocumentUrlService;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class AssembleeRepository extends GenericRepository<Assemblee, Long> {

    @Inject
    private DocumentUrlService documentUrlService;

    @Override
    protected Class<Assemblee> getEntityClass() {
        return Assemblee.class;
    }

    /**
 * Récupère les assemblées générales d'une copropriété
 */
public List<AssembleeResumeDTO> findByCoproprieteId(Long coproprieteId) {
    // Requête principale sans la collection batiments
    List<Object[]> results = em.createQuery(
        "SELECT a.id, a.dateAssemblee, a.dateAGProvisoire, a.extraordinaire, " +
        "       a.pvag.fichierPVAG.nomStockage, a.typeTantieme.type " +
        "FROM Assemblee a " +
        "LEFT JOIN a.pvag " +
        "LEFT JOIN a.pvag.fichierPVAG " +
        "LEFT JOIN a.typeTantieme " +
        "WHERE a.copropriete.id = :coproprieteId " +
        "AND (a.corbeille IS NULL OR a.corbeille = false) " +
        "ORDER BY a.dateAssemblee DESC",
        Object[].class)
        .setParameter("coproprieteId", coproprieteId)
        .getResultList();
    
    List<AssembleeResumeDTO> dtos = new ArrayList<>();
    
    for (Object[] row : results) {
        Long id = (Long) row[0];
        
        AssembleeResumeDTO dto = new AssembleeResumeDTO();
        dto.setId(id);
        dto.setDateAssemblee(((Instant) row[1]).atZone(ZoneId.systemDefault()).toLocalDate());
        dto.setDateProvisoire((Boolean) row[2]);
        
        Boolean extraordinaire = (Boolean) row[3];
        dto.setType(Boolean.TRUE.equals(extraordinaire) ? "EXTRAORDINAIRE" : "ORDINAIRE");
        
        String nomStockage = (String) row[4];
        dto.setProcesVerbalUrl(documentUrlService.getDocumentUrl(nomStockage));
        dto.setProcesVerbalMiniatureUrl(documentUrlService.getMiniatureUrl(nomStockage));
        
        dto.setCleRepartition((String) row[5]);
        
        // Récupérer les bâtiments séparément
        dto.setBatiments(findBatimentsByAssembleeId(id));
        
        dtos.add(dto);
    }
    
    return dtos;
}

/**
 * Récupère les libellés des bâtiments d'une assemblée
 */
private List<String> findBatimentsByAssembleeId(Long assembleeId) {
    List<String> batiments = em.createQuery(
        "SELECT b.libelle FROM Assemblee a JOIN a.batiments b WHERE a.id = :assembleeId",
        String.class)
        .setParameter("assembleeId", assembleeId)
        .getResultList();
    
    return batiments.isEmpty() ? null : batiments;
}

    /**
     * Convertit le champ batiments en List<String>
     * Adaptez selon le type réel de votre champ batiments
     */
    @SuppressWarnings("unchecked")
    private List<String> convertToBatimentsList(List<Batiment> batiments) {
        if (batiments == null) {
            return null;
        }

        List<String> liste = new ArrayList<>();
        for (Batiment b : batiments) {
            liste.add(b.getLibelle());
        }

        return liste;
    }

    /**
     * Convertit le champ cleRepartition en String Adaptez selon le type réel
     * (enum, entité, String...)
     */
    private String convertToCleRepartition(Object cleRepartition) {
        if (cleRepartition == null) {
            return null;
        }

        // Si c'est une entité avec un nom
        // return ((CleRepartition) cleRepartition).getNom();
        // Si c'est un enum
        // return ((CleRepartitionEnum) cleRepartition).name();
        // Si c'est une String
        return cleRepartition.toString();
    }
}
