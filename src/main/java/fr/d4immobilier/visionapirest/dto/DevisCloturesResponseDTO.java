// DevisCloturesResponseDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.util.List;

public record DevisCloturesResponseDTO(
    List<DemandeDevisEnCoursDTO> demandesDevisCloturees,
    List<DevisOrphelinDTO> devisAnciens
) {}