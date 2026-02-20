package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TantiemeDTO;
import fr.d4immobilier.visionapirest.entities.Batiment;
import fr.d4immobilier.visionapirest.entities.Tantieme;
import fr.d4immobilier.visionapirest.entities.TypeTantieme;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-20T08:40:21+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class TantiemeMapperImpl implements TantiemeMapper {

    @Override
    public List<TantiemeDTO> toDTOList(List<Tantieme> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TantiemeDTO> list = new ArrayList<TantiemeDTO>( entities.size() );
        for ( Tantieme tantieme : entities ) {
            list.add( toDTO( tantieme ) );
        }

        return list;
    }

    @Override
    public TantiemeDTO toDTO(Tantieme entity) {
        if ( entity == null ) {
            return null;
        }

        TantiemeDTO tantiemeDTO = new TantiemeDTO();

        tantiemeDTO.setTypeTantiemeId( entityTypeTantiemeId( entity ) );
        tantiemeDTO.setBatimentId( entityBatimentId( entity ) );
        tantiemeDTO.setId( entity.getId() );
        tantiemeDTO.setQuotePart( entity.getQuotePart() );

        return tantiemeDTO;
    }

    @Override
    public Tantieme toEntity(TantiemeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Tantieme tantieme = new Tantieme();

        tantieme.setId( dto.getId() );
        tantieme.setQuotePart( dto.getQuotePart() );

        return tantieme;
    }

    private Long entityTypeTantiemeId(Tantieme tantieme) {
        if ( tantieme == null ) {
            return null;
        }
        TypeTantieme typeTantieme = tantieme.getTypeTantieme();
        if ( typeTantieme == null ) {
            return null;
        }
        Long id = typeTantieme.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityBatimentId(Tantieme tantieme) {
        if ( tantieme == null ) {
            return null;
        }
        Batiment batiment = tantieme.getBatiment();
        if ( batiment == null ) {
            return null;
        }
        Long id = batiment.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
