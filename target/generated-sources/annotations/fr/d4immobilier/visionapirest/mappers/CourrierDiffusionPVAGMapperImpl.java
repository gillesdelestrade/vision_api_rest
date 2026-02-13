package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CourrierDiffusionPVAGDTO;
import fr.d4immobilier.visionapirest.entities.CourrierDiffusionPVAG;
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
public class CourrierDiffusionPVAGMapperImpl implements CourrierDiffusionPVAGMapper {

    @Override
    public List<CourrierDiffusionPVAGDTO> toDTOList(List<CourrierDiffusionPVAG> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CourrierDiffusionPVAGDTO> list = new ArrayList<CourrierDiffusionPVAGDTO>( entities.size() );
        for ( CourrierDiffusionPVAG courrierDiffusionPVAG : entities ) {
            list.add( toDTO( courrierDiffusionPVAG ) );
        }

        return list;
    }

    @Override
    public CourrierDiffusionPVAGDTO toDTO(CourrierDiffusionPVAG entity) {
        if ( entity == null ) {
            return null;
        }

        CourrierDiffusionPVAGDTO courrierDiffusionPVAGDTO = new CourrierDiffusionPVAGDTO();

        courrierDiffusionPVAGDTO.setPvagId( entityPvagId( entity ) );
        courrierDiffusionPVAGDTO.setId( entity.getId() );

        return courrierDiffusionPVAGDTO;
    }

    @Override
    public CourrierDiffusionPVAG toEntity(CourrierDiffusionPVAGDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CourrierDiffusionPVAG courrierDiffusionPVAG = new CourrierDiffusionPVAG();

        courrierDiffusionPVAG.setId( dto.getId() );

        return courrierDiffusionPVAG;
    }

    private Long entityPvagId(CourrierDiffusionPVAG courrierDiffusionPVAG) {
        if ( courrierDiffusionPVAG == null ) {
            return null;
        }
        PVAG pvag = courrierDiffusionPVAG.getPvag();
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
