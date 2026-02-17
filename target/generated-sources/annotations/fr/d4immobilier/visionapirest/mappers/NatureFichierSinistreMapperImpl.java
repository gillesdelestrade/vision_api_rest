package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.NatureFichierSinistreDTO;
import fr.d4immobilier.visionapirest.entities.NatureFichierSinistre;
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
public class NatureFichierSinistreMapperImpl implements NatureFichierSinistreMapper {

    @Override
    public List<NatureFichierSinistreDTO> toDTOList(List<NatureFichierSinistre> entities) {
        if ( entities == null ) {
            return null;
        }

        List<NatureFichierSinistreDTO> list = new ArrayList<NatureFichierSinistreDTO>( entities.size() );
        for ( NatureFichierSinistre natureFichierSinistre : entities ) {
            list.add( toDTO( natureFichierSinistre ) );
        }

        return list;
    }

    @Override
    public NatureFichierSinistreDTO toDTO(NatureFichierSinistre entity) {
        if ( entity == null ) {
            return null;
        }

        NatureFichierSinistreDTO natureFichierSinistreDTO = new NatureFichierSinistreDTO();

        natureFichierSinistreDTO.setId( entity.getId() );
        natureFichierSinistreDTO.setNature( entity.getNature() );
        natureFichierSinistreDTO.setRang( entity.getRang() );

        return natureFichierSinistreDTO;
    }

    @Override
    public NatureFichierSinistre toEntity(NatureFichierSinistreDTO dto) {
        if ( dto == null ) {
            return null;
        }

        NatureFichierSinistre natureFichierSinistre = new NatureFichierSinistre();

        natureFichierSinistre.setId( dto.getId() );
        natureFichierSinistre.setNature( dto.getNature() );
        natureFichierSinistre.setRang( dto.getRang() );

        return natureFichierSinistre;
    }
}
