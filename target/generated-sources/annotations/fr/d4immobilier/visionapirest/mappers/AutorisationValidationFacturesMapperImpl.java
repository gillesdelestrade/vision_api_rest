package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AutorisationValidationFacturesDTO;
import fr.d4immobilier.visionapirest.entities.AutorisationValidationFactures;
import fr.d4immobilier.visionapirest.entities.ConseilSyndical;
import fr.d4immobilier.visionapirest.entities.Personne;
import fr.d4immobilier.visionapirest.entities.Societe;
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
public class AutorisationValidationFacturesMapperImpl implements AutorisationValidationFacturesMapper {

    @Override
    public List<AutorisationValidationFacturesDTO> toDTOList(List<AutorisationValidationFactures> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AutorisationValidationFacturesDTO> list = new ArrayList<AutorisationValidationFacturesDTO>( entities.size() );
        for ( AutorisationValidationFactures autorisationValidationFactures : entities ) {
            list.add( toDTO( autorisationValidationFactures ) );
        }

        return list;
    }

    @Override
    public AutorisationValidationFacturesDTO toDTO(AutorisationValidationFactures entity) {
        if ( entity == null ) {
            return null;
        }

        AutorisationValidationFacturesDTO autorisationValidationFacturesDTO = new AutorisationValidationFacturesDTO();

        autorisationValidationFacturesDTO.setConseilSyndicalId( entityConseilSyndicalId( entity ) );
        autorisationValidationFacturesDTO.setPersonneId( entityPersonneId( entity ) );
        autorisationValidationFacturesDTO.setSocieteId( entitySocieteId( entity ) );
        autorisationValidationFacturesDTO.setId( entity.getId() );
        autorisationValidationFacturesDTO.setAutoriseAValiderLesFactures( entity.getAutoriseAValiderLesFactures() );

        return autorisationValidationFacturesDTO;
    }

    @Override
    public AutorisationValidationFactures toEntity(AutorisationValidationFacturesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AutorisationValidationFactures autorisationValidationFactures = new AutorisationValidationFactures();

        autorisationValidationFactures.setId( dto.getId() );
        autorisationValidationFactures.setAutoriseAValiderLesFactures( dto.getAutoriseAValiderLesFactures() );

        return autorisationValidationFactures;
    }

    private Long entityConseilSyndicalId(AutorisationValidationFactures autorisationValidationFactures) {
        if ( autorisationValidationFactures == null ) {
            return null;
        }
        ConseilSyndical conseilSyndical = autorisationValidationFactures.getConseilSyndical();
        if ( conseilSyndical == null ) {
            return null;
        }
        Long id = conseilSyndical.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityPersonneId(AutorisationValidationFactures autorisationValidationFactures) {
        if ( autorisationValidationFactures == null ) {
            return null;
        }
        Personne personne = autorisationValidationFactures.getPersonne();
        if ( personne == null ) {
            return null;
        }
        Long id = personne.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entitySocieteId(AutorisationValidationFactures autorisationValidationFactures) {
        if ( autorisationValidationFactures == null ) {
            return null;
        }
        Societe societe = autorisationValidationFactures.getSociete();
        if ( societe == null ) {
            return null;
        }
        Long id = societe.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
