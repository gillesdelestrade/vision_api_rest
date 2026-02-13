package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CampagneADFDTO;
import fr.d4immobilier.visionapirest.entities.CampagneADF;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CampagneADFMapper extends GenericMapper<CampagneADF, CampagneADFDTO> {
    
    // Mapping de l'entité vers le DTO
    CampagneADFDTO toDTO(CampagneADF entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "aDFCopros", ignore = true)
    CampagneADF toEntity(CampagneADFDTO dto);
}
