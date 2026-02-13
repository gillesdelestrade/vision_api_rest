package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AttenduCSDTO;
import fr.d4immobilier.visionapirest.entities.AttenduCS;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface AttenduCSMapper extends GenericMapper<AttenduCS, AttenduCSDTO> {
    
    // Mapping de l'entité vers le DTO
    AttenduCSDTO toDTO(AttenduCS entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "textesATrou", ignore = true)
    AttenduCS toEntity(AttenduCSDTO dto);
}
