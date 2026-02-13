package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FactureFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.AvisD4Facture;
import fr.d4immobilier.visionapirest.entities.AvisFactureCS;
import fr.d4immobilier.visionapirest.entities.ContratFournisseur;
import fr.d4immobilier.visionapirest.entities.EtatTraitementAuto;
import fr.d4immobilier.visionapirest.entities.FactureFournisseur;
import fr.d4immobilier.visionapirest.entities.FichierFacture;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
import fr.d4immobilier.visionapirest.entities.MotifDecisionFacture;
import fr.d4immobilier.visionapirest.entities.MoyenDePaiement;
import fr.d4immobilier.visionapirest.entities.Personne;
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
public class FactureFournisseurMapperImpl implements FactureFournisseurMapper {

    @Override
    public List<FactureFournisseurDTO> toDTOList(List<FactureFournisseur> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FactureFournisseurDTO> list = new ArrayList<FactureFournisseurDTO>( entities.size() );
        for ( FactureFournisseur factureFournisseur : entities ) {
            list.add( toDTO( factureFournisseur ) );
        }

        return list;
    }

    @Override
    public FactureFournisseurDTO toDTO(FactureFournisseur entity) {
        if ( entity == null ) {
            return null;
        }

        FactureFournisseurDTO factureFournisseurDTO = new FactureFournisseurDTO();

        factureFournisseurDTO.setFichierFactureId( entityFichierFactureId( entity ) );
        factureFournisseurDTO.setFournisseurId( entityFournisseurId( entity ) );
        factureFournisseurDTO.setApprobateurId( entityApprobateurId( entity ) );
        factureFournisseurDTO.setMotifDecisionFactureId( entityMotifDecisionFactureId( entity ) );
        factureFournisseurDTO.setContratFournisseurId( entityContratFournisseurId( entity ) );
        factureFournisseurDTO.setAvisD4( avisD4ToString( entity.getAvisD4() ) );
        factureFournisseurDTO.setAvisCS( avisCSToString( entity.getAvisCS() ) );
        factureFournisseurDTO.setMoyenDePaiement( moyenDePaiementToString( entity.getMoyenDePaiement() ) );
        factureFournisseurDTO.setEtatTraitementAuto( etatTraitementAutoToString( entity.getEtatTraitementAuto() ) );
        factureFournisseurDTO.setId( entity.getId() );
        factureFournisseurDTO.setDateReception( entity.getDateReception() );
        factureFournisseurDTO.setDateFacture( entity.getDateFacture() );
        factureFournisseurDTO.setReference( entity.getReference() );
        factureFournisseurDTO.setMontant( entity.getMontant() );
        factureFournisseurDTO.setDateDeMiseAuPaiement( entity.getDateDeMiseAuPaiement() );
        factureFournisseurDTO.setReferencePaiement( entity.getReferencePaiement() );
        factureFournisseurDTO.setCommentaireCS( entity.getCommentaireCS() );
        factureFournisseurDTO.setDateDecisionCS( entity.getDateDecisionCS() );
        factureFournisseurDTO.setPriseEnCompteParLeBot( entity.getPriseEnCompteParLeBot() );
        factureFournisseurDTO.setDateDebutPeriode( entity.getDateDebutPeriode() );
        factureFournisseurDTO.setDateFinPeriode( entity.getDateFinPeriode() );
        factureFournisseurDTO.setLettreAccompagnementImprimee( entity.getLettreAccompagnementImprimee() );
        factureFournisseurDTO.setPrivative( entity.getPrivative() );
        factureFournisseurDTO.setCloturee( entity.getCloturee() );
        factureFournisseurDTO.setDateDebutAttenteContreOrdre( entity.getDateDebutAttenteContreOrdre() );
        factureFournisseurDTO.setDateValidationAutomatique( entity.getDateValidationAutomatique() );
        factureFournisseurDTO.setDateDebutAttenteInfoFournisseur( entity.getDateDebutAttenteInfoFournisseur() );
        factureFournisseurDTO.setDateRefusAutomatique( entity.getDateRefusAutomatique() );
        factureFournisseurDTO.setDateDerniereRelanceAttenteContreOrdre( entity.getDateDerniereRelanceAttenteContreOrdre() );
        factureFournisseurDTO.setDateDerniereRelanceAttenteInfo( entity.getDateDerniereRelanceAttenteInfo() );
        factureFournisseurDTO.setDateExportComfact( entity.getDateExportComfact() );

        return factureFournisseurDTO;
    }

