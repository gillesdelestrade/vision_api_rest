package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ComplementProcedureDTO;
import fr.d4immobilier.visionapirest.entities.ComplementProcedure;
import fr.d4immobilier.visionapirest.entities.Fichier;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
import fr.d4immobilier.visionapirest.entities.Procedure;
import fr.d4immobilier.visionapirest.entities.StatutProcedure;
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
public class ComplementProcedureMapperImpl implements ComplementProcedureMapper {

    @Override
    public List<ComplementProcedureDTO> toDTOList(List<ComplementProcedure> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ComplementProcedureDTO> list = new ArrayList<ComplementProcedureDTO>( entities.size() );
        for ( ComplementProcedure complementProcedure : entities ) {
            list.add( toDTO( complementProcedure ) );
        }

        return list;
    }

    @Override
    public ComplementProcedureDTO toDTO(ComplementProcedure entity) {
        if ( entity == null ) {
            return null;
        }

        ComplementProcedureDTO complementProcedureDTO = new ComplementProcedureDTO();

        complementProcedureDTO.setFichierCertificatDeNonAppelId( entityFichierCertificatDeNonAppelId( entity ) );
        complementProcedureDTO.setFichierOrdonnanceId( entityFichierOrdonnanceId( entity ) );
        complementProcedureDTO.setAvocatId( entityAvocatId( entity ) );
        complementProcedureDTO.setProcedureId( entityProcedureId( entity ) );
        complementProcedureDTO.setFichierAssignationId( entityFichierAssignationId( entity ) );
        complementProcedureDTO.setStatutProcedure( statutProcedureToString( entity.getStatutProcedure() ) );
        complementProcedureDTO.setId( entity.getId() );
        complementProcedureDTO.setTribunal( entity.getTribunal() );
        complementProcedureDTO.setReferenceAvocat( entity.getReferenceAvocat() );
        complementProcedureDTO.setReferenceHuissier( entity.getReferenceHuissier() );
        complementProcedureDTO.setReferenceTribunal( entity.getReferenceTribunal() );
        complementProcedureDTO.setOrigine( entity.getOrigine() );
        complementProcedureDTO.setDateReceptionAssignation( entity.getDateReceptionAssignation() );
        complementProcedureDTO.setDateDeMiseEnDelibere( entity.getDateDeMiseEnDelibere() );
        complementProcedureDTO.setDelibere( entity.getDelibere() );
        complementProcedureDTO.setArticle700( entity.getArticle700() );
        complementProcedureDTO.setDateReceptionCertificatDeNonAppel( entity.getDateReceptionCertificatDeNonAppel() );
        complementProcedureDTO.setDateAssignation( entity.getDateAssignation() );
        complementProcedureDTO.setCeQuiEstDemande( entity.getCeQuiEstDemande() );
        complementProcedureDTO.setDatePremiereComparution( entity.getDatePremiereComparution() );
        complementProcedureDTO.setDefendeur( entity.getDefendeur() );

        return complementProcedureDTO;
    }

    @Override
    public ComplementProcedure toEntity(ComplementProcedureDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ComplementProcedure complementProcedure = new ComplementProcedure();

        complementProcedure.setId( dto.getId() );
        complementProcedure.setTribunal( dto.getTribunal() );
        complementProcedure.setReferenceAvocat( dto.getReferenceAvocat() );
        complementProcedure.setReferenceHuissier( dto.getReferenceHuissier() );
        complementProcedure.setReferenceTribunal( dto.getReferenceTribunal() );
        complementProcedure.setOrigine( dto.getOrigine() );
        complementProcedure.setDateReceptionAssignation( dto.getDateReceptionAssignation() );
        complementProcedure.setDateDeMiseEnDelibere( dto.getDateDeMiseEnDelibere() );
        complementProcedure.setDelibere( dto.getDelibere() );
        complementProcedure.setArticle700( dto.getArticle700() );
        if ( dto.getStatutProcedure() != null ) {
            complementProcedure.setStatutProcedure( Enum.valueOf( StatutProcedure.class, dto.getStatutProcedure() ) );
        }
        complementProcedure.setDateReceptionCertificatDeNonAppel( dto.getDateReceptionCertificatDeNonAppel() );
        complementProcedure.setDateAssignation( dto.getDateAssignation() );
        complementProcedure.setCeQuiEstDemande( dto.getCeQuiEstDemande() );
        complementProcedure.setDatePremiereComparution( dto.getDatePremiereComparution() );
        complementProcedure.setDefendeur( dto.getDefendeur() );

        return complementProcedure;
    }

    private Long entityFichierCertificatDeNonAppelId(ComplementProcedure complementProcedure) {
        if ( complementProcedure == null ) {
            return null;
        }
        Fichier fichierCertificatDeNonAppel = complementProcedure.getFichierCertificatDeNonAppel();
        if ( fichierCertificatDeNonAppel == null ) {
            return null;
        }
        Long id = fichierCertificatDeNonAppel.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierOrdonnanceId(ComplementProcedure complementProcedure) {
        if ( complementProcedure == null ) {
            return null;
        }
        Fichier fichierOrdonnance = complementProcedure.getFichierOrdonnance();
        if ( fichierOrdonnance == null ) {
            return null;
        }
        Long id = fichierOrdonnance.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAvocatId(ComplementProcedure complementProcedure) {
        if ( complementProcedure == null ) {
            return null;
        }
        Fournisseur avocat = complementProcedure.getAvocat();
        if ( avocat == null ) {
            return null;
        }
        Long id = avocat.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityProcedureId(ComplementProcedure complementProcedure) {
        if ( complementProcedure == null ) {
            return null;
        }
        Procedure procedure = complementProcedure.getProcedure();
        if ( procedure == null ) {
            return null;
        }
        Long id = procedure.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierAssignationId(ComplementProcedure complementProcedure) {
        if ( complementProcedure == null ) {
            return null;
        }
        Fichier fichierAssignation = complementProcedure.getFichierAssignation();
        if ( fichierAssignation == null ) {
            return null;
        }
        Long id = fichierAssignation.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
