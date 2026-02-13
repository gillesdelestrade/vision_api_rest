package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.LogActiviteDTO;
import fr.d4immobilier.visionapirest.entities.LogActivite;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface LogActiviteMapper extends GenericMapper<LogActivite, LogActiviteDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "user.id", target = "userId")
        @Mapping(source = "dateActivite", target = "dateActivite", qualifiedByName = "dateActiviteToString")
    LogActiviteDTO toDTO(LogActivite entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "user", ignore = true)
        LogActivite toEntity(LogActiviteDTO dto);

    // Méthodes helper pour les enums

    @Named("dateActiviteToString")
    default String dateActiviteToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
