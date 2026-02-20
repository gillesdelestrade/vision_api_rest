package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PVAGDTO;
import fr.d4immobilier.visionapirest.entities.Assemblee;
import fr.d4immobilier.visionapirest.entities.FichierPVAG;
import fr.d4immobilier.visionapirest.entities.PVAG;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-20T08:40:21+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class PVAGMapperImpl implements PVAGMapper {

    @Override
    public List<PVAGDTO> toDTOList(List<PVAG> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PVAGDTO> list = new ArrayList<PVAGDTO>( entities.size() );
        for ( PVAG pVAG : entities ) {
            list.add( toDTO( pVAG ) );
        }

        return list;
    }

    @Override
    public PVAGDTO toDTO(PVAG entity) {
        if ( entity == null ) {
            return null;
        }

        PVAGDTO pVAGDTO = new PVAGDTO();

        pVAGDTO.setAssembleeId( entityAssembleeId( entity ) );
        pVAGDTO.setFichierPVAGId( entityFichierPVAGId( entity ) );
        pVAGDTO.setDateAG( dateAGToString( entity.getDateAG() ) );
        pVAGDTO.setId( entity.getId() );

        return pVAGDTO;
    }

    @Override
    public PVAG toEntity(PVAGDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PVAG pVAG = new PVAG();

        pVAG.setId( dto.getId() );
        if ( dto.getDateAG() != null ) {
            pVAG.setDateAG( Instant.parse( dto.getDateAG() ) );
        }

        return pVAG;
    }

    private Long entityAssembleeId(PVAG pVAG) {
        if ( pVAG == null ) {
            return null;
        }
        Assemblee assemblee = pVAG.getAssemblee();
        if ( assemblee == null ) {
            return null;
        }
        Long id = assemblee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierPVAGId(PVAG pVAG) {
        if ( pVAG == null ) {
            return null;
        }
        FichierPVAG fichierPVAG = pVAG.getFichierPVAG();
        if ( fichierPVAG == null ) {
            return null;
        }
        Long id = fichierPVAG.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
