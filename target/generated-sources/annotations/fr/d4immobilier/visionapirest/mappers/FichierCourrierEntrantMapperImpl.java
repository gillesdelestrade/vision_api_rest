package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierCourrierEntrantDTO;
import fr.d4immobilier.visionapirest.entities.CourrierEntrant;
import fr.d4immobilier.visionapirest.entities.FichierCourrierEntrant;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-17T10:51:57+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class FichierCourrierEntrantMapperImpl implements FichierCourrierEntrantMapper {

    @Override
    public List<FichierCourrierEntrantDTO> toDTOList(List<FichierCourrierEntrant> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierCourrierEntrantDTO> list = new ArrayList<FichierCourrierEntrantDTO>( entities.size() );
        for ( FichierCourrierEntrant fichierCourrierEntrant : entities ) {
            list.add( toDTO( fichierCourrierEntrant ) );
        }

        return list;
    }

    @Override
    public FichierCourrierEntrantDTO toDTO(FichierCourrierEntrant entity) {
        if ( entity == null ) {
            return null;
        }

        FichierCourrierEntrantDTO fichierCourrierEntrantDTO = new FichierCourrierEntrantDTO();

        fichierCourrierEntrantDTO.setCourrierEntrantId( entityCourrierEntrantId( entity ) );
        fichierCourrierEntrantDTO.setId( entity.getId() );

        return fichierCourrierEntrantDTO;
    }

    @Override
    public FichierCourrierEntrant toEntity(FichierCourrierEntrantDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierCourrierEntrant fichierCourrierEntrant = new FichierCourrierEntrant();

        fichierCourrierEntrant.setId( dto.getId() );

        return fichierCourrierEntrant;
    }

    private Long entityCourrierEntrantId(FichierCourrierEntrant fichierCourrierEntrant) {
        if ( fichierCourrierEntrant == null ) {
            return null;
        }
        CourrierEntrant courrierEntrant = fichierCourrierEntrant.getCourrierEntrant();
        if ( courrierEntrant == null ) {
            return null;
        }
        Long id = courrierEntrant.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
