package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ActionDTO;
import fr.d4immobilier.visionapirest.entities.Action;
import fr.d4immobilier.visionapirest.entities.Courrier;
import fr.d4immobilier.visionapirest.entities.Importance;
import fr.d4immobilier.visionapirest.entities.Personne;
import fr.d4immobilier.visionapirest.entities.Urgence;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-13T14:09:30+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class ActionMapperImpl implements ActionMapper {

    @Override
    public List<ActionDTO> toDTOList(List<Action> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ActionDTO> list = new ArrayList<ActionDTO>( entities.size() );
        for ( Action action : entities ) {
            list.add( toDTO( action ) );
        }

        return list;
    }

    @Override
    public ActionDTO toDTO(Action entity) {
        if ( entity == null ) {
            return null;
        }

        ActionDTO actionDTO = new ActionDTO();

        actionDTO.setCourrierId( entityCourrierId( entity ) );
        actionDTO.setEmetteurId( entityEmetteurId( entity ) );
        actionDTO.setExecuteurId( entityExecuteurId( entity ) );
        actionDTO.setPersonneSignalantTermineId( entityPersonneSignalantTermineId( entity ) );
        actionDTO.setDateCreation( dateCreationToString( entity.getDateCreation() ) );
        actionDTO.setDatePrevue( datePrevueToString( entity.getDatePrevue() ) );
        actionDTO.setDateRealisation( dateRealisationToString( entity.getDateRealisation() ) );
        actionDTO.setImportance( importanceToString( entity.getImportance() ) );
        actionDTO.setUrgence( urgenceToString( entity.getUrgence() ) );
        actionDTO.setId( entity.getId() );
        actionDTO.setLibelle( entity.getLibelle() );
        actionDTO.setCommentaire( entity.getCommentaire() );
        actionDTO.setNotBefore( entity.getNotBefore() );
        actionDTO.setDateSignaleTermineParCoproprietaire( entity.getDateSignaleTermineParCoproprietaire() );

        return actionDTO;
    }

    @Override
    public Action toEntity(ActionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Action action = new Action();

        action.setId( dto.getId() );
        if ( dto.getDatePrevue() != null ) {
            action.setDatePrevue( Instant.parse( dto.getDatePrevue() ) );
        }
        if ( dto.getDateRealisation() != null ) {
            action.setDateRealisation( Instant.parse( dto.getDateRealisation() ) );
        }
        if ( dto.getImportance() != null ) {
            action.setImportance( Enum.valueOf( Importance.class, dto.getImportance() ) );
        }
        if ( dto.getUrgence() != null ) {
            action.setUrgence( Enum.valueOf( Urgence.class, dto.getUrgence() ) );
        }
        action.setLibelle( dto.getLibelle() );
        action.setCommentaire( dto.getCommentaire() );
        if ( dto.getDateCreation() != null ) {
            action.setDateCreation( Instant.parse( dto.getDateCreation() ) );
        }
        action.setNotBefore( dto.getNotBefore() );
        action.setDateSignaleTermineParCoproprietaire( dto.getDateSignaleTermineParCoproprietaire() );

        return action;
    }

    private Long entityCourrierId(Action action) {
        if ( action == null ) {
            return null;
        }
        Courrier courrier = action.getCourrier();
        if ( courrier == null ) {
            return null;
        }
        Long id = courrier.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityEmetteurId(Action action) {
        if ( action == null ) {
            return null;
        }
        Personne emetteur = action.getEmetteur();
        if ( emetteur == null ) {
            return null;
        }
        Long id = emetteur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityExecuteurId(Action action) {
        if ( action == null ) {
            return null;
        }
        Personne executeur = action.getExecuteur();
        if ( executeur == null ) {
            return null;
        }
        Long id = executeur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityPersonneSignalantTermineId(Action action) {
        if ( action == null ) {
            return null;
        }
        Personne personneSignalantTermine = action.getPersonneSignalantTermine();
        if ( personneSignalantTermine == null ) {
            return null;
        }
        Long id = personneSignalantTermine.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
