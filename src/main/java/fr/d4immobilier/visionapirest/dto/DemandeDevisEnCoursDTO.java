// DemandeDevisEnCoursDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.util.List;

public record DemandeDevisEnCoursDTO(
    Long id,
    String objet,
    LocalDate date,
    String type,
    String statut,
    RattachementDTO rattachement,
    List<FournisseurDevisDTO> fournisseurs
) {}