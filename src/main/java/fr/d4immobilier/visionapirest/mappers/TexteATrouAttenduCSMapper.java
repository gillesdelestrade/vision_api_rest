package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TexteATrouAttenduCSDTO;
import fr.d4immobilier.visionapirest.entities.TexteATrouAttenduCS;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface TexteATrouAttenduCSMapper extends GenericMapper<TexteATrouAttenduCS, TexteATrouAttenduCSDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "attenduCS.id", target = "attenduCSId")
    TexteATrouAttenduCSDTO toDTO(TexteATrouAttenduCS entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "attenduCS", ignore = true)
    TexteATrouAttenduCS toEntity(TexteATrouAttenduCSDTO dto);
}
