package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DossierContentieuxFactureDTO;
import fr.d4immobilier.visionapirest.entities.DossierContentieuxFacture;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DossierContentieuxFactureMapper extends GenericMapper<DossierContentieuxFacture, DossierContentieuxFactureDTO> {
    
    // Mapping de l'entité vers le DTO
    DossierContentieuxFactureDTO toDTO(DossierContentieuxFacture entity);

    // Mapping du DTO vers l'entité
    DossierContentieuxFacture toEntity(DossierContentieuxFactureDTO dto);
}
