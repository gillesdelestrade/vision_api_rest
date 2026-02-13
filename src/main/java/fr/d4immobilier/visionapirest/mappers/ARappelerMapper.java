package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ARappelerDTO;
import fr.d4immobilier.visionapirest.entities.ARappeler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ARappelerMapper extends GenericMapper<ARappeler, ARappelerDTO> {
    
    // Mapping de l'entité vers le DTO
    ARappelerDTO toDTO(ARappeler entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "rappels", ignore = true)
    ARappeler toEntity(ARappelerDTO dto);
}
