package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.NoeudThreadCourrierDTO;
import fr.d4immobilier.visionapirest.entities.NoeudThreadCourrier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface NoeudThreadCourrierMapper extends GenericMapper<NoeudThreadCourrier, NoeudThreadCourrierDTO> {
    
    // Mapping de l'entité vers le DTO
        NoeudThreadCourrierDTO toDTO(NoeudThreadCourrier entity);

    // Mapping du DTO vers l'entité
            NoeudThreadCourrier toEntity(NoeudThreadCourrierDTO dto);
}
