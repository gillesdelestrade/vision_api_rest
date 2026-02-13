package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ProchaineEtapeDTO;
import fr.d4immobilier.visionapirest.entities.ProchaineEtape;
import fr.d4immobilier.visionapirest.entities.ProchaineEtapeType;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-12T18:34:53+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class ProchaineEtapeMapperImpl implements ProchaineEtapeMapper {

    @Override
    public List<ProchaineEtapeDTO> toDTOList(List<ProchaineEtape> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ProchaineEtapeDTO> list = new ArrayList<ProchaineEtapeDTO>( entities.size() );
        for ( ProchaineEtape prochaineEtape : entities ) {
            list.add( toDTO( prochaineEtape ) );
        }

        return list;
    }

    @Override
    public ProchaineEtapeDTO toDTO(ProchaineEtape entity) {
        if ( entity == null ) {
            return null;
        }

        ProchaineEtapeDTO prochaineEtapeDTO = new ProchaineEtapeDTO();

        prochaineEtapeDTO.setProchaineEtapeTypeId( entityProchaineEtapeTypeId( entity ) );
        prochaineEtapeDTO.setDateDebut( dateDebutToString( entity.getDateDebut() ) );
        prochaineEtapeDTO.setDateFin( dateFinToString( entity.getDateFin() ) );
        prochaineEtapeDTO.setId( entity.getId() );

        return prochaineEtapeDTO;
    }

    @Override
    public ProchaineEtape toEntity(ProchaineEtapeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ProchaineEtape prochaineEtape = new ProchaineEtape();

        prochaineEtape.setId( dto.getId() );
        if ( dto.getDateDebut() != null ) {
            prochaineEtape.setDateDebut( Instant.parse( dto.getDateDebut() ) );
        }
        if ( dto.getDateFin() != null ) {
            prochaineEtape.setDateFin( Instant.parse( dto.getDateFin() ) );
        }

        return prochaineEtape;
    }

    private Long entityProchaineEtapeTypeId(ProchaineEtape prochaineEtape) {
        if ( prochaineEtape == null ) {
            return null;
        }
        ProchaineEtapeType prochaineEtapeType = prochaineEtape.getProchaineEtapeType();
        if ( prochaineEtapeType == null ) {
            return null;
        }
        Long id = prochaineEtapeType.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
