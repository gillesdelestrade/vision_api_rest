package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MotNonPertinentDTO;
import fr.d4immobilier.visionapirest.entities.MotNonPertinent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface MotNonPertinentMapper extends GenericMapper<MotNonPertinent, MotNonPertinentDTO> {
    
    // Mapping de l'entité vers le DTO
    MotNonPertinentDTO toDTO(MotNonPertinent entity);

    // Mapping du DTO vers l'entité
    MotNonPertinent toEntity(MotNonPertinentDTO dto);
}
