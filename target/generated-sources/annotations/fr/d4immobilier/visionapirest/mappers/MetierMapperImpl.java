package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MetierDTO;
import fr.d4immobilier.visionapirest.entities.Metier;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-13T14:09:30+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class MetierMapperImpl implements MetierMapper {

    @Override
    public List<MetierDTO> toDTOList(List<Metier> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MetierDTO> list = new ArrayList<MetierDTO>( entities.size() );
        for ( Metier metier : entities ) {
            list.add( toDTO( metier ) );
        }

        return list;
    }

    @Override
    public MetierDTO toDTO(Metier entity) {
        if ( entity == null ) {
            return null;
        }

        MetierDTO metierDTO = new MetierDTO();

        metierDTO.setId( entity.getId() );
        metierDTO.setMetier( entity.getMetier() );

        return metierDTO;
    }

    @Override
    public Metier toEntity(MetierDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Metier metier = new Metier();

        metier.setId( dto.getId() );
        metier.setMetier( dto.getMetier() );

        return metier;
    }
}
