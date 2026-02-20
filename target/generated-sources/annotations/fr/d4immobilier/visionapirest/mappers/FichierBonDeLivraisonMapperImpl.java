package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierBonDeLivraisonDTO;
import fr.d4immobilier.visionapirest.entities.FichierBonDeLivraison;
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
public class FichierBonDeLivraisonMapperImpl implements FichierBonDeLivraisonMapper {

    @Override
    public List<FichierBonDeLivraisonDTO> toDTOList(List<FichierBonDeLivraison> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierBonDeLivraisonDTO> list = new ArrayList<FichierBonDeLivraisonDTO>( entities.size() );
        for ( FichierBonDeLivraison fichierBonDeLivraison : entities ) {
            list.add( toDTO( fichierBonDeLivraison ) );
        }

        return list;
    }

    @Override
    public FichierBonDeLivraisonDTO toDTO(FichierBonDeLivraison entity) {
        if ( entity == null ) {
            return null;
        }

        FichierBonDeLivraisonDTO fichierBonDeLivraisonDTO = new FichierBonDeLivraisonDTO();

        fichierBonDeLivraisonDTO.setLivraisonId( entityLivraisonId( entity ) );
        fichierBonDeLivraisonDTO.setId( entity.getId() );

        return fichierBonDeLivraisonDTO;
    }

    @Override
    public FichierBonDeLivraison toEntity(FichierBonDeLivraisonDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierBonDeLivraison fichierBonDeLivraison = new FichierBonDeLivraison();

        fichierBonDeLivraison.setId( dto.getId() );

        return fichierBonDeLivraison;
    }

    private Long entityLivraisonId(FichierBonDeLivraison fichierBonDeLivraison) {
        if ( fichierBonDeLivraison == null ) {
            return null;
        }
        Livraison livraison = fichierBonDeLivraison.getLivraison();
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
