package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MandatSyndicDTO;
import fr.d4immobilier.visionapirest.entities.ContratFournisseur;
import fr.d4immobilier.visionapirest.entities.MandatSyndic;
import fr.d4immobilier.visionapirest.entities.PVAG;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-12T18:34:53+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class MandatSyndicMapperImpl implements MandatSyndicMapper {

    @Override
    public List<MandatSyndicDTO> toDTOList(List<MandatSyndic> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MandatSyndicDTO> list = new ArrayList<MandatSyndicDTO>( entities.size() );
        for ( MandatSyndic mandatSyndic : entities ) {
            list.add( toDTO( mandatSyndic ) );
        }

        return list;
    }

    @Override
    public MandatSyndicDTO toDTO(MandatSyndic entity) {
        if ( entity == null ) {
            return null;
        }

        MandatSyndicDTO mandatSyndicDTO = new MandatSyndicDTO();

        mandatSyndicDTO.setPvagId( entityPvagId( entity ) );
        mandatSyndicDTO.setContratFournisseurId( entityContratFournisseurId( entity ) );
        mandatSyndicDTO.setId( entity.getId() );
        mandatSyndicDTO.setNumero( entity.getNumero() );
        mandatSyndicDTO.setDateDebut( entity.getDateDebut() );
        mandatSyndicDTO.setDateFin( entity.getDateFin() );

        return mandatSyndicDTO;
    }

    @Override
    public MandatSyndic toEntity(MandatSyndicDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MandatSyndic mandatSyndic = new MandatSyndic();

        mandatSyndic.setId( dto.getId() );
        mandatSyndic.setNumero( dto.getNumero() );
        mandatSyndic.setDateDebut( dto.getDateDebut() );
        mandatSyndic.setDateFin( dto.getDateFin() );

        return mandatSyndic;
    }

    private Long entityPvagId(MandatSyndic mandatSyndic) {
        if ( mandatSyndic == null ) {
            return null;
        }
        PVAG pvag = mandatSyndic.getPvag();
        if ( pvag == null ) {
            return null;
        }
        Long id = pvag.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityContratFournisseurId(MandatSyndic mandatSyndic) {
        if ( mandatSyndic == null ) {
            return null;
        }
        ContratFournisseur contratFournisseur = mandatSyndic.getContratFournisseur();
        if ( contratFournisseur == null ) {
            return null;
        }
        Long id = contratFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
