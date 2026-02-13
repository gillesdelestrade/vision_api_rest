package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ObjetASurveillerDTO;
import fr.d4immobilier.visionapirest.entities.ObjetASurveiller;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ObjetASurveillerMapper extends GenericMapper<ObjetASurveiller, ObjetASurveillerDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "dateDerniereMiseAJour", target = "dateDerniereMiseAJour", qualifiedByName = "dateDerniereMiseAJourToString")
    ObjetASurveillerDTO toDTO(ObjetASurveiller entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "surveillancesObjets", ignore = true)
    ObjetASurveiller toEntity(ObjetASurveillerDTO dto);

    // Méthodes helper pour les enums

    @Named("dateDerniereMiseAJourToString")
    default String dateDerniereMiseAJourToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
