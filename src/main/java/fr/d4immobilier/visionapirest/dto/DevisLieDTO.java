// DevisLieDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;

public record DevisLieDTO(
    Long id,
    String reference,
    LocalDate dateDevis,
    Float montant,
    String nomStockageFichier
) {}