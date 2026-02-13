package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ThreadCourrierDTO;
import fr.d4immobilier.visionapirest.entities.ThreadCourrier;
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
public class ThreadCourrierMapperImpl implements ThreadCourrierMapper {

    @Override
    public List<ThreadCourrierDTO> toDTOList(List<ThreadCourrier> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ThreadCourrierDTO> list = new ArrayList<ThreadCourrierDTO>( entities.size() );
        for ( ThreadCourrier threadCourrier : entities ) {
            list.add( toDTO( threadCourrier ) );
        }

        return list;
    }

    @Override
    public ThreadCourrierDTO toDTO(ThreadCourrier entity) {
        if ( entity == null ) {
            return null;
        }

        ThreadCourrierDTO threadCourrierDTO = new ThreadCourrierDTO();

        threadCourrierDTO.setId( entity.getId() );

        return threadCourrierDTO;
    }

    @Override
    public ThreadCourrier toEntity(ThreadCourrierDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ThreadCourrier threadCourrier = new ThreadCourrier();

        threadCourrier.setId( dto.getId() );

        return threadCourrier;
    }
}
