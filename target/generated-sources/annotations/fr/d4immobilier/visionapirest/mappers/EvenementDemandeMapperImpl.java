package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EvenementDemandeDTO;
import fr.d4immobilier.visionapirest.entities.Courriel;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.entities.EtapeDemande;
import fr.d4immobilier.visionapirest.entities.EvenementDemande;
import fr.d4immobilier.visionapirest.entities.Personne;
import fr.d4immobilier.visionapirest.entities.ReunionV2;
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
public class EvenementDemandeMapperImpl implements EvenementDemandeMapper {

    @Override
    public List<EvenementDemandeDTO> toDTOList(List<EvenementDemande> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EvenementDemandeDTO> list = new ArrayList<EvenementDemandeDTO>( entities.size() );
        for ( EvenementDemande evenementDemande : entities ) {
            list.add( toDTO( evenementDemande ) );
        }

        return list;
    }

    @Override
    public EvenementDemandeDTO toDTO(EvenementDemande entity) {
        if ( entity == null ) {
            return null;
        }

        EvenementDemandeDTO evenementDemandeDTO = new EvenementDemandeDTO();

        evenementDemandeDTO.setCourrielId( entityCourrielId( entity ) );
        evenementDemandeDTO.setReunionV2Id( entityReunionV2Id( entity ) );
        evenementDemandeDTO.setDemandeId( entityDemandeId( entity ) );
        evenementDemandeDTO.setAuteurId( entityAuteurId( entity ) );
        evenementDemandeDTO.setEtapeDemandeId( entityEtapeDemandeId( entity ) );
        evenementDemandeDTO.setDateEvenement( dateEvenementToString( entity.getDateEvenement() ) );
        evenementDemandeDTO.setId( entity.getId() );
        evenementDemandeDTO.setTexte( entity.getTexte() );
        evenementDemandeDTO.setClotureEtapeDemande( entity.getClotureEtapeDemande() );
        evenementDemandeDTO.setCopieParMail( entity.getCopieParMail() );
        evenementDemandeDTO.setIdDI( entity.getIdDI() );
        evenementDemandeDTO.setIdDDF( entity.getIdDDF() );

        return evenementDemandeDTO;
    }

    @Override
    public EvenementDemande toEntity(EvenementDemandeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EvenementDemande evenementDemande = new EvenementDemande();

        evenementDemande.setId( dto.getId() );
        if ( dto.getDateEvenement() != null ) {
            evenementDemande.setDateEvenement( Instant.parse( dto.getDateEvenement() ) );
        }
        evenementDemande.setTexte( dto.getTexte() );
        evenementDemande.setClotureEtapeDemande( dto.getClotureEtapeDemande() );
        evenementDemande.setCopieParMail( dto.getCopieParMail() );
        evenementDemande.setIdDI( dto.getIdDI() );
        evenementDemande.setIdDDF( dto.getIdDDF() );

        return evenementDemande;
    }

    private Long entityCourrielId(EvenementDemande evenementDemande) {
        if ( evenementDemande == null ) {
            return null;
        }
        Courriel courriel = evenementDemande.getCourriel();
        if ( courriel == null ) {
            return null;
        }
        Long id = courriel.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityReunionV2Id(EvenementDemande evenementDemande) {
        if ( evenementDemande == null ) {
            return null;
        }
        ReunionV2 reunionV2 = evenementDemande.getReunionV2();
        if ( reunionV2 == null ) {
            return null;
        }
        Long id = reunionV2.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDemandeId(EvenementDemande evenementDemande) {
        if ( evenementDemande == null ) {
            return null;
        }
        Demande demande = evenementDemande.getDemande();
        if ( demande == null ) {
            return null;
        }
        Long id = demande.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAuteurId(EvenementDemande evenementDemande) {
        if ( evenementDemande == null ) {
            return null;
        }
        Personne auteur = evenementDemande.getAuteur();
        if ( auteur == null ) {
            return null;
        }
        Long id = auteur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityEtapeDemandeId(EvenementDemande evenementDemande) {
        if ( evenementDemande == null ) {
            return null;
        }
        EtapeDemande etapeDemande = evenementDemande.getEtapeDemande();
        if ( etapeDemande == null ) {
            return null;
        }
        Long id = etapeDemande.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
