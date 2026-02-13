package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierDemandeSansCompteVisionDTO;
import fr.d4immobilier.visionapirest.entities.FichierDemandeSansCompteVision;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierDemandeSansCompteVisionMapper extends GenericMapper<FichierDemandeSansCompteVision, FichierDemandeSansCompteVisionDTO> {
    
    // Mapping de l'entité vers le DTO
        FichierDemandeSansCompteVisionDTO toDTO(FichierDemandeSansCompteVision entity);

    // Mapping du DTO vers l'entité
        FichierDemandeSansCompteVision toEntity(FichierDemandeSansCompteVisionDTO dto);
}
