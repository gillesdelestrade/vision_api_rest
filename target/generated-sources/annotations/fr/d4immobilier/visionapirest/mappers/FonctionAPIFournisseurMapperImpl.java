package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FonctionAPIFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.APIFournisseur;
import fr.d4immobilier.visionapirest.entities.FonctionAPIFournisseur;
import fr.d4immobilier.visionapirest.entities.LexiqueAPID4;
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
public class FonctionAPIFournisseurMapperImpl implements FonctionAPIFournisseurMapper {

    @Override
    public List<FonctionAPIFournisseurDTO> toDTOList(List<FonctionAPIFournisseur> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FonctionAPIFournisseurDTO> list = new ArrayList<FonctionAPIFournisseurDTO>( entities.size() );
        for ( FonctionAPIFournisseur fonctionAPIFournisseur : entities ) {
            list.add( toDTO( fonctionAPIFournisseur ) );
        }

        return list;
    }

    @Override
    public FonctionAPIFournisseurDTO toDTO(FonctionAPIFournisseur entity) {
        if ( entity == null ) {
            return null;
        }

        FonctionAPIFournisseurDTO fonctionAPIFournisseurDTO = new FonctionAPIFournisseurDTO();

        fonctionAPIFournisseurDTO.setAPIFournisseurId( entityAPIFournisseurId( entity ) );
        fonctionAPIFournisseurDTO.setLexiqueAPID4Id( entityLexiqueAPID4Id( entity ) );
        fonctionAPIFournisseurDTO.setId( entity.getId() );
        fonctionAPIFournisseurDTO.setUrlRequete( entity.getUrlRequete() );
        fonctionAPIFournisseurDTO.setStructureDonneesEnvoyees( entity.getStructureDonneesEnvoyees() );
        fonctionAPIFournisseurDTO.setStructureDonneesRecues( entity.getStructureDonneesRecues() );

        return fonctionAPIFournisseurDTO;
    }

    @Override
    public FonctionAPIFournisseur toEntity(FonctionAPIFournisseurDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FonctionAPIFournisseur fonctionAPIFournisseur = new FonctionAPIFournisseur();

        fonctionAPIFournisseur.setId( dto.getId() );
        fonctionAPIFournisseur.setUrlRequete( dto.getUrlRequete() );
        fonctionAPIFournisseur.setStructureDonneesEnvoyees( dto.getStructureDonneesEnvoyees() );
        fonctionAPIFournisseur.setStructureDonneesRecues( dto.getStructureDonneesRecues() );

        return fonctionAPIFournisseur;
    }

    private Long entityAPIFournisseurId(FonctionAPIFournisseur fonctionAPIFournisseur) {
        if ( fonctionAPIFournisseur == null ) {
            return null;
        }
        APIFournisseur aPIFournisseur = fonctionAPIFournisseur.getaPIFournisseur();
        if ( aPIFournisseur == null ) {
            return null;
        }
        Long id = aPIFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityLexiqueAPID4Id(FonctionAPIFournisseur fonctionAPIFournisseur) {
        if ( fonctionAPIFournisseur == null ) {
            return null;
        }
        LexiqueAPID4 lexiqueAPID4 = fonctionAPIFournisseur.getLexiqueAPID4();
        if ( lexiqueAPID4 == null ) {
            return null;
        }
        Long id = lexiqueAPID4.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
