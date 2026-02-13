package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BonDeCommandeMaterielDTO;
import fr.d4immobilier.visionapirest.entities.BonDeCommandeMateriel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface BonDeCommandeMaterielMapper extends GenericMapper<BonDeCommandeMateriel, BonDeCommandeMaterielDTO> {
    
    // Mapping de l'entité vers le DTO
    BonDeCommandeMaterielDTO toDTO(BonDeCommandeMateriel entity);

    // Mapping du DTO vers l'entité
    BonDeCommandeMateriel toEntity(BonDeCommandeMaterielDTO dto);
}
