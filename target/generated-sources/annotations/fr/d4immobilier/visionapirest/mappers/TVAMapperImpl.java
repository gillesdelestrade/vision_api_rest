package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TVADTO;
import fr.d4immobilier.visionapirest.entities.TVA;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T17:26:49+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class TVAMapperImpl implements TVAMapper {

    @Override
    public List<TVADTO> toDTOList(List<TVA> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TVADTO> list = new ArrayList<TVADTO>( entities.size() );
        for ( TVA tVA : entities ) {
            list.add( toDTO( tVA ) );
        }

        return list;
    }

    @Override
    public TVADTO toDTO(TVA entity) {
        if ( entity == null ) {
            return null;
        }

        TVADTO tVADTO = new TVADTO();

        tVADTO.setId( entity.getId() );
        tVADTO.setTaux( entity.getTaux() );

        return tVADTO;
    }

    @Override
    public TVA toEntity(TVADTO dto) {
        if ( dto == null ) {
            return null;
        }

        TVA tVA = new TVA();

        tVA.setId( dto.getId() );
        tVA.setTaux( dto.getTaux() );

        return tVA;
    }
}
