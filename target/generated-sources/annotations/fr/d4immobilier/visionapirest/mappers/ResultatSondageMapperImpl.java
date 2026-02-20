package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ResultatSondageDTO;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.entities.PropositionSondage;
import fr.d4immobilier.visionapirest.entities.ResultatSondage;
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
public class ResultatSondageMapperImpl implements ResultatSondageMapper {

    @Override
    public List<ResultatSondageDTO> toDTOList(List<ResultatSondage> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ResultatSondageDTO> list = new ArrayList<ResultatSondageDTO>( entities.size() );
        for ( ResultatSondage resultatSondage : entities ) {
            list.add( toDTO( resultatSondage ) );
        }

        return list;
    }

    @Override
    public ResultatSondageDTO toDTO(ResultatSondage entity) {
        if ( entity == null ) {
            return null;
        }

        ResultatSondageDTO resultatSondageDTO = new ResultatSondageDTO();

        resultatSondageDTO.setCoproprietaireId( entityCoproprietaireId( entity ) );
        resultatSondageDTO.setPropositionSondageId( entityPropositionSondageId( entity ) );
        resultatSondageDTO.setId( entity.getId() );
        resultatSondageDTO.setCommentaire( entity.getCommentaire() );

        return resultatSondageDTO;
    }

    @Override
    public ResultatSondage toEntity(ResultatSondageDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ResultatSondage resultatSondage = new ResultatSondage();

        resultatSondage.setId( dto.getId() );
        resultatSondage.setCommentaire( dto.getCommentaire() );

        return resultatSondage;
    }

    private Long entityCoproprietaireId(ResultatSondage resultatSondage) {
        if ( resultatSondage == null ) {
            return null;
        }
        Coproprietaire coproprietaire = resultatSondage.getCoproprietaire();
        if ( coproprietaire == null ) {
            return null;
        }
        Long id = coproprietaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityPropositionSondageId(ResultatSondage resultatSondage) {
        if ( resultatSondage == null ) {
            return null;
        }
        PropositionSondage propositionSondage = resultatSondage.getPropositionSondage();
        if ( propositionSondage == null ) {
            return null;
        }
        Long id = propositionSondage.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
