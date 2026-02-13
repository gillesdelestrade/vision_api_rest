package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BonDeCommandeEmplacementBALInterphoneDTO;
import fr.d4immobilier.visionapirest.entities.BonDeCommandeEmplacementBALInterphone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface BonDeCommandeEmplacementBALInterphoneMapper extends GenericMapper<BonDeCommandeEmplacementBALInterphone, BonDeCommandeEmplacementBALInterphoneDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "emplacementPanneauBALInterphone.id", target = "emplacementPanneauBALInterphoneId")
    BonDeCommandeEmplacementBALInterphoneDTO toDTO(BonDeCommandeEmplacementBALInterphone entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "emplacementPanneauBALInterphone", ignore = true)
    BonDeCommandeEmplacementBALInterphone toEntity(BonDeCommandeEmplacementBALInterphoneDTO dto);
}
