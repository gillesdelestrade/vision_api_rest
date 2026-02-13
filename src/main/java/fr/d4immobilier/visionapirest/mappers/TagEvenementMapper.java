package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TagEvenementDTO;
import fr.d4immobilier.visionapirest.entities.TagEvenement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface TagEvenementMapper extends GenericMapper<TagEvenement, TagEvenementDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "created_at", target = "created_at", qualifiedByName = "created_atToString")
    TagEvenementDTO toDTO(TagEvenement entity);

    // Mapping du DTO vers l'entité
    TagEvenement toEntity(TagEvenementDTO dto);

    // Méthodes helper pour les enums

    @Named("created_atToString")
    default String created_atToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
