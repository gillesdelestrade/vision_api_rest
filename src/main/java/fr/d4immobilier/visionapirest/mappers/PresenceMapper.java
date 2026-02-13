package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PresenceDTO;
import fr.d4immobilier.visionapirest.entities.Presence;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PresenceMapper extends GenericMapper<Presence, PresenceDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "assemblee.id", target = "assembleeId")
    @Mapping(source = "coproprietaire.id", target = "coproprietaireId")
    @Mapping(source = "affectation.id", target = "affectationId")
    @Mapping(source = "resolutionDepart.id", target = "resolutionDepartId")
    @Mapping(source = "statutPresence", target = "statutPresence", qualifiedByName = "statutPresenceToString")
    @Mapping(source = "datePresenceOuReceptionFormulaire", target = "datePresenceOuReceptionFormulaire", qualifiedByName = "datePresenceOuReceptionFormulaireToString")
    PresenceDTO toDTO(Presence entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "assemblee", ignore = true)
    @Mapping(target = "coproprietaire", ignore = true)
    @Mapping(target = "affectation", ignore = true)
    @Mapping(target = "resolutionDepart", ignore = true)
    Presence toEntity(PresenceDTO dto);

    // Méthodes helper pour les enums

    @Named("statutPresenceToString")
    default String statutPresenceToString(fr.d4immobilier.visionapirest.entities.StatutPresence value) {
        return value != null ? value.name() : null;
    }

    @Named("datePresenceOuReceptionFormulaireToString")
    default String datePresenceOuReceptionFormulaireToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
