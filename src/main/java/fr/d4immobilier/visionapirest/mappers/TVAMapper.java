package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TVADTO;
import fr.d4immobilier.visionapirest.entities.TVA;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface TVAMapper extends GenericMapper<TVA, TVADTO> {
    
    // Mapping de l'entité vers le DTO
    TVADTO toDTO(TVA entity);

    // Mapping du DTO vers l'entité
    TVA toEntity(TVADTO dto);
}
