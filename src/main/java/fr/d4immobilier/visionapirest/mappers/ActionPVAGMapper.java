package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ActionPVAGDTO;
import fr.d4immobilier.visionapirest.entities.ActionPVAG;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ActionPVAGMapper extends GenericMapper<ActionPVAG, ActionPVAGDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "pvag.id", target = "pvagId")
    ActionPVAGDTO toDTO(ActionPVAG entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "pvag", ignore = true)
    ActionPVAG toEntity(ActionPVAGDTO dto);
}
