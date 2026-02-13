package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CommentaireDevisFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.CommentaireDevisFournisseur;
import fr.d4immobilier.visionapirest.entities.DevisFournisseur;
import fr.d4immobilier.visionapirest.entities.Personne;
import fr.d4immobilier.visionapirest.entities.Societe;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-12T18:34:53+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class CommentaireDevisFournisseurMapperImpl implements CommentaireDevisFournisseurMapper {

    @Override
    public List<CommentaireDevisFournisseurDTO> toDTOList(List<CommentaireDevisFournisseur> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CommentaireDevisFournisseurDTO> list = new ArrayList<CommentaireDevisFournisseurDTO>( entities.size() );
        for ( CommentaireDevisFournisseur commentaireDevisFournisseur : entities ) {
            list.add( toDTO( commentaireDevisFournisseur ) );
        }

        return list;
    }

    @Override
    public CommentaireDevisFournisseurDTO toDTO(CommentaireDevisFournisseur entity) {
        if ( entity == null ) {
            return null;
        }

        CommentaireDevisFournisseurDTO commentaireDevisFournisseurDTO = new CommentaireDevisFournisseurDTO();

        commentaireDevisFournisseurDTO.setDevisFournisseurId( entityDevisFournisseurId( entity ) );
        commentaireDevisFournisseurDTO.setAuteurPersonneId( entityAuteurPersonneId( entity ) );
        commentaireDevisFournisseurDTO.setAuteurSocieteId( entityAuteurSocieteId( entity ) );
        commentaireDevisFournisseurDTO.setDateCommentaire( dateCommentaireToString( entity.getDateCommentaire() ) );
        commentaireDevisFournisseurDTO.setId( entity.getId() );
        commentaireDevisFournisseurDTO.setCommentaire( entity.getCommentaire() );
        commentaireDevisFournisseurDTO.setElementDeDecision( entity.getElementDeDecision() );

        return commentaireDevisFournisseurDTO;
    }

    @Override
    public CommentaireDevisFournisseur toEntity(CommentaireDevisFournisseurDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CommentaireDevisFournisseur commentaireDevisFournisseur = new CommentaireDevisFournisseur();

        commentaireDevisFournisseur.setId( dto.getId() );
        if ( dto.getDateCommentaire() != null ) {
            commentaireDevisFournisseur.setDateCommentaire( Instant.parse( dto.getDateCommentaire() ) );
        }
        commentaireDevisFournisseur.setCommentaire( dto.getCommentaire() );
        commentaireDevisFournisseur.setElementDeDecision( dto.getElementDeDecision() );

        return commentaireDevisFournisseur;
    }

    private Long entityDevisFournisseurId(CommentaireDevisFournisseur commentaireDevisFournisseur) {
        if ( commentaireDevisFournisseur == null ) {
            return null;
        }
        DevisFournisseur devisFournisseur = commentaireDevisFournisseur.getDevisFournisseur();
        if ( devisFournisseur == null ) {
            return null;
        }
        Long id = devisFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAuteurPersonneId(CommentaireDevisFournisseur commentaireDevisFournisseur) {
        if ( commentaireDevisFournisseur == null ) {
            return null;
        }
        Personne auteurPersonne = commentaireDevisFournisseur.getAuteurPersonne();
        if ( auteurPersonne == null ) {
            return null;
        }
        Long id = auteurPersonne.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAuteurSocieteId(CommentaireDevisFournisseur commentaireDevisFournisseur) {
        if ( commentaireDevisFournisseur == null ) {
            return null;
        }
        Societe auteurSociete = commentaireDevisFournisseur.getAuteurSociete();
        if ( auteurSociete == null ) {
            return null;
        }
        Long id = auteurSociete.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
