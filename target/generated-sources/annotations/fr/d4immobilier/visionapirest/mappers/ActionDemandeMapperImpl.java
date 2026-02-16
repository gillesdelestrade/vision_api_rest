package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ActionDemandeDTO;
import fr.d4immobilier.visionapirest.entities.ActionDemande;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.entities.ReunionV2;
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
public class ActionDemandeMapperImpl implements ActionDemandeMapper {

    @Override
    public List<ActionDemandeDTO> toDTOList(List<ActionDemande> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ActionDemandeDTO> list = new ArrayList<ActionDemandeDTO>( entities.size() );
        for ( ActionDemande actionDemande : entities ) {
            list.add( toDTO( actionDemande ) );
        }

        return list;
    }

    @Override
    public ActionDemandeDTO toDTO(ActionDemande entity) {
        if ( entity == null ) {
            return null;
        }

        ActionDemandeDTO actionDemandeDTO = new ActionDemandeDTO();

        actionDemandeDTO.setReunionV2Id( entityReunionV2Id( entity ) );
        actionDemandeDTO.setDemandeId( entityDemandeId( entity ) );
        actionDemandeDTO.setId( entity.getId() );

        return actionDemandeDTO;
    }

    @Override
    public ActionDemande toEntity(ActionDemandeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ActionDemande actionDemande = new ActionDemande();

        actionDemande.setId( dto.getId() );

        return actionDemande;
    }

    private Long entityReunionV2Id(ActionDemande actionDemande) {
        if ( actionDemande == null ) {
            return null;
        }
        ReunionV2 reunionV2 = actionDemande.getReunionV2();
        if ( reunionV2 == null ) {
            return null;
        }
        Long id = reunionV2.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDemandeId(ActionDemande actionDemande) {
        if ( actionDemande == null ) {
            return null;
        }
        Demande demande = actionDemande.getDemande();
        if ( demande == null ) {
            return null;
        }
        Long id = demande.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
