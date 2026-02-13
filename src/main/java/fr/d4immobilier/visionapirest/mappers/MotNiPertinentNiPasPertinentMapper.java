package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MotNiPertinentNiPasPertinentDTO;
import fr.d4immobilier.visionapirest.entities.MotNiPertinentNiPasPertinent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface MotNiPertinentNiPasPertinentMapper extends GenericMapper<MotNiPertinentNiPasPertinent, MotNiPertinentNiPasPertinentDTO> {
    
    // Mapping de l'entité vers le DTO
    MotNiPertinentNiPasPertinentDTO toDTO(MotNiPertinentNiPasPertinent entity);

    // Mapping du DTO vers l'entité
    MotNiPertinentNiPasPertinent toEntity(MotNiPertinentNiPasPertinentDTO dto);
}
