package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.RappelDTO;
import fr.d4immobilier.visionapirest.entities.Rappel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface RappelMapper extends GenericMapper<Rappel, RappelDTO> {
    
    // Mapping de l'entité vers le DTO
        RappelDTO toDTO(Rappel entity);

    // Mapping du DTO vers l'entité
        Rappel toEntity(RappelDTO dto);
}
