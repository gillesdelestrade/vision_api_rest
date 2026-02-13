package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EvenementAutorisationDematerialisationDTO;
import fr.d4immobilier.visionapirest.entities.EvenementAutorisationDematerialisation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface EvenementAutorisationDematerialisationMapper extends GenericMapper<EvenementAutorisationDematerialisation, EvenementAutorisationDematerialisationDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "auteur.id", target = "auteurId")
    @Mapping(source = "autorisationDematerialisation.id", target = "autorisationDematerialisationId")
    @Mapping(source = "dateEvenement", target = "dateEvenement", qualifiedByName = "dateEvenementToString")
    EvenementAutorisationDematerialisationDTO toDTO(EvenementAutorisationDematerialisation entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "auteur", ignore = true)
    @Mapping(target = "autorisationDematerialisation", ignore = true)
    EvenementAutorisationDematerialisation toEntity(EvenementAutorisationDematerialisationDTO dto);

    // Méthodes helper pour les enums

    @Named("dateEvenementToString")
    default String dateEvenementToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
