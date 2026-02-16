package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CoproprietaireSocieteDTO;
import fr.d4immobilier.visionapirest.entities.CoproprietaireSociete;
import fr.d4immobilier.visionapirest.entities.Societe;
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
public class CoproprietaireSocieteMapperImpl implements CoproprietaireSocieteMapper {

    @Override
    public List<CoproprietaireSocieteDTO> toDTOList(List<CoproprietaireSociete> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CoproprietaireSocieteDTO> list = new ArrayList<CoproprietaireSocieteDTO>( entities.size() );
        for ( CoproprietaireSociete coproprietaireSociete : entities ) {
            list.add( toDTO( coproprietaireSociete ) );
        }

        return list;
    }

    @Override
    public CoproprietaireSocieteDTO toDTO(CoproprietaireSociete entity) {
        if ( entity == null ) {
            return null;
        }

        CoproprietaireSocieteDTO coproprietaireSocieteDTO = new CoproprietaireSocieteDTO();

        coproprietaireSocieteDTO.setSocieteId( entitySocieteId( entity ) );
        coproprietaireSocieteDTO.setId( entity.getId() );

        return coproprietaireSocieteDTO;
    }

    @Override
    public CoproprietaireSociete toEntity(CoproprietaireSocieteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CoproprietaireSociete coproprietaireSociete = new CoproprietaireSociete();

        coproprietaireSociete.setId( dto.getId() );

        return coproprietaireSociete;
    }

    private Long entitySocieteId(CoproprietaireSociete coproprietaireSociete) {
        if ( coproprietaireSociete == null ) {
            return null;
        }
        Societe societe = coproprietaireSociete.getSociete();
        if ( societe == null ) {
            return null;
        }
        Long id = societe.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
