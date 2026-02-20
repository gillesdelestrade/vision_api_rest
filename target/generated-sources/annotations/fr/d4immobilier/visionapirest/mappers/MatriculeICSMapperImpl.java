package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MatriculeICSDTO;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.entities.MatriculeICS;
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
public class MatriculeICSMapperImpl implements MatriculeICSMapper {

    @Override
    public List<MatriculeICSDTO> toDTOList(List<MatriculeICS> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MatriculeICSDTO> list = new ArrayList<MatriculeICSDTO>( entities.size() );
        for ( MatriculeICS matriculeICS : entities ) {
            list.add( toDTO( matriculeICS ) );
        }

        return list;
    }

    @Override
    public MatriculeICSDTO toDTO(MatriculeICS entity) {
        if ( entity == null ) {
            return null;
        }

        MatriculeICSDTO matriculeICSDTO = new MatriculeICSDTO();

        matriculeICSDTO.setCoproprietaireId( entityCoproprietaireId( entity ) );
        matriculeICSDTO.setId( entity.getId() );
        matriculeICSDTO.setMatricule( entity.getMatricule() );
        matriculeICSDTO.setLogin( entity.getLogin() );
        matriculeICSDTO.setPasswd( entity.getPasswd() );
        matriculeICSDTO.setRgpd( entity.getRgpd() );
        matriculeICSDTO.setPermalink( entity.getPermalink() );

        return matriculeICSDTO;
    }

    @Override
    public MatriculeICS toEntity(MatriculeICSDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MatriculeICS matriculeICS = new MatriculeICS();

        matriculeICS.setId( dto.getId() );
        matriculeICS.setMatricule( dto.getMatricule() );
        matriculeICS.setLogin( dto.getLogin() );
        matriculeICS.setPasswd( dto.getPasswd() );
        matriculeICS.setRgpd( dto.getRgpd() );
        matriculeICS.setPermalink( dto.getPermalink() );

        return matriculeICS;
    }

    private Long entityCoproprietaireId(MatriculeICS matriculeICS) {
        if ( matriculeICS == null ) {
            return null;
        }
        Coproprietaire coproprietaire = matriculeICS.getCoproprietaire();
        if ( coproprietaire == null ) {
            return null;
        }
        Long id = coproprietaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
