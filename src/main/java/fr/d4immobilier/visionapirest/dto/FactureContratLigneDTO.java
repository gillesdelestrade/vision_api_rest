// FactureContratLigneDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;

public record FactureContratLigneDTO(
    Long id,
    LocalDate dateFacture,
    String reference,
    Float montant
) {}