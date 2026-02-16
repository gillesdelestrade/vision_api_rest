package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ARappelerDTO;
import fr.d4immobilier.visionapirest.entities.ARappeler;
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
public class ARappelerMapperImpl implements ARappelerMapper {

    @Override
    public List<ARappelerDTO> toDTOList(List<ARappeler> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ARappelerDTO> list = new ArrayList<ARappelerDTO>( entities.size() );
        for ( ARappeler aRappeler : entities ) {
            list.add( toDTO( aRappeler ) );
        }

        return list;
    }

    @Override
    public ARappelerDTO toDTO(ARappeler entity) {
        if ( entity == null ) {
            return null;
        }

        ARappelerDTO aRappelerDTO = new ARappelerDTO();

        aRappelerDTO.setId( entity.getId() );
        aRappelerDTO.setDateButoire( entity.getDateButoire() );
        aRappelerDTO.setPostIt( entity.getPostIt() );
        aRappelerDTO.setConsigne( entity.getConsigne() );
        aRappelerDTO.setActif( entity.getActif() );
        aRappelerDTO.setAck( entity.getAck() );

        return aRappelerDTO;
    }

    @Override
    public ARappeler toEntity(ARappelerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ARappeler aRappeler = new ARappeler();

        aRappeler.setId( dto.getId() );
        aRappeler.setDateButoire( dto.getDateButoire() );
        aRappeler.setPostIt( dto.getPostIt() );
        aRappeler.setConsigne( dto.getConsigne() );
        aRappeler.setActif( dto.getActif() );
        aRappeler.setAck( dto.getAck() );

        return aRappeler;
    }
}
