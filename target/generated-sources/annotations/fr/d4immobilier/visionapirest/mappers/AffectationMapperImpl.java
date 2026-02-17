package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AffectationDTO;
import fr.d4immobilier.visionapirest.entities.Affectation;
import fr.d4immobilier.visionapirest.entities.Presence;
import fr.d4immobilier.visionapirest.entities.Tag;
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
public class AffectationMapperImpl implements AffectationMapper {

    @Override
    public List<AffectationDTO> toDTOList(List<Affectation> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AffectationDTO> list = new ArrayList<AffectationDTO>( entities.size() );
        for ( Affectation affectation : entities ) {
            list.add( toDTO( affectation ) );
        }

        return list;
    }

    @Override
    public AffectationDTO toDTO(Affectation entity) {
        if ( entity == null ) {
            return null;
        }

        AffectationDTO affectationDTO = new AffectationDTO();

        affectationDTO.setPresenceId( entityPresenceId( entity ) );
        affectationDTO.setTagId( entityTagId( entity ) );
        affectationDTO.setId( entity.getId() );

        return affectationDTO;
    }

    @Override
    public Affectation toEntity(AffectationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Affectation affectation = new Affectation();

        affectation.setId( dto.getId() );

        return affectation;
    }

    private Long entityPresenceId(Affectation affectation) {
        if ( affectation == null ) {
            return null;
        }
        Presence presence = affectation.getPresence();
        if ( presence == null ) {
            return null;
        }
        Long id = presence.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityTagId(Affectation affectation) {
        if ( affectation == null ) {
            return null;
        }
        Tag tag = affectation.getTag();
        if ( tag == null ) {
            return null;
        }
        Long id = tag.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
