package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierEmplacementDTO;
import fr.d4immobilier.visionapirest.entities.EmplacementPanneauBALInterphone;
import fr.d4immobilier.visionapirest.entities.FichierEmplacement;
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
public class FichierEmplacementMapperImpl implements FichierEmplacementMapper {

    @Override
    public List<FichierEmplacementDTO> toDTOList(List<FichierEmplacement> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierEmplacementDTO> list = new ArrayList<FichierEmplacementDTO>( entities.size() );
        for ( FichierEmplacement fichierEmplacement : entities ) {
            list.add( toDTO( fichierEmplacement ) );
        }

        return list;
    }

    @Override
    public FichierEmplacementDTO toDTO(FichierEmplacement entity) {
        if ( entity == null ) {
            return null;
        }

        FichierEmplacementDTO fichierEmplacementDTO = new FichierEmplacementDTO();

        fichierEmplacementDTO.setEmplacementPanneauBALInterphoneId( entityEmplacementPanneauBALInterphoneId( entity ) );
        fichierEmplacementDTO.setId( entity.getId() );

        return fichierEmplacementDTO;
    }

    @Override
    public FichierEmplacement toEntity(FichierEmplacementDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierEmplacement fichierEmplacement = new FichierEmplacement();

        fichierEmplacement.setId( dto.getId() );

        return fichierEmplacement;
    }

    private Long entityEmplacementPanneauBALInterphoneId(FichierEmplacement fichierEmplacement) {
        if ( fichierEmplacement == null ) {
            return null;
        }
        EmplacementPanneauBALInterphone emplacementPanneauBALInterphone = fichierEmplacement.getEmplacementPanneauBALInterphone();
        if ( emplacementPanneauBALInterphone == null ) {
            return null;
        }
        Long id = emplacementPanneauBALInterphone.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
