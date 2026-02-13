// FichierMutationInfoDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.time.Instant;

public record FichierMutationInfoDTO(
    Long id,
    String nomFichier,
    String nomStockage,
    Instant dateCreation
) {}