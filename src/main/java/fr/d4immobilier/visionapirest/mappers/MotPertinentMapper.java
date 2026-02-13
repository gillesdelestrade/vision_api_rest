package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MotPertinentDTO;
import fr.d4immobilier.visionapirest.entities.MotPertinent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface MotPertinentMapper extends GenericMapper<MotPertinent, MotPertinentDTO> {
    
    // Mapping de l'entité vers le DTO
        MotPertinentDTO toDTO(MotPertinent entity);

    // Mapping du DTO vers l'entité
        MotPertinent toEntity(MotPertinentDTO dto);
}
