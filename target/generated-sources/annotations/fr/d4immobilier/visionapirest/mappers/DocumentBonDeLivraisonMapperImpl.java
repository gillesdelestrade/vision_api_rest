package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DocumentBonDeLivraisonDTO;
import fr.d4immobilier.visionapirest.entities.DocumentBonDeLivraison;
import fr.d4immobilier.visionapirest.entities.Livraison;
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
public class DocumentBonDeLivraisonMapperImpl implements DocumentBonDeLivraisonMapper {

    @Override
    public List<DocumentBonDeLivraisonDTO> toDTOList(List<DocumentBonDeLivraison> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DocumentBonDeLivraisonDTO> list = new ArrayList<DocumentBonDeLivraisonDTO>( entities.size() );
        for ( DocumentBonDeLivraison documentBonDeLivraison : entities ) {
            list.add( toDTO( documentBonDeLivraison ) );
        }

        return list;
    }

    @Override
    public DocumentBonDeLivraisonDTO toDTO(DocumentBonDeLivraison entity) {
        if ( entity == null ) {
            return null;
        }

        DocumentBonDeLivraisonDTO documentBonDeLivraisonDTO = new DocumentBonDeLivraisonDTO();

        documentBonDeLivraisonDTO.setLivraisonId( entityLivraisonId( entity ) );
        documentBonDeLivraisonDTO.setId( entity.getId() );

        return documentBonDeLivraisonDTO;
    }

    @Override
    public DocumentBonDeLivraison toEntity(DocumentBonDeLivraisonDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DocumentBonDeLivraison documentBonDeLivraison = new DocumentBonDeLivraison();

        documentBonDeLivraison.setId( dto.getId() );

        return documentBonDeLivraison;
    }

    private Long entityLivraisonId(DocumentBonDeLivraison documentBonDeLivraison) {
        if ( documentBonDeLivraison == null ) {
            return null;
        }
        Livraison livraison = documentBonDeLivraison.getLivraison();
        if ( livraison == null ) {
            return null;
        }
        Long id = livraison.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
