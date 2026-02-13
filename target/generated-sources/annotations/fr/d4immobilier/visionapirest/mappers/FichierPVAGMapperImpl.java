package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierPVAGDTO;
import fr.d4immobilier.visionapirest.entities.FichierPVAG;
import fr.d4immobilier.visionapirest.entities.PVAG;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-13T14:09:30+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class FichierPVAGMapperImpl implements FichierPVAGMapper {

    @Override
    public List<FichierPVAGDTO> toDTOList(List<FichierPVAG> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierPVAGDTO> list = new ArrayList<FichierPVAGDTO>( entities.size() );
        for ( FichierPVAG fichierPVAG : entities ) {
            list.add( toDTO( fichierPVAG ) );
        }

        return list;
    }

    @Override
    public FichierPVAGDTO toDTO(FichierPVAG entity) {
        if ( entity == null ) {
            return null;
        }

        FichierPVAGDTO fichierPVAGDTO = new FichierPVAGDTO();

        fichierPVAGDTO.setPvagId( entityPvagId( entity ) );
        fichierPVAGDTO.setId( entity.getId() );

        return fichierPVAGDTO;
    }

    @Override
    public FichierPVAG toEntity(FichierPVAGDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierPVAG fichierPVAG = new FichierPVAG();

        fichierPVAG.setId( dto.getId() );

        return fichierPVAG;
    }

    private Long entityPvagId(FichierPVAG fichierPVAG) {
        if ( fichierPVAG == null ) {
            return null;
        }
        PVAG pvag = fichierPVAG.getPvag();
        if ( pvag == null ) {
            return null;
        }
        Long id = pvag.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
