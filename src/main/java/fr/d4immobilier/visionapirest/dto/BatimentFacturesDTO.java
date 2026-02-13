// BatimentFacturesDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.util.List;

public record BatimentFacturesDTO(
    Long batimentId,
    String batimentLibelle,
    List<FactureDTO> factures
) {}