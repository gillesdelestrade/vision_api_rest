package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EtiquetteDTO;
import fr.d4immobilier.visionapirest.entities.Etiquette;
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
public class EtiquetteMapperImpl implements EtiquetteMapper {

    @Override
    public List<EtiquetteDTO> toDTOList(List<Etiquette> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EtiquetteDTO> list = new ArrayList<EtiquetteDTO>( entities.size() );
        for ( Etiquette etiquette : entities ) {
            list.add( toDTO( etiquette ) );
        }

        return list;
    }

    @Override
    public EtiquetteDTO toDTO(Etiquette entity) {
        if ( entity == null ) {
            return null;
        }

        EtiquetteDTO etiquetteDTO = new EtiquetteDTO();

        etiquetteDTO.setId( entity.getId() );
        etiquetteDTO.setLibelle( entity.getLibelle() );

        return etiquetteDTO;
    }

    @Override
    public Etiquette toEntity(EtiquetteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Etiquette etiquette = new Etiquette();

        etiquette.setId( dto.getId() );
        etiquette.setLibelle( dto.getLibelle() );

        return etiquette;
    }
}
