package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.APIFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.APIFournisseur;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
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
public class APIFournisseurMapperImpl implements APIFournisseurMapper {

    @Override
    public List<APIFournisseurDTO> toDTOList(List<APIFournisseur> entities) {
        if ( entities == null ) {
            return null;
        }

        List<APIFournisseurDTO> list = new ArrayList<APIFournisseurDTO>( entities.size() );
        for ( APIFournisseur aPIFournisseur : entities ) {
            list.add( toDTO( aPIFournisseur ) );
        }

        return list;
    }

    @Override
    public APIFournisseurDTO toDTO(APIFournisseur entity) {
        if ( entity == null ) {
            return null;
        }

        APIFournisseurDTO aPIFournisseurDTO = new APIFournisseurDTO();

        aPIFournisseurDTO.setFournisseurId( entityFournisseurId( entity ) );
        aPIFournisseurDTO.setId( entity.getId() );
        aPIFournisseurDTO.setAPIKeyD4( entity.getAPIKeyD4() );
        aPIFournisseurDTO.setAPIKeyExt( entity.getAPIKeyExt() );

        return aPIFournisseurDTO;
    }

    @Override
    public APIFournisseur toEntity(APIFournisseurDTO dto) {
        if ( dto == null ) {
            return null;
        }

        APIFournisseur aPIFournisseur = new APIFournisseur();

        aPIFournisseur.setId( dto.getId() );
        aPIFournisseur.setAPIKeyD4( dto.getAPIKeyD4() );
        aPIFournisseur.setAPIKeyExt( dto.getAPIKeyExt() );

        return aPIFournisseur;
    }

    private Long entityFournisseurId(APIFournisseur aPIFournisseur) {
        if ( aPIFournisseur == null ) {
            return null;
        }
        Fournisseur fournisseur = aPIFournisseur.getFournisseur();
        if ( fournisseur == null ) {
            return null;
        }
        Long id = fournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
