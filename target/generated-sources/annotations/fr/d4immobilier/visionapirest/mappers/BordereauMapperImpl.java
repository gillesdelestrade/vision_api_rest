package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BordereauDTO;
import fr.d4immobilier.visionapirest.entities.Bordereau;
import fr.d4immobilier.visionapirest.entities.Gestionnaire;
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
public class BordereauMapperImpl implements BordereauMapper {

    @Override
    public List<BordereauDTO> toDTOList(List<Bordereau> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BordereauDTO> list = new ArrayList<BordereauDTO>( entities.size() );
        for ( Bordereau bordereau : entities ) {
            list.add( toDTO( bordereau ) );
        }

        return list;
    }

    @Override
    public BordereauDTO toDTO(Bordereau entity) {
        if ( entity == null ) {
            return null;
        }

        BordereauDTO bordereauDTO = new BordereauDTO();

        bordereauDTO.setGestionnaireId( entityGestionnaireId( entity ) );
        bordereauDTO.setCreated_at( created_atToString( entity.getCreated_at() ) );
        bordereauDTO.setUpdated_at( updated_atToString( entity.getUpdated_at() ) );
        bordereauDTO.setId( entity.getId() );
        bordereauDTO.setTexte( entity.getTexte() );
        bordereauDTO.setDate( entity.getDate() );

        return bordereauDTO;
    }

    @Override
    public Bordereau toEntity(BordereauDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Bordereau bordereau = new Bordereau();

        bordereau.setId( dto.getId() );
        if ( dto.getCreated_at() != null ) {
            bordereau.setCreated_at( Instant.parse( dto.getCreated_at() ) );
        }
        if ( dto.getUpdated_at() != null ) {
            bordereau.setUpdated_at( Instant.parse( dto.getUpdated_at() ) );
        }
        bordereau.setTexte( dto.getTexte() );
        bordereau.setDate( dto.getDate() );

        return bordereau;
    }

    private Long entityGestionnaireId(Bordereau bordereau) {
        if ( bordereau == null ) {
            return null;
        }
        Gestionnaire gestionnaire = bordereau.getGestionnaire();
        if ( gestionnaire == null ) {
            return null;
        }
        Long id = gestionnaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
