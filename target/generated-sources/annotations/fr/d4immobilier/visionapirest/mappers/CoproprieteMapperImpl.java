package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CoproprieteDTO;
import fr.d4immobilier.visionapirest.entities.Adresse;
import fr.d4immobilier.visionapirest.entities.ConseilSyndical;
import fr.d4immobilier.visionapirest.entities.Copropriete;
import fr.d4immobilier.visionapirest.entities.Gestionnaire;
import fr.d4immobilier.visionapirest.entities.StatutCopropriete;
import fr.d4immobilier.visionapirest.entities.Syndic;
import fr.d4immobilier.visionapirest.entities.TypeCopropriete;
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
public class CoproprieteMapperImpl implements CoproprieteMapper {

    @Override
    public List<CoproprieteDTO> toDTOList(List<Copropriete> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CoproprieteDTO> list = new ArrayList<CoproprieteDTO>( entities.size() );
        for ( Copropriete copropriete : entities ) {
            list.add( toDTO( copropriete ) );
        }

        return list;
    }

    @Override
    public CoproprieteDTO toDTO(Copropriete entity) {
        if ( entity == null ) {
            return null;
        }

        CoproprieteDTO coproprieteDTO = new CoproprieteDTO();

        coproprieteDTO.setAdresseId( entityAdresseId( entity ) );
        coproprieteDTO.setGestionnaireId( entityGestionnaireId( entity ) );
        coproprieteDTO.setGestionnaireSedentaireId( entityGestionnaireSedentaireId( entity ) );
        coproprieteDTO.setComptableId( entityComptableId( entity ) );
        coproprieteDTO.setGestionnaireInitiales( getInitiales( entity.getGestionnaire() ) );
        coproprieteDTO.setGestionnaireSedentaireInitiales( getInitiales( entity.getGestionnaireSedentaire() ) );
        coproprieteDTO.setComptableInitiales( getInitiales( entity.getComptable() ) );
        coproprieteDTO.setConseilSyndicalId( entityConseilSyndicalId( entity ) );
        coproprieteDTO.setSyndicId( entitySyndicId( entity ) );
        coproprieteDTO.setTypeCopropriete( typeCoproprieteToString( entity.getTypeCopropriete() ) );
        coproprieteDTO.setStatutCopropriete( statutCoproprieteToString( entity.getStatutCopropriete() ) );
        coproprieteDTO.setId( entity.getId() );
        coproprieteDTO.setNom( entity.getNom() );
        coproprieteDTO.setTantiemes( entity.getTantiemes() );
        coproprieteDTO.setTrigramme( entity.getTrigramme() );
        coproprieteDTO.setIdentifiantICS( entity.getIdentifiantICS() );
        coproprieteDTO.setNumeroSiret( entity.getNumeroSiret() );
        coproprieteDTO.setTantiemesLocauxHabitation( entity.getTantiemesLocauxHabitation() );
        coproprieteDTO.setDateDebutMandat( entity.getDateDebutMandat() );
        coproprieteDTO.setNumeroImmatriculation( entity.getNumeroImmatriculation() );
        coproprieteDTO.setComptabiliteEnCoursDeSaisie( entity.getComptabiliteEnCoursDeSaisie() );
        coproprieteDTO.setNombreDeVisitesVendues( entity.getNombreDeVisitesVendues() );
        coproprieteDTO.setNombreCSJourneeSurPlaceVendus( entity.getNombreCSJourneeSurPlaceVendus() );
        coproprieteDTO.setNombreCSSoireeSurPlaceVendus( entity.getNombreCSSoireeSurPlaceVendus() );
        coproprieteDTO.setNombreCSJourneeD4Vendus( entity.getNombreCSJourneeD4Vendus() );
        coproprieteDTO.setNombreCSSoireeD4Vendus( entity.getNombreCSSoireeD4Vendus() );
        coproprieteDTO.setNombreDeLotsVendus( entity.getNombreDeLotsVendus() );
        coproprieteDTO.setHeureAGEnJournee( entity.getHeureAGEnJournee() );
        coproprieteDTO.setLieuAGD4( entity.getLieuAGD4() );
        coproprieteDTO.setDureeAGVendue( entity.getDureeAGVendue() );
        coproprieteDTO.setNombreCSJourneeSurPlaceReels( entity.getNombreCSJourneeSurPlaceReels() );
        coproprieteDTO.setNombreCSSoireeSurPlaceReels( entity.getNombreCSSoireeSurPlaceReels() );
        coproprieteDTO.setGerabilite( entity.getGerabilite() );
        coproprieteDTO.setMoisClotureExercice( entity.getMoisClotureExercice() );

        return coproprieteDTO;
    }

