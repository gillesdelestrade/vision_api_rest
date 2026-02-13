package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DevisHonorairesDTO;
import fr.d4immobilier.visionapirest.entities.DevisHonoraires;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DevisHonorairesMapper extends GenericMapper<DevisHonoraires, DevisHonorairesDTO> {
    
    // Mapping de l'entité vers le DTO
    DevisHonorairesDTO toDTO(DevisHonoraires entity);

    // Mapping du DTO vers l'entité
    DevisHonoraires toEntity(DevisHonorairesDTO dto);
}
