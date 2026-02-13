package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MandataireSocieteDTO;
import fr.d4immobilier.visionapirest.entities.MandataireSociete;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface MandataireSocieteMapper extends GenericMapper<MandataireSociete, MandataireSocieteDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "societe.id", target = "societeId")
    MandataireSocieteDTO toDTO(MandataireSociete entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "societe", ignore = true)
    MandataireSociete toEntity(MandataireSocieteDTO dto);
}
