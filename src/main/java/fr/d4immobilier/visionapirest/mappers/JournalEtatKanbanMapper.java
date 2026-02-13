package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.JournalEtatKanbanDTO;
import fr.d4immobilier.visionapirest.entities.JournalEtatKanban;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface JournalEtatKanbanMapper extends GenericMapper<JournalEtatKanban, JournalEtatKanbanDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "demande.id", target = "demandeId")
    @Mapping(source = "etatKanban.id", target = "etatKanbanId")
    @Mapping(source = "dateEntree", target = "dateEntree", qualifiedByName = "dateEntreeToString")
    @Mapping(source = "dateSortie", target = "dateSortie", qualifiedByName = "dateSortieToString")
    JournalEtatKanbanDTO toDTO(JournalEtatKanban entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "demande", ignore = true)
    @Mapping(target = "etatKanban", ignore = true)
    JournalEtatKanban toEntity(JournalEtatKanbanDTO dto);

    // Méthodes helper pour les enums

    @Named("dateEntreeToString")
    default String dateEntreeToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("dateSortieToString")
    default String dateSortieToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
