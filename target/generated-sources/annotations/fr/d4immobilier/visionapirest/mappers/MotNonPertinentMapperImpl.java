package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MotNonPertinentDTO;
import fr.d4immobilier.visionapirest.entities.MotNonPertinent;
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
public class MotNonPertinentMapperImpl implements MotNonPertinentMapper {

    @Override
    public List<MotNonPertinentDTO> toDTOList(List<MotNonPertinent> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MotNonPertinentDTO> list = new ArrayList<MotNonPertinentDTO>( entities.size() );
        for ( MotNonPertinent motNonPertinent : entities ) {
            list.add( toDTO( motNonPertinent ) );
        }

        return list;
    }

    @Override
    public MotNonPertinentDTO toDTO(MotNonPertinent entity) {
        if ( entity == null ) {
            return null;
        }

        MotNonPertinentDTO motNonPertinentDTO = new MotNonPertinentDTO();

        motNonPertinentDTO.setId( entity.getId() );
        motNonPertinentDTO.setMot( entity.getMot() );

        return motNonPertinentDTO;
    }

    @Override
    public MotNonPertinent toEntity(MotNonPertinentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MotNonPertinent motNonPertinent = new MotNonPertinent();

        motNonPertinent.setId( dto.getId() );
        motNonPertinent.setMot( dto.getMot() );

        return motNonPertinent;
    }
}
