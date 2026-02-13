// DevisEnCoursResponseDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.util.List;

public record DevisEnCoursResponseDTO(
    List<DemandeDevisEnCoursDTO> demandesDevis,
    List<DevisOrphelinDTO> devisOrphelins
) {}