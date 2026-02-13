package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierReunionDTO;
import fr.d4immobilier.visionapirest.entities.FichierReunion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierReunionMapper extends GenericMapper<FichierReunion, FichierReunionDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "reunion.id", target = "reunionId")
    @Mapping(source = "pointAborde.id", target = "pointAbordeId")
    FichierReunionDTO toDTO(FichierReunion entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "reunion", ignore = true)
    @Mapping(target = "pointAborde", ignore = true)
    FichierReunion toEntity(FichierReunionDTO dto);
}
