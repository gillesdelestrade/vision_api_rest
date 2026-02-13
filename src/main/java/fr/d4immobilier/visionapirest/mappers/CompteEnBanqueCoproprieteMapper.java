package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CompteEnBanqueCoproprieteDTO;
import fr.d4immobilier.visionapirest.entities.CompteEnBanqueCopropriete;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CompteEnBanqueCoproprieteMapper extends GenericMapper<CompteEnBanqueCopropriete, CompteEnBanqueCoproprieteDTO> {
    
    // Mapping de l'entité vers le DTO
        CompteEnBanqueCoproprieteDTO toDTO(CompteEnBanqueCopropriete entity);

    // Mapping du DTO vers l'entité
        CompteEnBanqueCopropriete toEntity(CompteEnBanqueCoproprieteDTO dto);
}
