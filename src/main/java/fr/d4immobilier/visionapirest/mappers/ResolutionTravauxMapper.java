package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ResolutionTravauxDTO;
import fr.d4immobilier.visionapirest.entities.ResolutionTravaux;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ResolutionTravauxMapper extends GenericMapper<ResolutionTravaux, ResolutionTravauxDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "regroupementResolutions.id", target = "regroupementResolutionsId")
    @Mapping(source = "honorairesSurTravaux.id", target = "honorairesSurTravauxId")
    @Mapping(source = "demande.id", target = "demandeId")
    @Mapping(source = "resolutionEnveloppe.id", target = "resolutionEnveloppeId")
    ResolutionTravauxDTO toDTO(ResolutionTravaux entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "regroupementResolutions", ignore = true)
    @Mapping(target = "optionsTravaux", ignore = true)
    @Mapping(target = "honorairesSurTravaux", ignore = true)
    @Mapping(target = "financementsTravaux", ignore = true)
    @Mapping(target = "demande", ignore = true)
    @Mapping(target = "resolutionEnveloppe", ignore = true)
    ResolutionTravaux toEntity(ResolutionTravauxDTO dto);
}
