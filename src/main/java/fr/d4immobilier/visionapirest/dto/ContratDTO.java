// ContratDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.util.List;

public record ContratDTO(
    Long id,
    String reference,
    String description,
    LocalDate dateDebut,
    LocalDate dateFin,
    Float montantForfait,
    String frequenceFactures,
    FournisseurSimpleDTO fournisseur,
    List<FichierContratInfoDTO> fichiers
) {}