package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AppelEntrantDTO;
import fr.d4immobilier.visionapirest.entities.AppelEntrant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface AppelEntrantMapper extends GenericMapper<AppelEntrant, AppelEntrantDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "appelantPersonne.id", target = "appelantPersonneId")
    @Mapping(source = "appelantSociete.id", target = "appelantSocieteId")
    @Mapping(source = "interlocuteurD4.id", target = "interlocuteurD4Id")
    @Mapping(source = "demande.id", target = "demandeId")
    @Mapping(source = "dateDebutAppel", target = "dateDebutAppel", qualifiedByName = "dateDebutAppelToString")
    @Mapping(source = "dateFinAppel", target = "dateFinAppel", qualifiedByName = "dateFinAppelToString")
    AppelEntrantDTO toDTO(AppelEntrant entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "appelantPersonne", ignore = true)
    @Mapping(target = "appelantSociete", ignore = true)
    @Mapping(target = "interlocuteurD4", ignore = true)
    @Mapping(target = "demande", ignore = true)
    AppelEntrant toEntity(AppelEntrantDTO dto);

    // Méthodes helper pour les enums

    @Named("dateDebutAppelToString")
    default String dateDebutAppelToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("dateFinAppelToString")
    default String dateFinAppelToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
