package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EvaluationFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.DemandeDevisFournisseur;
import fr.d4immobilier.visionapirest.entities.EvaluationFournisseur;
import fr.d4immobilier.visionapirest.entities.FactureFournisseur;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
import fr.d4immobilier.visionapirest.entities.InterventionDemande;
import fr.d4immobilier.visionapirest.entities.Personne;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-12T18:34:53+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class EvaluationFournisseurMapperImpl implements EvaluationFournisseurMapper {

    @Override
    public List<EvaluationFournisseurDTO> toDTOList(List<EvaluationFournisseur> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EvaluationFournisseurDTO> list = new ArrayList<EvaluationFournisseurDTO>( entities.size() );
        for ( EvaluationFournisseur evaluationFournisseur : entities ) {
            list.add( toDTO( evaluationFournisseur ) );
        }

        return list;
    }

    @Override
    public EvaluationFournisseurDTO toDTO(EvaluationFournisseur entity) {
        if ( entity == null ) {
            return null;
        }

        EvaluationFournisseurDTO evaluationFournisseurDTO = new EvaluationFournisseurDTO();

        evaluationFournisseurDTO.setFournisseurId( entityFournisseurId( entity ) );
        evaluationFournisseurDTO.setAuteurId( entityAuteurId( entity ) );
        evaluationFournisseurDTO.setInterventionDemandeId( entityInterventionDemandeId( entity ) );
        evaluationFournisseurDTO.setFactureFournisseurId( entityFactureFournisseurId( entity ) );
        evaluationFournisseurDTO.setDemandeDevisFournisseurId( entityDemandeDevisFournisseurId( entity ) );
        evaluationFournisseurDTO.setDateEvaluation( dateEvaluationToString( entity.getDateEvaluation() ) );
        evaluationFournisseurDTO.setId( entity.getId() );
        evaluationFournisseurDTO.setCommentaire( entity.getCommentaire() );
        evaluationFournisseurDTO.setNoteReactivite( entity.getNoteReactivite() );
        evaluationFournisseurDTO.setNotePrix( entity.getNotePrix() );
        evaluationFournisseurDTO.setNoteQualite( entity.getNoteQualite() );

        return evaluationFournisseurDTO;
    }

    @Override
    public EvaluationFournisseur toEntity(EvaluationFournisseurDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EvaluationFournisseur evaluationFournisseur = new EvaluationFournisseur();

        evaluationFournisseur.setId( dto.getId() );
        evaluationFournisseur.setCommentaire( dto.getCommentaire() );
        evaluationFournisseur.setNoteReactivite( dto.getNoteReactivite() );
        evaluationFournisseur.setNotePrix( dto.getNotePrix() );
        evaluationFournisseur.setNoteQualite( dto.getNoteQualite() );
        if ( dto.getDateEvaluation() != null ) {
            evaluationFournisseur.setDateEvaluation( Instant.parse( dto.getDateEvaluation() ) );
        }

        return evaluationFournisseur;
    }

    private Long entityFournisseurId(EvaluationFournisseur evaluationFournisseur) {
        if ( evaluationFournisseur == null ) {
            return null;
        }
        Fournisseur fournisseur = evaluationFournisseur.getFournisseur();
        if ( fournisseur == null ) {
            return null;
        }
        Long id = fournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAuteurId(EvaluationFournisseur evaluationFournisseur) {
        if ( evaluationFournisseur == null ) {
            return null;
        }
        Personne auteur = evaluationFournisseur.getAuteur();
        if ( auteur == null ) {
            return null;
        }
        Long id = auteur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityInterventionDemandeId(EvaluationFournisseur evaluationFournisseur) {
        if ( evaluationFournisseur == null ) {
            return null;
        }
        InterventionDemande interventionDemande = evaluationFournisseur.getInterventionDemande();
        if ( interventionDemande == null ) {
            return null;
        }
        Long id = interventionDemande.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFactureFournisseurId(EvaluationFournisseur evaluationFournisseur) {
        if ( evaluationFournisseur == null ) {
            return null;
        }
        FactureFournisseur factureFournisseur = evaluationFournisseur.getFactureFournisseur();
        if ( factureFournisseur == null ) {
            return null;
        }
        Long id = factureFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDemandeDevisFournisseurId(EvaluationFournisseur evaluationFournisseur) {
        if ( evaluationFournisseur == null ) {
            return null;
        }
        DemandeDevisFournisseur demandeDevisFournisseur = evaluationFournisseur.getDemandeDevisFournisseur();
        if ( demandeDevisFournisseur == null ) {
            return null;
        }
        Long id = demandeDevisFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
