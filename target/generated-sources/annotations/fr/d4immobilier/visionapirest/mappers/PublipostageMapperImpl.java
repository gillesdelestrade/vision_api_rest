package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PublipostageDTO;
import fr.d4immobilier.visionapirest.entities.Courrier;
import fr.d4immobilier.visionapirest.entities.PreuveDeDepotALaPoste;
import fr.d4immobilier.visionapirest.entities.Publipostage;
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
public class PublipostageMapperImpl implements PublipostageMapper {

    @Override
    public List<PublipostageDTO> toDTOList(List<Publipostage> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PublipostageDTO> list = new ArrayList<PublipostageDTO>( entities.size() );
        for ( Publipostage publipostage : entities ) {
            list.add( toDTO( publipostage ) );
        }

        return list;
    }

    @Override
    public PublipostageDTO toDTO(Publipostage entity) {
        if ( entity == null ) {
            return null;
        }

        PublipostageDTO publipostageDTO = new PublipostageDTO();

        publipostageDTO.setCourrierId( entityCourrierId( entity ) );
        publipostageDTO.setPreuveDeDepotALaPosteId( entityPreuveDeDepotALaPosteId( entity ) );
        publipostageDTO.setId( entity.getId() );

        return publipostageDTO;
    }

    @Override
    public Publipostage toEntity(PublipostageDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Publipostage publipostage = new Publipostage();

        publipostage.setId( dto.getId() );

        return publipostage;
    }

    private Long entityCourrierId(Publipostage publipostage) {
        if ( publipostage == null ) {
            return null;
        }
        Courrier courrier = publipostage.getCourrier();
        if ( courrier == null ) {
            return null;
        }
        Long id = courrier.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityPreuveDeDepotALaPosteId(Publipostage publipostage) {
        if ( publipostage == null ) {
            return null;
        }
        PreuveDeDepotALaPoste preuveDeDepotALaPoste = publipostage.getPreuveDeDepotALaPoste();
        if ( preuveDeDepotALaPoste == null ) {
            return null;
        }
        Long id = preuveDeDepotALaPoste.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
