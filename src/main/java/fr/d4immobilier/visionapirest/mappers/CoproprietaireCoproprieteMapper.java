package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CoproprietaireCoproprieteDTO;
import fr.d4immobilier.visionapirest.entities.CoproprietaireCopropriete;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CoproprietaireCoproprieteMapper extends GenericMapper<CoproprietaireCopropriete, CoproprietaireCoproprieteDTO> {
    
    // Mapping de l'entité vers le DTO
        CoproprietaireCoproprieteDTO toDTO(CoproprietaireCopropriete entity);

    // Mapping du DTO vers l'entité
        CoproprietaireCopropriete toEntity(CoproprietaireCoproprieteDTO dto);
}
