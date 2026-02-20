// CoproprietaireByEmailDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.util.List;

public record CoproprietaireByEmailDTO(
    Long id,
    String nom,
    String prenom,
    String email,
    List<CoproprieteCoproprietaireDTO> coproprietes
) {}