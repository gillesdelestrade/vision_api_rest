package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ActionDTO;
import fr.d4immobilier.visionapirest.entities.Action;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ActionMapper extends GenericMapper<Action, ActionDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "courrier.id", target = "courrierId")
    @Mapping(source = "emetteur.id", target = "emetteurId")
    @Mapping(source = "executeur.id", target = "executeurId")
        @Mapping(source = "personneSignalantTermine.id", target = "personneSignalantTermineId")
    @Mapping(source = "dateCreation", target = "dateCreation", qualifiedByName = "dateCreationToString")
    @Mapping(source = "datePrevue", target = "datePrevue", qualifiedByName = "datePrevueToString")
    @Mapping(source = "dateRealisation", target = "dateRealisation", qualifiedByName = "dateRealisationToString")
    @Mapping(source = "importance", target = "importance", qualifiedByName = "importanceToString")
    @Mapping(source = "urgence", target = "urgence", qualifiedByName = "urgenceToString")
    ActionDTO toDTO(Action entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "prochainesEtapesActions", ignore = true)
    @Mapping(target = "courrier", ignore = true)
    @Mapping(target = "emetteur", ignore = true)
    @Mapping(target = "executeur", ignore = true)
        @Mapping(target = "personneSignalantTermine", ignore = true)
    Action toEntity(ActionDTO dto);

    // Méthodes helper pour les enums

    @Named("dateCreationToString")
    default String dateCreationToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("datePrevueToString")
    default String datePrevueToString(java.time.Instant value) {
        return value != null ? value.toString(): null;
    }

    @Named("dateRealisationToString")
    default String dateRealisationToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("importanceToString")
    default String importanceToString(fr.d4immobilier.visionapirest.entities.Importance value) {
        return value != null ? value.name() : null;
    }

    @Named("urgenceToString")
    default String urgenceToString(fr.d4immobilier.visionapirest.entities.Urgence value) {
        return value != null ? value.name() : null;
    }
}
