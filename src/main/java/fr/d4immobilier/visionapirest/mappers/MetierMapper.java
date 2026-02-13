package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MetierDTO;
import fr.d4immobilier.visionapirest.entities.Metier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface MetierMapper extends GenericMapper<Metier, MetierDTO> {
    
    // Mapping de l'entité vers le DTO
    MetierDTO toDTO(Metier entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "motsCleMetier", ignore = true)
    @Mapping(target = "fournisseurs", ignore = true)
    Metier toEntity(MetierDTO dto);
}
