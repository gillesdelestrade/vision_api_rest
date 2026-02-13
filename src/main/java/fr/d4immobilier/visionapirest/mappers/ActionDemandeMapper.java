package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ActionDemandeDTO;
import fr.d4immobilier.visionapirest.entities.ActionDemande;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ActionDemandeMapper extends GenericMapper<ActionDemande, ActionDemandeDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "reunionV2.id", target = "reunionV2Id")
    @Mapping(source = "demande.id", target = "demandeId")
    ActionDemandeDTO toDTO(ActionDemande entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "reunionV2", ignore = true)
    @Mapping(target = "demande", ignore = true)
    ActionDemande toEntity(ActionDemandeDTO dto);
}
