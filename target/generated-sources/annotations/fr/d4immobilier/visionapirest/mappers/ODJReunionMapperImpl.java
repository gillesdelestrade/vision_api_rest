package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ODJReunionDTO;
import fr.d4immobilier.visionapirest.entities.ODJReunion;
import fr.d4immobilier.visionapirest.entities.Reunion;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T17:26:49+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class ODJReunionMapperImpl implements ODJReunionMapper {

    @Override
    public List<ODJReunionDTO> toDTOList(List<ODJReunion> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ODJReunionDTO> list = new ArrayList<ODJReunionDTO>( entities.size() );
        for ( ODJReunion oDJReunion : entities ) {
            list.add( toDTO( oDJReunion ) );
        }

        return list;
    }

    @Override
    public ODJReunionDTO toDTO(ODJReunion entity) {
        if ( entity == null ) {
            return null;
        }

        ODJReunionDTO oDJReunionDTO = new ODJReunionDTO();

        oDJReunionDTO.setReunionId( entityReunionId( entity ) );
        oDJReunionDTO.setDateCreation( dateCreationToString( entity.getDateCreation() ) );
        oDJReunionDTO.setDateModification( dateModificationToString( entity.getDateModification() ) );
        oDJReunionDTO.setDateReunionPrevue( dateReunionPrevueToString( entity.getDateReunionPrevue() ) );
        oDJReunionDTO.setId( entity.getId() );
        oDJReunionDTO.setDateProvisoire( entity.getDateProvisoire() );
        oDJReunionDTO.setLieuReunion( entity.getLieuReunion() );

        return oDJReunionDTO;
    }

    @Override
    public ODJReunion toEntity(ODJReunionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ODJReunion oDJReunion = new ODJReunion();

        oDJReunion.setId( dto.getId() );
        if ( dto.getDateCreation() != null ) {
            oDJReunion.setDateCreation( Instant.parse( dto.getDateCreation() ) );
        }
        if ( dto.getDateModification() != null ) {
            oDJReunion.setDateModification( Instant.parse( dto.getDateModification() ) );
        }
        if ( dto.getDateReunionPrevue() != null ) {
            oDJReunion.setDateReunionPrevue( Instant.parse( dto.getDateReunionPrevue() ) );
        }
        oDJReunion.setDateProvisoire( dto.getDateProvisoire() );
        oDJReunion.setLieuReunion( dto.getLieuReunion() );

        return oDJReunion;
    }

    private Long entityReunionId(ODJReunion oDJReunion) {
        if ( oDJReunion == null ) {
            return null;
        }
        Reunion reunion = oDJReunion.getReunion();
        if ( reunion == null ) {
            return null;
        }
        Long id = reunion.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
