package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.LexiqueAPID4DTO;
import fr.d4immobilier.visionapirest.entities.LexiqueAPID4;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface LexiqueAPID4Mapper extends GenericMapper<LexiqueAPID4, LexiqueAPID4DTO> {
    
    // Mapping de l'entité vers le DTO
    LexiqueAPID4DTO toDTO(LexiqueAPID4 entity);

    // Mapping du DTO vers l'entité
    LexiqueAPID4 toEntity(LexiqueAPID4DTO dto);
}
