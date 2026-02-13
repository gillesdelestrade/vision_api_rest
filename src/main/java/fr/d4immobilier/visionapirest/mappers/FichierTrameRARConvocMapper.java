package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierTrameRARConvocDTO;
import fr.d4immobilier.visionapirest.entities.FichierTrameRARConvoc;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierTrameRARConvocMapper extends GenericMapper<FichierTrameRARConvoc, FichierTrameRARConvocDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "assemblee.id", target = "assembleeId")
    FichierTrameRARConvocDTO toDTO(FichierTrameRARConvoc entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "assemblee", ignore = true)
    FichierTrameRARConvoc toEntity(FichierTrameRARConvocDTO dto);
}
