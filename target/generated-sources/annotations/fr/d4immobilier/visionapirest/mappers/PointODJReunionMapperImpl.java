package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PointODJReunionDTO;
import fr.d4immobilier.visionapirest.entities.AttenduCS;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.entities.ODJReunion;
import fr.d4immobilier.visionapirest.entities.PointODJReunion;
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
public class PointODJReunionMapperImpl implements PointODJReunionMapper {

    @Override
    public List<PointODJReunionDTO> toDTOList(List<PointODJReunion> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PointODJReunionDTO> list = new ArrayList<PointODJReunionDTO>( entities.size() );
        for ( PointODJReunion pointODJReunion : entities ) {
            list.add( toDTO( pointODJReunion ) );
        }

        return list;
    }

    @Override
    public PointODJReunionDTO toDTO(PointODJReunion entity) {
        if ( entity == null ) {
            return null;
        }

        PointODJReunionDTO pointODJReunionDTO = new PointODJReunionDTO();

        pointODJReunionDTO.setODJReunionId( entityODJReunionId( entity ) );
        pointODJReunionDTO.setDemandeId( entityDemandeId( entity ) );
        pointODJReunionDTO.setAttenduCSId( entityAttenduCSId( entity ) );
        pointODJReunionDTO.setId( entity.getId() );
        pointODJReunionDTO.setNumero( entity.getNumero() );
        pointODJReunionDTO.setObtenu( entity.getObtenu() );

        return pointODJReunionDTO;
    }

    @Override
    public PointODJReunion toEntity(PointODJReunionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PointODJReunion pointODJReunion = new PointODJReunion();

        pointODJReunion.setId( dto.getId() );
        pointODJReunion.setNumero( dto.getNumero() );
        pointODJReunion.setObtenu( dto.getObtenu() );

        return pointODJReunion;
    }

    private Long entityODJReunionId(PointODJReunion pointODJReunion) {
        if ( pointODJReunion == null ) {
            return null;
        }
        ODJReunion oDJReunion = pointODJReunion.getoDJReunion();
        if ( oDJReunion == null ) {
            return null;
        }
        Long id = oDJReunion.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDemandeId(PointODJReunion pointODJReunion) {
        if ( pointODJReunion == null ) {
            return null;
        }
        Demande demande = pointODJReunion.getDemande();
        if ( demande == null ) {
            return null;
        }
        Long id = demande.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAttenduCSId(PointODJReunion pointODJReunion) {
        if ( pointODJReunion == null ) {
            return null;
        }
        AttenduCS attenduCS = pointODJReunion.getAttenduCS();
        if ( attenduCS == null ) {
            return null;
        }
        Long id = attenduCS.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
