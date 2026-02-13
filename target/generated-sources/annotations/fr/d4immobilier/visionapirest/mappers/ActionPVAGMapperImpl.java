package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ActionPVAGDTO;
import fr.d4immobilier.visionapirest.entities.ActionPVAG;
import fr.d4immobilier.visionapirest.entities.PVAG;
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
public class ActionPVAGMapperImpl implements ActionPVAGMapper {

    @Override
    public List<ActionPVAGDTO> toDTOList(List<ActionPVAG> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ActionPVAGDTO> list = new ArrayList<ActionPVAGDTO>( entities.size() );
        for ( ActionPVAG actionPVAG : entities ) {
            list.add( toDTO( actionPVAG ) );
        }

        return list;
    }

    @Override
    public ActionPVAGDTO toDTO(ActionPVAG entity) {
        if ( entity == null ) {
            return null;
        }

        ActionPVAGDTO actionPVAGDTO = new ActionPVAGDTO();

        actionPVAGDTO.setPvagId( entityPvagId( entity ) );
        actionPVAGDTO.setId( entity.getId() );

        return actionPVAGDTO;
    }

    @Override
    public ActionPVAG toEntity(ActionPVAGDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ActionPVAG actionPVAG = new ActionPVAG();

        actionPVAG.setId( dto.getId() );

        return actionPVAG;
    }

    private Long entityPvagId(ActionPVAG actionPVAG) {
        if ( actionPVAG == null ) {
            return null;
        }
        PVAG pvag = actionPVAG.getPvag();
        if ( pvag == null ) {
            return null;
        }
        Long id = pvag.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
