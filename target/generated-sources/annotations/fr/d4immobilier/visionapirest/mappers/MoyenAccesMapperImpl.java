package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MoyenAccesDTO;
import fr.d4immobilier.visionapirest.entities.EmplacementStock;
import fr.d4immobilier.visionapirest.entities.MoyenAcces;
import fr.d4immobilier.visionapirest.entities.MoyenAccesCatalogue;
import fr.d4immobilier.visionapirest.entities.PanierCommandeMoyenAcces;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-20T08:40:20+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class MoyenAccesMapperImpl implements MoyenAccesMapper {

    @Override
    public List<MoyenAccesDTO> toDTOList(List<MoyenAcces> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MoyenAccesDTO> list = new ArrayList<MoyenAccesDTO>( entities.size() );
        for ( MoyenAcces moyenAcces : entities ) {
            list.add( toDTO( moyenAcces ) );
        }

        return list;
    }

    @Override
    public MoyenAccesDTO toDTO(MoyenAcces entity) {
        if ( entity == null ) {
            return null;
        }

        MoyenAccesDTO moyenAccesDTO = new MoyenAccesDTO();

        moyenAccesDTO.setPanierCommandeMoyenAccesId( entityPanierCommandeMoyenAccesId( entity ) );
        moyenAccesDTO.setMoyenAccesCatalogueId( entityMoyenAccesCatalogueId( entity ) );
        moyenAccesDTO.setEmplacementStockId( entityEmplacementStockId( entity ) );
        moyenAccesDTO.setDateCommande( dateCommandeToString( entity.getDateCommande() ) );
        moyenAccesDTO.setDateEntreeDansLeStock( dateEntreeDansLeStockToString( entity.getDateEntreeDansLeStock() ) );
        moyenAccesDTO.setDateSortieDuSotck( dateSortieDuSotckToString( entity.getDateSortieDuSotck() ) );
        moyenAccesDTO.setDateDeclarationPerte( dateDeclarationPerteToString( entity.getDateDeclarationPerte() ) );
        moyenAccesDTO.setDateDesactivation( dateDesactivationToString( entity.getDateDesactivation() ) );
        moyenAccesDTO.setId( entity.getId() );
        moyenAccesDTO.setNumero( entity.getNumero() );
        moyenAccesDTO.setObservations( entity.getObservations() );

        return moyenAccesDTO;
    }

    @Override
    public MoyenAcces toEntity(MoyenAccesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MoyenAcces moyenAcces = new MoyenAcces();

        moyenAcces.setId( dto.getId() );
        moyenAcces.setNumero( dto.getNumero() );
        if ( dto.getDateCommande() != null ) {
            moyenAcces.setDateCommande( Instant.parse( dto.getDateCommande() ) );
        }
        if ( dto.getDateEntreeDansLeStock() != null ) {
            moyenAcces.setDateEntreeDansLeStock( Instant.parse( dto.getDateEntreeDansLeStock() ) );
        }
        if ( dto.getDateSortieDuSotck() != null ) {
            moyenAcces.setDateSortieDuSotck( Instant.parse( dto.getDateSortieDuSotck() ) );
        }
        if ( dto.getDateDeclarationPerte() != null ) {
            moyenAcces.setDateDeclarationPerte( Instant.parse( dto.getDateDeclarationPerte() ) );
        }
        if ( dto.getDateDesactivation() != null ) {
            moyenAcces.setDateDesactivation( Instant.parse( dto.getDateDesactivation() ) );
        }
        moyenAcces.setObservations( dto.getObservations() );

        return moyenAcces;
    }

    private Long entityPanierCommandeMoyenAccesId(MoyenAcces moyenAcces) {
        if ( moyenAcces == null ) {
            return null;
        }
        PanierCommandeMoyenAcces panierCommandeMoyenAcces = moyenAcces.getPanierCommandeMoyenAcces();
        if ( panierCommandeMoyenAcces == null ) {
            return null;
        }
        Long id = panierCommandeMoyenAcces.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityMoyenAccesCatalogueId(MoyenAcces moyenAcces) {
        if ( moyenAcces == null ) {
            return null;
        }
        MoyenAccesCatalogue moyenAccesCatalogue = moyenAcces.getMoyenAccesCatalogue();
        if ( moyenAccesCatalogue == null ) {
            return null;
        }
        Long id = moyenAccesCatalogue.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityEmplacementStockId(MoyenAcces moyenAcces) {
        if ( moyenAcces == null ) {
            return null;
        }
        EmplacementStock emplacementStock = moyenAcces.getEmplacementStock();
        if ( emplacementStock == null ) {
            return null;
        }
        Long id = emplacementStock.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
