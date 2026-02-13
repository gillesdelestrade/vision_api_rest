package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TagEvenement_EvenementDTO;
import fr.d4immobilier.visionapirest.entities.TagEvenement_Evenement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface TagEvenement_EvenementMapper extends GenericMapper<TagEvenement_Evenement, TagEvenement_EvenementDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "created_at", target = "created_at", qualifiedByName = "created_atToString")
    TagEvenement_EvenementDTO toDTO(TagEvenement_Evenement entity);

    // Mapping du DTO vers l'entité
    TagEvenement_Evenement toEntity(TagEvenement_EvenementDTO dto);

    // Méthodes helper pour les enums

    @Named("created_atToString")
    default String created_atToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
