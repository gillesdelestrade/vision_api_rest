package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.GestionnaireDTO;
import fr.d4immobilier.visionapirest.entities.Agence;
import fr.d4immobilier.visionapirest.entities.Gestionnaire;
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
public class GestionnaireMapperImpl implements GestionnaireMapper {

    @Override
    public List<GestionnaireDTO> toDTOList(List<Gestionnaire> entities) {
        if ( entities == null ) {
            return null;
        }

        List<GestionnaireDTO> list = new ArrayList<GestionnaireDTO>( entities.size() );
        for ( Gestionnaire gestionnaire : entities ) {
            list.add( toDTO( gestionnaire ) );
        }

        return list;
    }

    @Override
    public GestionnaireDTO toDTO(Gestionnaire entity) {
        if ( entity == null ) {
            return null;
        }

        GestionnaireDTO gestionnaireDTO = new GestionnaireDTO();

        gestionnaireDTO.setAgenceId( entityAgenceId( entity ) );
        gestionnaireDTO.setId( entity.getId() );
        gestionnaireDTO.setNumeroDePoste( entity.getNumeroDePoste() );
        gestionnaireDTO.setInitialesICS( entity.getInitialesICS() );
        gestionnaireDTO.setFonctiond4( entity.getFonctiond4() );

        return gestionnaireDTO;
    }

    @Override
    public Gestionnaire toEntity(GestionnaireDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Gestionnaire gestionnaire = new Gestionnaire();

        gestionnaire.setId( dto.getId() );
        gestionnaire.setNumeroDePoste( dto.getNumeroDePoste() );
        gestionnaire.setInitialesICS( dto.getInitialesICS() );
        gestionnaire.setFonctiond4( dto.getFonctiond4() );

        return gestionnaire;
    }

    private Long entityAgenceId(Gestionnaire gestionnaire) {
        if ( gestionnaire == null ) {
            return null;
        }
        Agence agence = gestionnaire.getAgence();
        if ( agence == null ) {
            return null;
        }
        Long id = agence.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
