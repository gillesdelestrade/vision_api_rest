package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TagEvenement_EvenementDTO;
import fr.d4immobilier.visionapirest.entities.TagEvenement_Evenement;
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
public class TagEvenement_EvenementMapperImpl implements TagEvenement_EvenementMapper {

    @Override
    public List<TagEvenement_EvenementDTO> toDTOList(List<TagEvenement_Evenement> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TagEvenement_EvenementDTO> list = new ArrayList<TagEvenement_EvenementDTO>( entities.size() );
        for ( TagEvenement_Evenement tagEvenement_Evenement : entities ) {
            list.add( toDTO( tagEvenement_Evenement ) );
        }

        return list;
    }

    @Override
    public TagEvenement_EvenementDTO toDTO(TagEvenement_Evenement entity) {
        if ( entity == null ) {
            return null;
        }

        TagEvenement_EvenementDTO tagEvenement_EvenementDTO = new TagEvenement_EvenementDTO();

        tagEvenement_EvenementDTO.setCreated_at( created_atToString( entity.getCreated_at() ) );
        tagEvenement_EvenementDTO.setId( entity.getId() );
        tagEvenement_EvenementDTO.setEvenement_id( entity.getEvenement_id() );
        tagEvenement_EvenementDTO.setTag_id( entity.getTag_id() );

        return tagEvenement_EvenementDTO;
    }

    @Override
    public TagEvenement_Evenement toEntity(TagEvenement_EvenementDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TagEvenement_Evenement tagEvenement_Evenement = new TagEvenement_Evenement();

        tagEvenement_Evenement.setId( dto.getId() );
        tagEvenement_Evenement.setEvenement_id( dto.getEvenement_id() );
        tagEvenement_Evenement.setTag_id( dto.getTag_id() );
        if ( dto.getCreated_at() != null ) {
            tagEvenement_Evenement.setCreated_at( Instant.parse( dto.getCreated_at() ) );
        }

        return tagEvenement_Evenement;
    }
}
