// FactureDTO.java
package fr.d4immobilier.visionapirest.dto;

import java.time.LocalDate;
import java.util.List;

public record FactureDTO(
    Long id,
    String reference,
    Float montant,
    LocalDate dateFacture,
    LocalDate dateReception,
    LocalDate dateDeMiseAuPaiement,
    String avisD4,
    String avisCS,
    FournisseurSimpleDTO fournisseur,
    String nomStockageFichier,
    List<CommentaireFactureDTO> commentaires,
    List<InterventionDemandeFactureDTO> interventions,
    ContratFactureDTO contrat
) {}