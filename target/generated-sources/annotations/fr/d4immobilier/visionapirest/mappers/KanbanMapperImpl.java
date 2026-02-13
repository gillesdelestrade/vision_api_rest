package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.KanbanDTO;
import fr.d4immobilier.visionapirest.entities.Kanban;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-13T14:09:30+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class KanbanMapperImpl implements KanbanMapper {

    @Override
    public List<KanbanDTO> toDTOList(List<Kanban> entities) {
        if ( entities == null ) {
            return null;
        }

        List<KanbanDTO> list = new ArrayList<KanbanDTO>( entities.size() );
        for ( Kanban kanban : entities ) {
            list.add( toDTO( kanban ) );
        }

        return list;
    }

    @Override
    public KanbanDTO toDTO(Kanban entity) {
        if ( entity == null ) {
            return null;
        }

        KanbanDTO kanbanDTO = new KanbanDTO();

        kanbanDTO.setId( entity.getId() );
        kanbanDTO.setTitre( entity.getTitre() );
        kanbanDTO.setDescription( entity.getDescription() );

        return kanbanDTO;
    }

    @Override
    public Kanban toEntity(KanbanDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Kanban kanban = new Kanban();

        kanban.setId( dto.getId() );
        kanban.setTitre( dto.getTitre() );
        kanban.setDescription( dto.getDescription() );

        return kanban;
    }
}
