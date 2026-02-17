package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PlanningGestionnaireDTO;
import fr.d4immobilier.visionapirest.entities.DemiJournee;
import fr.d4immobilier.visionapirest.entities.Gestionnaire;
import fr.d4immobilier.visionapirest.entities.MotifAbsenceGestionnaire;
import fr.d4immobilier.visionapirest.entities.PlanningGestionnaire;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-17T10:51:57+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class PlanningGestionnaireMapperImpl implements PlanningGestionnaireMapper {

    @Override
    public List<PlanningGestionnaireDTO> toDTOList(List<PlanningGestionnaire> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PlanningGestionnaireDTO> list = new ArrayList<PlanningGestionnaireDTO>( entities.size() );
        for ( PlanningGestionnaire planningGestionnaire : entities ) {
            list.add( toDTO( planningGestionnaire ) );
        }

        return list;
    }

    @Override
    public PlanningGestionnaireDTO toDTO(PlanningGestionnaire entity) {
        if ( entity == null ) {
            return null;
        }

        PlanningGestionnaireDTO planningGestionnaireDTO = new PlanningGestionnaireDTO();

        planningGestionnaireDTO.setGestionnaireId( entityGestionnaireId( entity ) );
        planningGestionnaireDTO.setDemiJournee( demiJourneeToString( entity.getDemiJournee() ) );
        planningGestionnaireDTO.setMotifAbsenceGestionnaire( motifAbsenceGestionnaireToString( entity.getMotifAbsenceGestionnaire() ) );
        planningGestionnaireDTO.setId( entity.getId() );
        planningGestionnaireDTO.setDatePlanning( entity.getDatePlanning() );
        planningGestionnaireDTO.setLog( entity.getLog() );

        return planningGestionnaireDTO;
    }

    @Override
    public PlanningGestionnaire toEntity(PlanningGestionnaireDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PlanningGestionnaire planningGestionnaire = new PlanningGestionnaire();

        planningGestionnaire.setId( dto.getId() );
        planningGestionnaire.setDatePlanning( dto.getDatePlanning() );
        if ( dto.getDemiJournee() != null ) {
            planningGestionnaire.setDemiJournee( Enum.valueOf( DemiJournee.class, dto.getDemiJournee() ) );
        }
        if ( dto.getMotifAbsenceGestionnaire() != null ) {
            planningGestionnaire.setMotifAbsenceGestionnaire( Enum.valueOf( MotifAbsenceGestionnaire.class, dto.getMotifAbsenceGestionnaire() ) );
        }
        planningGestionnaire.setLog( dto.getLog() );

        return planningGestionnaire;
    }

    private Long entityGestionnaireId(PlanningGestionnaire planningGestionnaire) {
        if ( planningGestionnaire == null ) {
            return null;
        }
        Gestionnaire gestionnaire = planningGestionnaire.getGestionnaire();
        if ( gestionnaire == null ) {
            return null;
        }
        Long id = gestionnaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
