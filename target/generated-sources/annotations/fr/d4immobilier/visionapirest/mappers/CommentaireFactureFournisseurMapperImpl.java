package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CommentaireFactureFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.CommentaireFactureFournisseur;
import fr.d4immobilier.visionapirest.entities.FactureFournisseur;
import fr.d4immobilier.visionapirest.entities.Personne;
import fr.d4immobilier.visionapirest.entities.Societe;
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
public class CommentaireFactureFournisseurMapperImpl implements CommentaireFactureFournisseurMapper {

    @Override
    public List<CommentaireFactureFournisseurDTO> toDTOList(List<CommentaireFactureFournisseur> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CommentaireFactureFournisseurDTO> list = new ArrayList<CommentaireFactureFournisseurDTO>( entities.size() );
        for ( CommentaireFactureFournisseur commentaireFactureFournisseur : entities ) {
            list.add( toDTO( commentaireFactureFournisseur ) );
        }

        return list;
    }

    @Override
    public CommentaireFactureFournisseurDTO toDTO(CommentaireFactureFournisseur entity) {
        if ( entity == null ) {
            return null;
        }

        CommentaireFactureFournisseurDTO commentaireFactureFournisseurDTO = new CommentaireFactureFournisseurDTO();

        commentaireFactureFournisseurDTO.setFactureFournisseurId( entityFactureFournisseurId( entity ) );
        commentaireFactureFournisseurDTO.setAuteurPersonneId( entityAuteurPersonneId( entity ) );
        commentaireFactureFournisseurDTO.setAuteurSocieteId( entityAuteurSocieteId( entity ) );
        commentaireFactureFournisseurDTO.setDateCommentaire( dateCommentaireToString( entity.getDateCommentaire() ) );
        commentaireFactureFournisseurDTO.setId( entity.getId() );
        commentaireFactureFournisseurDTO.setCommentaire( entity.getCommentaire() );

        return commentaireFactureFournisseurDTO;
    }

    @Override
    public CommentaireFactureFournisseur toEntity(CommentaireFactureFournisseurDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CommentaireFactureFournisseur commentaireFactureFournisseur = new CommentaireFactureFournisseur();

        commentaireFactureFournisseur.setId( dto.getId() );
        if ( dto.getDateCommentaire() != null ) {
            commentaireFactureFournisseur.setDateCommentaire( Instant.parse( dto.getDateCommentaire() ) );
        }
        commentaireFactureFournisseur.setCommentaire( dto.getCommentaire() );

        return commentaireFactureFournisseur;
    }

    private Long entityFactureFournisseurId(CommentaireFactureFournisseur commentaireFactureFournisseur) {
        if ( commentaireFactureFournisseur == null ) {
            return null;
        }
        FactureFournisseur factureFournisseur = commentaireFactureFournisseur.getFactureFournisseur();
        if ( factureFournisseur == null ) {
            return null;
        }
        Long id = factureFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAuteurPersonneId(CommentaireFactureFournisseur commentaireFactureFournisseur) {
        if ( commentaireFactureFournisseur == null ) {
            return null;
        }
        Personne auteurPersonne = commentaireFactureFournisseur.getAuteurPersonne();
        if ( auteurPersonne == null ) {
            return null;
        }
        Long id = auteurPersonne.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAuteurSocieteId(CommentaireFactureFournisseur commentaireFactureFournisseur) {
        if ( commentaireFactureFournisseur == null ) {
            return null;
        }
        Societe auteurSociete = commentaireFactureFournisseur.getAuteurSociete();
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
