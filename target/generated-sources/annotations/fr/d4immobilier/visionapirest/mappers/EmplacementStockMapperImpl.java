package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EmplacementStockDTO;
import fr.d4immobilier.visionapirest.entities.EmplacementStock;
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
public class EmplacementStockMapperImpl implements EmplacementStockMapper {

    @Override
    public List<EmplacementStockDTO> toDTOList(List<EmplacementStock> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EmplacementStockDTO> list = new ArrayList<EmplacementStockDTO>( entities.size() );
        for ( EmplacementStock emplacementStock : entities ) {
            list.add( toDTO( emplacementStock ) );
        }

        return list;
    }

    @Override
    public EmplacementStockDTO toDTO(EmplacementStock entity) {
        if ( entity == null ) {
            return null;
        }

        EmplacementStockDTO emplacementStockDTO = new EmplacementStockDTO();

        emplacementStockDTO.setId( entity.getId() );
        emplacementStockDTO.setDesignation( entity.getDesignation() );

        return emplacementStockDTO;
    }

    @Override
    public EmplacementStock toEntity(EmplacementStockDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EmplacementStock emplacementStock = new EmplacementStock();

        emplacementStock.setId( dto.getId() );
        emplacementStock.setDesignation( dto.getDesignation() );

        return emplacementStock;
    }
}
