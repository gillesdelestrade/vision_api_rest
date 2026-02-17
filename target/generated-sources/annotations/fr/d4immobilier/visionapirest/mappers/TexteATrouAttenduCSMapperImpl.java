package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TexteATrouAttenduCSDTO;
import fr.d4immobilier.visionapirest.entities.AttenduCS;
import fr.d4immobilier.visionapirest.entities.TexteATrouAttenduCS;
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
public class TexteATrouAttenduCSMapperImpl implements TexteATrouAttenduCSMapper {

    @Override
    public List<TexteATrouAttenduCSDTO> toDTOList(List<TexteATrouAttenduCS> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TexteATrouAttenduCSDTO> list = new ArrayList<TexteATrouAttenduCSDTO>( entities.size() );
        for ( TexteATrouAttenduCS texteATrouAttenduCS : entities ) {
            list.add( toDTO( texteATrouAttenduCS ) );
        }

        return list;
    }

    @Override
    public TexteATrouAttenduCSDTO toDTO(TexteATrouAttenduCS entity) {
        if ( entity == null ) {
            return null;
        }

        TexteATrouAttenduCSDTO texteATrouAttenduCSDTO = new TexteATrouAttenduCSDTO();

        texteATrouAttenduCSDTO.setAttenduCSId( entityAttenduCSId( entity ) );
        texteATrouAttenduCSDTO.setId( entity.getId() );
        texteATrouAttenduCSDTO.setTexteATrou( entity.getTexteATrou() );

        return texteATrouAttenduCSDTO;
    }

    @Override
    public TexteATrouAttenduCS toEntity(TexteATrouAttenduCSDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TexteATrouAttenduCS texteATrouAttenduCS = new TexteATrouAttenduCS();

        texteATrouAttenduCS.setId( dto.getId() );
        texteATrouAttenduCS.setTexteATrou( dto.getTexteATrou() );

        return texteATrouAttenduCS;
    }

    private Long entityAttenduCSId(TexteATrouAttenduCS texteATrouAttenduCS) {
        if ( texteATrouAttenduCS == null ) {
            return null;
        }
        AttenduCS attenduCS = texteATrouAttenduCS.getAttenduCS();
        if ( attenduCS == null ) {
            return null;
        }
        Long id = attenduCS.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
