package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.SyndicDTO;
import fr.d4immobilier.visionapirest.entities.Syndic;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface SyndicMapper extends GenericMapper<Syndic, SyndicDTO> {
    
    // Mapping de l'entité vers le DTO
    SyndicDTO toDTO(Syndic entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "coproprietes", ignore = true)
    Syndic toEntity(SyndicDTO dto);
}
