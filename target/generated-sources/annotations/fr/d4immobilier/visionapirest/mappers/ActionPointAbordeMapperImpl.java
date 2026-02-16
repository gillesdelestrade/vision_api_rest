package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ActionPointAbordeDTO;
import fr.d4immobilier.visionapirest.entities.ActionPointAborde;
import fr.d4immobilier.visionapirest.entities.PointAborde;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T17:26:49+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class ActionPointAbordeMapperImpl implements ActionPointAbordeMapper {

    @Override
    public List<ActionPointAbordeDTO> toDTOList(List<ActionPointAborde> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ActionPointAbordeDTO> list = new ArrayList<ActionPointAbordeDTO>( entities.size() );
        for ( ActionPointAborde actionPointAborde : entities ) {
            list.add( toDTO( actionPointAborde ) );
        }

        return list;
    }

    @Override
    public ActionPointAbordeDTO toDTO(ActionPointAborde entity) {
        if ( entity == null ) {
            return null;
        }

        ActionPointAbordeDTO actionPointAbordeDTO = new ActionPointAbordeDTO();

        actionPointAbordeDTO.setPointAbordeId( entityPointAbordeId( entity ) );
        actionPointAbordeDTO.setId( entity.getId() );

        return actionPointAbordeDTO;
    }

    @Override
    public ActionPointAborde toEntity(ActionPointAbordeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ActionPointAborde actionPointAborde = new ActionPointAborde();

        actionPointAborde.setId( dto.getId() );

        return actionPointAborde;
    }

    private Long entityPointAbordeId(ActionPointAborde actionPointAborde) {
        if ( actionPointAborde == null ) {
            return null;
        }
        PointAborde pointAborde = actionPointAborde.getPointAborde();
        if ( pointAborde == null ) {
            return null;
        }
        Long id = pointAborde.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
