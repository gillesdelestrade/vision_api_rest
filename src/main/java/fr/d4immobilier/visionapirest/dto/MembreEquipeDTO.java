// MembreEquipeDTO.java
package fr.d4immobilier.visionapirest.dto;

public record MembreEquipeDTO(
    String role,
    String roleLabel,
    String trigramme,
    String nom,
    String prenom,
    String email
) {}