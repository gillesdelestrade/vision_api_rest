package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.RegroupementResolutionsDTO;
import fr.d4immobilier.visionapirest.entities.RegroupementResolutions;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface RegroupementResolutionsMapper extends GenericMapper<RegroupementResolutions, RegroupementResolutionsDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "assemblee.id", target = "assembleeId")
    @Mapping(source = "typeTantieme.id", target = "typeTantiemeId")
    @Mapping(source = "majorite", target = "majorite", qualifiedByName = "majoriteToString")
    RegroupementResolutionsDTO toDTO(RegroupementResolutions entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "assemblee", ignore = true)
    @Mapping(target = "batiments", ignore = true)
    @Mapping(target = "typeTantieme", ignore = true)
        RegroupementResolutions toEntity(RegroupementResolutionsDTO dto);

    // Méthodes helper pour les enums

    @Named("majoriteToString")
    default String majoriteToString(fr.d4immobilier.visionapirest.entities.Majorite value) {
        return value != null ? value.name() : null;
    }
}
