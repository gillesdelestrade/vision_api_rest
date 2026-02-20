package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierDevisFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.DevisFournisseur;
import fr.d4immobilier.visionapirest.entities.FichierDevisFournisseur;
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
public class FichierDevisFournisseurMapperImpl implements FichierDevisFournisseurMapper {

    @Override
    public List<FichierDevisFournisseurDTO> toDTOList(List<FichierDevisFournisseur> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierDevisFournisseurDTO> list = new ArrayList<FichierDevisFournisseurDTO>( entities.size() );
        for ( FichierDevisFournisseur fichierDevisFournisseur : entities ) {
            list.add( toDTO( fichierDevisFournisseur ) );
        }

        return list;
    }

    @Override
    public FichierDevisFournisseurDTO toDTO(FichierDevisFournisseur entity) {
        if ( entity == null ) {
            return null;
        }

        FichierDevisFournisseurDTO fichierDevisFournisseurDTO = new FichierDevisFournisseurDTO();

        fichierDevisFournisseurDTO.setDevisFournisseurId( entityDevisFournisseurId( entity ) );
        fichierDevisFournisseurDTO.setId( entity.getId() );

        return fichierDevisFournisseurDTO;
    }

    @Override
    public FichierDevisFournisseur toEntity(FichierDevisFournisseurDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierDevisFournisseur fichierDevisFournisseur = new FichierDevisFournisseur();

        fichierDevisFournisseur.setId( dto.getId() );

        return fichierDevisFournisseur;
    }

    private Long entityDevisFournisseurId(FichierDevisFournisseur fichierDevisFournisseur) {
        if ( fichierDevisFournisseur == null ) {
            return null;
        }
        DevisFournisseur devisFournisseur = fichierDevisFournisseur.getDevisFournisseur();
        if ( devisFournisseur == null ) {
            return null;
        }
        Long id = devisFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
