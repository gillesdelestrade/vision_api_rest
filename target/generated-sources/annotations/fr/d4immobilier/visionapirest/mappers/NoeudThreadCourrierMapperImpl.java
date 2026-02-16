package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.NoeudThreadCourrierDTO;
import fr.d4immobilier.visionapirest.entities.NoeudThreadCourrier;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T17:26:50+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class NoeudThreadCourrierMapperImpl implements NoeudThreadCourrierMapper {

    @Override
    public List<NoeudThreadCourrierDTO> toDTOList(List<NoeudThreadCourrier> entities) {
        if ( entities == null ) {
            return null;
        }

        List<NoeudThreadCourrierDTO> list = new ArrayList<NoeudThreadCourrierDTO>( entities.size() );
        for ( NoeudThreadCourrier noeudThreadCourrier : entities ) {
            list.add( toDTO( noeudThreadCourrier ) );
        }

        return list;
    }

    @Override
    public NoeudThreadCourrierDTO toDTO(NoeudThreadCourrier entity) {
        if ( entity == null ) {
            return null;
        }

        NoeudThreadCourrierDTO noeudThreadCourrierDTO = new NoeudThreadCourrierDTO();

        noeudThreadCourrierDTO.setId( entity.getId() );

        return noeudThreadCourrierDTO;
    }

    @Override
    public NoeudThreadCourrier toEntity(NoeudThreadCourrierDTO dto) {
        if ( dto == null ) {
            return null;
        }

        NoeudThreadCourrier noeudThreadCourrier = new NoeudThreadCourrier();

        noeudThreadCourrier.setId( dto.getId() );

        return noeudThreadCourrier;
    }
}
