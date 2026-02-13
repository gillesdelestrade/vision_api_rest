// DevisInfoDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;

public record DevisInfoDTO(
    String id,
    Float montantTTC,
    LocalDate dateReception,
    String pdfUrl,
    String nomStockage
) {}