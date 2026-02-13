package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PassageObligeDTO;
import fr.d4immobilier.visionapirest.entities.PassageOblige;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PassageObligeMapper extends GenericMapper<PassageOblige, PassageObligeDTO> {
    
    // Mapping de l'entité vers le DTO
        PassageObligeDTO toDTO(PassageOblige entity);

    // Mapping du DTO vers l'entité
        PassageOblige toEntity(PassageObligeDTO dto);
}
