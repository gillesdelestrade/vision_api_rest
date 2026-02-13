package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.KanbanDTO;
import fr.d4immobilier.visionapirest.entities.Kanban;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface KanbanMapper extends GenericMapper<Kanban, KanbanDTO> {
    
    // Mapping de l'entité vers le DTO
    KanbanDTO toDTO(Kanban entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "etatsKanban", ignore = true)
    Kanban toEntity(KanbanDTO dto);
}
