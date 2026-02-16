package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ContratFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.ContratFournisseur;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
import fr.d4immobilier.visionapirest.entities.FrequenceFactures;
import fr.d4immobilier.visionapirest.entities.MomentPaiementFacturesContrat;
import fr.d4immobilier.visionapirest.entities.PrestationContrat;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T17:26:49+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class ContratFournisseurMapperImpl implements ContratFournisseurMapper {

    @Override
    public List<ContratFournisseurDTO> toDTOList(List<ContratFournisseur> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ContratFournisseurDTO> list = new ArrayList<ContratFournisseurDTO>( entities.size() );
        for ( ContratFournisseur contratFournisseur : entities ) {
            list.add( toDTO( contratFournisseur ) );
        }

        return list;
    }

    @Override
    public ContratFournisseurDTO toDTO(ContratFournisseur entity) {
        if ( entity == null ) {
            return null;
        }

        ContratFournisseurDTO contratFournisseurDTO = new ContratFournisseurDTO();

        contratFournisseurDTO.setFournisseurId( entityFournisseurId( entity ) );
        contratFournisseurDTO.setPrestationContratId( entityPrestationContratId( entity ) );
        contratFournisseurDTO.setMomentPaiementFacturesContrat( momentPaiementFacturesContratToString( entity.getMomentPaiementFacturesContrat() ) );
        contratFournisseurDTO.setFrequenceFactures( frequenceFacturesToString( entity.getFrequenceFactures() ) );
        contratFournisseurDTO.setId( entity.getId() );
        contratFournisseurDTO.setReference( entity.getReference() );
        contratFournisseurDTO.setDescription( entity.getDescription() );
        contratFournisseurDTO.setCommentaire( entity.getCommentaire() );
        contratFournisseurDTO.setDateContrat( entity.getDateContrat() );
        contratFournisseurDTO.setDateDebut( entity.getDateDebut() );
        contratFournisseurDTO.setDateFin( entity.getDateFin() );
        contratFournisseurDTO.setMontantForfait( entity.getMontantForfait() );
        contratFournisseurDTO.setReferenceClient( entity.getReferenceClient() );
        contratFournisseurDTO.setValidationFacturesPasNecessaire( entity.getValidationFacturesPasNecessaire() );
        contratFournisseurDTO.setFacturationForfaitaire( entity.getFacturationForfaitaire() );
        contratFournisseurDTO.setJourAnniversaire( entity.getJourAnniversaire() );
        contratFournisseurDTO.setMoisAnniversaire( entity.getMoisAnniversaire() );
        contratFournisseurDTO.setDureePreavisResiliation( entity.getDureePreavisResiliation() );

        return contratFournisseurDTO;
    }

    @Override
    public ContratFournisseur toEntity(ContratFournisseurDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ContratFournisseur contratFournisseur = new ContratFournisseur();

        contratFournisseur.setId( dto.getId() );
        contratFournisseur.setReference( dto.getReference() );
        contratFournisseur.setDescription( dto.getDescription() );
        contratFournisseur.setDateContrat( dto.getDateContrat() );
        contratFournisseur.setDateDebut( dto.getDateDebut() );
        contratFournisseur.setDateFin( dto.getDateFin() );
        if ( dto.getMomentPaiementFacturesContrat() != null ) {
            contratFournisseur.setMomentPaiementFacturesContrat( Enum.valueOf( MomentPaiementFacturesContrat.class, dto.getMomentPaiementFacturesContrat() ) );
        }
        if ( dto.getFrequenceFactures() != null ) {
            contratFournisseur.setFrequenceFactures( Enum.valueOf( FrequenceFactures.class, dto.getFrequenceFactures() ) );
        }
        contratFournisseur.setMontantForfait( dto.getMontantForfait() );
        contratFournisseur.setReferenceClient( dto.getReferenceClient() );
        contratFournisseur.setCommentaire( dto.getCommentaire() );
        contratFournisseur.setValidationFacturesPasNecessaire( dto.getValidationFacturesPasNecessaire() );
        contratFournisseur.setFacturationForfaitaire( dto.getFacturationForfaitaire() );
        contratFournisseur.setJourAnniversaire( dto.getJourAnniversaire() );
        contratFournisseur.setMoisAnniversaire( dto.getMoisAnniversaire() );
        contratFournisseur.setDureePreavisResiliation( dto.getDureePreavisResiliation() );

        return contratFournisseur;
    }

    private Long entityFournisseurId(ContratFournisseur contratFournisseur) {
        if ( contratFournisseur == null ) {
            return null;
        }
        Fournisseur fournisseur = contratFournisseur.getFournisseur();
        if ( fournisseur == null ) {
            return null;
        }
        Long id = fournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityPrestationContratId(ContratFournisseur contratFournisseur) {
        if ( contratFournisseur == null ) {
            return null;
        }
        PrestationContrat prestationContrat = contratFournisseur.getPrestationContrat();
        if ( prestationContrat == null ) {
            return null;
        }
        Long id = prestationContrat.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
