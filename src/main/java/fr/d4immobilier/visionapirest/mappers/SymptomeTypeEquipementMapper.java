package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.SymptomeTypeEquipementDTO;
import fr.d4immobilier.visionapirest.entities.SymptomeTypeEquipement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface SymptomeTypeEquipementMapper extends GenericMapper<SymptomeTypeEquipement, SymptomeTypeEquipementDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "typeEquipement.id", target = "typeEquipementId")
    SymptomeTypeEquipementDTO toDTO(SymptomeTypeEquipement entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "typeEquipement", ignore = true)
    SymptomeTypeEquipement toEntity(SymptomeTypeEquipementDTO dto);
}
