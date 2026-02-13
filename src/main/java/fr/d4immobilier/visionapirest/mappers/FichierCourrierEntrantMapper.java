package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierCourrierEntrantDTO;
import fr.d4immobilier.visionapirest.entities.FichierCourrierEntrant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierCourrierEntrantMapper extends GenericMapper<FichierCourrierEntrant, FichierCourrierEntrantDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "courrierEntrant.id", target = "courrierEntrantId")
    FichierCourrierEntrantDTO toDTO(FichierCourrierEntrant entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "courrierEntrant", ignore = true)
    FichierCourrierEntrant toEntity(FichierCourrierEntrantDTO dto);
}
