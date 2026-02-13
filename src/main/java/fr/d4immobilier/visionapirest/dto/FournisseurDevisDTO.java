// FournisseurDevisDTO.java
package fr.d4immobilier.visionapirest.dto;

public record FournisseurDevisDTO(
    Long id,
    String nom,
    String contact,
    String statut,
    DevisInfoDTO devis
) {}