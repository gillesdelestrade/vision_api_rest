package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.HonorairesSurTravauxDTO;
import fr.d4immobilier.visionapirest.entities.HonorairesSurTravaux;
import fr.d4immobilier.visionapirest.entities.Resolution;
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
public class HonorairesSurTravauxMapperImpl implements HonorairesSurTravauxMapper {

    @Override
    public List<HonorairesSurTravauxDTO> toDTOList(List<HonorairesSurTravaux> entities) {
        if ( entities == null ) {
            return null;
        }

        List<HonorairesSurTravauxDTO> list = new ArrayList<HonorairesSurTravauxDTO>( entities.size() );
        for ( HonorairesSurTravaux honorairesSurTravaux : entities ) {
            list.add( toDTO( honorairesSurTravaux ) );
        }

        return list;
    }

    @Override
    public HonorairesSurTravauxDTO toDTO(HonorairesSurTravaux entity) {
        if ( entity == null ) {
            return null;
        }

        HonorairesSurTravauxDTO honorairesSurTravauxDTO = new HonorairesSurTravauxDTO();

        honorairesSurTravauxDTO.setResolutionId( entityResolutionId( entity ) );
        honorairesSurTravauxDTO.setId( entity.getId() );
        honorairesSurTravauxDTO.setValeurEuros( entity.getValeurEuros() );
        honorairesSurTravauxDTO.setValeurPoucents( entity.getValeurPoucents() );

        return honorairesSurTravauxDTO;
    }

    @Override
    public HonorairesSurTravaux toEntity(HonorairesSurTravauxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        HonorairesSurTravaux honorairesSurTravaux = new HonorairesSurTravaux();

        honorairesSurTravaux.setId( dto.getId() );
        honorairesSurTravaux.setValeurEuros( dto.getValeurEuros() );
        honorairesSurTravaux.setValeurPoucents( dto.getValeurPoucents() );

        return honorairesSurTravaux;
    }

    private Long entityResolutionId(HonorairesSurTravaux honorairesSurTravaux) {
        if ( honorairesSurTravaux == null ) {
            return null;
        }
        Resolution resolution = honorairesSurTravaux.getResolution();
        if ( resolution == null ) {
            return null;
        }
        Long id = resolution.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
