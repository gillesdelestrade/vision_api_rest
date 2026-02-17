package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.InterventionDemandeDTO;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.entities.DemandeDevis;
import fr.d4immobilier.visionapirest.entities.DevisFournisseur;
import fr.d4immobilier.visionapirest.entities.FactureFournisseur;
import fr.d4immobilier.visionapirest.entities.FichierInterventionDemande;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
import fr.d4immobilier.visionapirest.entities.InterventionDemande;
import fr.d4immobilier.visionapirest.entities.Metier;
import fr.d4immobilier.visionapirest.entities.PanierDemandesIntervention;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-17T10:51:57+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class InterventionDemandeMapperImpl implements InterventionDemandeMapper {

    @Override
    public List<InterventionDemandeDTO> toDTOList(List<InterventionDemande> entities) {
        if ( entities == null ) {
            return null;
        }

        List<InterventionDemandeDTO> list = new ArrayList<InterventionDemandeDTO>( entities.size() );
        for ( InterventionDemande interventionDemande : entities ) {
            list.add( toDTO( interventionDemande ) );
        }

        return list;
    }

    @Override
    public InterventionDemandeDTO toDTO(InterventionDemande entity) {
        if ( entity == null ) {
            return null;
        }

        InterventionDemandeDTO interventionDemandeDTO = new InterventionDemandeDTO();

        interventionDemandeDTO.setDemandeDevisId( entityDemandeDevisId( entity ) );
        interventionDemandeDTO.setDevisFournisseurId( entityDevisFournisseurId( entity ) );
        interventionDemandeDTO.setPanierDemandesInterventionId( entityPanierDemandesInterventionId( entity ) );
        interventionDemandeDTO.setFichierDemandeInterventionId( entityFichierDemandeInterventionId( entity ) );
        interventionDemandeDTO.setFactureFournisseurId( entityFactureFournisseurId( entity ) );
        interventionDemandeDTO.setFournisseurId( entityFournisseurId( entity ) );
        interventionDemandeDTO.setDemandeId( entityDemandeId( entity ) );
        interventionDemandeDTO.setMetierId( entityMetierId( entity ) );
        interventionDemandeDTO.setDateCreationDemande( dateCreationDemandeToString( entity.getDateCreationDemande() ) );
        interventionDemandeDTO.setDatePriseEnCompteFournisseur( datePriseEnCompteFournisseurToString( entity.getDatePriseEnCompteFournisseur() ) );
        interventionDemandeDTO.setDateAccordCS( dateAccordCSToString( entity.getDateAccordCS() ) );
        interventionDemandeDTO.setId( entity.getId() );
        interventionDemandeDTO.setReference( entity.getReference() );
        interventionDemandeDTO.setObjet( entity.getObjet() );
        interventionDemandeDTO.setLieuIntervention( entity.getLieuIntervention() );
        interventionDemandeDTO.setPlageInterventionPrevue( entity.getPlageInterventionPrevue() );
        interventionDemandeDTO.setDateRappel( entity.getDateRappel() );
        interventionDemandeDTO.setDateInterventionRealisee( entity.getDateInterventionRealisee() );
        interventionDemandeDTO.setDateAnnulation( entity.getDateAnnulation() );
        interventionDemandeDTO.setHistorique( entity.getHistorique() );
        interventionDemandeDTO.setAnalyzed( entity.getAnalyzed() );
        interventionDemandeDTO.setPrioritaire( entity.getPrioritaire() );
        interventionDemandeDTO.setNombreRelances( entity.getNombreRelances() );
        interventionDemandeDTO.setIdViaAPIFournisseur( entity.getIdViaAPIFournisseur() );

        return interventionDemandeDTO;
    }

    @Override
    public InterventionDemande toEntity(InterventionDemandeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        InterventionDemande interventionDemande = new InterventionDemande();

        interventionDemande.setId( dto.getId() );
        interventionDemande.setReference( dto.getReference() );
        interventionDemande.setObjet( dto.getObjet() );
        if ( dto.getDateCreationDemande() != null ) {
            interventionDemande.setDateCreationDemande( Instant.parse( dto.getDateCreationDemande() ) );
        }
        interventionDemande.setLieuIntervention( dto.getLieuIntervention() );
        if ( dto.getDatePriseEnCompteFournisseur() != null ) {
            interventionDemande.setDatePriseEnCompteFournisseur( Instant.parse( dto.getDatePriseEnCompteFournisseur() ) );
        }
        interventionDemande.setPlageInterventionPrevue( dto.getPlageInterventionPrevue() );
        interventionDemande.setDateRappel( dto.getDateRappel() );
        interventionDemande.setDateInterventionRealisee( dto.getDateInterventionRealisee() );
        interventionDemande.setDateAnnulation( dto.getDateAnnulation() );
        interventionDemande.setHistorique( dto.getHistorique() );
        interventionDemande.setAnalyzed( dto.getAnalyzed() );
        interventionDemande.setPrioritaire( dto.getPrioritaire() );
        interventionDemande.setNombreRelances( dto.getNombreRelances() );
        if ( dto.getDateAccordCS() != null ) {
            interventionDemande.setDateAccordCS( Instant.parse( dto.getDateAccordCS() ) );
        }
        interventionDemande.setIdViaAPIFournisseur( dto.getIdViaAPIFournisseur() );

        return interventionDemande;
    }

    private Long entityDemandeDevisId(InterventionDemande interventionDemande) {
        if ( interventionDemande == null ) {
            return null;
        }
        DemandeDevis demandeDevis = interventionDemande.getDemandeDevis();
        if ( demandeDevis == null ) {
            return null;
        }
        Long id = demandeDevis.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDevisFournisseurId(InterventionDemande interventionDemande) {
        if ( interventionDemande == null ) {
            return null;
        }
        DevisFournisseur devisFournisseur = interventionDemande.getDevisFournisseur();
        if ( devisFournisseur == null ) {
            return null;
        }
        Long id = devisFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityPanierDemandesInterventionId(InterventionDemande interventionDemande) {
        if ( interventionDemande == null ) {
            return null;
        }
        PanierDemandesIntervention panierDemandesIntervention = interventionDemande.getPanierDemandesIntervention();
        if ( panierDemandesIntervention == null ) {
            return null;
        }
        Long id = panierDemandesIntervention.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierDemandeInterventionId(InterventionDemande interventionDemande) {
        if ( interventionDemande == null ) {
            return null;
        }
        FichierInterventionDemande fichierDemandeIntervention = interventionDemande.getFichierDemandeIntervention();
        if ( fichierDemandeIntervention == null ) {
            return null;
        }
        Long id = fichierDemandeIntervention.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFactureFournisseurId(InterventionDemande interventionDemande) {
        if ( interventionDemande == null ) {
            return null;
        }
        FactureFournisseur factureFournisseur = interventionDemande.getFactureFournisseur();
        if ( factureFournisseur == null ) {
            return null;
        }
        Long id = factureFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFournisseurId(InterventionDemande interventionDemande) {
        if ( interventionDemande == null ) {
            return null;
        }
        Fournisseur fournisseur = interventionDemande.getFournisseur();
        if ( fournisseur == null ) {
            return null;
        }
        Long id = fournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDemandeId(InterventionDemande interventionDemande) {
        if ( interventionDemande == null ) {
            return null;
        }
        Demande demande = interventionDemande.getDemande();
        if ( demande == null ) {
            return null;
        }
        Long id = demande.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityMetierId(InterventionDemande interventionDemande) {
        if ( interventionDemande == null ) {
            return null;
        }
        Metier metier = interventionDemande.getMetier();
        if ( metier == null ) {
            return null;
        }
        Long id = metier.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
