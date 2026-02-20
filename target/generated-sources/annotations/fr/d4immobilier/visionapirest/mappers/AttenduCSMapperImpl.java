package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AttenduCSDTO;
import fr.d4immobilier.visionapirest.entities.AttenduCS;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-20T08:40:21+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class AttenduCSMapperImpl implements AttenduCSMapper {

    @Override
    public List<AttenduCSDTO> toDTOList(List<AttenduCS> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AttenduCSDTO> list = new ArrayList<AttenduCSDTO>( entities.size() );
        for ( AttenduCS attenduCS : entities ) {
            list.add( toDTO( attenduCS ) );
        }

        return list;
    }

    @Override
    public AttenduCSDTO toDTO(AttenduCS entity) {
        if ( entity == null ) {
            return null;
        }

        AttenduCSDTO attenduCSDTO = new AttenduCSDTO();

        attenduCSDTO.setId( entity.getId() );
        attenduCSDTO.setLibelle( entity.getLibelle() );

        return attenduCSDTO;
    }

    @Override
    public AttenduCS toEntity(AttenduCSDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AttenduCS attenduCS = new AttenduCS();

        attenduCS.setId( dto.getId() );
        attenduCS.setLibelle( dto.getLibelle() );

        return attenduCS;
    }
}
