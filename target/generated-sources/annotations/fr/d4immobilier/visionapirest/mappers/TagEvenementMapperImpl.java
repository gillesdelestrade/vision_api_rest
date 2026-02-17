package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TagEvenementDTO;
import fr.d4immobilier.visionapirest.entities.TagEvenement;
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
public class TagEvenementMapperImpl implements TagEvenementMapper {

    @Override
    public List<TagEvenementDTO> toDTOList(List<TagEvenement> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TagEvenementDTO> list = new ArrayList<TagEvenementDTO>( entities.size() );
        for ( TagEvenement tagEvenement : entities ) {
            list.add( toDTO( tagEvenement ) );
        }

        return list;
    }

    @Override
    public TagEvenementDTO toDTO(TagEvenement entity) {
        if ( entity == null ) {
            return null;
        }

        TagEvenementDTO tagEvenementDTO = new TagEvenementDTO();

        tagEvenementDTO.setCreated_at( created_atToString( entity.getCreated_at() ) );
        tagEvenementDTO.setId( entity.getId() );
        tagEvenementDTO.setLibelle( entity.getLibelle() );

        return tagEvenementDTO;
    }

    @Override
    public TagEvenement toEntity(TagEvenementDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TagEvenement tagEvenement = new TagEvenement();

        tagEvenement.setId( dto.getId() );
        tagEvenement.setLibelle( dto.getLibelle() );
        if ( dto.getCreated_at() != null ) {
            tagEvenement.setCreated_at( Instant.parse( dto.getCreated_at() ) );
        }

        return tagEvenement;
    }
}
