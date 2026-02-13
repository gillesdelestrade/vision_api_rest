package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MoyenAccesCatalogueDTO;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
import fr.d4immobilier.visionapirest.entities.ModeleMoyenAcces;
import fr.d4immobilier.visionapirest.entities.MoyenAccesCatalogue;
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
public class MoyenAccesCatalogueMapperImpl implements MoyenAccesCatalogueMapper {

    @Override
    public List<MoyenAccesCatalogueDTO> toDTOList(List<MoyenAccesCatalogue> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MoyenAccesCatalogueDTO> list = new ArrayList<MoyenAccesCatalogueDTO>( entities.size() );
        for ( MoyenAccesCatalogue moyenAccesCatalogue : entities ) {
            list.add( toDTO( moyenAccesCatalogue ) );
        }

        return list;
    }

    @Override
    public MoyenAccesCatalogueDTO toDTO(MoyenAccesCatalogue entity) {
        if ( entity == null ) {
            return null;
        }

        MoyenAccesCatalogueDTO moyenAccesCatalogueDTO = new MoyenAccesCatalogueDTO();

        moyenAccesCatalogueDTO.setFournisseurId( entityFournisseurId( entity ) );
        moyenAccesCatalogueDTO.setModeleMoyenAccesId( entityModeleMoyenAccesId( entity ) );
        moyenAccesCatalogueDTO.setId( entity.getId() );
        moyenAccesCatalogueDTO.setPrixUnitaire( entity.getPrixUnitaire() );
        moyenAccesCatalogueDTO.setFraisEnvoi( entity.getFraisEnvoi() );
        moyenAccesCatalogueDTO.setLibelle( entity.getLibelle() );
        moyenAccesCatalogueDTO.setDescription( entity.getDescription() );

        return moyenAccesCatalogueDTO;
    }

    @Override
    public MoyenAccesCatalogue toEntity(MoyenAccesCatalogueDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MoyenAccesCatalogue moyenAccesCatalogue = new MoyenAccesCatalogue();

        moyenAccesCatalogue.setId( dto.getId() );
        moyenAccesCatalogue.setPrixUnitaire( dto.getPrixUnitaire() );
        moyenAccesCatalogue.setFraisEnvoi( dto.getFraisEnvoi() );
        moyenAccesCatalogue.setLibelle( dto.getLibelle() );
        moyenAccesCatalogue.setDescription( dto.getDescription() );

        return moyenAccesCatalogue;
    }

    private Long entityFournisseurId(MoyenAccesCatalogue moyenAccesCatalogue) {
        if ( moyenAccesCatalogue == null ) {
            return null;
        }
        Fournisseur fournisseur = moyenAccesCatalogue.getFournisseur();
        if ( fournisseur == null ) {
            return null;
        }
        Long id = fournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityModeleMoyenAccesId(MoyenAccesCatalogue moyenAccesCatalogue) {
        if ( moyenAccesCatalogue == null ) {
            return null;
        }
        ModeleMoyenAcces modeleMoyenAcces = moyenAccesCatalogue.getModeleMoyenAcces();
        if ( modeleMoyenAcces == null ) {
            return null;
        }
        Long id = modeleMoyenAcces.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
