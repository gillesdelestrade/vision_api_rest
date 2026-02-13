package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DevisFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.DevisFournisseur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DevisFournisseurMapper extends GenericMapper<DevisFournisseur, DevisFournisseurDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "fichierDevisFournisseur.id", target = "fichierDevisFournisseurId")
    @Mapping(source = "demandeDevisFournisseur.id", target = "demandeDevisFournisseurId")
    @Mapping(source = "fournisseur.id", target = "fournisseurId")
        @Mapping(source = "demandeIntervention.id", target = "demandeInterventionId")
    @Mapping(source = "approbateur.id", target = "approbateurId")
    @Mapping(source = "fichierKBIS.id", target = "fichierKBISId")
    @Mapping(source = "fichierVigilanceURSSAF.id", target = "fichierVigilanceURSSAFId")
    @Mapping(source = "fichierTravailleursEtrangers.id", target = "fichierTravailleursEtrangersId")
    @Mapping(source = "fichierRCPro.id", target = "fichierRCProId")
    @Mapping(source = "fichierAssuranceDecennale.id", target = "fichierAssuranceDecennaleId")
    @Mapping(source = "avisD4", target = "avisD4", qualifiedByName = "avisD4ToString")
    @Mapping(source = "avisCS", target = "avisCS", qualifiedByName = "avisCSToString")
    DevisFournisseurDTO toDTO(DevisFournisseur entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "commentairesDevisFournisseurs", ignore = true)
    @Mapping(target = "fichierDevisFournisseur", ignore = true)
    @Mapping(target = "demandeDevisFournisseur", ignore = true)
    @Mapping(target = "fournisseur", ignore = true)
        @Mapping(target = "demandeIntervention", ignore = true)
    @Mapping(target = "approbateur", ignore = true)
    @Mapping(target = "fichierKBIS", ignore = true)
    @Mapping(target = "fichierVigilanceURSSAF", ignore = true)
    @Mapping(target = "fichierTravailleursEtrangers", ignore = true)
    @Mapping(target = "fichierRCPro", ignore = true)
    @Mapping(target = "fichierAssuranceDecennale", ignore = true)
    DevisFournisseur toEntity(DevisFournisseurDTO dto);

    // Méthodes helper pour les enums

    @Named("avisD4ToString")
    default String avisD4ToString(fr.d4immobilier.visionapirest.entities.AvisD4Devis value) {
        return value != null ? value.name() : null;
    }

    @Named("avisCSToString")
    default String avisCSToString(fr.d4immobilier.visionapirest.entities.AvisDevisCS value) {
        return value != null ? value.name() : null;
    }
}
