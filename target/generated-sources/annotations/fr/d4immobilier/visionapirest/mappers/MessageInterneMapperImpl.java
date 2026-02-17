package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MessageInterneDTO;
import fr.d4immobilier.visionapirest.entities.MessageInterne;
import fr.d4immobilier.visionapirest.entities.Personne;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-17T10:51:57+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class MessageInterneMapperImpl implements MessageInterneMapper {

    @Override
    public List<MessageInterneDTO> toDTOList(List<MessageInterne> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MessageInterneDTO> list = new ArrayList<MessageInterneDTO>( entities.size() );
        for ( MessageInterne messageInterne : entities ) {
            list.add( toDTO( messageInterne ) );
        }

        return list;
    }

    @Override
    public MessageInterneDTO toDTO(MessageInterne entity) {
        if ( entity == null ) {
            return null;
        }

        MessageInterneDTO messageInterneDTO = new MessageInterneDTO();

        messageInterneDTO.setAuteurId( entityAuteurId( entity ) );
        messageInterneDTO.setDestinataireId( entityDestinataireId( entity ) );
        messageInterneDTO.setDateEmission( dateEmissionToString( entity.getDateEmission() ) );
        messageInterneDTO.setId( entity.getId() );
        messageInterneDTO.setMessage( entity.getMessage() );
        messageInterneDTO.setPrisEnCompte( entity.getPrisEnCompte() );

        return messageInterneDTO;
    }

    @Override
    public MessageInterne toEntity(MessageInterneDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MessageInterne messageInterne = new MessageInterne();

        messageInterne.setId( dto.getId() );
        messageInterne.setMessage( dto.getMessage() );
        if ( dto.getDateEmission() != null ) {
            messageInterne.setDateEmission( Instant.parse( dto.getDateEmission() ) );
        }
        messageInterne.setPrisEnCompte( dto.getPrisEnCompte() );

        return messageInterne;
    }

    private Long entityAuteurId(MessageInterne messageInterne) {
        if ( messageInterne == null ) {
            return null;
        }
        Personne auteur = messageInterne.getAuteur();
        if ( auteur == null ) {
            return null;
        }
        Long id = auteur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDestinataireId(MessageInterne messageInterne) {
        if ( messageInterne == null ) {
            return null;
        }
        Personne destinataire = messageInterne.getDestinataire();
        if ( destinataire == null ) {
            return null;
        }
        Long id = destinataire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
