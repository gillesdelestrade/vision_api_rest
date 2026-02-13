package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ConciergeDTO;
import fr.d4immobilier.visionapirest.entities.Concierge;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ConciergeMapper extends GenericMapper<Concierge, ConciergeDTO> {
    
    // Mapping de l'entité vers le DTO
        ConciergeDTO toDTO(Concierge entity);

    // Mapping du DTO vers l'entité
        Concierge toEntity(ConciergeDTO dto);
}
