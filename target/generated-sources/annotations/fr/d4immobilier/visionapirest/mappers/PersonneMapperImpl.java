package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PersonneDTO;
import fr.d4immobilier.visionapirest.entities.Adresse;
import fr.d4immobilier.visionapirest.entities.CompteVision;
import fr.d4immobilier.visionapirest.entities.Personne;
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
public class PersonneMapperImpl implements PersonneMapper {

    @Override
    public List<PersonneDTO> toDTOList(List<Personne> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PersonneDTO> list = new ArrayList<PersonneDTO>( entities.size() );
        for ( Personne personne : entities ) {
            list.add( toDTO( personne ) );
        }

        return list;
    }

    @Override
    public PersonneDTO toDTO(Personne entity) {
        if ( entity == null ) {
            return null;
        }

        PersonneDTO personneDTO = new PersonneDTO();

        personneDTO.setAdresseId( entityAdresseId( entity ) );
        personneDTO.setCompteVisionId( entityCompteVisionId( entity ) );
        personneDTO.setId( entity.getId() );
        personneDTO.setTitre( entity.getTitre() );
        personneDTO.setNom( entity.getNom() );
        personneDTO.setPrenom( entity.getPrenom() );
        personneDTO.setMail1( entity.getMail1() );
        personneDTO.setMail2( entity.getMail2() );
        personneDTO.setTelPortable( entity.getTelPortable() );
        personneDTO.setTelFixe( entity.getTelFixe() );
        personneDTO.setInvitee( entity.getInvitee() );

        return personneDTO;
    }

    @Override
    public Personne toEntity(PersonneDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Personne personne = new Personne();

        personne.setId( dto.getId() );
        personne.setNom( dto.getNom() );
        personne.setPrenom( dto.getPrenom() );
        personne.setTitre( dto.getTitre() );
        personne.setMail1( dto.getMail1() );
        personne.setMail2( dto.getMail2() );
        personne.setTelPortable( dto.getTelPortable() );
        personne.setTelFixe( dto.getTelFixe() );
        personne.setInvitee( dto.getInvitee() );

        return personne;
    }

    private Long entityAdresseId(Personne personne) {
        if ( personne == null ) {
            return null;
        }
        Adresse adresse = personne.getAdresse();
        if ( adresse == null ) {
            return null;
        }
        Long id = adresse.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityCompteVisionId(Personne personne) {
        if ( personne == null ) {
            return null;
        }
        CompteVision compteVision = personne.getCompteVision();
        if ( compteVision == null ) {
            return null;
        }
        Long id = compteVision.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
