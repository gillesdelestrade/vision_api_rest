package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EmplacementPanneauBALInterphoneDTO;
import fr.d4immobilier.visionapirest.entities.EmplacementPanneauBALInterphone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface EmplacementPanneauBALInterphoneMapper extends GenericMapper<EmplacementPanneauBALInterphone, EmplacementPanneauBALInterphoneDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "panneauBALInterphone.id", target = "panneauBALInterphoneId")
    @Mapping(source = "statutEmplacementPlaqueBAL", target = "statutEmplacementPlaqueBAL", qualifiedByName = "statutEmplacementPlaqueBALToString")
    EmplacementPanneauBALInterphoneDTO toDTO(EmplacementPanneauBALInterphone entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "fichiers", ignore = true)
    @Mapping(target = "demandes", ignore = true)
    @Mapping(target = "bonsDeCommande", ignore = true)
        @Mapping(target = "panneauBALInterphone", ignore = true)
    EmplacementPanneauBALInterphone toEntity(EmplacementPanneauBALInterphoneDTO dto);

    // Méthodes helper pour les enums

    @Named("statutEmplacementPlaqueBALToString")
    default String statutEmplacementPlaqueBALToString(fr.d4immobilier.visionapirest.entities.StatutEmplacementPlaqueBAL value) {
        return value != null ? value.name() : null;
    }
}
