package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierReunionDTO;
import fr.d4immobilier.visionapirest.entities.FichierReunion;
import fr.d4immobilier.visionapirest.entities.PointAborde;
import fr.d4immobilier.visionapirest.entities.Reunion;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-12T18:34:53+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class FichierReunionMapperImpl implements FichierReunionMapper {

    @Override
    public List<FichierReunionDTO> toDTOList(List<FichierReunion> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierReunionDTO> list = new ArrayList<FichierReunionDTO>( entities.size() );
        for ( FichierReunion fichierReunion : entities ) {
            list.add( toDTO( fichierReunion ) );
        }

        return list;
    }

    @Override
    public FichierReunionDTO toDTO(FichierReunion entity) {
        if ( entity == null ) {
            return null;
        }

        FichierReunionDTO fichierReunionDTO = new FichierReunionDTO();

        fichierReunionDTO.setReunionId( entityReunionId( entity ) );
        fichierReunionDTO.setPointAbordeId( entityPointAbordeId( entity ) );
        fichierReunionDTO.setId( entity.getId() );

        return fichierReunionDTO;
    }

    @Override
    public FichierReunion toEntity(FichierReunionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierReunion fichierReunion = new FichierReunion();

        fichierReunion.setId( dto.getId() );

        return fichierReunion;
    }

    private Long entityReunionId(FichierReunion fichierReunion) {
        if ( fichierReunion == null ) {
            return null;
        }
        Reunion reunion = fichierReunion.getReunion();
        if ( reunion == null ) {
            return null;
        }
        Long id = reunion.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityPointAbordeId(FichierReunion fichierReunion) {
        if ( fichierReunion == null ) {
            return null;
        }
        PointAborde pointAborde = fichierReunion.getPointAborde();
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
