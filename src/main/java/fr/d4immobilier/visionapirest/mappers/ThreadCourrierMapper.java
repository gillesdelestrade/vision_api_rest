package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ThreadCourrierDTO;
import fr.d4immobilier.visionapirest.entities.ThreadCourrier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ThreadCourrierMapper extends GenericMapper<ThreadCourrier, ThreadCourrierDTO> {
    
    // Mapping de l'entité vers le DTO
    ThreadCourrierDTO toDTO(ThreadCourrier entity);

    // Mapping du DTO vers l'entité
    ThreadCourrier toEntity(ThreadCourrierDTO dto);
}
