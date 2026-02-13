package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.RegroupementResolutionTypeDTO;
import fr.d4immobilier.visionapirest.entities.RegroupementResolutionType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface RegroupementResolutionTypeMapper extends GenericMapper<RegroupementResolutionType, RegroupementResolutionTypeDTO> {
    
    // Mapping de l'entité vers le DTO
    RegroupementResolutionTypeDTO toDTO(RegroupementResolutionType entity);

    // Mapping du DTO vers l'entité
    RegroupementResolutionType toEntity(RegroupementResolutionTypeDTO dto);
}
