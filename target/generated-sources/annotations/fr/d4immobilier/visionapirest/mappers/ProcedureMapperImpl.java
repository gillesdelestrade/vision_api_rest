package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ProcedureDTO;
import fr.d4immobilier.visionapirest.entities.ComplementProcedure;
import fr.d4immobilier.visionapirest.entities.Procedure;
import fr.d4immobilier.visionapirest.entities.TypeProcedure;
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
public class ProcedureMapperImpl implements ProcedureMapper {

    @Override
    public List<ProcedureDTO> toDTOList(List<Procedure> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ProcedureDTO> list = new ArrayList<ProcedureDTO>( entities.size() );
        for ( Procedure procedure : entities ) {
            list.add( toDTO( procedure ) );
        }

        return list;
    }

    @Override
    public ProcedureDTO toDTO(Procedure entity) {
        if ( entity == null ) {
            return null;
        }

        ProcedureDTO procedureDTO = new ProcedureDTO();

        procedureDTO.setComplementProcedureId( entityComplementProcedureId( entity ) );
        procedureDTO.setTypeProcedure( typeProcedureToString( entity.getTypeProcedure() ) );
        procedureDTO.setId( entity.getId() );

        return procedureDTO;
    }

    @Override
    public Procedure toEntity(ProcedureDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Procedure procedure = new Procedure();

        procedure.setId( dto.getId() );
        if ( dto.getTypeProcedure() != null ) {
            procedure.setTypeProcedure( Enum.valueOf( TypeProcedure.class, dto.getTypeProcedure() ) );
        }

        return procedure;
    }

    private Long entityComplementProcedureId(Procedure procedure) {
        if ( procedure == null ) {
            return null;
        }
        ComplementProcedure complementProcedure = procedure.getComplementProcedure();
        if ( complementProcedure == null ) {
            return null;
        }
        Long id = complementProcedure.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
