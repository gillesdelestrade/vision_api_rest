package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DocumentDTO;
import fr.d4immobilier.visionapirest.entities.Document;
import fr.d4immobilier.visionapirest.entities.Personne;
import fr.d4immobilier.visionapirest.entities.Societe;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-20T08:40:21+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class DocumentMapperImpl implements DocumentMapper {

    @Override
    public List<DocumentDTO> toDTOList(List<Document> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DocumentDTO> list = new ArrayList<DocumentDTO>( entities.size() );
        for ( Document document : entities ) {
            list.add( toDTO( document ) );
        }

        return list;
    }

    @Override
    public DocumentDTO toDTO(Document entity) {
        if ( entity == null ) {
            return null;
        }

        DocumentDTO documentDTO = new DocumentDTO();

        documentDTO.setAuteurId( entityAuteurId( entity ) );
        documentDTO.setDestinatairePersonneId( entityDestinatairePersonneId( entity ) );
        documentDTO.setDestinataireSocieteId( entityDestinataireSocieteId( entity ) );
        documentDTO.setDateCreation( dateCreationToString( entity.getDateCreation() ) );
        documentDTO.setId( entity.getId() );
        documentDTO.setNumeroCodeBarre( entity.getNumeroCodeBarre() );
        documentDTO.setCommentaire( entity.getCommentaire() );
        documentDTO.setContenu( entity.getContenu() );
        documentDTO.setTitre( entity.getTitre() );

        return documentDTO;
    }

    @Override
    public Document toEntity(DocumentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Document document = new Document();

        document.setId( dto.getId() );
        document.setNumeroCodeBarre( dto.getNumeroCodeBarre() );
        if ( dto.getDateCreation() != null ) {
            document.setDateCreation( Instant.parse( dto.getDateCreation() ) );
        }
        document.setCommentaire( dto.getCommentaire() );
        document.setContenu( dto.getContenu() );
        document.setTitre( dto.getTitre() );

        return document;
    }

    private Long entityAuteurId(Document document) {
        if ( document == null ) {
            return null;
        }
        Personne auteur = document.getAuteur();
        if ( auteur == null ) {
            return null;
        }
        Long id = auteur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDestinatairePersonneId(Document document) {
        if ( document == null ) {
            return null;
        }
        Personne destinatairePersonne = document.getDestinatairePersonne();
        if ( destinatairePersonne == null ) {
            return null;
        }
        Long id = destinatairePersonne.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDestinataireSocieteId(Document document) {
        if ( document == null ) {
            return null;
        }
        Societe destinataireSociete = document.getDestinataireSociete();
        if ( destinataireSociete == null ) {
            return null;
        }
        Long id = destinataireSociete.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
