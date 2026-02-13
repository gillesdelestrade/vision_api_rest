package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PublipostageDTO;
import fr.d4immobilier.visionapirest.entities.Publipostage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PublipostageMapper extends GenericMapper<Publipostage, PublipostageDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "courrier.id", target = "courrierId")
    @Mapping(source = "preuveDeDepotALaPoste.id", target = "preuveDeDepotALaPosteId")
    PublipostageDTO toDTO(Publipostage entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "courrier", ignore = true)
    @Mapping(target = "destinataires", ignore = true)
    @Mapping(target = "preuveDeDepotALaPoste", ignore = true)
    Publipostage toEntity(PublipostageDTO dto);
}
