package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TypeDocumentCourrierEntrantDTO;
import fr.d4immobilier.visionapirest.entities.TypeDocumentCourrierEntrant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface TypeDocumentCourrierEntrantMapper extends GenericMapper<TypeDocumentCourrierEntrant, TypeDocumentCourrierEntrantDTO> {
    
    // Mapping de l'entité vers le DTO
    TypeDocumentCourrierEntrantDTO toDTO(TypeDocumentCourrierEntrant entity);

    // Mapping du DTO vers l'entité
    TypeDocumentCourrierEntrant toEntity(TypeDocumentCourrierEntrantDTO dto);
}
