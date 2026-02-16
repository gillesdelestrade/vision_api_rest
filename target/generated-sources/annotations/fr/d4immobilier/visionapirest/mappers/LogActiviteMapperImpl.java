package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.LogActiviteDTO;
import fr.d4immobilier.visionapirest.entities.LogActivite;
import fr.d4immobilier.visionapirest.entities.Personne;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T17:26:49+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class LogActiviteMapperImpl implements LogActiviteMapper {

    @Override
    public List<LogActiviteDTO> toDTOList(List<LogActivite> entities) {
        if ( entities == null ) {
            return null;
        }

        List<LogActiviteDTO> list = new ArrayList<LogActiviteDTO>( entities.size() );
        for ( LogActivite logActivite : entities ) {
            list.add( toDTO( logActivite ) );
        }

        return list;
    }

    @Override
    public LogActiviteDTO toDTO(LogActivite entity) {
        if ( entity == null ) {
            return null;
        }

        LogActiviteDTO logActiviteDTO = new LogActiviteDTO();

        logActiviteDTO.setUserId( entityUserId( entity ) );
        logActiviteDTO.setDateActivite( dateActiviteToString( entity.getDateActivite() ) );
        logActiviteDTO.setId( entity.getId() );
        logActiviteDTO.setDescription( entity.getDescription() );
        logActiviteDTO.setNbPages( entity.getNbPages() );
        logActiviteDTO.setNbDocuments( entity.getNbDocuments() );
        logActiviteDTO.setDureeAppelEnSecondes( entity.getDureeAppelEnSecondes() );

        return logActiviteDTO;
    }

    @Override
    public LogActivite toEntity(LogActiviteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        LogActivite logActivite = new LogActivite();

        logActivite.setId( dto.getId() );
        if ( dto.getDateActivite() != null ) {
            logActivite.setDateActivite( Instant.parse( dto.getDateActivite() ) );
        }
        logActivite.setDescription( dto.getDescription() );
        logActivite.setNbPages( dto.getNbPages() );
        logActivite.setNbDocuments( dto.getNbDocuments() );
        logActivite.setDureeAppelEnSecondes( dto.getDureeAppelEnSecondes() );

        return logActivite;
    }

    private Long entityUserId(LogActivite logActivite) {
        if ( logActivite == null ) {
            return null;
        }
        Personne user = logActivite.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
