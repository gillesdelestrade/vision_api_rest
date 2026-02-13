// ContratsResponseDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.util.List;

public record ContratsResponseDTO(
    List<PrestationContratsDTO> contratsEnCours,
    List<PrestationContratsDTO> contratsTermines
) {}