package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ActionModeleCourrierDTO;
import fr.d4immobilier.visionapirest.entities.ActionModeleCourrier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ActionModeleCourrierMapper extends GenericMapper<ActionModeleCourrier, ActionModeleCourrierDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "modeleCourrier.id", target = "modeleCourrierId")
    ActionModeleCourrierDTO toDTO(ActionModeleCourrier entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "modeleCourrier", ignore = true)
    ActionModeleCourrier toEntity(ActionModeleCourrierDTO dto);
}
