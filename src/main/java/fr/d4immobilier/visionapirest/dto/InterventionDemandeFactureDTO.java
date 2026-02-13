// InterventionDemandeFactureDTO.java
package fr.d4immobilier.visionapirest.dto;

public record InterventionDemandeFactureDTO(
    Long id,
    String reference,
    String objet,
    String lieuIntervention,
    String nomStockageFichier,
    DevisLieDTO devis
) {}