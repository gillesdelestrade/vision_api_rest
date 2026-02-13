package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ARappelerEnvoiMailDTO;
import fr.d4immobilier.visionapirest.entities.ARappelerEnvoiMail;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ARappelerEnvoiMailMapper extends GenericMapper<ARappelerEnvoiMail, ARappelerEnvoiMailDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "envoiMail.id", target = "envoiMailId")
    ARappelerEnvoiMailDTO toDTO(ARappelerEnvoiMail entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "envoiMail", ignore = true)
    ARappelerEnvoiMail toEntity(ARappelerEnvoiMailDTO dto);
}
