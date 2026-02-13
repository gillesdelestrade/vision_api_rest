package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FactureFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.FactureFournisseur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FactureFournisseurMapper extends GenericMapper<FactureFournisseur, FactureFournisseurDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "fichierFacture.id", target = "fichierFactureId")
    @Mapping(source = "fournisseur.id", target = "fournisseurId")
        @Mapping(source = "approbateur.id", target = "approbateurId")
    @Mapping(source = "motifDecisionFacture.id", target = "motifDecisionFactureId")
    @Mapping(source = "contratFournisseur.id", target = "contratFournisseurId")
    @Mapping(source = "avisD4", target = "avisD4", qualifiedByName = "avisD4ToString")
    @Mapping(source = "avisCS", target = "avisCS", qualifiedByName = "avisCSToString")
    @Mapping(source = "moyenDePaiement", target = "moyenDePaiement", qualifiedByName = "moyenDePaiementToString")
    @Mapping(source = "etatTraitementAuto", target = "etatTraitementAuto", qualifiedByName = "etatTraitementAutoToString")
    FactureFournisseurDTO toDTO(FactureFournisseur entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "factureFournisseursQuiAnnulentEtQuiRemplacent", ignore = true)
    @Mapping(target = "courrierFactures", ignore = true)
    @Mapping(target = "commentairesFactureFournisseurs", ignore = true)
    @Mapping(target = "fichierFacture", ignore = true)
    @Mapping(target = "fournisseur", ignore = true)
        @Mapping(target = "demandesInterventions", ignore = true)
    @Mapping(target = "approbateur", ignore = true)
    @Mapping(target = "motifDecisionFacture", ignore = true)
    @Mapping(target = "factureFournisseursAnnuleesEtRemplacees", ignore = true)
    @Mapping(target = "contratFournisseur", ignore = true)
    @Mapping(target = "batimentsConcernes", ignore = true)
    FactureFournisseur toEntity(FactureFournisseurDTO dto);

    // Méthodes helper pour les enums

    @Named("avisD4ToString")
    default String avisD4ToString(fr.d4immobilier.visionapirest.entities.AvisD4Facture value) {
        return value != null ? value.name() : null;
    }

    @Named("avisCSToString")
    default String avisCSToString(fr.d4immobilier.visionapirest.entities.AvisFactureCS value) {
        return value != null ? value.name() : null;
    }

    @Named("moyenDePaiementToString")
    default String moyenDePaiementToString(fr.d4immobilier.visionapirest.entities.MoyenDePaiement value) {
        return value != null ? value.name() : null;
    }

    @Named("etatTraitementAutoToString")
    default String etatTraitementAutoToString(fr.d4immobilier.visionapirest.entities.EtatTraitementAuto value) {
        return value != null ? value.name() : null;
    }
}
