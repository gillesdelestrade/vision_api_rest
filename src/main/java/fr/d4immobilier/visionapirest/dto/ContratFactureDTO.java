// ContratFactureDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.util.List;

public record ContratFactureDTO(
    Long id,
    String reference,
    String description,
    List<FactureContratLigneDTO> autresFactures
) {}