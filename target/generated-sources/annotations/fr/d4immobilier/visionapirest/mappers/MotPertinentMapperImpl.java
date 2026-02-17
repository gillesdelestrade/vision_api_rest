package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MotPertinentDTO;
import fr.d4immobilier.visionapirest.entities.MotPertinent;
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
public class MotPertinentMapperImpl implements MotPertinentMapper {

    @Override
    public List<MotPertinentDTO> toDTOList(List<MotPertinent> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MotPertinentDTO> list = new ArrayList<MotPertinentDTO>( entities.size() );
        for ( MotPertinent motPertinent : entities ) {
            list.add( toDTO( motPertinent ) );
        }

        return list;
    }

    @Override
    public MotPertinentDTO toDTO(MotPertinent entity) {
        if ( entity == null ) {
            return null;
        }

        MotPertinentDTO motPertinentDTO = new MotPertinentDTO();

        motPertinentDTO.setId( entity.getId() );
        motPertinentDTO.setMot( entity.getMot() );

        return motPertinentDTO;
    }

    @Override
    public MotPertinent toEntity(MotPertinentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MotPertinent motPertinent = new MotPertinent();

        motPertinent.setId( dto.getId() );
        motPertinent.setMot( dto.getMot() );

        return motPertinent;
    }
}
