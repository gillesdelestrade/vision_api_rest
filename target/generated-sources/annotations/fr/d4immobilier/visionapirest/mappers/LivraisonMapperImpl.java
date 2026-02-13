package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.LivraisonDTO;
import fr.d4immobilier.visionapirest.entities.DestinationLivraison;
import fr.d4immobilier.visionapirest.entities.DocumentBonDeLivraison;
import fr.d4immobilier.visionapirest.entities.FichierBonDeLivraison;
import fr.d4immobilier.visionapirest.entities.Livraison;
import fr.d4immobilier.visionapirest.entities.PanierCommandeMoyenAcces;
import fr.d4immobilier.visionapirest.entities.TypeEnvoi;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-13T14:09:30+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class LivraisonMapperImpl implements LivraisonMapper {

    @Override
    public List<LivraisonDTO> toDTOList(List<Livraison> entities) {
        if ( entities == null ) {
            return null;
        }

        List<LivraisonDTO> list = new ArrayList<LivraisonDTO>( entities.size() );
        for ( Livraison livraison : entities ) {
            list.add( toDTO( livraison ) );
        }

        return list;
    }

    @Override
    public LivraisonDTO toDTO(Livraison entity) {
        if ( entity == null ) {
            return null;
        }

        LivraisonDTO livraisonDTO = new LivraisonDTO();

        livraisonDTO.setDocumentBonDeLivraisonId( entityDocumentBonDeLivraisonId( entity ) );
        livraisonDTO.setFichierBonDeLivraisonId( entityFichierBonDeLivraisonId( entity ) );
        livraisonDTO.setPanierCommandeMoyenAccesId( entityPanierCommandeMoyenAccesId( entity ) );
        livraisonDTO.setDateExpedition( dateExpeditionToString( entity.getDateExpedition() ) );
        livraisonDTO.setTypeEnvoi( typeEnvoiToString( entity.getTypeEnvoi() ) );
        livraisonDTO.setDateLivraison( dateLivraisonToString( entity.getDateLivraison() ) );
        livraisonDTO.setDestinationLivraison( destinationLivraisonToString( entity.getDestinationLivraison() ) );
        livraisonDTO.setId( entity.getId() );
        livraisonDTO.setNumeroSuivi( entity.getNumeroSuivi() );
        livraisonDTO.setStatut( entity.getStatut() );
        livraisonDTO.setReference( entity.getReference() );

        return livraisonDTO;
    }

    @Override
    public Livraison toEntity(LivraisonDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Livraison livraison = new Livraison();

        livraison.setId( dto.getId() );
        if ( dto.getDateExpedition() != null ) {
            livraison.setDateExpedition( Instant.parse( dto.getDateExpedition() ) );
        }
        livraison.setNumeroSuivi( dto.getNumeroSuivi() );
        if ( dto.getTypeEnvoi() != null ) {
            livraison.setTypeEnvoi( Enum.valueOf( TypeEnvoi.class, dto.getTypeEnvoi() ) );
        }
        livraison.setStatut( dto.getStatut() );
        if ( dto.getDateLivraison() != null ) {
            livraison.setDateLivraison( Instant.parse( dto.getDateLivraison() ) );
        }
        if ( dto.getDestinationLivraison() != null ) {
            livraison.setDestinationLivraison( Enum.valueOf( DestinationLivraison.class, dto.getDestinationLivraison() ) );
        }
        livraison.setReference( dto.getReference() );

        return livraison;
    }

    private Long entityDocumentBonDeLivraisonId(Livraison livraison) {
        if ( livraison == null ) {
            return null;
        }
        DocumentBonDeLivraison documentBonDeLivraison = livraison.getDocumentBonDeLivraison();
        if ( documentBonDeLivraison == null ) {
            return null;
        }
        Long id = documentBonDeLivraison.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierBonDeLivraisonId(Livraison livraison) {
        if ( livraison == null ) {
            return null;
        }
        FichierBonDeLivraison fichierBonDeLivraison = livraison.getFichierBonDeLivraison();
        if ( fichierBonDeLivraison == null ) {
            return null;
        }
        Long id = fichierBonDeLivraison.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityPanierCommandeMoyenAccesId(Livraison livraison) {
        if ( livraison == null ) {
            return null;
        }
        PanierCommandeMoyenAcces panierCommandeMoyenAcces = livraison.getPanierCommandeMoyenAcces();
        if ( panierCommandeMoyenAcces == null ) {
            return null;
        }
        Long id = panierCommandeMoyenAcces.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
