package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PanierDemandesInterventionDTO;
import fr.d4immobilier.visionapirest.entities.PanierDemandesIntervention;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PanierDemandesInterventionMapper extends GenericMapper<PanierDemandesIntervention, PanierDemandesInterventionDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "fournisseur.id", target = "fournisseurId")
    PanierDemandesInterventionDTO toDTO(PanierDemandesIntervention entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "fournisseur", ignore = true)
    @Mapping(target = "interventionsDemande", ignore = true)
    PanierDemandesIntervention toEntity(PanierDemandesInterventionDTO dto);
}
