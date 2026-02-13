package fr.d4immobilier.visionapirest.services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DocumentUrlService {
    
    // Adaptez ces chemins selon votre configuration
    private static final String BASE_URL = "https://d4immo-upload.s3.eu-west-3.amazonaws.com/";
    private static final String BASE_URL_MINIATURE = "https://d4immo-upload-resized.s3.eu-west-3.amazonaws.com/resized-";
    private static final String MINIATURE_SUFFIX = "";
    
    /**
     * Génère l'URL du document à partir du nom de stockage
     */
    public String getDocumentUrl(String nomStockage) {
        if (nomStockage == null || nomStockage.isEmpty()) {
            return null;
        }
        return BASE_URL + nomStockage;
    }
    
    /**
     * Génère l'URL de la miniature à partir du nom de stockage
     */
    public String getMiniatureUrl(String nomStockage) {
        if (nomStockage == null || nomStockage.isEmpty()) {
            return null;
        }
        
        // Extraire l'extension
        int lastDot = nomStockage.lastIndexOf('.');
        if (lastDot > 0) {
            String nom = nomStockage.substring(0, lastDot);
            String extension = nomStockage.substring(lastDot);
            // Remplacer l'extension par .png pour la miniature
            return BASE_URL + nom + MINIATURE_SUFFIX + ".png";
        }
        
        return BASE_URL + nomStockage + MINIATURE_SUFFIX + ".png";
    }
}