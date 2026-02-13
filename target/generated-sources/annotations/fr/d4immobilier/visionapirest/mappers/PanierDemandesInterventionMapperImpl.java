package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PanierDemandesInterventionDTO;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
import fr.d4immobilier.visionapirest.entities.PanierDemandesIntervention;
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
public class PanierDemandesInterventionMapperImpl implements PanierDemandesInterventionMapper {

    @Override
    public List<PanierDemandesInterventionDTO> toDTOList(List<PanierDemandesIntervention> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PanierDemandesInterventionDTO> list = new ArrayList<PanierDemandesInterventionDTO>( entities.size() );
        for ( PanierDemandesIntervention panierDemandesIntervention : entities ) {
            list.add( toDTO( panierDemandesIntervention ) );
        }

        return list;
    }

    @Override
    public PanierDemandesInterventionDTO toDTO(PanierDemandesIntervention entity) {
        if ( entity == null ) {
            return null;
        }

        PanierDemandesInterventionDTO panierDemandesInterventionDTO = new PanierDemandesInterventionDTO();

        panierDemandesInterventionDTO.setFournisseurId( entityFournisseurId( entity ) );
        panierDemandesInterventionDTO.setId( entity.getId() );
        panierDemandesInterventionDTO.setDateButoire( entity.getDateButoire() );
        panierDemandesInterventionDTO.setDeclenche( entity.getDeclenche() );

        return panierDemandesInterventionDTO;
    }

    @Override
    public PanierDemandesIntervention toEntity(PanierDemandesInterventionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PanierDemandesIntervention panierDemandesIntervention = new PanierDemandesIntervention();

        panierDemandesIntervention.setId( dto.getId() );
        panierDemandesIntervention.setDateButoire( dto.getDateButoire() );
        panierDemandesIntervention.setDeclenche( dto.getDeclenche() );

        return panierDemandesIntervention;
    }

    private Long entityFournisseurId(PanierDemandesIntervention panierDemandesIntervention) {
        if ( panierDemandesIntervention == null ) {
            return null;
        }
        Fournisseur fournisseur = panierDemandesIntervention.getFournisseur();
        if ( fournisseur == null ) {
            return null;
        }
        Long id = fournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
