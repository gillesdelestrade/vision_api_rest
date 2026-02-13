package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.RejetPrelevementDTO;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.entities.Fichier;
import fr.d4immobilier.visionapirest.entities.MouvementBancaire;
import fr.d4immobilier.visionapirest.entities.RejetPrelevement;
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
public class RejetPrelevementMapperImpl implements RejetPrelevementMapper {

    @Override
    public List<RejetPrelevementDTO> toDTOList(List<RejetPrelevement> entities) {
        if ( entities == null ) {
            return null;
        }

        List<RejetPrelevementDTO> list = new ArrayList<RejetPrelevementDTO>( entities.size() );
        for ( RejetPrelevement rejetPrelevement : entities ) {
            list.add( toDTO( rejetPrelevement ) );
        }

        return list;
    }

    @Override
    public RejetPrelevementDTO toDTO(RejetPrelevement entity) {
        if ( entity == null ) {
            return null;
        }

        RejetPrelevementDTO rejetPrelevementDTO = new RejetPrelevementDTO();

        rejetPrelevementDTO.setCoproprietaireId( entityCoproprietaireId( entity ) );
        rejetPrelevementDTO.setMouvementBancaireId( entityMouvementBancaireId( entity ) );
        rejetPrelevementDTO.setFichierId( entityFichierId( entity ) );
        rejetPrelevementDTO.setId( entity.getId() );
        rejetPrelevementDTO.setDateTraitement( entity.getDateTraitement() );
        rejetPrelevementDTO.setCommentaire( entity.getCommentaire() );

        return rejetPrelevementDTO;
    }

    @Override
    public RejetPrelevement toEntity(RejetPrelevementDTO dto) {
        if ( dto == null ) {
            return null;
        }

        RejetPrelevement rejetPrelevement = new RejetPrelevement();

        rejetPrelevement.setId( dto.getId() );
        rejetPrelevement.setDateTraitement( dto.getDateTraitement() );
        rejetPrelevement.setCommentaire( dto.getCommentaire() );

        return rejetPrelevement;
    }

    private Long entityCoproprietaireId(RejetPrelevement rejetPrelevement) {
        if ( rejetPrelevement == null ) {
            return null;
        }
        Coproprietaire coproprietaire = rejetPrelevement.getCoproprietaire();
        if ( coproprietaire == null ) {
            return null;
        }
        Long id = coproprietaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityMouvementBancaireId(RejetPrelevement rejetPrelevement) {
        if ( rejetPrelevement == null ) {
            return null;
        }
        MouvementBancaire mouvementBancaire = rejetPrelevement.getMouvementBancaire();
        if ( mouvementBancaire == null ) {
            return null;
        }
        Long id = mouvementBancaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierId(RejetPrelevement rejetPrelevement) {
        if ( rejetPrelevement == null ) {
            return null;
        }
        Fichier fichier = rejetPrelevement.getFichier();
        if ( fichier == null ) {
            return null;
        }
        Long id = fichier.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
