package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PreuveDeDepotALaPosteDTO;
import fr.d4immobilier.visionapirest.entities.PreuveDeDepotALaPoste;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PreuveDeDepotALaPosteMapper extends GenericMapper<PreuveDeDepotALaPoste, PreuveDeDepotALaPosteDTO> {
    
    // Mapping de l'entité vers le DTO
    PreuveDeDepotALaPosteDTO toDTO(PreuveDeDepotALaPoste entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "courriers", ignore = true)
    PreuveDeDepotALaPoste toEntity(PreuveDeDepotALaPosteDTO dto);
}
