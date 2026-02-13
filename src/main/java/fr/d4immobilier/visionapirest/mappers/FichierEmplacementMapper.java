package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierEmplacementDTO;
import fr.d4immobilier.visionapirest.entities.FichierEmplacement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierEmplacementMapper extends GenericMapper<FichierEmplacement, FichierEmplacementDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "emplacementPanneauBALInterphone.id", target = "emplacementPanneauBALInterphoneId")
    FichierEmplacementDTO toDTO(FichierEmplacement entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "emplacementPanneauBALInterphone", ignore = true)
    FichierEmplacement toEntity(FichierEmplacementDTO dto);
}
