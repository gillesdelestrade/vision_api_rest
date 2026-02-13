// CourrierListDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.time.Instant;

public record CourrierListDTO(
    Long id,
    Instant dateCreation,
    String auteur,
    String titre,
    String reference,
    Boolean recommandeAR,
    String destinataires,
    DemandeLieDTO demande
) {}