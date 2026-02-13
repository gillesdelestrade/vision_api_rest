package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AffectationEtiquetteDTO;
import fr.d4immobilier.visionapirest.entities.AffectationEtiquette;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface AffectationEtiquetteMapper extends GenericMapper<AffectationEtiquette, AffectationEtiquetteDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "etiquette.id", target = "etiquetteId")
    AffectationEtiquetteDTO toDTO(AffectationEtiquette entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "etiquette", ignore = true)
    AffectationEtiquette toEntity(AffectationEtiquetteDTO dto);
}
