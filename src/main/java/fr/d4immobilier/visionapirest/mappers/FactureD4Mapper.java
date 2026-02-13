package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FactureD4DTO;
import fr.d4immobilier.visionapirest.entities.FactureD4;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FactureD4Mapper extends GenericMapper<FactureD4, FactureD4DTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "coproprietaire.id", target = "coproprietaireId")
    @Mapping(source = "societe.id", target = "societeId")
    @Mapping(source = "typeFactureD4", target = "typeFactureD4", qualifiedByName = "typeFactureD4ToString")
    @Mapping(source = "dateValidation", target = "dateValidation", qualifiedByName = "dateValidationToString")
    @Mapping(source = "dateEdition", target = "dateEdition", qualifiedByName = "dateEditionToString")
    FactureD4DTO toDTO(FactureD4 entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "regroupementsLignesFacturation", ignore = true)
        @Mapping(target = "coproprietaire", ignore = true)
    @Mapping(target = "societe", ignore = true)
    FactureD4 toEntity(FactureD4DTO dto);

    // Méthodes helper pour les enums

    @Named("typeFactureD4ToString")
    default String typeFactureD4ToString(fr.d4immobilier.visionapirest.entities.TypeFactureD4 value) {
        return value != null ? value.name() : null;
    }

    @Named("dateValidationToString")
    default String dateValidationToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("dateEditionToString")
    default String dateEditionToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
