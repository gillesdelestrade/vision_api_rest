package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CourrierDeclarationSinistreDTO;
import fr.d4immobilier.visionapirest.entities.CourrierDeclarationSinistre;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CourrierDeclarationSinistreMapper extends GenericMapper<CourrierDeclarationSinistre, CourrierDeclarationSinistreDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "sinistre.id", target = "sinistreId")
    CourrierDeclarationSinistreDTO toDTO(CourrierDeclarationSinistre entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "sinistre", ignore = true)
    CourrierDeclarationSinistre toEntity(CourrierDeclarationSinistreDTO dto);
}
