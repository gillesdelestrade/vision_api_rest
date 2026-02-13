package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.SondageDTO;
import fr.d4immobilier.visionapirest.entities.Sondage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface SondageMapper extends GenericMapper<Sondage, SondageDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "demande.id", target = "demandeId")
    SondageDTO toDTO(Sondage entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "propositionsSondage", ignore = true)
    @Mapping(target = "demande", ignore = true)
    Sondage toEntity(SondageDTO dto);
}
