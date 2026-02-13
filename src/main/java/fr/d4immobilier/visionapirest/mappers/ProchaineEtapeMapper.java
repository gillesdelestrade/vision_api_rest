package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ProchaineEtapeDTO;
import fr.d4immobilier.visionapirest.entities.ProchaineEtape;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ProchaineEtapeMapper extends GenericMapper<ProchaineEtape, ProchaineEtapeDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "prochaineEtapeType.id", target = "prochaineEtapeTypeId")
    @Mapping(source = "dateDebut", target = "dateDebut", qualifiedByName = "dateDebutToString")
    @Mapping(source = "dateFin", target = "dateFin", qualifiedByName = "dateFinToString")
    ProchaineEtapeDTO toDTO(ProchaineEtape entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "prochaineEtapeType", ignore = true)
    ProchaineEtape toEntity(ProchaineEtapeDTO dto);

    // Méthodes helper pour les enums

    @Named("dateDebutToString")
    default String dateDebutToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("dateFinToString")
    default String dateFinToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
