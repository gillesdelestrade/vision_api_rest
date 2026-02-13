package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DocumentBonDeCommandeDTO;
import fr.d4immobilier.visionapirest.entities.BonDeCommande;
import fr.d4immobilier.visionapirest.entities.DocumentBonDeCommande;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-13T14:09:30+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class DocumentBonDeCommandeMapperImpl implements DocumentBonDeCommandeMapper {

    @Override
    public List<DocumentBonDeCommandeDTO> toDTOList(List<DocumentBonDeCommande> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DocumentBonDeCommandeDTO> list = new ArrayList<DocumentBonDeCommandeDTO>( entities.size() );
        for ( DocumentBonDeCommande documentBonDeCommande : entities ) {
            list.add( toDTO( documentBonDeCommande ) );
        }

        return list;
    }

    @Override
    public DocumentBonDeCommandeDTO toDTO(DocumentBonDeCommande entity) {
        if ( entity == null ) {
            return null;
        }

        DocumentBonDeCommandeDTO documentBonDeCommandeDTO = new DocumentBonDeCommandeDTO();

        documentBonDeCommandeDTO.setBonDeCommandeId( entityBonDeCommandeId( entity ) );
        documentBonDeCommandeDTO.setId( entity.getId() );

        return documentBonDeCommandeDTO;
    }

    @Override
    public DocumentBonDeCommande toEntity(DocumentBonDeCommandeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DocumentBonDeCommande documentBonDeCommande = new DocumentBonDeCommande();

        documentBonDeCommande.setId( dto.getId() );

        return documentBonDeCommande;
    }

    private Long entityBonDeCommandeId(DocumentBonDeCommande documentBonDeCommande) {
        if ( documentBonDeCommande == null ) {
            return null;
        }
        BonDeCommande bonDeCommande = documentBonDeCommande.getBonDeCommande();
        if ( bonDeCommande == null ) {
            return null;
        }
        Long id = bonDeCommande.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
