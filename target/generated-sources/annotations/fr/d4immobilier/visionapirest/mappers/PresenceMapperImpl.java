package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PresenceDTO;
import fr.d4immobilier.visionapirest.entities.Affectation;
import fr.d4immobilier.visionapirest.entities.Assemblee;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.entities.Presence;
import fr.d4immobilier.visionapirest.entities.Resolution;
import fr.d4immobilier.visionapirest.entities.StatutPresence;
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
public class PresenceMapperImpl implements PresenceMapper {

    @Override
    public List<PresenceDTO> toDTOList(List<Presence> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PresenceDTO> list = new ArrayList<PresenceDTO>( entities.size() );
        for ( Presence presence : entities ) {
            list.add( toDTO( presence ) );
        }

        return list;
    }

    @Override
    public PresenceDTO toDTO(Presence entity) {
        if ( entity == null ) {
            return null;
        }

        PresenceDTO presenceDTO = new PresenceDTO();

        presenceDTO.setAssembleeId( entityAssembleeId( entity ) );
        presenceDTO.setCoproprietaireId( entityCoproprietaireId( entity ) );
        presenceDTO.setAffectationId( entityAffectationId( entity ) );
        presenceDTO.setResolutionDepartId( entityResolutionDepartId( entity ) );
        presenceDTO.setStatutPresence( statutPresenceToString( entity.getStatutPresence() ) );
        presenceDTO.setDatePresenceOuReceptionFormulaire( datePresenceOuReceptionFormulaireToString( entity.getDatePresenceOuReceptionFormulaire() ) );
        presenceDTO.setId( entity.getId() );

        return presenceDTO;
    }

    @Override
    public Presence toEntity(PresenceDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Presence presence = new Presence();

        presence.setId( dto.getId() );
        if ( dto.getStatutPresence() != null ) {
            presence.setStatutPresence( Enum.valueOf( StatutPresence.class, dto.getStatutPresence() ) );
        }
        if ( dto.getDatePresenceOuReceptionFormulaire() != null ) {
            presence.setDatePresenceOuReceptionFormulaire( Instant.parse( dto.getDatePresenceOuReceptionFormulaire() ) );
        }

        return presence;
    }

    private Long entityAssembleeId(Presence presence) {
        if ( presence == null ) {
            return null;
        }
        Assemblee assemblee = presence.getAssemblee();
        if ( assemblee == null ) {
            return null;
        }
        Long id = assemblee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityCoproprietaireId(Presence presence) {
        if ( presence == null ) {
            return null;
        }
        Coproprietaire coproprietaire = presence.getCoproprietaire();
        if ( coproprietaire == null ) {
            return null;
        }
        Long id = coproprietaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAffectationId(Presence presence) {
        if ( presence == null ) {
            return null;
        }
        Affectation affectation = presence.getAffectation();
        if ( affectation == null ) {
            return null;
        }
        Long id = affectation.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityResolutionDepartId(Presence presence) {
        if ( presence == null ) {
            return null;
        }
        Resolution resolutionDepart = presence.getResolutionDepart();
        if ( resolutionDepart == null ) {
            return null;
        }
        Long id = resolutionDepart.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
