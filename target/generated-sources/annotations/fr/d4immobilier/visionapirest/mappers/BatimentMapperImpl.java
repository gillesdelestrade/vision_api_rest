package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BatimentDTO;
import fr.d4immobilier.visionapirest.entities.Batiment;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T17:26:49+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class BatimentMapperImpl implements BatimentMapper {

    @Override
    public List<BatimentDTO> toDTOList(List<Batiment> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BatimentDTO> list = new ArrayList<BatimentDTO>( entities.size() );
        for ( Batiment batiment : entities ) {
            list.add( toDTO( batiment ) );
        }

        return list;
    }

    @Override
    public BatimentDTO toDTO(Batiment entity) {
        if ( entity == null ) {
            return null;
        }

        BatimentDTO batimentDTO = new BatimentDTO();

        batimentDTO.setId( entity.getId() );
        batimentDTO.setLibelle( entity.getLibelle() );
        batimentDTO.setLibelleCourt( entity.getLibelleCourt() );

        return batimentDTO;
    }

    @Override
    public Batiment toEntity(BatimentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Batiment batiment = new Batiment();

        batiment.setId( dto.getId() );
        batiment.setLibelle( dto.getLibelle() );
        batiment.setLibelleCourt( dto.getLibelleCourt() );

        return batiment;
    }
}
