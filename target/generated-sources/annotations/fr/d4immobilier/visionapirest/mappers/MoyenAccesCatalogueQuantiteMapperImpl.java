package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MoyenAccesCatalogueQuantiteDTO;
import fr.d4immobilier.visionapirest.entities.MoyenAccesCatalogue;
import fr.d4immobilier.visionapirest.entities.MoyenAccesCatalogueQuantite;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-12T18:34:52+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class MoyenAccesCatalogueQuantiteMapperImpl implements MoyenAccesCatalogueQuantiteMapper {

    @Override
    public List<MoyenAccesCatalogueQuantiteDTO> toDTOList(List<MoyenAccesCatalogueQuantite> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MoyenAccesCatalogueQuantiteDTO> list = new ArrayList<MoyenAccesCatalogueQuantiteDTO>( entities.size() );
        for ( MoyenAccesCatalogueQuantite moyenAccesCatalogueQuantite : entities ) {
            list.add( toDTO( moyenAccesCatalogueQuantite ) );
        }

        return list;
    }

    @Override
    public MoyenAccesCatalogueQuantiteDTO toDTO(MoyenAccesCatalogueQuantite entity) {
        if ( entity == null ) {
            return null;
        }

        MoyenAccesCatalogueQuantiteDTO moyenAccesCatalogueQuantiteDTO = new MoyenAccesCatalogueQuantiteDTO();

        moyenAccesCatalogueQuantiteDTO.setMoyenAccesCatalogueId( entityMoyenAccesCatalogueId( entity ) );
        moyenAccesCatalogueQuantiteDTO.setId( entity.getId() );
        moyenAccesCatalogueQuantiteDTO.setQuantite( entity.getQuantite() );

        return moyenAccesCatalogueQuantiteDTO;
    }

    @Override
    public MoyenAccesCatalogueQuantite toEntity(MoyenAccesCatalogueQuantiteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MoyenAccesCatalogueQuantite moyenAccesCatalogueQuantite = new MoyenAccesCatalogueQuantite();

        moyenAccesCatalogueQuantite.setId( dto.getId() );
        moyenAccesCatalogueQuantite.setQuantite( dto.getQuantite() );

        return moyenAccesCatalogueQuantite;
    }

    private Long entityMoyenAccesCatalogueId(MoyenAccesCatalogueQuantite moyenAccesCatalogueQuantite) {
        if ( moyenAccesCatalogueQuantite == null ) {
            return null;
        }
        MoyenAccesCatalogue moyenAccesCatalogue = moyenAccesCatalogueQuantite.getMoyenAccesCatalogue();
        if ( moyenAccesCatalogue == null ) {
            return null;
        }
        Long id = moyenAccesCatalogue.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
