// PrestationContratsDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.util.List;

public record PrestationContratsDTO(
    Long prestationId,
    String prestation,
    List<ContratDTO> contrats
) {}