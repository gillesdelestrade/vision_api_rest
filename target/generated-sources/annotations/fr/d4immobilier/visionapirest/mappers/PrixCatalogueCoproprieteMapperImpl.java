package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PrixCatalogueCoproprieteDTO;
import fr.d4immobilier.visionapirest.entities.PrixCatalogueCopropriete;
import fr.d4immobilier.visionapirest.entities.ProduitCatalogue;
import fr.d4immobilier.visionapirest.entities.Tarif;
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
public class PrixCatalogueCoproprieteMapperImpl implements PrixCatalogueCoproprieteMapper {

    @Override
    public List<PrixCatalogueCoproprieteDTO> toDTOList(List<PrixCatalogueCopropriete> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PrixCatalogueCoproprieteDTO> list = new ArrayList<PrixCatalogueCoproprieteDTO>( entities.size() );
        for ( PrixCatalogueCopropriete prixCatalogueCopropriete : entities ) {
            list.add( toDTO( prixCatalogueCopropriete ) );
        }

        return list;
    }

    @Override
    public PrixCatalogueCoproprieteDTO toDTO(PrixCatalogueCopropriete entity) {
        if ( entity == null ) {
            return null;
        }

        PrixCatalogueCoproprieteDTO prixCatalogueCoproprieteDTO = new PrixCatalogueCoproprieteDTO();

        prixCatalogueCoproprieteDTO.setTarifId( entityTarifId( entity ) );
        prixCatalogueCoproprieteDTO.setProduitCatalogueId( entityProduitCatalogueId( entity ) );
        prixCatalogueCoproprieteDTO.setId( entity.getId() );
        prixCatalogueCoproprieteDTO.setPrix( entity.getPrix() );

        return prixCatalogueCoproprieteDTO;
    }

    @Override
    public PrixCatalogueCopropriete toEntity(PrixCatalogueCoproprieteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PrixCatalogueCopropriete prixCatalogueCopropriete = new PrixCatalogueCopropriete();

        prixCatalogueCopropriete.setId( dto.getId() );
        prixCatalogueCopropriete.setPrix( dto.getPrix() );

        return prixCatalogueCopropriete;
    }

    private Long entityTarifId(PrixCatalogueCopropriete prixCatalogueCopropriete) {
        if ( prixCatalogueCopropriete == null ) {
            return null;
        }
        Tarif tarif = prixCatalogueCopropriete.getTarif();
        if ( tarif == null ) {
            return null;
        }
        Long id = tarif.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityProduitCatalogueId(PrixCatalogueCopropriete prixCatalogueCopropriete) {
        if ( prixCatalogueCopropriete == null ) {
            return null;
        }
        ProduitCatalogue produitCatalogue = prixCatalogueCopropriete.getProduitCatalogue();
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
