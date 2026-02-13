package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CoproprietaireSocieteDTO;
import fr.d4immobilier.visionapirest.entities.CoproprietaireSociete;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CoproprietaireSocieteMapper extends GenericMapper<CoproprietaireSociete, CoproprietaireSocieteDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "societe.id", target = "societeId")
    CoproprietaireSocieteDTO toDTO(CoproprietaireSociete entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "societe", ignore = true)
    CoproprietaireSociete toEntity(CoproprietaireSocieteDTO dto);
}
