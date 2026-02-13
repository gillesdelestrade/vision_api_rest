package fr.d4immobilier.visionapirest.dto;

// EquipementDTO.java
public record EquipementDTO(
    Long id,
    String libelle,
    Long batimentId,
    Long typeEquipementId,
    Long fournisseurId,
    String typeEquipement,
    String fournisseur
) {}