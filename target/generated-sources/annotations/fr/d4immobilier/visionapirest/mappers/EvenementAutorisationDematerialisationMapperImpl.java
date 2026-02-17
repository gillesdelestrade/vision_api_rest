package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EvenementAutorisationDematerialisationDTO;
import fr.d4immobilier.visionapirest.entities.AutorisationDematerialisation;
import fr.d4immobilier.visionapirest.entities.EvenementAutorisationDematerialisation;
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
public class EvenementAutorisationDematerialisationMapperImpl implements EvenementAutorisationDematerialisationMapper {

    @Override
    public List<EvenementAutorisationDematerialisationDTO> toDTOList(List<EvenementAutorisationDematerialisation> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EvenementAutorisationDematerialisationDTO> list = new ArrayList<EvenementAutorisationDematerialisationDTO>( entities.size() );
        for ( EvenementAutorisationDematerialisation evenementAutorisationDematerialisation : entities ) {
            list.add( toDTO( evenementAutorisationDematerialisation ) );
        }

        return list;
    }

    @Override
    public EvenementAutorisationDematerialisationDTO toDTO(EvenementAutorisationDematerialisation entity) {
        if ( entity == null ) {
            return null;
        }

        EvenementAutorisationDematerialisationDTO evenementAutorisationDematerialisationDTO = new EvenementAutorisationDematerialisationDTO();

        evenementAutorisationDematerialisationDTO.setAuteurId( entityAuteurId( entity ) );
        evenementAutorisationDematerialisationDTO.setAutorisationDematerialisationId( entityAutorisationDematerialisationId( entity ) );
        evenementAutorisationDematerialisationDTO.setDateEvenement( dateEvenementToString( entity.getDateEvenement() ) );
        evenementAutorisationDematerialisationDTO.setId( entity.getId() );
        evenementAutorisationDematerialisationDTO.setTexte( entity.getTexte() );

        return evenementAutorisationDematerialisationDTO;
    }

    @Override
    public EvenementAutorisationDematerialisation toEntity(EvenementAutorisationDematerialisationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EvenementAutorisationDematerialisation evenementAutorisationDematerialisation = new EvenementAutorisationDematerialisation();

        evenementAutorisationDematerialisation.setId( dto.getId() );
        if ( dto.getDateEvenement() != null ) {
            evenementAutorisationDematerialisation.setDateEvenement( Instant.parse( dto.getDateEvenement() ) );
        }
        evenementAutorisationDematerialisation.setTexte( dto.getTexte() );

        return evenementAutorisationDematerialisation;
    }

    private Long entityAuteurId(EvenementAutorisationDematerialisation evenementAutorisationDematerialisation) {
        if ( evenementAutorisationDematerialisation == null ) {
            return null;
        }
        Personne auteur = evenementAutorisationDematerialisation.getAuteur();
        if ( auteur == null ) {
            return null;
        }
        Long id = auteur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAutorisationDematerialisationId(EvenementAutorisationDematerialisation evenementAutorisationDematerialisation) {
        if ( evenementAutorisationDematerialisation == null ) {
            return null;
        }
        AutorisationDematerialisation autorisationDematerialisation = evenementAutorisationDematerialisation.getAutorisationDematerialisation();
        if ( autorisationDematerialisation == null ) {
            return null;
        }
        Long id = autorisationDematerialisation.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
