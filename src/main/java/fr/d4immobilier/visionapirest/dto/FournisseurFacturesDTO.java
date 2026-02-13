// FournisseurFacturesDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.util.List;

public record FournisseurFacturesDTO(
    Long fournisseurId,
    String fournisseurNom,
    List<FactureDTO> factures
) {}