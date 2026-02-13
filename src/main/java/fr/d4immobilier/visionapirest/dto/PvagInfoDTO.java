// PvagInfoDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.time.Instant;

public record PvagInfoDTO(
    Long id,
    Instant dateAG,
    String nomFichier,
    String nomStockage
) {}