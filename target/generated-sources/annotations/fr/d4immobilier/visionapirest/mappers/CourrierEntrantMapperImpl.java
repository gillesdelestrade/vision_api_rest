package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CourrierEntrantDTO;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.entities.CourrierEntrant;
import fr.d4immobilier.visionapirest.entities.FichierCourrierEntrant;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
import fr.d4immobilier.visionapirest.entities.ProvenanceCourrierEntrant;
import fr.d4immobilier.visionapirest.entities.TypeDocumentCourrierEntrant;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-20T08:40:21+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class CourrierEntrantMapperImpl implements CourrierEntrantMapper {

    @Override
    public List<CourrierEntrantDTO> toDTOList(List<CourrierEntrant> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CourrierEntrantDTO> list = new ArrayList<CourrierEntrantDTO>( entities.size() );
        for ( CourrierEntrant courrierEntrant : entities ) {
            list.add( toDTO( courrierEntrant ) );
        }

        return list;
    }

    @Override
    public CourrierEntrantDTO toDTO(CourrierEntrant entity) {
        if ( entity == null ) {
            return null;
        }

        CourrierEntrantDTO courrierEntrantDTO = new CourrierEntrantDTO();

        courrierEntrantDTO.setTypeDocumentCourrierEntrantId( entityTypeDocumentCourrierEntrantId( entity ) );
        courrierEntrantDTO.setFichierCourrierEntrantId( entityFichierCourrierEntrantId( entity ) );
        courrierEntrantDTO.setCoproprietaireProvenanceId( entityCoproprietaireProvenanceId( entity ) );
        courrierEntrantDTO.setFournisseurProvenanceId( entityFournisseurProvenanceId( entity ) );
        courrierEntrantDTO.setProvenanceCourrierEntrant( provenanceCourrierEntrantToString( entity.getProvenanceCourrierEntrant() ) );
        courrierEntrantDTO.setId( entity.getId() );
        courrierEntrantDTO.setDateReception( entity.getDateReception() );
        courrierEntrantDTO.setDateCourrier( entity.getDateCourrier() );
        courrierEntrantDTO.setAffecte( entity.getAffecte() );
        courrierEntrantDTO.setNePasClasser( entity.getNePasClasser() );
        courrierEntrantDTO.setConcerneSinistre( entity.getConcerneSinistre() );

        return courrierEntrantDTO;
    }

    @Override
    public CourrierEntrant toEntity(CourrierEntrantDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CourrierEntrant courrierEntrant = new CourrierEntrant();

        courrierEntrant.setId( dto.getId() );
        courrierEntrant.setDateReception( dto.getDateReception() );
        courrierEntrant.setDateCourrier( dto.getDateCourrier() );
        if ( dto.getProvenanceCourrierEntrant() != null ) {
            courrierEntrant.setProvenanceCourrierEntrant( Enum.valueOf( ProvenanceCourrierEntrant.class, dto.getProvenanceCourrierEntrant() ) );
        }
        courrierEntrant.setAffecte( dto.getAffecte() );
        courrierEntrant.setNePasClasser( dto.getNePasClasser() );
        courrierEntrant.setConcerneSinistre( dto.getConcerneSinistre() );

        return courrierEntrant;
    }

    private Long entityTypeDocumentCourrierEntrantId(CourrierEntrant courrierEntrant) {
        if ( courrierEntrant == null ) {
            return null;
        }
        TypeDocumentCourrierEntrant typeDocumentCourrierEntrant = courrierEntrant.getTypeDocumentCourrierEntrant();
        if ( typeDocumentCourrierEntrant == null ) {
            return null;
        }
        Long id = typeDocumentCourrierEntrant.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierCourrierEntrantId(CourrierEntrant courrierEntrant) {
        if ( courrierEntrant == null ) {
            return null;
        }
        FichierCourrierEntrant fichierCourrierEntrant = courrierEntrant.getFichierCourrierEntrant();
        if ( fichierCourrierEntrant == null ) {
            return null;
        }
        Long id = fichierCourrierEntrant.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityCoproprietaireProvenanceId(CourrierEntrant courrierEntrant) {
        if ( courrierEntrant == null ) {
            return null;
        }
        Coproprietaire coproprietaireProvenance = courrierEntrant.getCoproprietaireProvenance();
        if ( coproprietaireProvenance == null ) {
            return null;
        }
        Long id = coproprietaireProvenance.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFournisseurProvenanceId(CourrierEntrant courrierEntrant) {
        if ( courrierEntrant == null ) {
            return null;
        }
        Fournisseur fournisseurProvenance = courrierEntrant.getFournisseurProvenance();
        if ( fournisseurProvenance == null ) {
            return null;
        }
        Long id = fournisseurProvenance.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
