package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.LexiqueAPID4DTO;
import fr.d4immobilier.visionapirest.entities.LexiqueAPID4;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-12T18:34:53+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class LexiqueAPID4MapperImpl implements LexiqueAPID4Mapper {

    @Override
    public List<LexiqueAPID4DTO> toDTOList(List<LexiqueAPID4> entities) {
        if ( entities == null ) {
            return null;
        }

        List<LexiqueAPID4DTO> list = new ArrayList<LexiqueAPID4DTO>( entities.size() );
        for ( LexiqueAPID4 lexiqueAPID4 : entities ) {
            list.add( toDTO( lexiqueAPID4 ) );
        }

        return list;
    }

    @Override
    public LexiqueAPID4DTO toDTO(LexiqueAPID4 entity) {
        if ( entity == null ) {
            return null;
        }

        LexiqueAPID4DTO lexiqueAPID4DTO = new LexiqueAPID4DTO();

        lexiqueAPID4DTO.setId( entity.getId() );
        lexiqueAPID4DTO.setLibelle( entity.getLibelle() );
        lexiqueAPID4DTO.setDescription( entity.getDescription() );

        return lexiqueAPID4DTO;
    }

    @Override
    public LexiqueAPID4 toEntity(LexiqueAPID4DTO dto) {
        if ( dto == null ) {
            return null;
        }

        LexiqueAPID4 lexiqueAPID4 = new LexiqueAPID4();

        lexiqueAPID4.setId( dto.getId() );
        lexiqueAPID4.setLibelle( dto.getLibelle() );
        lexiqueAPID4.setDescription( dto.getDescription() );

        return lexiqueAPID4;
    }
}
