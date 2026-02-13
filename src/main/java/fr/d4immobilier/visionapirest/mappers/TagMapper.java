package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TagDTO;
import fr.d4immobilier.visionapirest.entities.Tag;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface TagMapper extends GenericMapper<Tag, TagDTO> {
    
    // Mapping de l'entité vers le DTO
    TagDTO toDTO(Tag entity);

    // Mapping du DTO vers l'entité
    Tag toEntity(TagDTO dto);
}
