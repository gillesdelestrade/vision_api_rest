package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.RappelTelephoniqueDTO;
import fr.d4immobilier.visionapirest.entities.DemandeDeRappel;
import fr.d4immobilier.visionapirest.entities.EtatRappelTelephonique;
import fr.d4immobilier.visionapirest.entities.Gestionnaire;
import fr.d4immobilier.visionapirest.entities.RappelTelephonique;
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
public class RappelTelephoniqueMapperImpl implements RappelTelephoniqueMapper {

    @Override
    public List<RappelTelephoniqueDTO> toDTOList(List<RappelTelephonique> entities) {
        if ( entities == null ) {
            return null;
        }

        List<RappelTelephoniqueDTO> list = new ArrayList<RappelTelephoniqueDTO>( entities.size() );
        for ( RappelTelephonique rappelTelephonique : entities ) {
            list.add( toDTO( rappelTelephonique ) );
        }

        return list;
    }

    @Override
    public RappelTelephoniqueDTO toDTO(RappelTelephonique entity) {
        if ( entity == null ) {
            return null;
        }

        RappelTelephoniqueDTO rappelTelephoniqueDTO = new RappelTelephoniqueDTO();

        rappelTelephoniqueDTO.setAuteurId( entityAuteurId( entity ) );
        rappelTelephoniqueDTO.setDemandeDeRappelId( entityDemandeDeRappelId( entity ) );
        rappelTelephoniqueDTO.setDateRappel( dateRappelToString( entity.getDateRappel() ) );
        rappelTelephoniqueDTO.setEtatRappelTelephonique( etatRappelTelephoniqueToString( entity.getEtatRappelTelephonique() ) );
        rappelTelephoniqueDTO.setId( entity.getId() );
        rappelTelephoniqueDTO.setTexte( entity.getTexte() );

        return rappelTelephoniqueDTO;
    }

    @Override
    public RappelTelephonique toEntity(RappelTelephoniqueDTO dto) {
        if ( dto == null ) {
            return null;
        }

        RappelTelephonique rappelTelephonique = new RappelTelephonique();

        rappelTelephonique.setId( dto.getId() );
        if ( dto.getDateRappel() != null ) {
            rappelTelephonique.setDateRappel( Instant.parse( dto.getDateRappel() ) );
        }
        rappelTelephonique.setTexte( dto.getTexte() );
        if ( dto.getEtatRappelTelephonique() != null ) {
            rappelTelephonique.setEtatRappelTelephonique( Enum.valueOf( EtatRappelTelephonique.class, dto.getEtatRappelTelephonique() ) );
        }

        return rappelTelephonique;
    }

    private Long entityAuteurId(RappelTelephonique rappelTelephonique) {
        if ( rappelTelephonique == null ) {
            return null;
        }
        Gestionnaire auteur = rappelTelephonique.getAuteur();
        if ( auteur == null ) {
            return null;
        }
        Long id = auteur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDemandeDeRappelId(RappelTelephonique rappelTelephonique) {
        if ( rappelTelephonique == null ) {
            return null;
        }
        DemandeDeRappel demandeDeRappel = rappelTelephonique.getDemandeDeRappel();
        if ( demandeDeRappel == null ) {
            return null;
        }
        Long id = demandeDeRappel.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
