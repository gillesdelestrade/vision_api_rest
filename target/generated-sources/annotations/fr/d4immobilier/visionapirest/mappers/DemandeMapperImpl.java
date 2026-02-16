package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DemandeDTO;
import fr.d4immobilier.visionapirest.entities.BoiteArchive;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.entities.Equipement;
import fr.d4immobilier.visionapirest.entities.EtatDemande;
import fr.d4immobilier.visionapirest.entities.Importance;
import fr.d4immobilier.visionapirest.entities.Personne;
import fr.d4immobilier.visionapirest.entities.Urgence;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T17:26:49+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class DemandeMapperImpl implements DemandeMapper {

    @Override
    public List<DemandeDTO> toDTOList(List<Demande> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DemandeDTO> list = new ArrayList<DemandeDTO>( entities.size() );
        for ( Demande demande : entities ) {
            list.add( toDTO( demande ) );
        }

        return list;
    }

    @Override
    public DemandeDTO toDTO(Demande entity) {
        if ( entity == null ) {
            return null;
        }

        DemandeDTO demandeDTO = new DemandeDTO();

        demandeDTO.setEmetteurId( entityEmetteurId( entity ) );
        demandeDTO.setEquipementId( entityEquipementId( entity ) );
        demandeDTO.setAttributaireId( entityAttributaireId( entity ) );
        demandeDTO.setBoiteArchiveId( entityBoiteArchiveId( entity ) );
        demandeDTO.setDateConstat( dateConstatToString( entity.getDateConstat() ) );
        demandeDTO.setEtatDemande( etatDemandeToString( entity.getEtatDemande() ) );
        demandeDTO.setImportance( importanceToString( entity.getImportance() ) );
        demandeDTO.setUrgence( urgenceToString( entity.getUrgence() ) );
        demandeDTO.setDateDernierImportMailAtraiter( dateDernierImportMailAtraiterToString( entity.getDateDernierImportMailAtraiter() ) );
        demandeDTO.setId( entity.getId() );
        demandeDTO.setDateButoire( entity.getDateButoire() );
        demandeDTO.setDateClotureParD4( entity.getDateClotureParD4() );
        demandeDTO.setDateClotureDefinitive( entity.getDateClotureDefinitive() );
        demandeDTO.setDescription( entity.getDescription() );
        demandeDTO.setVisibleParCoproprietaires( entity.getVisibleParCoproprietaires() );
        demandeDTO.setDelaisSatisfaisants( entity.getDelaisSatisfaisants() );
        demandeDTO.setExplicationsClairesCompletes( entity.getExplicationsClairesCompletes() );
        demandeDTO.setGeneriqueEquipement( entity.getGeneriqueEquipement() );
        demandeDTO.setNotBefore( entity.getNotBefore() );
        demandeDTO.setEpingle( entity.getEpingle() );
        demandeDTO.setDateDemandeClotureCoproprietaire( entity.getDateDemandeClotureCoproprietaire() );
        demandeDTO.setNumero( entity.getNumero() );
        demandeDTO.setSuiviCS( entity.getSuiviCS() );
        demandeDTO.setDossierPermanent( entity.getDossierPermanent() );
        demandeDTO.setDirect( entity.getDirect() );
        demandeDTO.setAg( entity.getAg() );
        demandeDTO.setVisibleParLeCS( entity.getVisibleParLeCS() );

        return demandeDTO;
    }

    @Override
    public Demande toEntity(DemandeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Demande demande = new Demande();

        demande.setId( dto.getId() );
        if ( dto.getDateConstat() != null ) {
            demande.setDateConstat( Instant.parse( dto.getDateConstat() ) );
        }
        demande.setDateButoire( dto.getDateButoire() );
        demande.setDateClotureParD4( dto.getDateClotureParD4() );
        demande.setDateClotureDefinitive( dto.getDateClotureDefinitive() );
        demande.setDescription( dto.getDescription() );
        if ( dto.getEtatDemande() != null ) {
            demande.setEtatDemande( Enum.valueOf( EtatDemande.class, dto.getEtatDemande() ) );
        }
        demande.setVisibleParCoproprietaires( dto.getVisibleParCoproprietaires() );
        demande.setDelaisSatisfaisants( dto.getDelaisSatisfaisants() );
        demande.setExplicationsClairesCompletes( dto.getExplicationsClairesCompletes() );
        if ( dto.getImportance() != null ) {
            demande.setImportance( Enum.valueOf( Importance.class, dto.getImportance() ) );
        }
        if ( dto.getUrgence() != null ) {
            demande.setUrgence( Enum.valueOf( Urgence.class, dto.getUrgence() ) );
        }
        demande.setGeneriqueEquipement( dto.getGeneriqueEquipement() );
        demande.setNotBefore( dto.getNotBefore() );
        demande.setEpingle( dto.getEpingle() );
        demande.setDateDemandeClotureCoproprietaire( dto.getDateDemandeClotureCoproprietaire() );
        if ( dto.getDateDernierImportMailAtraiter() != null ) {
            demande.setDateDernierImportMailAtraiter( Instant.parse( dto.getDateDernierImportMailAtraiter() ) );
        }
        demande.setNumero( dto.getNumero() );
        demande.setSuiviCS( dto.getSuiviCS() );
        demande.setDossierPermanent( dto.getDossierPermanent() );
        demande.setDirect( dto.getDirect() );
        demande.setAg( dto.getAg() );
        demande.setVisibleParLeCS( dto.getVisibleParLeCS() );

        return demande;
    }

    private Long entityEmetteurId(Demande demande) {
        if ( demande == null ) {
            return null;
        }
        Personne emetteur = demande.getEmetteur();
        if ( emetteur == null ) {
            return null;
        }
        Long id = emetteur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityEquipementId(Demande demande) {
        if ( demande == null ) {
            return null;
        }
        Equipement equipement = demande.getEquipement();
        if ( equipement == null ) {
            return null;
        }
        Long id = equipement.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAttributaireId(Demande demande) {
        if ( demande == null ) {
            return null;
        }
        Personne attributaire = demande.getAttributaire();
        if ( attributaire == null ) {
            return null;
        }
        Long id = attributaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityBoiteArchiveId(Demande demande) {
        if ( demande == null ) {
            return null;
        }
        BoiteArchive boiteArchive = demande.getBoiteArchive();
        if ( boiteArchive == null ) {
            return null;
        }
        Long id = boiteArchive.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
