package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FinancementTravauxDTO;
import fr.d4immobilier.visionapirest.entities.FinancementTravaux;
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
public class FinancementTravauxMapperImpl implements FinancementTravauxMapper {

    @Override
    public List<FinancementTravauxDTO> toDTOList(List<FinancementTravaux> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FinancementTravauxDTO> list = new ArrayList<FinancementTravauxDTO>( entities.size() );
        for ( FinancementTravaux financementTravaux : entities ) {
            list.add( toDTO( financementTravaux ) );
        }

        return list;
    }

    @Override
    public FinancementTravauxDTO toDTO(FinancementTravaux entity) {
        if ( entity == null ) {
            return null;
        }

        FinancementTravauxDTO financementTravauxDTO = new FinancementTravauxDTO();

        financementTravauxDTO.setResolutionId( entityResolutionId( entity ) );
        financementTravauxDTO.setId( entity.getId() );

        return financementTravauxDTO;
    }

    @Override
    public FinancementTravaux toEntity(FinancementTravauxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FinancementTravaux financementTravaux = new FinancementTravaux();

        financementTravaux.setId( dto.getId() );

        return financementTravaux;
    }

    private Long entityResolutionId(FinancementTravaux financementTravaux) {
        if ( financementTravaux == null ) {
            return null;
        }
        Resolution resolution = financementTravaux.getResolution();
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
