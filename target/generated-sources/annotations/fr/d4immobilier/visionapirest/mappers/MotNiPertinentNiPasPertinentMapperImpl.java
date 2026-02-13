package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MotNiPertinentNiPasPertinentDTO;
import fr.d4immobilier.visionapirest.entities.MotNiPertinentNiPasPertinent;
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
public class MotNiPertinentNiPasPertinentMapperImpl implements MotNiPertinentNiPasPertinentMapper {

    @Override
    public List<MotNiPertinentNiPasPertinentDTO> toDTOList(List<MotNiPertinentNiPasPertinent> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MotNiPertinentNiPasPertinentDTO> list = new ArrayList<MotNiPertinentNiPasPertinentDTO>( entities.size() );
        for ( MotNiPertinentNiPasPertinent motNiPertinentNiPasPertinent : entities ) {
            list.add( toDTO( motNiPertinentNiPasPertinent ) );
        }

        return list;
    }

    @Override
    public MotNiPertinentNiPasPertinentDTO toDTO(MotNiPertinentNiPasPertinent entity) {
        if ( entity == null ) {
            return null;
        }

        MotNiPertinentNiPasPertinentDTO motNiPertinentNiPasPertinentDTO = new MotNiPertinentNiPasPertinentDTO();

        motNiPertinentNiPasPertinentDTO.setId( entity.getId() );
        motNiPertinentNiPasPertinentDTO.setMot( entity.getMot() );

        return motNiPertinentNiPasPertinentDTO;
    }

    @Override
    public MotNiPertinentNiPasPertinent toEntity(MotNiPertinentNiPasPertinentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MotNiPertinentNiPasPertinent motNiPertinentNiPasPertinent = new MotNiPertinentNiPasPertinent();

        motNiPertinentNiPasPertinent.setId( dto.getId() );
        motNiPertinentNiPasPertinent.setMot( dto.getMot() );

        return motNiPertinentNiPasPertinent;
    }
}
