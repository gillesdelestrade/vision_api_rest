package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CoproprietaireDTO;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T17:26:50+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class CoproprietaireMapperImpl implements CoproprietaireMapper {

    @Override
    public List<CoproprietaireDTO> toDTOList(List<Coproprietaire> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CoproprietaireDTO> list = new ArrayList<CoproprietaireDTO>( entities.size() );
        for ( Coproprietaire coproprietaire : entities ) {
            list.add( toDTO( coproprietaire ) );
        }

        return list;
    }

    @Override
    public CoproprietaireDTO toDTO(Coproprietaire entity) {
        if ( entity == null ) {
            return null;
        }

        CoproprietaireDTO coproprietaireDTO = new CoproprietaireDTO();

        coproprietaireDTO.setId( entity.getId() );
        coproprietaireDTO.setCodeBarrePresent( entity.getCodeBarrePresent() );
        coproprietaireDTO.setCodeBarrePouvoir( entity.getCodeBarrePouvoir() );

        return coproprietaireDTO;
    }

    @Override
    public Coproprietaire toEntity(CoproprietaireDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Coproprietaire coproprietaire = new Coproprietaire();

        coproprietaire.setCodeBarrePresent( dto.getCodeBarrePresent() );
        coproprietaire.setCodeBarrePouvoir( dto.getCodeBarrePouvoir() );
        coproprietaire.setId( dto.getId() );

        return coproprietaire;
    }
}
