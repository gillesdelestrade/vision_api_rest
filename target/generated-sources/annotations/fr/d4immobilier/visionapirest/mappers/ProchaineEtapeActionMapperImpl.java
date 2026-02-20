package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ProchaineEtapeActionDTO;
import fr.d4immobilier.visionapirest.entities.Action;
import fr.d4immobilier.visionapirest.entities.ProchaineEtapeAction;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-20T08:40:21+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class ProchaineEtapeActionMapperImpl implements ProchaineEtapeActionMapper {

    @Override
    public List<ProchaineEtapeActionDTO> toDTOList(List<ProchaineEtapeAction> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ProchaineEtapeActionDTO> list = new ArrayList<ProchaineEtapeActionDTO>( entities.size() );
        for ( ProchaineEtapeAction prochaineEtapeAction : entities ) {
            list.add( toDTO( prochaineEtapeAction ) );
        }

        return list;
    }

    @Override
    public ProchaineEtapeActionDTO toDTO(ProchaineEtapeAction entity) {
        if ( entity == null ) {
            return null;
        }

        ProchaineEtapeActionDTO prochaineEtapeActionDTO = new ProchaineEtapeActionDTO();

        prochaineEtapeActionDTO.setActionId( entityActionId( entity ) );
        prochaineEtapeActionDTO.setId( entity.getId() );

        return prochaineEtapeActionDTO;
    }

    @Override
    public ProchaineEtapeAction toEntity(ProchaineEtapeActionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ProchaineEtapeAction prochaineEtapeAction = new ProchaineEtapeAction();

        prochaineEtapeAction.setId( dto.getId() );

        return prochaineEtapeAction;
    }

    private Long entityActionId(ProchaineEtapeAction prochaineEtapeAction) {
        if ( prochaineEtapeAction == null ) {
            return null;
        }
        Action action = prochaineEtapeAction.getAction();
        if ( action == null ) {
            return null;
        }
        Long id = action.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
