package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.RibDTO;
import fr.d4immobilier.visionapirest.entities.Rib;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface RibMapper extends GenericMapper<Rib, RibDTO> {
    
    // Mapping de l'entité vers le DTO
        RibDTO toDTO(Rib entity);

    // Mapping du DTO vers l'entité
        Rib toEntity(RibDTO dto);
}
