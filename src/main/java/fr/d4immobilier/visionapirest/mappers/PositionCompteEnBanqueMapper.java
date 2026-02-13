package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PositionCompteEnBanqueDTO;
import fr.d4immobilier.visionapirest.entities.PositionCompteEnBanque;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PositionCompteEnBanqueMapper extends GenericMapper<PositionCompteEnBanque, PositionCompteEnBanqueDTO> {
    
    // Mapping de l'entité vers le DTO
        PositionCompteEnBanqueDTO toDTO(PositionCompteEnBanque entity);

    // Mapping du DTO vers l'entité
        PositionCompteEnBanque toEntity(PositionCompteEnBanqueDTO dto);
}
