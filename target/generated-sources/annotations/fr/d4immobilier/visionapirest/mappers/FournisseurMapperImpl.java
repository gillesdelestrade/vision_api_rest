package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FournisseurDTO;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-12T18:34:53+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class FournisseurMapperImpl implements FournisseurMapper {

    @Override
    public List<FournisseurDTO> toDTOList(List<Fournisseur> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FournisseurDTO> list = new ArrayList<FournisseurDTO>( entities.size() );
        for ( Fournisseur fournisseur : entities ) {
            list.add( toDTO( fournisseur ) );
        }

        return list;
    }

    @Override
    public FournisseurDTO toDTO(Fournisseur entity) {
        if ( entity == null ) {
            return null;
        }

        FournisseurDTO fournisseurDTO = new FournisseurDTO();

        fournisseurDTO.setId( entity.getId() );
        fournisseurDTO.setIdentifiantICS( entity.getIdentifiantICS() );
        fournisseurDTO.setPermalink( entity.getPermalink() );

        return fournisseurDTO;
    }

    @Override
    public Fournisseur toEntity(FournisseurDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Fournisseur fournisseur = new Fournisseur();

        fournisseur.setId( dto.getId() );
        fournisseur.setIdentifiantICS( dto.getIdentifiantICS() );
        fournisseur.setPermalink( dto.getPermalink() );

        return fournisseur;
    }
}
