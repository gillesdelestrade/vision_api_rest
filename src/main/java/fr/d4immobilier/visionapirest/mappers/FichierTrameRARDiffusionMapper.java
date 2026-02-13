package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierTrameRARDiffusionDTO;
import fr.d4immobilier.visionapirest.entities.FichierTrameRARDiffusion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierTrameRARDiffusionMapper extends GenericMapper<FichierTrameRARDiffusion, FichierTrameRARDiffusionDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "assemblee.id", target = "assembleeId")
    FichierTrameRARDiffusionDTO toDTO(FichierTrameRARDiffusion entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "assemblee", ignore = true)
    FichierTrameRARDiffusion toEntity(FichierTrameRARDiffusionDTO dto);
}
