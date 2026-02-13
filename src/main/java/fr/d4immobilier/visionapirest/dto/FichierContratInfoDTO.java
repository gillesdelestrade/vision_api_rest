// FichierContratInfoDTO.java
package fr.d4immobilier.visionapirest.dto;

public record FichierContratInfoDTO(
    Long id,
    String nomFichier,
    String nomStockage
) {}