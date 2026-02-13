// CoproprietaireDematDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.util.List;

public record CoproprietaireDematDTO(
    Long matriculeICSId,
    String matricule,
    Long coproprietaireId,
    String nom,
    String email,
    Boolean compteActif,
    List<AutorisationDematDTO> autorisations
) {}