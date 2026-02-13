package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CompteEnBanqueSocieteDTO;
import fr.d4immobilier.visionapirest.entities.CompteEnBanqueSociete;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CompteEnBanqueSocieteMapper extends GenericMapper<CompteEnBanqueSociete, CompteEnBanqueSocieteDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "societe.id", target = "societeId")
    CompteEnBanqueSocieteDTO toDTO(CompteEnBanqueSociete entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "societe", ignore = true)
    CompteEnBanqueSociete toEntity(CompteEnBanqueSocieteDTO dto);
}
