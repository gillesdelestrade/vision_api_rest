package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DevisFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.AvisD4Devis;
import fr.d4immobilier.visionapirest.entities.AvisDevisCS;
import fr.d4immobilier.visionapirest.entities.DemandeDevisFournisseur;
import fr.d4immobilier.visionapirest.entities.DevisFournisseur;
import fr.d4immobilier.visionapirest.entities.FichierDemande;
import fr.d4immobilier.visionapirest.entities.FichierDevisFournisseur;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
import fr.d4immobilier.visionapirest.entities.InterventionDemande;
import fr.d4immobilier.visionapirest.entities.Personne;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-17T10:51:57+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class DevisFournisseurMapperImpl implements DevisFournisseurMapper {

    @Override
    public List<DevisFournisseurDTO> toDTOList(List<DevisFournisseur> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DevisFournisseurDTO> list = new ArrayList<DevisFournisseurDTO>( entities.size() );
        for ( DevisFournisseur devisFournisseur : entities ) {
            list.add( toDTO( devisFournisseur ) );
        }

        return list;
    }

    @Override
    public DevisFournisseurDTO toDTO(DevisFournisseur entity) {
        if ( entity == null ) {
            return null;
        }

        DevisFournisseurDTO devisFournisseurDTO = new DevisFournisseurDTO();

        devisFournisseurDTO.setFichierDevisFournisseurId( entityFichierDevisFournisseurId( entity ) );
        devisFournisseurDTO.setDemandeDevisFournisseurId( entityDemandeDevisFournisseurId( entity ) );
        devisFournisseurDTO.setFournisseurId( entityFournisseurId( entity ) );
        devisFournisseurDTO.setDemandeInterventionId( entityDemandeInterventionId( entity ) );
        devisFournisseurDTO.setApprobateurId( entityApprobateurId( entity ) );
        devisFournisseurDTO.setFichierKBISId( entityFichierKBISId( entity ) );
        devisFournisseurDTO.setFichierVigilanceURSSAFId( entityFichierVigilanceURSSAFId( entity ) );
        devisFournisseurDTO.setFichierTravailleursEtrangersId( entityFichierTravailleursEtrangersId( entity ) );
        devisFournisseurDTO.setFichierRCProId( entityFichierRCProId( entity ) );
        devisFournisseurDTO.setFichierAssuranceDecennaleId( entityFichierAssuranceDecennaleId( entity ) );
        devisFournisseurDTO.setAvisD4( avisD4ToString( entity.getAvisD4() ) );
        devisFournisseurDTO.setAvisCS( avisCSToString( entity.getAvisCS() ) );
        devisFournisseurDTO.setId( entity.getId() );
        devisFournisseurDTO.setDateReception( entity.getDateReception() );
        devisFournisseurDTO.setDateDevis( entity.getDateDevis() );
        devisFournisseurDTO.setReference( entity.getReference() );
        devisFournisseurDTO.setMontant( entity.getMontant() );
        devisFournisseurDTO.setDateDecisionCS( entity.getDateDecisionCS() );
        devisFournisseurDTO.setPriseEnCompteParLeBot( entity.getPriseEnCompteParLeBot() );
        devisFournisseurDTO.setCommentaire( entity.getCommentaire() );
        devisFournisseurDTO.setMasquer( entity.getMasquer() );
        devisFournisseurDTO.setDateEnvoiAuConseilSyndical( entity.getDateEnvoiAuConseilSyndical() );
        devisFournisseurDTO.setDetailEnvoiAuConseilSyndical( entity.getDetailEnvoiAuConseilSyndical() );
        devisFournisseurDTO.setElementsANoter( entity.getElementsANoter() );
        devisFournisseurDTO.setFichierKBISConforme( entity.getFichierKBISConforme() );
        devisFournisseurDTO.setFichierVigilanceURSSAFConforme( entity.getFichierVigilanceURSSAFConforme() );
        devisFournisseurDTO.setFichierTravailleursEtrangersConforme( entity.getFichierTravailleursEtrangersConforme() );
        devisFournisseurDTO.setFichierRCProConforme( entity.getFichierRCProConforme() );
        devisFournisseurDTO.setFichierAssuranceDecennaleConforme( entity.getFichierAssuranceDecennaleConforme() );
        devisFournisseurDTO.setFichierAssuranceDecennaleNonConcerne( entity.getFichierAssuranceDecennaleNonConcerne() );

        return devisFournisseurDTO;
    }

    @Override
    public DevisFournisseur toEntity(DevisFournisseurDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DevisFournisseur devisFournisseur = new DevisFournisseur();

        devisFournisseur.setId( dto.getId() );
        devisFournisseur.setDateReception( dto.getDateReception() );
        devisFournisseur.setDateDevis( dto.getDateDevis() );
        devisFournisseur.setReference( dto.getReference() );
        devisFournisseur.setMontant( dto.getMontant() );
        if ( dto.getAvisD4() != null ) {
            devisFournisseur.setAvisD4( Enum.valueOf( AvisD4Devis.class, dto.getAvisD4() ) );
        }
        if ( dto.getAvisCS() != null ) {
            devisFournisseur.setAvisCS( Enum.valueOf( AvisDevisCS.class, dto.getAvisCS() ) );
        }
        devisFournisseur.setDateDecisionCS( dto.getDateDecisionCS() );
        devisFournisseur.setPriseEnCompteParLeBot( dto.getPriseEnCompteParLeBot() );
        devisFournisseur.setCommentaire( dto.getCommentaire() );
        devisFournisseur.setMasquer( dto.getMasquer() );
        devisFournisseur.setDateEnvoiAuConseilSyndical( dto.getDateEnvoiAuConseilSyndical() );
        devisFournisseur.setDetailEnvoiAuConseilSyndical( dto.getDetailEnvoiAuConseilSyndical() );
        devisFournisseur.setElementsANoter( dto.getElementsANoter() );
        devisFournisseur.setFichierKBISConforme( dto.getFichierKBISConforme() );
        devisFournisseur.setFichierVigilanceURSSAFConforme( dto.getFichierVigilanceURSSAFConforme() );
        devisFournisseur.setFichierTravailleursEtrangersConforme( dto.getFichierTravailleursEtrangersConforme() );
        devisFournisseur.setFichierRCProConforme( dto.getFichierRCProConforme() );
        devisFournisseur.setFichierAssuranceDecennaleConforme( dto.getFichierAssuranceDecennaleConforme() );
        devisFournisseur.setFichierAssuranceDecennaleNonConcerne( dto.getFichierAssuranceDecennaleNonConcerne() );

        return devisFournisseur;
    }

    private Long entityFichierDevisFournisseurId(DevisFournisseur devisFournisseur) {
        if ( devisFournisseur == null ) {
            return null;
        }
        FichierDevisFournisseur fichierDevisFournisseur = devisFournisseur.getFichierDevisFournisseur();
        if ( fichierDevisFournisseur == null ) {
            return null;
        }
        Long id = fichierDevisFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDemandeDevisFournisseurId(DevisFournisseur devisFournisseur) {
        if ( devisFournisseur == null ) {
            return null;
        }
        DemandeDevisFournisseur demandeDevisFournisseur = devisFournisseur.getDemandeDevisFournisseur();
        if ( demandeDevisFournisseur == null ) {
            return null;
        }
        Long id = demandeDevisFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFournisseurId(DevisFournisseur devisFournisseur) {
        if ( devisFournisseur == null ) {
            return null;
        }
        Fournisseur fournisseur = devisFournisseur.getFournisseur();
        if ( fournisseur == null ) {
            return null;
        }
        Long id = fournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDemandeInterventionId(DevisFournisseur devisFournisseur) {
        if ( devisFournisseur == null ) {
            return null;
        }
        InterventionDemande demandeIntervention = devisFournisseur.getDemandeIntervention();
        if ( demandeIntervention == null ) {
            return null;
        }
        Long id = demandeIntervention.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityApprobateurId(DevisFournisseur devisFournisseur) {
        if ( devisFournisseur == null ) {
            return null;
        }
        Personne approbateur = devisFournisseur.getApprobateur();
        if ( approbateur == null ) {
            return null;
        }
        Long id = approbateur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierKBISId(DevisFournisseur devisFournisseur) {
        if ( devisFournisseur == null ) {
            return null;
        }
        FichierDemande fichierKBIS = devisFournisseur.getFichierKBIS();
        if ( fichierKBIS == null ) {
            return null;
        }
        Long id = fichierKBIS.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierVigilanceURSSAFId(DevisFournisseur devisFournisseur) {
        if ( devisFournisseur == null ) {
            return null;
        }
        FichierDemande fichierVigilanceURSSAF = devisFournisseur.getFichierVigilanceURSSAF();
        if ( fichierVigilanceURSSAF == null ) {
            return null;
        }
        Long id = fichierVigilanceURSSAF.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierTravailleursEtrangersId(DevisFournisseur devisFournisseur) {
        if ( devisFournisseur == null ) {
            return null;
        }
        FichierDemande fichierTravailleursEtrangers = devisFournisseur.getFichierTravailleursEtrangers();
        if ( fichierTravailleursEtrangers == null ) {
            return null;
        }
        Long id = fichierTravailleursEtrangers.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierRCProId(DevisFournisseur devisFournisseur) {
        if ( devisFournisseur == null ) {
            return null;
        }
        FichierDemande fichierRCPro = devisFournisseur.getFichierRCPro();
        if ( fichierRCPro == null ) {
            return null;
        }
        Long id = fichierRCPro.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierAssuranceDecennaleId(DevisFournisseur devisFournisseur) {
        if ( devisFournisseur == null ) {
            return null;
        }
        FichierDemande fichierAssuranceDecennale = devisFournisseur.getFichierAssuranceDecennale();
        if ( fichierAssuranceDecennale == null ) {
            return null;
        }
        Long id = fichierAssuranceDecennale.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
