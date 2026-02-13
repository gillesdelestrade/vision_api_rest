package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.SocieteDTO;
import fr.d4immobilier.visionapirest.entities.Adresse;
import fr.d4immobilier.visionapirest.entities.CompteVision;
import fr.d4immobilier.visionapirest.entities.Personne;
import fr.d4immobilier.visionapirest.entities.Societe;
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
public class SocieteMapperImpl implements SocieteMapper {

    @Override
    public List<SocieteDTO> toDTOList(List<Societe> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SocieteDTO> list = new ArrayList<SocieteDTO>( entities.size() );
        for ( Societe societe : entities ) {
            list.add( toDTO( societe ) );
        }

        return list;
    }

    @Override
    public SocieteDTO toDTO(Societe entity) {
        if ( entity == null ) {
            return null;
        }

        SocieteDTO societeDTO = new SocieteDTO();

        societeDTO.setCompteVisionId( entityCompteVisionId( entity ) );
        societeDTO.setAdresseId( entityAdresseId( entity ) );
        societeDTO.setRepresentantId( entityRepresentantId( entity ) );
        societeDTO.setId( entity.getId() );
        societeDTO.setFormeJuridique( entity.getFormeJuridique() );
        societeDTO.setRaisonSociale( entity.getRaisonSociale() );
        societeDTO.setMail1( entity.getMail1() );
        societeDTO.setMail2( entity.getMail2() );
        societeDTO.setTelPortable( entity.getTelPortable() );
        societeDTO.setTelFixe( entity.getTelFixe() );
        societeDTO.setFax( entity.getFax() );

        return societeDTO;
    }

    @Override
    public Societe toEntity(SocieteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Societe societe = new Societe();

        societe.setId( dto.getId() );
        societe.setFormeJuridique( dto.getFormeJuridique() );
        societe.setRaisonSociale( dto.getRaisonSociale() );
        societe.setMail1( dto.getMail1() );
        societe.setMail2( dto.getMail2() );
        societe.setTelPortable( dto.getTelPortable() );
        societe.setTelFixe( dto.getTelFixe() );
        societe.setFax( dto.getFax() );

        return societe;
    }

    private Long entityCompteVisionId(Societe societe) {
        if ( societe == null ) {
            return null;
        }
        CompteVision compteVision = societe.getCompteVision();
        if ( compteVision == null ) {
            return null;
        }
        Long id = compteVision.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAdresseId(Societe societe) {
        if ( societe == null ) {
            return null;
        }
        Adresse adresse = societe.getAdresse();
        if ( adresse == null ) {
            return null;
        }
        Long id = adresse.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityRepresentantId(Societe societe) {
        if ( societe == null ) {
            return null;
        }
        Personne representant = societe.getRepresentant();
        if ( representant == null ) {
            return null;
        }
        Long id = representant.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
