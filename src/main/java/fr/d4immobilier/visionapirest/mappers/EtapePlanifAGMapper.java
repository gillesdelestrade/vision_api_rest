package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EtapePlanifAGDTO;
import fr.d4immobilier.visionapirest.entities.EtapePlanifAG;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface EtapePlanifAGMapper extends GenericMapper<EtapePlanifAG, EtapePlanifAGDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "assemblee.id", target = "assembleeId")
    @Mapping(source = "etapePlanifAGModele.id", target = "etapePlanifAGModeleId")
    @Mapping(source = "acteur.id", target = "acteurId")
    @Mapping(source = "dateCible", target = "dateCible", qualifiedByName = "dateCibleToString")
    @Mapping(source = "dateRealisation", target = "dateRealisation", qualifiedByName = "dateRealisationToString")
    @Mapping(source = "dateDebut", target = "dateDebut", qualifiedByName = "dateDebutToString")
    EtapePlanifAGDTO toDTO(EtapePlanifAG entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "assemblee", ignore = true)
    @Mapping(target = "etapePlanifAGModele", ignore = true)
    @Mapping(target = "acteur", ignore = true)
    @Mapping(target = "predecesseurs", ignore = true)
    @Mapping(target = "historiquesModification", ignore = true)
    EtapePlanifAG toEntity(EtapePlanifAGDTO dto);

    // Méthodes helper pour les enums

    @Named("dateCibleToString")
    default String dateCibleToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("dateRealisationToString")
    default String dateRealisationToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("dateDebutToString")
    default String dateDebutToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
