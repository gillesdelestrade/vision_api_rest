package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierDemandeSansCompteVisionDTO;
import fr.d4immobilier.visionapirest.entities.FichierDemandeSansCompteVision;
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
public class FichierDemandeSansCompteVisionMapperImpl implements FichierDemandeSansCompteVisionMapper {

    @Override
    public List<FichierDemandeSansCompteVisionDTO> toDTOList(List<FichierDemandeSansCompteVision> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierDemandeSansCompteVisionDTO> list = new ArrayList<FichierDemandeSansCompteVisionDTO>( entities.size() );
        for ( FichierDemandeSansCompteVision fichierDemandeSansCompteVision : entities ) {
            list.add( toDTO( fichierDemandeSansCompteVision ) );
        }

        return list;
    }

    @Override
    public FichierDemandeSansCompteVisionDTO toDTO(FichierDemandeSansCompteVision entity) {
        if ( entity == null ) {
            return null;
        }

        FichierDemandeSansCompteVisionDTO fichierDemandeSansCompteVisionDTO = new FichierDemandeSansCompteVisionDTO();

        fichierDemandeSansCompteVisionDTO.setId( entity.getId() );

        return fichierDemandeSansCompteVisionDTO;
    }

    @Override
    public FichierDemandeSansCompteVision toEntity(FichierDemandeSansCompteVisionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierDemandeSansCompteVision fichierDemandeSansCompteVision = new FichierDemandeSansCompteVision();

        fichierDemandeSansCompteVision.setId( dto.getId() );

        return fichierDemandeSansCompteVision;
    }
}
