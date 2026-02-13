package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ResolutionDTO;
import fr.d4immobilier.visionapirest.entities.Resolution;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ResolutionMapper extends GenericMapper<Resolution, ResolutionDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "regroupementResolutions.id", target = "regroupementResolutionsId")
    @Mapping(source = "typeTantieme.id", target = "typeTantiemeId")
    @Mapping(source = "assemblee.id", target = "assembleeId")
    @Mapping(source = "majoriteRequise", target = "majoriteRequise", qualifiedByName = "majoriteRequiseToString")
    ResolutionDTO toDTO(Resolution entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "regroupementResolutions", ignore = true)
    @Mapping(target = "votes", ignore = true)
    @Mapping(target = "typeTantieme", ignore = true)
    @Mapping(target = "assemblee", ignore = true)
    @Mapping(target = "fichiers", ignore = true)
    @Mapping(target = "fournisseursConsultesEnAttente", ignore = true)
    @Mapping(target = "batiments", ignore = true)
    Resolution toEntity(ResolutionDTO dto);

    // Méthodes helper pour les enums

    @Named("majoriteRequiseToString")
    default String majoriteRequiseToString(fr.d4immobilier.visionapirest.entities.Majorite value) {
        return value != null ? value.name() : null;
    }
}
