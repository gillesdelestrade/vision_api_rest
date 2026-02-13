package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ODJReunionDTO;
import fr.d4immobilier.visionapirest.entities.ODJReunion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ODJReunionMapper extends GenericMapper<ODJReunion, ODJReunionDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "reunion.id", target = "reunionId")
    @Mapping(source = "dateCreation", target = "dateCreation", qualifiedByName = "dateCreationToString")
    @Mapping(source = "dateModification", target = "dateModification", qualifiedByName = "dateModificationToString")
    @Mapping(source = "dateReunionPrevue", target = "dateReunionPrevue", qualifiedByName = "dateReunionPrevueToString")
    ODJReunionDTO toDTO(ODJReunion entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "pointsODJReunion", ignore = true)
    @Mapping(target = "reunion", ignore = true)
    ODJReunion toEntity(ODJReunionDTO dto);

    // Méthodes helper pour les enums

    @Named("dateCreationToString")
    default String dateCreationToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("dateModificationToString")
    default String dateModificationToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("dateReunionPrevueToString")
    default String dateReunionPrevueToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
