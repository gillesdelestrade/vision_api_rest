package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PassageObligeDTO;
import fr.d4immobilier.visionapirest.entities.PassageOblige;
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
public class PassageObligeMapperImpl implements PassageObligeMapper {

    @Override
    public List<PassageObligeDTO> toDTOList(List<PassageOblige> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PassageObligeDTO> list = new ArrayList<PassageObligeDTO>( entities.size() );
        for ( PassageOblige passageOblige : entities ) {
            list.add( toDTO( passageOblige ) );
        }

        return list;
    }

    @Override
    public PassageObligeDTO toDTO(PassageOblige entity) {
        if ( entity == null ) {
            return null;
        }

        PassageObligeDTO passageObligeDTO = new PassageObligeDTO();

        passageObligeDTO.setId( entity.getId() );
        passageObligeDTO.setJourSemaine( entity.getJourSemaine() );
        passageObligeDTO.setHeureDebut( entity.getHeureDebut() );
        passageObligeDTO.setMinutesDebut( entity.getMinutesDebut() );
        passageObligeDTO.setHeureFin( entity.getHeureFin() );
        passageObligeDTO.setMinutesFin( entity.getMinutesFin() );

        return passageObligeDTO;
    }

    @Override
    public PassageOblige toEntity(PassageObligeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PassageOblige passageOblige = new PassageOblige();

        passageOblige.setId( dto.getId() );
        passageOblige.setJourSemaine( dto.getJourSemaine() );
        passageOblige.setHeureDebut( dto.getHeureDebut() );
        passageOblige.setMinutesDebut( dto.getMinutesDebut() );
        passageOblige.setHeureFin( dto.getHeureFin() );
        passageOblige.setMinutesFin( dto.getMinutesFin() );

        return passageOblige;
    }
}
