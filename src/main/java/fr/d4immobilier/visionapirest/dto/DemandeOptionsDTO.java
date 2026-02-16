// DemandeOptionsDTO.java
package fr.d4immobilier.visionapirest.dto;

public record DemandeOptionsDTO(
    Boolean epingle,
    Boolean suiviCS,
    Boolean dossierPermanent,
    Boolean direct,
    Boolean ag
) {}