    @Override
    public Copropriete toEntity(CoproprieteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Copropriete copropriete = new Copropriete();

        copropriete.setId( dto.getId() );
        copropriete.setNom( dto.getNom() );
        copropriete.setTantiemes( dto.getTantiemes() );
        if ( dto.getTypeCopropriete() != null ) {
            copropriete.setTypeCopropriete( Enum.valueOf( TypeCopropriete.class, dto.getTypeCopropriete() ) );
        }
        copropriete.setTrigramme( dto.getTrigramme() );
        if ( dto.getStatutCopropriete() != null ) {
            copropriete.setStatutCopropriete( Enum.valueOf( StatutCopropriete.class, dto.getStatutCopropriete() ) );
        }
        copropriete.setIdentifiantICS( dto.getIdentifiantICS() );
        copropriete.setNumeroSiret( dto.getNumeroSiret() );
        copropriete.setTantiemesLocauxHabitation( dto.getTantiemesLocauxHabitation() );
        copropriete.setDateDebutMandat( dto.getDateDebutMandat() );
        copropriete.setNumeroImmatriculation( dto.getNumeroImmatriculation() );
        copropriete.setComptabiliteEnCoursDeSaisie( dto.getComptabiliteEnCoursDeSaisie() );
        copropriete.setNombreDeVisitesVendues( dto.getNombreDeVisitesVendues() );
        copropriete.setNombreCSJourneeSurPlaceVendus( dto.getNombreCSJourneeSurPlaceVendus() );
        copropriete.setNombreCSSoireeSurPlaceVendus( dto.getNombreCSSoireeSurPlaceVendus() );
        copropriete.setNombreCSJourneeD4Vendus( dto.getNombreCSJourneeD4Vendus() );
        copropriete.setNombreCSSoireeD4Vendus( dto.getNombreCSSoireeD4Vendus() );
        copropriete.setNombreDeLotsVendus( dto.getNombreDeLotsVendus() );
        copropriete.setHeureAGEnJournee( dto.getHeureAGEnJournee() );
        copropriete.setLieuAGD4( dto.getLieuAGD4() );
        copropriete.setDureeAGVendue( dto.getDureeAGVendue() );
        copropriete.setGerabilite( dto.getGerabilite() );
        copropriete.setNombreCSJourneeSurPlaceReels( dto.getNombreCSJourneeSurPlaceReels() );
        copropriete.setNombreCSSoireeSurPlaceReels( dto.getNombreCSSoireeSurPlaceReels() );
        copropriete.setMoisClotureExercice( dto.getMoisClotureExercice() );

        return copropriete;
    }

    private Long entityAdresseId(Copropriete copropriete) {
        if ( copropriete == null ) {
            return null;
        }
        Adresse adresse = copropriete.getAdresse();
        if ( adresse == null ) {
            return null;
        }
        Long id = adresse.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityGestionnaireId(Copropriete copropriete) {
        if ( copropriete == null ) {
            return null;
        }
        Gestionnaire gestionnaire = copropriete.getGestionnaire();
        if ( gestionnaire == null ) {
            return null;
        }
        Long id = gestionnaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityGestionnaireSedentaireId(Copropriete copropriete) {
        if ( copropriete == null ) {
            return null;
        }
        Gestionnaire gestionnaireSedentaire = copropriete.getGestionnaireSedentaire();
        if ( gestionnaireSedentaire == null ) {
            return null;
        }
        Long id = gestionnaireSedentaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityComptableId(Copropriete copropriete) {
        if ( copropriete == null ) {
            return null;
        }
        Gestionnaire comptable = copropriete.getComptable();
        if ( comptable == null ) {
            return null;
        }
        Long id = comptable.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityConseilSyndicalId(Copropriete copropriete) {
        if ( copropriete == null ) {
            return null;
        }
        ConseilSyndical conseilSyndical = copropriete.getConseilSyndical();
        if ( conseilSyndical == null ) {
            return null;
        }
        Long id = conseilSyndical.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entitySyndicId(Copropriete copropriete) {
        if ( copropriete == null ) {
            return null;
        }
        Syndic syndic = copropriete.getSyndic();
        if ( syndic == null ) {
            return null;
        }
        Long id = syndic.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
