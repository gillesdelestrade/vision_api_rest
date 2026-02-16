// CommentaireDemandeResponseDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.time.Instant;

public record CommentaireDemandeResponseDTO(
    Long id,
    Instant dateEvenement,
    String auteur,
    String texte
) {}