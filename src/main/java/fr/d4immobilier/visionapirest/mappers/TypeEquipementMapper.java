package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TypeEquipementDTO;
import fr.d4immobilier.visionapirest.entities.TypeEquipement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface TypeEquipementMapper extends GenericMapper<TypeEquipement, TypeEquipementDTO> {
    
    // Mapping de l'entité vers le DTO
    TypeEquipementDTO toDTO(TypeEquipement entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "prestationsConcernees", ignore = true)
    TypeEquipement toEntity(TypeEquipementDTO dto);
}
