package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EvaluationFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.EvaluationFournisseur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface EvaluationFournisseurMapper extends GenericMapper<EvaluationFournisseur, EvaluationFournisseurDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "fournisseur.id", target = "fournisseurId")
    @Mapping(source = "auteur.id", target = "auteurId")
    @Mapping(source = "interventionDemande.id", target = "interventionDemandeId")
    @Mapping(source = "factureFournisseur.id", target = "factureFournisseurId")
    @Mapping(source = "demandeDevisFournisseur.id", target = "demandeDevisFournisseurId")
    @Mapping(source = "dateEvaluation", target = "dateEvaluation", qualifiedByName = "dateEvaluationToString")
    EvaluationFournisseurDTO toDTO(EvaluationFournisseur entity);

    // Mapping du DTO vers l'entité
    EvaluationFournisseur toEntity(EvaluationFournisseurDTO dto);

    // Méthodes helper pour les enums

    @Named("fournisseurIdToString")
    default String fournisseurIdToString(fr.d4immobilier.visionapirest.entities.Fournisseur value) {
        return value != null ? value.getId().toString(): null;
    }

    @Named("auteurToString")
    default String auteurToString(fr.d4immobilier.visionapirest.entities.Personne value) {
        return value != null ? value.getId().toString(): null;
    }

    @Named("interventionDemandeToString")
    default String interventionDemandeToString(fr.d4immobilier.visionapirest.entities.InterventionDemande value) {
        return value != null ? value.getId().toString(): null;
    }

    @Named("factureFournisseurToString")
    default String factureFournisseurToString(fr.d4immobilier.visionapirest.entities.FactureFournisseur value) {
        return value != null ? value.getId().toString(): null;
    }

    @Named("demandeDevisFournisseurToString")
    default String demandeDevisFournisseurToString(fr.d4immobilier.visionapirest.entities.DemandeDevisFournisseur value) {
        return value != null ? value.getId().toString(): null;
    }

    @Named("dateEvaluationToString")
    default String dateEvaluationToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
