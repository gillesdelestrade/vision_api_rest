package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ARappelerCourrierDTO;
import fr.d4immobilier.visionapirest.entities.ARappelerCourrier;
import fr.d4immobilier.visionapirest.entities.Courrier;
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
public class ARappelerCourrierMapperImpl implements ARappelerCourrierMapper {

    @Override
    public List<ARappelerCourrierDTO> toDTOList(List<ARappelerCourrier> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ARappelerCourrierDTO> list = new ArrayList<ARappelerCourrierDTO>( entities.size() );
        for ( ARappelerCourrier aRappelerCourrier : entities ) {
            list.add( toDTO( aRappelerCourrier ) );
        }

        return list;
    }

    @Override
    public ARappelerCourrierDTO toDTO(ARappelerCourrier entity) {
        if ( entity == null ) {
            return null;
        }

        ARappelerCourrierDTO aRappelerCourrierDTO = new ARappelerCourrierDTO();

        aRappelerCourrierDTO.setCourrierId( entityCourrierId( entity ) );
        aRappelerCourrierDTO.setId( entity.getId() );

        return aRappelerCourrierDTO;
    }

    @Override
    public ARappelerCourrier toEntity(ARappelerCourrierDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ARappelerCourrier aRappelerCourrier = new ARappelerCourrier();

        aRappelerCourrier.setId( dto.getId() );

        return aRappelerCourrier;
    }

    private Long entityCourrierId(ARappelerCourrier aRappelerCourrier) {
        if ( aRappelerCourrier == null ) {
            return null;
        }
        Courrier courrier = aRappelerCourrier.getCourrier();
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
