package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.RappelDTO;
import fr.d4immobilier.visionapirest.entities.Rappel;
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
public class RappelMapperImpl implements RappelMapper {

    @Override
    public List<RappelDTO> toDTOList(List<Rappel> entities) {
        if ( entities == null ) {
            return null;
        }

        List<RappelDTO> list = new ArrayList<RappelDTO>( entities.size() );
        for ( Rappel rappel : entities ) {
            list.add( toDTO( rappel ) );
        }

        return list;
    }

    @Override
    public RappelDTO toDTO(Rappel entity) {
        if ( entity == null ) {
            return null;
        }

        RappelDTO rappelDTO = new RappelDTO();

        rappelDTO.setId( entity.getId() );
        rappelDTO.setDateRappel( entity.getDateRappel() );

        return rappelDTO;
    }

    @Override
    public Rappel toEntity(RappelDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Rappel rappel = new Rappel();

        rappel.setId( dto.getId() );
        rappel.setDateRappel( dto.getDateRappel() );

        return rappel;
    }
}
