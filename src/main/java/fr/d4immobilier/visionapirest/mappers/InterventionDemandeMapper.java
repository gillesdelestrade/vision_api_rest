package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.InterventionDemandeDTO;
import fr.d4immobilier.visionapirest.entities.InterventionDemande;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface InterventionDemandeMapper extends GenericMapper<InterventionDemande, InterventionDemandeDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "demandeDevis.id", target = "demandeDevisId")
    @Mapping(source = "devisFournisseur.id", target = "devisFournisseurId")
    @Mapping(source = "panierDemandesIntervention.id", target = "panierDemandesInterventionId")
    @Mapping(source = "fichierDemandeIntervention.id", target = "fichierDemandeInterventionId")
    @Mapping(source = "factureFournisseur.id", target = "factureFournisseurId")
    @Mapping(source = "fournisseur.id", target = "fournisseurId")
    @Mapping(source = "demande.id", target = "demandeId")
    @Mapping(source = "metier.id", target = "metierId")
    @Mapping(source = "dateCreationDemande", target = "dateCreationDemande", qualifiedByName = "dateCreationDemandeToString")
    @Mapping(source = "datePriseEnCompteFournisseur", target = "datePriseEnCompteFournisseur", qualifiedByName = "datePriseEnCompteFournisseurToString")
    @Mapping(source = "dateAccordCS", target = "dateAccordCS", qualifiedByName = "dateAccordCSToString")
    InterventionDemandeDTO toDTO(InterventionDemande entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "demandeDevis", ignore = true)
    @Mapping(target = "devisFournisseur", ignore = true)
    @Mapping(target = "panierDemandesIntervention", ignore = true)
    @Mapping(target = "fichierDemandeIntervention", ignore = true)
    @Mapping(target = "factureFournisseur", ignore = true)
    @Mapping(target = "fournisseur", ignore = true)
    @Mapping(target = "demande", ignore = true)
    @Mapping(target = "metier", ignore = true)
    InterventionDemande toEntity(InterventionDemandeDTO dto);

    // Méthodes helper pour les enums

    @Named("dateCreationDemandeToString")
    default String dateCreationDemandeToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("datePriseEnCompteFournisseurToString")
    default String datePriseEnCompteFournisseurToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("dateAccordCSToString")
    default String dateAccordCSToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
