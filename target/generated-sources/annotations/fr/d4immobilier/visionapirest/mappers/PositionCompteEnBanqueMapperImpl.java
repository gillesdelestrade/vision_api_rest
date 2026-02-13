package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PositionCompteEnBanqueDTO;
import fr.d4immobilier.visionapirest.entities.PositionCompteEnBanque;
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
public class PositionCompteEnBanqueMapperImpl implements PositionCompteEnBanqueMapper {

    @Override
    public List<PositionCompteEnBanqueDTO> toDTOList(List<PositionCompteEnBanque> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PositionCompteEnBanqueDTO> list = new ArrayList<PositionCompteEnBanqueDTO>( entities.size() );
        for ( PositionCompteEnBanque positionCompteEnBanque : entities ) {
            list.add( toDTO( positionCompteEnBanque ) );
        }

        return list;
    }

    @Override
    public PositionCompteEnBanqueDTO toDTO(PositionCompteEnBanque entity) {
        if ( entity == null ) {
            return null;
        }

        PositionCompteEnBanqueDTO positionCompteEnBanqueDTO = new PositionCompteEnBanqueDTO();

        positionCompteEnBanqueDTO.setId( entity.getId() );
        positionCompteEnBanqueDTO.setDatePosition( entity.getDatePosition() );
        positionCompteEnBanqueDTO.setPosition( entity.getPosition() );

        return positionCompteEnBanqueDTO;
    }

    @Override
    public PositionCompteEnBanque toEntity(PositionCompteEnBanqueDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PositionCompteEnBanque positionCompteEnBanque = new PositionCompteEnBanque();

        positionCompteEnBanque.setId( dto.getId() );
        positionCompteEnBanque.setDatePosition( dto.getDatePosition() );
        positionCompteEnBanque.setPosition( dto.getPosition() );

        return positionCompteEnBanque;
    }
}
