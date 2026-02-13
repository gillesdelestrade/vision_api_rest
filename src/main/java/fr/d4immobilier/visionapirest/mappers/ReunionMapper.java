package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ReunionDTO;
import fr.d4immobilier.visionapirest.entities.Reunion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ReunionMapper extends GenericMapper<Reunion, ReunionDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "dateReunion", target = "dateReunion", qualifiedByName = "dateReunionToString")
    ReunionDTO toDTO(Reunion entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "fichiersReunion", ignore = true)
    @Mapping(target = "pointsAbordes", ignore = true)
        Reunion toEntity(ReunionDTO dto);

    // Méthodes helper pour les enums

    @Named("dateReunionToString")
    default String dateReunionToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
