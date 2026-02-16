package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ProduitCatalogueDTO;
import fr.d4immobilier.visionapirest.entities.ProduitCatalogue;
import fr.d4immobilier.visionapirest.entities.TVA;
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
public class ProduitCatalogueMapperImpl implements ProduitCatalogueMapper {

    @Override
    public List<ProduitCatalogueDTO> toDTOList(List<ProduitCatalogue> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ProduitCatalogueDTO> list = new ArrayList<ProduitCatalogueDTO>( entities.size() );
        for ( ProduitCatalogue produitCatalogue : entities ) {
            list.add( toDTO( produitCatalogue ) );
        }

        return list;
    }

    @Override
    public ProduitCatalogueDTO toDTO(ProduitCatalogue entity) {
        if ( entity == null ) {
            return null;
        }

        ProduitCatalogueDTO produitCatalogueDTO = new ProduitCatalogueDTO();

        produitCatalogueDTO.setTvaId( entityTvaId( entity ) );
        produitCatalogueDTO.setId( entity.getId() );
        produitCatalogueDTO.setReference( entity.getReference() );
        produitCatalogueDTO.setDesignation( entity.getDesignation() );

        return produitCatalogueDTO;
    }

    @Override
    public ProduitCatalogue toEntity(ProduitCatalogueDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ProduitCatalogue produitCatalogue = new ProduitCatalogue();

        produitCatalogue.setId( dto.getId() );
        produitCatalogue.setReference( dto.getReference() );
        produitCatalogue.setDesignation( dto.getDesignation() );

        return produitCatalogue;
    }

    private Long entityTvaId(ProduitCatalogue produitCatalogue) {
        if ( produitCatalogue == null ) {
            return null;
        }
        TVA tva = produitCatalogue.getTva();
        if ( tva == null ) {
            return null;
        }
        Long id = tva.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
