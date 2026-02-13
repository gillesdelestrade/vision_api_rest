package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PanierCommandeMoyenAccesDTO;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.entities.PanierCommandeMoyenAcces;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-12T18:34:53+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class PanierCommandeMoyenAccesMapperImpl implements PanierCommandeMoyenAccesMapper {

    @Override
    public List<PanierCommandeMoyenAccesDTO> toDTOList(List<PanierCommandeMoyenAcces> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PanierCommandeMoyenAccesDTO> list = new ArrayList<PanierCommandeMoyenAccesDTO>( entities.size() );
        for ( PanierCommandeMoyenAcces panierCommandeMoyenAcces : entities ) {
            list.add( toDTO( panierCommandeMoyenAcces ) );
        }

        return list;
    }

    @Override
    public PanierCommandeMoyenAccesDTO toDTO(PanierCommandeMoyenAcces entity) {
        if ( entity == null ) {
            return null;
        }

        PanierCommandeMoyenAccesDTO panierCommandeMoyenAccesDTO = new PanierCommandeMoyenAccesDTO();

        panierCommandeMoyenAccesDTO.setCoproprietaireId( entityCoproprietaireId( entity ) );
        panierCommandeMoyenAccesDTO.setDemandeOrigineId( entityDemandeOrigineId( entity ) );
        panierCommandeMoyenAccesDTO.setId( entity.getId() );
        panierCommandeMoyenAccesDTO.setDateCreationPanier( entity.getDateCreationPanier() );
        panierCommandeMoyenAccesDTO.setDateValidationPanier( entity.getDateValidationPanier() );
        panierCommandeMoyenAccesDTO.setDateAnnulationPanier( entity.getDateAnnulationPanier() );
        panierCommandeMoyenAccesDTO.setAdresseLivraison( entity.getAdresseLivraison() );

        return panierCommandeMoyenAccesDTO;
    }

    @Override
    public PanierCommandeMoyenAcces toEntity(PanierCommandeMoyenAccesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PanierCommandeMoyenAcces panierCommandeMoyenAcces = new PanierCommandeMoyenAcces();

        panierCommandeMoyenAcces.setId( dto.getId() );
        panierCommandeMoyenAcces.setDateCreationPanier( dto.getDateCreationPanier() );
        panierCommandeMoyenAcces.setDateValidationPanier( dto.getDateValidationPanier() );
        panierCommandeMoyenAcces.setDateAnnulationPanier( dto.getDateAnnulationPanier() );
        panierCommandeMoyenAcces.setAdresseLivraison( dto.getAdresseLivraison() );

        return panierCommandeMoyenAcces;
    }

    private Long entityCoproprietaireId(PanierCommandeMoyenAcces panierCommandeMoyenAcces) {
        if ( panierCommandeMoyenAcces == null ) {
            return null;
        }
        Coproprietaire coproprietaire = panierCommandeMoyenAcces.getCoproprietaire();
        if ( coproprietaire == null ) {
            return null;
        }
        Long id = coproprietaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDemandeOrigineId(PanierCommandeMoyenAcces panierCommandeMoyenAcces) {
        if ( panierCommandeMoyenAcces == null ) {
            return null;
        }
        Demande demandeOrigine = panierCommandeMoyenAcces.getDemandeOrigine();
        if ( demandeOrigine == null ) {
            return null;
        }
        Long id = demandeOrigine.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
