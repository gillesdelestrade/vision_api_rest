package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AutorisationDematerialisationDTO;
import fr.d4immobilier.visionapirest.entities.AutorisationDematerialisation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface AutorisationDematerialisationMapper extends GenericMapper<AutorisationDematerialisation, AutorisationDematerialisationDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "matriculeICS.id", target = "matriculeICSId")
    @Mapping(source = "contenuDematerialisation", target = "contenuDematerialisation", qualifiedByName = "contenuDematerialisationToString")
    @Mapping(source = "supportDematerialisation", target = "supportDematerialisation", qualifiedByName = "supportDematerialisationToString")
    @Mapping(source = "statutAutorisationDematerialisation", target = "statutAutorisationDematerialisation", qualifiedByName = "statutAutorisationDematerialisationToString")
    AutorisationDematerialisationDTO toDTO(AutorisationDematerialisation entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "matriculeICS", ignore = true)
    @Mapping(target = "evenementsAutorisationDematerialisation", ignore = true)
    AutorisationDematerialisation toEntity(AutorisationDematerialisationDTO dto);

    // Méthodes helper pour les enums

    @Named("contenuDematerialisationToString")
    default String contenuDematerialisationToString(fr.d4immobilier.visionapirest.entities.ContenuDematerialisation value) {
        return value != null ? value.name() : null;
    }

    @Named("supportDematerialisationToString")
    default String supportDematerialisationToString(fr.d4immobilier.visionapirest.entities.SupportDematerialisation value) {
        return value != null ? value.name() : null;
    }

    @Named("statutAutorisationDematerialisationToString")
    default String statutAutorisationDematerialisationToString(fr.d4immobilier.visionapirest.entities.StatutAutorisationDematerialisation value) {
        return value != null ? value.name() : null;
    }
}
