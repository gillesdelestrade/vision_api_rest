package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EtiquetteDTO;
import fr.d4immobilier.visionapirest.entities.Etiquette;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface EtiquetteMapper extends GenericMapper<Etiquette, EtiquetteDTO> {
    
    // Mapping de l'entité vers le DTO
    EtiquetteDTO toDTO(Etiquette entity);

    // Mapping du DTO vers l'entité
    Etiquette toEntity(EtiquetteDTO dto);
}
