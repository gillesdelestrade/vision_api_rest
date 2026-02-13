package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PointAbordeDTO;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.entities.PointAborde;
import fr.d4immobilier.visionapirest.entities.Reunion;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-12T18:34:52+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class PointAbordeMapperImpl implements PointAbordeMapper {

    @Override
    public List<PointAbordeDTO> toDTOList(List<PointAborde> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PointAbordeDTO> list = new ArrayList<PointAbordeDTO>( entities.size() );
        for ( PointAborde pointAborde : entities ) {
            list.add( toDTO( pointAborde ) );
        }

        return list;
    }

    @Override
    public PointAbordeDTO toDTO(PointAborde entity) {
        if ( entity == null ) {
            return null;
        }

        PointAbordeDTO pointAbordeDTO = new PointAbordeDTO();

        pointAbordeDTO.setReunionId( entityReunionId( entity ) );
        pointAbordeDTO.setDemandeId( entityDemandeId( entity ) );
        pointAbordeDTO.setId( entity.getId() );
        pointAbordeDTO.setDescription( entity.getDescription() );
        pointAbordeDTO.setCommentaire( entity.getCommentaire() );

        return pointAbordeDTO;
    }

    @Override
    public PointAborde toEntity(PointAbordeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PointAborde pointAborde = new PointAborde();

        pointAborde.setId( dto.getId() );
        pointAborde.setDescription( dto.getDescription() );
        pointAborde.setCommentaire( dto.getCommentaire() );

        return pointAborde;
    }

    private Long entityReunionId(PointAborde pointAborde) {
        if ( pointAborde == null ) {
            return null;
        }
        Reunion reunion = pointAborde.getReunion();
        if ( reunion == null ) {
            return null;
        }
        Long id = reunion.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDemandeId(PointAborde pointAborde) {
        if ( pointAborde == null ) {
            return null;
        }
        Demande demande = pointAborde.getDemande();
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
