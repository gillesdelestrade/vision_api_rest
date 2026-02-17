package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.SurveillanceObjetsDTO;
import fr.d4immobilier.visionapirest.entities.ObjetASurveiller;
import fr.d4immobilier.visionapirest.entities.SurveillanceObjets;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-17T10:51:57+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class SurveillanceObjetsMapperImpl implements SurveillanceObjetsMapper {

    @Override
    public List<SurveillanceObjetsDTO> toDTOList(List<SurveillanceObjets> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SurveillanceObjetsDTO> list = new ArrayList<SurveillanceObjetsDTO>( entities.size() );
        for ( SurveillanceObjets surveillanceObjets : entities ) {
            list.add( toDTO( surveillanceObjets ) );
        }

        return list;
    }

    @Override
    public SurveillanceObjetsDTO toDTO(SurveillanceObjets entity) {
        if ( entity == null ) {
            return null;
        }

        SurveillanceObjetsDTO surveillanceObjetsDTO = new SurveillanceObjetsDTO();

        surveillanceObjetsDTO.setObjetASurveillerId( entityObjetASurveillerId( entity ) );
        surveillanceObjetsDTO.setDateDePriseEnCompte( dateDePriseEnCompteToString( entity.getDateDePriseEnCompte() ) );
        surveillanceObjetsDTO.setId( entity.getId() );
        surveillanceObjetsDTO.setIdPersonne( entity.getIdPersonne() );

        return surveillanceObjetsDTO;
    }

    @Override
    public SurveillanceObjets toEntity(SurveillanceObjetsDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SurveillanceObjets surveillanceObjets = new SurveillanceObjets();

        surveillanceObjets.setId( dto.getId() );
        surveillanceObjets.setIdPersonne( dto.getIdPersonne() );
        if ( dto.getDateDePriseEnCompte() != null ) {
            surveillanceObjets.setDateDePriseEnCompte( Instant.parse( dto.getDateDePriseEnCompte() ) );
        }

        return surveillanceObjets;
    }

    private Long entityObjetASurveillerId(SurveillanceObjets surveillanceObjets) {
        if ( surveillanceObjets == null ) {
            return null;
        }
        ObjetASurveiller objetASurveiller = surveillanceObjets.getObjetASurveiller();
        if ( objetASurveiller == null ) {
            return null;
        }
        Long id = objetASurveiller.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
