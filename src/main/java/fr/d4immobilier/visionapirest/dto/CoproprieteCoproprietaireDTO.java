// CoproprieteCoproprietaireDTO.java
package fr.d4immobilier.visionapirest.dto;

public record CoproprieteCoproprietaireDTO(
    Long id,
    String trigramme,
    String nom,
    String adresse
) {}