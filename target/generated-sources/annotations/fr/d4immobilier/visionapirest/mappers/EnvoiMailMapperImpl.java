package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EnvoiMailDTO;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.entities.Dossier;
import fr.d4immobilier.visionapirest.entities.EnvoiMail;
import fr.d4immobilier.visionapirest.entities.Fichier;
import fr.d4immobilier.visionapirest.entities.Reunion;
import fr.d4immobilier.visionapirest.entities.Sinistre;
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
public class EnvoiMailMapperImpl implements EnvoiMailMapper {

    @Override
    public List<EnvoiMailDTO> toDTOList(List<EnvoiMail> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EnvoiMailDTO> list = new ArrayList<EnvoiMailDTO>( entities.size() );
        for ( EnvoiMail envoiMail : entities ) {
            list.add( toDTO( envoiMail ) );
        }

        return list;
    }

    @Override
    public EnvoiMailDTO toDTO(EnvoiMail entity) {
        if ( entity == null ) {
            return null;
        }

        EnvoiMailDTO envoiMailDTO = new EnvoiMailDTO();

        envoiMailDTO.setDemandeId( entityDemandeId( entity ) );
        envoiMailDTO.setDossierId( entityDossierId( entity ) );
        envoiMailDTO.setSinistreId( entitySinistreId( entity ) );
        envoiMailDTO.setReunionId( entityReunionId( entity ) );
        envoiMailDTO.setFichierId( entityFichierId( entity ) );
        envoiMailDTO.setId( entity.getId() );
        envoiMailDTO.setDateMail( entity.getDateMail() );
        envoiMailDTO.setTexteMail( entity.getTexteMail() );

        return envoiMailDTO;
    }

    @Override
    public EnvoiMail toEntity(EnvoiMailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EnvoiMail envoiMail = new EnvoiMail();

        envoiMail.setId( dto.getId() );
        envoiMail.setDateMail( dto.getDateMail() );
        envoiMail.setTexteMail( dto.getTexteMail() );

        return envoiMail;
    }

    private Long entityDemandeId(EnvoiMail envoiMail) {
        if ( envoiMail == null ) {
            return null;
        }
        Demande demande = envoiMail.getDemande();
        if ( demande == null ) {
            return null;
        }
        Long id = demande.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDossierId(EnvoiMail envoiMail) {
        if ( envoiMail == null ) {
            return null;
        }
        Dossier dossier = envoiMail.getDossier();
        if ( dossier == null ) {
            return null;
        }
        Long id = dossier.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entitySinistreId(EnvoiMail envoiMail) {
        if ( envoiMail == null ) {
            return null;
        }
        Sinistre sinistre = envoiMail.getSinistre();
        if ( sinistre == null ) {
            return null;
        }
        Long id = sinistre.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityReunionId(EnvoiMail envoiMail) {
        if ( envoiMail == null ) {
            return null;
        }
        Reunion reunion = envoiMail.getReunion();
        if ( reunion == null ) {
            return null;
        }
        Long id = reunion.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierId(EnvoiMail envoiMail) {
        if ( envoiMail == null ) {
            return null;
        }
        Fichier fichier = envoiMail.getFichier();
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
