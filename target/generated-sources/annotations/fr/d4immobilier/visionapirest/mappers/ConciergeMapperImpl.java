package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ConciergeDTO;
import fr.d4immobilier.visionapirest.entities.Concierge;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-17T10:51:57+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class ConciergeMapperImpl implements ConciergeMapper {

    @Override
    public List<ConciergeDTO> toDTOList(List<Concierge> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ConciergeDTO> list = new ArrayList<ConciergeDTO>( entities.size() );
        for ( Concierge concierge : entities ) {
            list.add( toDTO( concierge ) );
        }

        return list;
    }

    @Override
    public ConciergeDTO toDTO(Concierge entity) {
        if ( entity == null ) {
            return null;
        }

        ConciergeDTO conciergeDTO = new ConciergeDTO();

        conciergeDTO.setId( entity.getId() );
        conciergeDTO.setNumeroAdherentMedecineDuTravail( entity.getNumeroAdherentMedecineDuTravail() );

        return conciergeDTO;
    }

    @Override
    public Concierge toEntity(ConciergeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Concierge concierge = new Concierge();

        concierge.setId( dto.getId() );
        concierge.setNumeroAdherentMedecineDuTravail( dto.getNumeroAdherentMedecineDuTravail() );

        return concierge;
    }
}
