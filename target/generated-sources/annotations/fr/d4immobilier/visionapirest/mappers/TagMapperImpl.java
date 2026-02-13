package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TagDTO;
import fr.d4immobilier.visionapirest.entities.Tag;
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
public class TagMapperImpl implements TagMapper {

    @Override
    public List<TagDTO> toDTOList(List<Tag> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TagDTO> list = new ArrayList<TagDTO>( entities.size() );
        for ( Tag tag : entities ) {
            list.add( toDTO( tag ) );
        }

        return list;
    }

    @Override
    public TagDTO toDTO(Tag entity) {
        if ( entity == null ) {
            return null;
        }

        TagDTO tagDTO = new TagDTO();

        tagDTO.setId( entity.getId() );
        tagDTO.setNumTag( entity.getNumTag() );

        return tagDTO;
    }

    @Override
    public Tag toEntity(TagDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Tag tag = new Tag();

        tag.setId( dto.getId() );
        tag.setNumTag( dto.getNumTag() );

        return tag;
    }
}
