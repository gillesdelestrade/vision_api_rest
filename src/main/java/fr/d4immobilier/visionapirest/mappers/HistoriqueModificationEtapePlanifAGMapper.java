package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.HistoriqueModificationEtapePlanifAGDTO;
import fr.d4immobilier.visionapirest.entities.HistoriqueModificationEtapePlanifAG;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface HistoriqueModificationEtapePlanifAGMapper extends GenericMapper<HistoriqueModificationEtapePlanifAG, HistoriqueModificationEtapePlanifAGDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "etapePlanifAG.id", target = "etapePlanifAGId")
    @Mapping(source = "ancienActeur.id", target = "ancienActeurId")
    @Mapping(source = "nouvelActeur.id", target = "nouvelActeurId")
    @Mapping(source = "dateModification", target = "dateModification", qualifiedByName = "dateModificationToString")
    @Mapping(source = "ancienneDateCible", target = "ancienneDateCible", qualifiedByName = "ancienneDateCibleToString")
    @Mapping(source = "nouvelleDateCible", target = "nouvelleDateCible", qualifiedByName = "nouvelleDateCibleToString")
    @Mapping(source = "modeModification", target = "modeModification", qualifiedByName = "modeModificationToString")
    HistoriqueModificationEtapePlanifAGDTO toDTO(HistoriqueModificationEtapePlanifAG entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "etapePlanifAG", ignore = true)
    @Mapping(target = "ancienActeur", ignore = true)
    @Mapping(target = "nouvelActeur", ignore = true)
    HistoriqueModificationEtapePlanifAG toEntity(HistoriqueModificationEtapePlanifAGDTO dto);

    // Méthodes helper pour les enums

    @Named("dateModificationToString")
    default String dateModificationToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("ancienneDateCibleToString")
    default String ancienneDateCibleToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("nouvelleDateCibleToString")
    default String nouvelleDateCibleToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("modeModificationToString")
    default String modeModificationToString(fr.d4immobilier.visionapirest.entities.ModeModificationEtapePlanifAG value) {
        return value != null ? value.name() : null;
    }
}
