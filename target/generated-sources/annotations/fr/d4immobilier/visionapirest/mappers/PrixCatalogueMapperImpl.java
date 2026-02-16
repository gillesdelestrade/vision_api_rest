package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PrixCatalogueDTO;
import fr.d4immobilier.visionapirest.entities.PrixCatalogue;
import fr.d4immobilier.visionapirest.entities.ProduitCatalogue;
import fr.d4immobilier.visionapirest.entities.Tarif;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T17:26:49+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class PrixCatalogueMapperImpl implements PrixCatalogueMapper {

    @Override
    public List<PrixCatalogueDTO> toDTOList(List<PrixCatalogue> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PrixCatalogueDTO> list = new ArrayList<PrixCatalogueDTO>( entities.size() );
        for ( PrixCatalogue prixCatalogue : entities ) {
            list.add( toDTO( prixCatalogue ) );
        }

        return list;
    }

    @Override
    public PrixCatalogueDTO toDTO(PrixCatalogue entity) {
        if ( entity == null ) {
            return null;
        }

        PrixCatalogueDTO prixCatalogueDTO = new PrixCatalogueDTO();

        prixCatalogueDTO.setTarifId( entityTarifId( entity ) );
        prixCatalogueDTO.setProduitCatalogueId( entityProduitCatalogueId( entity ) );
        prixCatalogueDTO.setId( entity.getId() );
        prixCatalogueDTO.setPrix( entity.getPrix() );

        return prixCatalogueDTO;
    }

    @Override
    public PrixCatalogue toEntity(PrixCatalogueDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PrixCatalogue prixCatalogue = new PrixCatalogue();

        prixCatalogue.setId( dto.getId() );
        prixCatalogue.setPrix( dto.getPrix() );

        return prixCatalogue;
    }

    private Long entityTarifId(PrixCatalogue prixCatalogue) {
        if ( prixCatalogue == null ) {
            return null;
        }
        Tarif tarif = prixCatalogue.getTarif();
        if ( tarif == null ) {
            return null;
        }
        Long id = tarif.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityProduitCatalogueId(PrixCatalogue prixCatalogue) {
        if ( prixCatalogue == null ) {
            return null;
        }
        ProduitCatalogue produitCatalogue = prixCatalogue.getProduitCatalogue();
        if ( produitCatalogue == null ) {
            return null;
        }
        Long id = produitCatalogue.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
