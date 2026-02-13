package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EtatKanbanDTO;
import fr.d4immobilier.visionapirest.entities.EtatKanban;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface EtatKanbanMapper extends GenericMapper<EtatKanban, EtatKanbanDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "kanban.id", target = "kanbanId")
    @Mapping(source = "etatKanbanSuivant.id", target = "etatKanbanSuivantId")
    @Mapping(source = "couleurEtatKanban", target = "couleurEtatKanban", qualifiedByName = "couleurEtatKanbanToString")
    EtatKanbanDTO toDTO(EtatKanban entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "kanban", ignore = true)
    @Mapping(target = "etatKanbanSuivant", ignore = true)
    EtatKanban toEntity(EtatKanbanDTO dto);

    // Méthodes helper pour les enums

    @Named("couleurEtatKanbanToString")
    default String couleurEtatKanbanToString(fr.d4immobilier.visionapirest.entities.CouleurEtatKanban value) {
        return value != null ? value.name() : null;
    }
}
