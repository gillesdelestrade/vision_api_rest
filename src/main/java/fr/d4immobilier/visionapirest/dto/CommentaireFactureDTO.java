// CommentaireFactureDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.time.Instant;

public record CommentaireFactureDTO(
    Long id,
    String commentaire,
    Instant dateCommentaire,
    String auteur
) {}