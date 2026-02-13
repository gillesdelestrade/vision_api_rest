package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ProchaineEtapeTypeDTO;
import fr.d4immobilier.visionapirest.entities.ProchaineEtapeType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ProchaineEtapeTypeMapper extends GenericMapper<ProchaineEtapeType, ProchaineEtapeTypeDTO> {
    
    // Mapping de l'entité vers le DTO
    ProchaineEtapeTypeDTO toDTO(ProchaineEtapeType entity);

    // Mapping du DTO vers l'entité
    ProchaineEtapeType toEntity(ProchaineEtapeTypeDTO dto);
}
