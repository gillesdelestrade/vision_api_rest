package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MotCleMetierDTO;
import fr.d4immobilier.visionapirest.entities.ImportanceMotCle;
import fr.d4immobilier.visionapirest.entities.Metier;
import fr.d4immobilier.visionapirest.entities.MotCleMetier;
import fr.d4immobilier.visionapirest.entities.MotPertinent;
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
public class MotCleMetierMapperImpl implements MotCleMetierMapper {

    @Override
    public List<MotCleMetierDTO> toDTOList(List<MotCleMetier> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MotCleMetierDTO> list = new ArrayList<MotCleMetierDTO>( entities.size() );
        for ( MotCleMetier motCleMetier : entities ) {
            list.add( toDTO( motCleMetier ) );
        }

        return list;
    }

    @Override
    public MotCleMetierDTO toDTO(MotCleMetier entity) {
        if ( entity == null ) {
            return null;
        }

        MotCleMetierDTO motCleMetierDTO = new MotCleMetierDTO();

        motCleMetierDTO.setMotPertinentId( entityMotPertinentId( entity ) );
        motCleMetierDTO.setMetierId( entityMetierId( entity ) );
        motCleMetierDTO.setImportanceMotCle( importanceMotCleToString( entity.getImportanceMotCle() ) );
        motCleMetierDTO.setId( entity.getId() );

        return motCleMetierDTO;
    }

    @Override
    public MotCleMetier toEntity(MotCleMetierDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MotCleMetier motCleMetier = new MotCleMetier();

        motCleMetier.setId( dto.getId() );
        if ( dto.getImportanceMotCle() != null ) {
            motCleMetier.setImportanceMotCle( Enum.valueOf( ImportanceMotCle.class, dto.getImportanceMotCle() ) );
        }

        return motCleMetier;
    }

    private Long entityMotPertinentId(MotCleMetier motCleMetier) {
        if ( motCleMetier == null ) {
            return null;
        }
        MotPertinent motPertinent = motCleMetier.getMotPertinent();
        if ( motPertinent == null ) {
            return null;
        }
        Long id = motPertinent.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityMetierId(MotCleMetier motCleMetier) {
        if ( motCleMetier == null ) {
            return null;
        }
        Metier metier = motCleMetier.getMetier();
        if ( metier == null ) {
            return null;
        }
        Long id = metier.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
