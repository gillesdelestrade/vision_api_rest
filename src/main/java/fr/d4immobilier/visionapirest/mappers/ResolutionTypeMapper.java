package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ResolutionTypeDTO;
import fr.d4immobilier.visionapirest.entities.ResolutionType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ResolutionTypeMapper extends GenericMapper<ResolutionType, ResolutionTypeDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "majorite", target = "majorite", qualifiedByName = "majoriteToString")
    ResolutionTypeDTO toDTO(ResolutionType entity);

    // Mapping du DTO vers l'entité
    ResolutionType toEntity(ResolutionTypeDTO dto);

    // Méthodes helper pour les enums

    @Named("majoriteToString")
    default String majoriteToString(fr.d4immobilier.visionapirest.entities.Majorite value) {
        return value != null ? value.name() : null;
    }
}
