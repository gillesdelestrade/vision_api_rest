package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierDemandeDevisFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.DemandeDevisFournisseur;
import fr.d4immobilier.visionapirest.entities.FichierDemandeDevisFournisseur;
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
public class FichierDemandeDevisFournisseurMapperImpl implements FichierDemandeDevisFournisseurMapper {

    @Override
    public List<FichierDemandeDevisFournisseurDTO> toDTOList(List<FichierDemandeDevisFournisseur> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierDemandeDevisFournisseurDTO> list = new ArrayList<FichierDemandeDevisFournisseurDTO>( entities.size() );
        for ( FichierDemandeDevisFournisseur fichierDemandeDevisFournisseur : entities ) {
            list.add( toDTO( fichierDemandeDevisFournisseur ) );
        }

        return list;
    }

    @Override
    public FichierDemandeDevisFournisseurDTO toDTO(FichierDemandeDevisFournisseur entity) {
        if ( entity == null ) {
            return null;
        }

        FichierDemandeDevisFournisseurDTO fichierDemandeDevisFournisseurDTO = new FichierDemandeDevisFournisseurDTO();

        fichierDemandeDevisFournisseurDTO.setDemandeDevisFournisseurId( entityDemandeDevisFournisseurId( entity ) );
        fichierDemandeDevisFournisseurDTO.setId( entity.getId() );

        return fichierDemandeDevisFournisseurDTO;
    }

    @Override
    public FichierDemandeDevisFournisseur toEntity(FichierDemandeDevisFournisseurDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierDemandeDevisFournisseur fichierDemandeDevisFournisseur = new FichierDemandeDevisFournisseur();

        fichierDemandeDevisFournisseur.setId( dto.getId() );

        return fichierDemandeDevisFournisseur;
    }

    private Long entityDemandeDevisFournisseurId(FichierDemandeDevisFournisseur fichierDemandeDevisFournisseur) {
        if ( fichierDemandeDevisFournisseur == null ) {
            return null;
        }
        DemandeDevisFournisseur demandeDevisFournisseur = fichierDemandeDevisFournisseur.getDemandeDevisFournisseur();
        if ( demandeDevisFournisseur == null ) {
            return null;
        }
        Long id = demandeDevisFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
