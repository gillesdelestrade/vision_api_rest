package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BoiteMailDTO;
import fr.d4immobilier.visionapirest.entities.BoiteMail;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface BoiteMailMapper extends GenericMapper<BoiteMail, BoiteMailDTO> {
    
    // Mapping de l'entité vers le DTO
    BoiteMailDTO toDTO(BoiteMail entity);

    // Mapping du DTO vers l'entité
        BoiteMail toEntity(BoiteMailDTO dto);
}
