package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.HonorairesSurTravauxDTO;
import fr.d4immobilier.visionapirest.entities.HonorairesSurTravaux;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface HonorairesSurTravauxMapper extends GenericMapper<HonorairesSurTravaux, HonorairesSurTravauxDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "resolution.id", target = "resolutionId")
    HonorairesSurTravauxDTO toDTO(HonorairesSurTravaux entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "resolution", ignore = true)
    HonorairesSurTravaux toEntity(HonorairesSurTravauxDTO dto);
}
