package fr.d4immobilier.visionapirest.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public record InterventionDemandeDetailDTO(
        Long id,
        String objet,
        LocalDateTime dateCreationDemande,
        String reference,
        String lieuIntervention,

        // Demande
        Long demandeId,

        // Fournisseur
        Long fournisseurId,
        String fournisseurRaisonSociale,
        String fournisseurMail,
        String fournisseurTelPortable,
        String fournisseurTelFixe,

        // Devis fournisseur
        Long devisFournisseurId,
        String devisFournisseurReference,
        Float devisFournisseurMontant,
        String devisFournisseurNomStockage,

        // Fichier demande intervention
        Long fichierDemandeInterventionId,
        String fichierDemandeInterventionNomStockage,

        // Dates et infos complémentaires
        LocalDate dateRappel,
        String plageInterventionPrevue,
        LocalDateTime dateAnnulation,
        LocalDateTime dateInterventionRealisee,
        LocalDateTime datePriseEnCompteFournisseur,
        String historique
) {
}