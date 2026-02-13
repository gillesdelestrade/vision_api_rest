package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PlanningGestionnaireDTO;
import fr.d4immobilier.visionapirest.entities.PlanningGestionnaire;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PlanningGestionnaireMapper extends GenericMapper<PlanningGestionnaire, PlanningGestionnaireDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "gestionnaire.id", target = "gestionnaireId")
    @Mapping(source = "demiJournee", target = "demiJournee", qualifiedByName = "demiJourneeToString")
    @Mapping(source = "motifAbsenceGestionnaire", target = "motifAbsenceGestionnaire", qualifiedByName = "motifAbsenceGestionnaireToString")
    PlanningGestionnaireDTO toDTO(PlanningGestionnaire entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "gestionnaire", ignore = true)
    PlanningGestionnaire toEntity(PlanningGestionnaireDTO dto);

    // Méthodes helper pour les enums

    @Named("demiJourneeToString")
    default String demiJourneeToString(fr.d4immobilier.visionapirest.entities.DemiJournee value) {
        return value != null ? value.name() : null;
    }

    @Named("motifAbsenceGestionnaireToString")
    default String motifAbsenceGestionnaireToString(fr.d4immobilier.visionapirest.entities.MotifAbsenceGestionnaire value) {
        return value != null ? value.name() : null;
    }
}
