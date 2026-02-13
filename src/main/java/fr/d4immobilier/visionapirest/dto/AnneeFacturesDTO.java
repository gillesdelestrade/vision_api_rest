// AnneeFacturesDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.util.List;

public record AnneeFacturesDTO(
    Integer annee,
    List<FournisseurFacturesDTO> fournisseurs
) {}