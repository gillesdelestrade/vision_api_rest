package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DevisD4DTO;
import fr.d4immobilier.visionapirest.entities.DevisD4;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DevisD4Mapper extends GenericMapper<DevisD4, DevisD4DTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "statutDevis", target = "statutDevis", qualifiedByName = "statutDevisToString")
    DevisD4DTO toDTO(DevisD4 entity);

    // Mapping du DTO vers l'entité
        DevisD4 toEntity(DevisD4DTO dto);

    // Méthodes helper pour les enums

    @Named("statutDevisToString")
    default String statutDevisToString(fr.d4immobilier.visionapirest.entities.StatutDevis value) {
        return value != null ? value.name() : null;
    }
}
