package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.NatureFichierSinistreDTO;
import fr.d4immobilier.visionapirest.entities.NatureFichierSinistre;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface NatureFichierSinistreMapper extends GenericMapper<NatureFichierSinistre, NatureFichierSinistreDTO> {
    
    // Mapping de l'entité vers le DTO
    NatureFichierSinistreDTO toDTO(NatureFichierSinistre entity);

    // Mapping du DTO vers l'entité
    NatureFichierSinistre toEntity(NatureFichierSinistreDTO dto);
}
