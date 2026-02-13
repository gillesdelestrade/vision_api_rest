package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PrestationContratDTO;
import fr.d4immobilier.visionapirest.entities.PrestationContrat;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-12T18:34:52+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class PrestationContratMapperImpl implements PrestationContratMapper {

    @Override
    public List<PrestationContratDTO> toDTOList(List<PrestationContrat> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PrestationContratDTO> list = new ArrayList<PrestationContratDTO>( entities.size() );
        for ( PrestationContrat prestationContrat : entities ) {
            list.add( toDTO( prestationContrat ) );
        }

        return list;
    }

    @Override
    public PrestationContratDTO toDTO(PrestationContrat entity) {
        if ( entity == null ) {
            return null;
        }

        PrestationContratDTO prestationContratDTO = new PrestationContratDTO();

        prestationContratDTO.setId( entity.getId() );
        prestationContratDTO.setPrestation( entity.getPrestation() );

        return prestationContratDTO;
    }

    @Override
    public PrestationContrat toEntity(PrestationContratDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PrestationContrat prestationContrat = new PrestationContrat();

        prestationContrat.setId( dto.getId() );
        prestationContrat.setPrestation( dto.getPrestation() );

        return prestationContrat;
    }
}
