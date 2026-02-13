package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.RappelCourrierDTO;
import fr.d4immobilier.visionapirest.entities.RappelCourrier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface RappelCourrierMapper extends GenericMapper<RappelCourrier, RappelCourrierDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "courrier.id", target = "courrierId")
    RappelCourrierDTO toDTO(RappelCourrier entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "courrier", ignore = true)
    RappelCourrier toEntity(RappelCourrierDTO dto);
}
