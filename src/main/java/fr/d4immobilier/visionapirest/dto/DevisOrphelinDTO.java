// DevisOrphelinDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;

public record DevisOrphelinDTO(
    Long id,
    FournisseurSimpleDTO fournisseur,
    Float montantTTC,
    LocalDate dateReception,
    String pdfUrl,
    String moisRegroupement
) {}