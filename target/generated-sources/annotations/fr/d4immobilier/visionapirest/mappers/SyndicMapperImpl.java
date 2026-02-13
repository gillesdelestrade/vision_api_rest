package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.SyndicDTO;
import fr.d4immobilier.visionapirest.entities.Syndic;
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
public class SyndicMapperImpl implements SyndicMapper {

    @Override
    public List<SyndicDTO> toDTOList(List<Syndic> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SyndicDTO> list = new ArrayList<SyndicDTO>( entities.size() );
        for ( Syndic syndic : entities ) {
            list.add( toDTO( syndic ) );
        }

        return list;
    }

    @Override
    public SyndicDTO toDTO(Syndic entity) {
        if ( entity == null ) {
            return null;
        }

        SyndicDTO syndicDTO = new SyndicDTO();

        syndicDTO.setId( entity.getId() );

        return syndicDTO;
    }

    @Override
    public Syndic toEntity(SyndicDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Syndic syndic = new Syndic();

        syndic.setId( dto.getId() );

        return syndic;
    }
}
