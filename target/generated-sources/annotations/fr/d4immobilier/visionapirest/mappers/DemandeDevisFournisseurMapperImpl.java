package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DemandeDevisFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.DemandeDevis;
import fr.d4immobilier.visionapirest.entities.DemandeDevisFournisseur;
import fr.d4immobilier.visionapirest.entities.DocumentDemandeDevis;
import fr.d4immobilier.visionapirest.entities.FichierDemandeDevisFournisseur;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
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
public class DemandeDevisFournisseurMapperImpl implements DemandeDevisFournisseurMapper {

    @Override
    public List<DemandeDevisFournisseurDTO> toDTOList(List<DemandeDevisFournisseur> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DemandeDevisFournisseurDTO> list = new ArrayList<DemandeDevisFournisseurDTO>( entities.size() );
        for ( DemandeDevisFournisseur demandeDevisFournisseur : entities ) {
            list.add( toDTO( demandeDevisFournisseur ) );
        }

        return list;
    }

    @Override
    public DemandeDevisFournisseurDTO toDTO(DemandeDevisFournisseur entity) {
        if ( entity == null ) {
            return null;
        }

        DemandeDevisFournisseurDTO demandeDevisFournisseurDTO = new DemandeDevisFournisseurDTO();

        demandeDevisFournisseurDTO.setDocumentDemandeDevisId( entityDocumentDemandeDevisId( entity ) );
        demandeDevisFournisseurDTO.setFichierDemandeDevisFournisseurId( entityFichierDemandeDevisFournisseurId( entity ) );
        demandeDevisFournisseurDTO.setFournisseurId( entityFournisseurId( entity ) );
        demandeDevisFournisseurDTO.setDemandeDevisId( entityDemandeDevisId( entity ) );
        demandeDevisFournisseurDTO.setDatePriseEnCompteFournisseur( datePriseEnCompteFournisseurToString( entity.getDatePriseEnCompteFournisseur() ) );
        demandeDevisFournisseurDTO.setId( entity.getId() );
        demandeDevisFournisseurDTO.setPeriodeRemiseDevisPrevue( entity.getPeriodeRemiseDevisPrevue() );
        demandeDevisFournisseurDTO.setDateReceptionDevis( entity.getDateReceptionDevis() );
        demandeDevisFournisseurDTO.setDateRappel( entity.getDateRappel() );
        demandeDevisFournisseurDTO.setDateAnnulation( entity.getDateAnnulation() );
        demandeDevisFournisseurDTO.setHistorique( entity.getHistorique() );
        demandeDevisFournisseurDTO.setPrioritaire( entity.getPrioritaire() );
        demandeDevisFournisseurDTO.setNombreRelances( entity.getNombreRelances() );

        return demandeDevisFournisseurDTO;
    }

    @Override
    public DemandeDevisFournisseur toEntity(DemandeDevisFournisseurDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DemandeDevisFournisseur demandeDevisFournisseur = new DemandeDevisFournisseur();

        demandeDevisFournisseur.setId( dto.getId() );
        if ( dto.getDatePriseEnCompteFournisseur() != null ) {
            demandeDevisFournisseur.setDatePriseEnCompteFournisseur( Instant.parse( dto.getDatePriseEnCompteFournisseur() ) );
        }
        demandeDevisFournisseur.setPeriodeRemiseDevisPrevue( dto.getPeriodeRemiseDevisPrevue() );
        demandeDevisFournisseur.setDateReceptionDevis( dto.getDateReceptionDevis() );
        demandeDevisFournisseur.setDateRappel( dto.getDateRappel() );
        demandeDevisFournisseur.setDateAnnulation( dto.getDateAnnulation() );
        demandeDevisFournisseur.setHistorique( dto.getHistorique() );
        demandeDevisFournisseur.setPrioritaire( dto.getPrioritaire() );
        demandeDevisFournisseur.setNombreRelances( dto.getNombreRelances() );

        return demandeDevisFournisseur;
    }

    private Long entityDocumentDemandeDevisId(DemandeDevisFournisseur demandeDevisFournisseur) {
        if ( demandeDevisFournisseur == null ) {
            return null;
        }
        DocumentDemandeDevis documentDemandeDevis = demandeDevisFournisseur.getDocumentDemandeDevis();
        if ( documentDemandeDevis == null ) {
            return null;
        }
        Long id = documentDemandeDevis.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierDemandeDevisFournisseurId(DemandeDevisFournisseur demandeDevisFournisseur) {
        if ( demandeDevisFournisseur == null ) {
            return null;
        }
        FichierDemandeDevisFournisseur fichierDemandeDevisFournisseur = demandeDevisFournisseur.getFichierDemandeDevisFournisseur();
        if ( fichierDemandeDevisFournisseur == null ) {
            return null;
        }
        Long id = fichierDemandeDevisFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFournisseurId(DemandeDevisFournisseur demandeDevisFournisseur) {
        if ( demandeDevisFournisseur == null ) {
            return null;
        }
        Fournisseur fournisseur = demandeDevisFournisseur.getFournisseur();
        if ( fournisseur == null ) {
            return null;
        }
        Long id = fournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDemandeDevisId(DemandeDevisFournisseur demandeDevisFournisseur) {
        if ( demandeDevisFournisseur == null ) {
            return null;
        }
        DemandeDevis demandeDevis = demandeDevisFournisseur.getDemandeDevis();
        if ( demandeDevis == null ) {
            return null;
        }
        Long id = demandeDevis.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
