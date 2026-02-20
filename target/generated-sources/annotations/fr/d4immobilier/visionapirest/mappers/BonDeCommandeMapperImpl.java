package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BonDeCommandeDTO;
import fr.d4immobilier.visionapirest.entities.BonDeCommande;
import fr.d4immobilier.visionapirest.entities.DocumentBonDeCommande;
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
public class BonDeCommandeMapperImpl implements BonDeCommandeMapper {

    @Override
    public List<BonDeCommandeDTO> toDTOList(List<BonDeCommande> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BonDeCommandeDTO> list = new ArrayList<BonDeCommandeDTO>( entities.size() );
        for ( BonDeCommande bonDeCommande : entities ) {
            list.add( toDTO( bonDeCommande ) );
        }

        return list;
    }

    @Override
    public BonDeCommandeDTO toDTO(BonDeCommande entity) {
        if ( entity == null ) {
            return null;
        }

        BonDeCommandeDTO bonDeCommandeDTO = new BonDeCommandeDTO();

        bonDeCommandeDTO.setDocumentBonDeCommandeId( entityDocumentBonDeCommandeId( entity ) );
        bonDeCommandeDTO.setId( entity.getId() );

        return bonDeCommandeDTO;
    }

    @Override
    public BonDeCommande toEntity(BonDeCommandeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        BonDeCommande bonDeCommande = new BonDeCommande();

        bonDeCommande.setId( dto.getId() );

        return bonDeCommande;
    }

    private Long entityDocumentBonDeCommandeId(BonDeCommande bonDeCommande) {
        if ( bonDeCommande == null ) {
            return null;
        }
        DocumentBonDeCommande documentBonDeCommande = bonDeCommande.getDocumentBonDeCommande();
        if ( documentBonDeCommande == null ) {
            return null;
        }
        Long id = documentBonDeCommande.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
