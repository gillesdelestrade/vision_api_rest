package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierDTO;
import fr.d4immobilier.visionapirest.entities.Courrier;
import fr.d4immobilier.visionapirest.entities.Fichier;
import fr.d4immobilier.visionapirest.entities.Personne;
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
public class FichierMapperImpl implements FichierMapper {

    @Override
    public List<FichierDTO> toDTOList(List<Fichier> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierDTO> list = new ArrayList<FichierDTO>( entities.size() );
        for ( Fichier fichier : entities ) {
            list.add( toDTO( fichier ) );
        }

        return list;
    }

    @Override
    public FichierDTO toDTO(Fichier entity) {
        if ( entity == null ) {
            return null;
        }

        FichierDTO fichierDTO = new FichierDTO();

        fichierDTO.setCourrierPourPieceJointeId( entityCourrierPourPieceJointeId( entity ) );
        fichierDTO.setAuteurId( entityAuteurId( entity ) );
        fichierDTO.setDateCreation( dateCreationToString( entity.getDateCreation() ) );
        fichierDTO.setId( entity.getId() );
        fichierDTO.setNomFichier( entity.getNomFichier() );
        fichierDTO.setNomStockage( entity.getNomStockage() );

        return fichierDTO;
    }

    @Override
    public Fichier toEntity(FichierDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Fichier fichier = new Fichier();

        fichier.setId( dto.getId() );
        fichier.setNomFichier( dto.getNomFichier() );
        fichier.setNomStockage( dto.getNomStockage() );
        if ( dto.getDateCreation() != null ) {
            fichier.setDateCreation( Instant.parse( dto.getDateCreation() ) );
        }

        return fichier;
    }

    private Long entityCourrierPourPieceJointeId(Fichier fichier) {
        if ( fichier == null ) {
            return null;
        }
        Courrier courrierPourPieceJointe = fichier.getCourrierPourPieceJointe();
        if ( courrierPourPieceJointe == null ) {
            return null;
        }
        Long id = courrierPourPieceJointe.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAuteurId(Fichier fichier) {
        if ( fichier == null ) {
            return null;
        }
        Personne auteur = fichier.getAuteur();
        if ( auteur == null ) {
            return null;
        }
        Long id = auteur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
