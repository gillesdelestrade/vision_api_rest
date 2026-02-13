package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.SurveillanceObjetsDTO;
import fr.d4immobilier.visionapirest.entities.SurveillanceObjets;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface SurveillanceObjetsMapper extends GenericMapper<SurveillanceObjets, SurveillanceObjetsDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "objetASurveiller.id", target = "objetASurveillerId")
    @Mapping(source = "dateDePriseEnCompte", target = "dateDePriseEnCompte", qualifiedByName = "dateDePriseEnCompteToString")
    SurveillanceObjetsDTO toDTO(SurveillanceObjets entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "objetASurveiller", ignore = true)
    SurveillanceObjets toEntity(SurveillanceObjetsDTO dto);

    // Méthodes helper pour les enums

    @Named("dateDePriseEnCompteToString")
    default String dateDePriseEnCompteToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