    @Override
    public FactureFournisseur toEntity(FactureFournisseurDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FactureFournisseur factureFournisseur = new FactureFournisseur();

        factureFournisseur.setId( dto.getId() );
        factureFournisseur.setDateReception( dto.getDateReception() );
        factureFournisseur.setDateFacture( dto.getDateFacture() );
        factureFournisseur.setReference( dto.getReference() );
        factureFournisseur.setMontant( dto.getMontant() );
        if ( dto.getAvisD4() != null ) {
            factureFournisseur.setAvisD4( Enum.valueOf( AvisD4Facture.class, dto.getAvisD4() ) );
        }
        if ( dto.getAvisCS() != null ) {
            factureFournisseur.setAvisCS( Enum.valueOf( AvisFactureCS.class, dto.getAvisCS() ) );
        }
        if ( dto.getMoyenDePaiement() != null ) {
            factureFournisseur.setMoyenDePaiement( Enum.valueOf( MoyenDePaiement.class, dto.getMoyenDePaiement() ) );
        }
        factureFournisseur.setDateDeMiseAuPaiement( dto.getDateDeMiseAuPaiement() );
        factureFournisseur.setReferencePaiement( dto.getReferencePaiement() );
        factureFournisseur.setCommentaireCS( dto.getCommentaireCS() );
        factureFournisseur.setDateDecisionCS( dto.getDateDecisionCS() );
        factureFournisseur.setPriseEnCompteParLeBot( dto.getPriseEnCompteParLeBot() );
        factureFournisseur.setDateDebutPeriode( dto.getDateDebutPeriode() );
        factureFournisseur.setDateFinPeriode( dto.getDateFinPeriode() );
        factureFournisseur.setLettreAccompagnementImprimee( dto.getLettreAccompagnementImprimee() );
        factureFournisseur.setPrivative( dto.getPrivative() );
        factureFournisseur.setCloturee( dto.getCloturee() );
        if ( dto.getEtatTraitementAuto() != null ) {
            factureFournisseur.setEtatTraitementAuto( Enum.valueOf( EtatTraitementAuto.class, dto.getEtatTraitementAuto() ) );
        }
        factureFournisseur.setDateDebutAttenteContreOrdre( dto.getDateDebutAttenteContreOrdre() );
        factureFournisseur.setDateValidationAutomatique( dto.getDateValidationAutomatique() );
        factureFournisseur.setDateDebutAttenteInfoFournisseur( dto.getDateDebutAttenteInfoFournisseur() );
        factureFournisseur.setDateRefusAutomatique( dto.getDateRefusAutomatique() );
        factureFournisseur.setDateDerniereRelanceAttenteContreOrdre( dto.getDateDerniereRelanceAttenteContreOrdre() );
        factureFournisseur.setDateDerniereRelanceAttenteInfo( dto.getDateDerniereRelanceAttenteInfo() );
        factureFournisseur.setDateExportComfact( dto.getDateExportComfact() );

        return factureFournisseur;
    }

    private Long entityFichierFactureId(FactureFournisseur factureFournisseur) {
        if ( factureFournisseur == null ) {
            return null;
        }
        FichierFacture fichierFacture = factureFournisseur.getFichierFacture();
        if ( fichierFacture == null ) {
            return null;
        }
        Long id = fichierFacture.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFournisseurId(FactureFournisseur factureFournisseur) {
        if ( factureFournisseur == null ) {
            return null;
        }
        Fournisseur fournisseur = factureFournisseur.getFournisseur();
        if ( fournisseur == null ) {
            return null;
        }
        Long id = fournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityApprobateurId(FactureFournisseur factureFournisseur) {
        if ( factureFournisseur == null ) {
            return null;
        }
        Personne approbateur = factureFournisseur.getApprobateur();
        if ( approbateur == null ) {
            return null;
        }
        Long id = approbateur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityMotifDecisionFactureId(FactureFournisseur factureFournisseur) {
        if ( factureFournisseur == null ) {
            return null;
        }
        MotifDecisionFacture motifDecisionFacture = factureFournisseur.getMotifDecisionFacture();
        if ( motifDecisionFacture == null ) {
            return null;
        }
        Long id = motifDecisionFacture.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityContratFournisseurId(FactureFournisseur factureFournisseur) {
        if ( factureFournisseur == null ) {
            return null;
        }
        ContratFournisseur contratFournisseur = factureFournisseur.getContratFournisseur();
        if ( contratFournisseur == null ) {
            return null;
        }
        Long id = contratFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
