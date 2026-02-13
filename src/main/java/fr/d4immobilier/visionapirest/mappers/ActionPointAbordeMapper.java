package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ActionPointAbordeDTO;
import fr.d4immobilier.visionapirest.entities.ActionPointAborde;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ActionPointAbordeMapper extends GenericMapper<ActionPointAborde, ActionPointAbordeDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "pointAborde.id", target = "pointAbordeId")
    ActionPointAbordeDTO toDTO(ActionPointAborde entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "pointAborde", ignore = true)
    ActionPointAborde toEntity(ActionPointAbordeDTO dto);
}
