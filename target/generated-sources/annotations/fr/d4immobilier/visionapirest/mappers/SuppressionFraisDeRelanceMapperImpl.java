package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.SuppressionFraisDeRelanceDTO;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.entities.SuppressionFraisDeRelance;
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
public class SuppressionFraisDeRelanceMapperImpl implements SuppressionFraisDeRelanceMapper {

    @Override
    public List<SuppressionFraisDeRelanceDTO> toDTOList(List<SuppressionFraisDeRelance> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SuppressionFraisDeRelanceDTO> list = new ArrayList<SuppressionFraisDeRelanceDTO>( entities.size() );
        for ( SuppressionFraisDeRelance suppressionFraisDeRelance : entities ) {
            list.add( toDTO( suppressionFraisDeRelance ) );
        }

        return list;
    }

    @Override
    public SuppressionFraisDeRelanceDTO toDTO(SuppressionFraisDeRelance entity) {
        if ( entity == null ) {
            return null;
        }

        SuppressionFraisDeRelanceDTO suppressionFraisDeRelanceDTO = new SuppressionFraisDeRelanceDTO();

        suppressionFraisDeRelanceDTO.setCoproprietaireId( entityCoproprietaireId( entity ) );
        suppressionFraisDeRelanceDTO.setId( entity.getId() );
        suppressionFraisDeRelanceDTO.setDateDemandeSuppression( entity.getDateDemandeSuppression() );
        suppressionFraisDeRelanceDTO.setMotif( entity.getMotif() );
        suppressionFraisDeRelanceDTO.setFraisSupprimes( entity.getFraisSupprimes() );

        return suppressionFraisDeRelanceDTO;
    }

    @Override
    public SuppressionFraisDeRelance toEntity(SuppressionFraisDeRelanceDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SuppressionFraisDeRelance suppressionFraisDeRelance = new SuppressionFraisDeRelance();

        suppressionFraisDeRelance.setId( dto.getId() );
        suppressionFraisDeRelance.setDateDemandeSuppression( dto.getDateDemandeSuppression() );
        suppressionFraisDeRelance.setMotif( dto.getMotif() );
        suppressionFraisDeRelance.setFraisSupprimes( dto.getFraisSupprimes() );

        return suppressionFraisDeRelance;
    }

    private Long entityCoproprietaireId(SuppressionFraisDeRelance suppressionFraisDeRelance) {
        if ( suppressionFraisDeRelance == null ) {
            return null;
        }
        Coproprietaire coproprietaire = suppressionFraisDeRelance.getCoproprietaire();
        if ( coproprietaire == null ) {
            return null;
        }
        Long id = coproprietaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
