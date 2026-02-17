package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.RappelCourrierDTO;
import fr.d4immobilier.visionapirest.entities.Courrier;
import fr.d4immobilier.visionapirest.entities.RappelCourrier;
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
public class RappelCourrierMapperImpl implements RappelCourrierMapper {

    @Override
    public List<RappelCourrierDTO> toDTOList(List<RappelCourrier> entities) {
        if ( entities == null ) {
            return null;
        }

        List<RappelCourrierDTO> list = new ArrayList<RappelCourrierDTO>( entities.size() );
        for ( RappelCourrier rappelCourrier : entities ) {
            list.add( toDTO( rappelCourrier ) );
        }

        return list;
    }

    @Override
    public RappelCourrierDTO toDTO(RappelCourrier entity) {
        if ( entity == null ) {
            return null;
        }

        RappelCourrierDTO rappelCourrierDTO = new RappelCourrierDTO();

        rappelCourrierDTO.setCourrierId( entityCourrierId( entity ) );
        rappelCourrierDTO.setId( entity.getId() );

        return rappelCourrierDTO;
    }

    @Override
    public RappelCourrier toEntity(RappelCourrierDTO dto) {
        if ( dto == null ) {
            return null;
        }

        RappelCourrier rappelCourrier = new RappelCourrier();

        rappelCourrier.setId( dto.getId() );

        return rappelCourrier;
    }

    private Long entityCourrierId(RappelCourrier rappelCourrier) {
        if ( rappelCourrier == null ) {
            return null;
        }
        Courrier courrier = rappelCourrier.getCourrier();
        if ( courrier == null ) {
            return null;
        }
        Long id = courrier.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
