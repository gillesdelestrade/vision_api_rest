package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DemandeEmplacementPanneauBALInterphoneDTO;
import fr.d4immobilier.visionapirest.entities.DemandeEmplacementPanneauBALInterphone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DemandeEmplacementPanneauBALInterphoneMapper extends GenericMapper<DemandeEmplacementPanneauBALInterphone, DemandeEmplacementPanneauBALInterphoneDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "emplacementPanneauBALInterphone.id", target = "emplacementPanneauBALInterphoneId")
    DemandeEmplacementPanneauBALInterphoneDTO toDTO(DemandeEmplacementPanneauBALInterphone entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "emplacementPanneauBALInterphone", ignore = true)
    DemandeEmplacementPanneauBALInterphone toEntity(DemandeEmplacementPanneauBALInterphoneDTO dto);
}
