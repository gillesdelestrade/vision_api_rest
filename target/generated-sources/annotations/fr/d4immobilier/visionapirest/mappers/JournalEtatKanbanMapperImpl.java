package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.JournalEtatKanbanDTO;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.entities.EtatKanban;
import fr.d4immobilier.visionapirest.entities.JournalEtatKanban;
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
public class JournalEtatKanbanMapperImpl implements JournalEtatKanbanMapper {

    @Override
    public List<JournalEtatKanbanDTO> toDTOList(List<JournalEtatKanban> entities) {
        if ( entities == null ) {
            return null;
        }

        List<JournalEtatKanbanDTO> list = new ArrayList<JournalEtatKanbanDTO>( entities.size() );
        for ( JournalEtatKanban journalEtatKanban : entities ) {
            list.add( toDTO( journalEtatKanban ) );
        }

        return list;
    }

    @Override
    public JournalEtatKanbanDTO toDTO(JournalEtatKanban entity) {
        if ( entity == null ) {
            return null;
        }

        JournalEtatKanbanDTO journalEtatKanbanDTO = new JournalEtatKanbanDTO();

        journalEtatKanbanDTO.setDemandeId( entityDemandeId( entity ) );
        journalEtatKanbanDTO.setEtatKanbanId( entityEtatKanbanId( entity ) );
        journalEtatKanbanDTO.setDateEntree( dateEntreeToString( entity.getDateEntree() ) );
        journalEtatKanbanDTO.setDateSortie( dateSortieToString( entity.getDateSortie() ) );
        journalEtatKanbanDTO.setId( entity.getId() );
        journalEtatKanbanDTO.setNumeroEntreeJournal( entity.getNumeroEntreeJournal() );
        journalEtatKanbanDTO.setDateExpiration( entity.getDateExpiration() );

        return journalEtatKanbanDTO;
    }

    @Override
    public JournalEtatKanban toEntity(JournalEtatKanbanDTO dto) {
        if ( dto == null ) {
            return null;
        }

        JournalEtatKanban journalEtatKanban = new JournalEtatKanban();

        journalEtatKanban.setId( dto.getId() );
        if ( dto.getDateEntree() != null ) {
            journalEtatKanban.setDateEntree( Instant.parse( dto.getDateEntree() ) );
        }
        if ( dto.getDateSortie() != null ) {
            journalEtatKanban.setDateSortie( Instant.parse( dto.getDateSortie() ) );
        }
        journalEtatKanban.setNumeroEntreeJournal( dto.getNumeroEntreeJournal() );
        journalEtatKanban.setDateExpiration( dto.getDateExpiration() );

        return journalEtatKanban;
    }

    private Long entityDemandeId(JournalEtatKanban journalEtatKanban) {
        if ( journalEtatKanban == null ) {
            return null;
        }
        Demande demande = journalEtatKanban.getDemande();
        if ( demande == null ) {
            return null;
        }
        Long id = demande.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityEtatKanbanId(JournalEtatKanban journalEtatKanban) {
        if ( journalEtatKanban == null ) {
            return null;
        }
        EtatKanban etatKanban = journalEtatKanban.getEtatKanban();
        if ( etatKanban == null ) {
            return null;
        }
        Long id = etatKanban.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
