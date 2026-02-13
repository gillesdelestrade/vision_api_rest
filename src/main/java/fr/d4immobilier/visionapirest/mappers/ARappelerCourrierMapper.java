package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ARappelerCourrierDTO;
import fr.d4immobilier.visionapirest.entities.ARappelerCourrier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ARappelerCourrierMapper extends GenericMapper<ARappelerCourrier, ARappelerCourrierDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "courrier.id", target = "courrierId")
    ARappelerCourrierDTO toDTO(ARappelerCourrier entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "courrier", ignore = true)
    ARappelerCourrier toEntity(ARappelerCourrierDTO dto);
}
