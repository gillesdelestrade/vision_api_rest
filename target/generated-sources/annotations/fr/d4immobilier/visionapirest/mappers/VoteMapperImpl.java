package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.VoteDTO;
import fr.d4immobilier.visionapirest.entities.Affectation;
import fr.d4immobilier.visionapirest.entities.ChoixVote;
import fr.d4immobilier.visionapirest.entities.Resolution;
import fr.d4immobilier.visionapirest.entities.Vote;
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
public class VoteMapperImpl implements VoteMapper {

    @Override
    public List<VoteDTO> toDTOList(List<Vote> entities) {
        if ( entities == null ) {
            return null;
        }

        List<VoteDTO> list = new ArrayList<VoteDTO>( entities.size() );
        for ( Vote vote : entities ) {
            list.add( toDTO( vote ) );
        }

        return list;
    }

    @Override
    public VoteDTO toDTO(Vote entity) {
        if ( entity == null ) {
            return null;
        }

        VoteDTO voteDTO = new VoteDTO();

        voteDTO.setResolutionId( entityResolutionId( entity ) );
        voteDTO.setAffectationId( entityAffectationId( entity ) );
        voteDTO.setChoixVote( choixVoteToString( entity.getChoixVote() ) );
        voteDTO.setId( entity.getId() );

        return voteDTO;
    }

    @Override
    public Vote toEntity(VoteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Vote vote = new Vote();

        vote.setId( dto.getId() );
        if ( dto.getChoixVote() != null ) {
            vote.setChoixVote( Enum.valueOf( ChoixVote.class, dto.getChoixVote() ) );
        }

        return vote;
    }

    private Long entityResolutionId(Vote vote) {
        if ( vote == null ) {
            return null;
        }
        Resolution resolution = vote.getResolution();
        if ( resolution == null ) {
            return null;
        }
        Long id = resolution.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAffectationId(Vote vote) {
        if ( vote == null ) {
            return null;
        }
        Affectation affectation = vote.getAffectation();
        if ( affectation == null ) {
            return null;
        }
        Long id = affectation.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
