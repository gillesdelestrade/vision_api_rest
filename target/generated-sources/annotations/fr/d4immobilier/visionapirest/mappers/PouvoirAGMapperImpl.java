package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PouvoirAGDTO;
import fr.d4immobilier.visionapirest.entities.Assemblee;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.entities.PouvoirAG;
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
public class PouvoirAGMapperImpl implements PouvoirAGMapper {

    @Override
    public List<PouvoirAGDTO> toDTOList(List<PouvoirAG> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PouvoirAGDTO> list = new ArrayList<PouvoirAGDTO>( entities.size() );
        for ( PouvoirAG pouvoirAG : entities ) {
            list.add( toDTO( pouvoirAG ) );
        }

        return list;
    }

    @Override
    public PouvoirAGDTO toDTO(PouvoirAG entity) {
        if ( entity == null ) {
            return null;
        }

        PouvoirAGDTO pouvoirAGDTO = new PouvoirAGDTO();

        pouvoirAGDTO.setCoproprietaireReceveurId( entityCoproprietaireReceveurId( entity ) );
        pouvoirAGDTO.setCoproprietaireDonneurId( entityCoproprietaireDonneurId( entity ) );
        pouvoirAGDTO.setAssembleeId( entityAssembleeId( entity ) );
        pouvoirAGDTO.setId( entity.getId() );

        return pouvoirAGDTO;
    }

    @Override
    public PouvoirAG toEntity(PouvoirAGDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PouvoirAG pouvoirAG = new PouvoirAG();

        pouvoirAG.setId( dto.getId() );

        return pouvoirAG;
    }

    private Long entityCoproprietaireReceveurId(PouvoirAG pouvoirAG) {
        if ( pouvoirAG == null ) {
            return null;
        }
        Coproprietaire coproprietaireReceveur = pouvoirAG.getCoproprietaireReceveur();
        if ( coproprietaireReceveur == null ) {
            return null;
        }
        Long id = coproprietaireReceveur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityCoproprietaireDonneurId(PouvoirAG pouvoirAG) {
        if ( pouvoirAG == null ) {
            return null;
        }
        Coproprietaire coproprietaireDonneur = pouvoirAG.getCoproprietaireDonneur();
        if ( coproprietaireDonneur == null ) {
            return null;
        }
        Long id = coproprietaireDonneur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAssembleeId(PouvoirAG pouvoirAG) {
        if ( pouvoirAG == null ) {
            return null;
        }
        Assemblee assemblee = pouvoirAG.getAssemblee();
        if ( assemblee == null ) {
            return null;
        }
        Long id = assemblee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
