package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EtatKanbanDTO;
import fr.d4immobilier.visionapirest.entities.CouleurEtatKanban;
import fr.d4immobilier.visionapirest.entities.EtatKanban;
import fr.d4immobilier.visionapirest.entities.Kanban;
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
public class EtatKanbanMapperImpl implements EtatKanbanMapper {

    @Override
    public List<EtatKanbanDTO> toDTOList(List<EtatKanban> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EtatKanbanDTO> list = new ArrayList<EtatKanbanDTO>( entities.size() );
        for ( EtatKanban etatKanban : entities ) {
            list.add( toDTO( etatKanban ) );
        }

        return list;
    }

    @Override
    public EtatKanbanDTO toDTO(EtatKanban entity) {
        if ( entity == null ) {
            return null;
        }

        EtatKanbanDTO etatKanbanDTO = new EtatKanbanDTO();

        etatKanbanDTO.setKanbanId( entityKanbanId( entity ) );
        etatKanbanDTO.setEtatKanbanSuivantId( entityEtatKanbanSuivantId( entity ) );
        etatKanbanDTO.setCouleurEtatKanban( couleurEtatKanbanToString( entity.getCouleurEtatKanban() ) );
        etatKanbanDTO.setId( entity.getId() );
        etatKanbanDTO.setLibelle( entity.getLibelle() );
        etatKanbanDTO.setNumeroOrdre( entity.getNumeroOrdre() );
        etatKanbanDTO.setDataField( entity.getDataField() );
        etatKanbanDTO.setDureeExpirationParDefaut( entity.getDureeExpirationParDefaut() );

        return etatKanbanDTO;
    }

    @Override
    public EtatKanban toEntity(EtatKanbanDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EtatKanban etatKanban = new EtatKanban();

        etatKanban.setId( dto.getId() );
        etatKanban.setLibelle( dto.getLibelle() );
        etatKanban.setNumeroOrdre( dto.getNumeroOrdre() );
        etatKanban.setDataField( dto.getDataField() );
        etatKanban.setDureeExpirationParDefaut( dto.getDureeExpirationParDefaut() );
        if ( dto.getCouleurEtatKanban() != null ) {
            etatKanban.setCouleurEtatKanban( Enum.valueOf( CouleurEtatKanban.class, dto.getCouleurEtatKanban() ) );
        }

        return etatKanban;
    }

    private Long entityKanbanId(EtatKanban etatKanban) {
        if ( etatKanban == null ) {
            return null;
        }
        Kanban kanban = etatKanban.getKanban();
        if ( kanban == null ) {
            return null;
        }
        Long id = kanban.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityEtatKanbanSuivantId(EtatKanban etatKanban) {
        if ( etatKanban == null ) {
            return null;
        }
        EtatKanban etatKanbanSuivant = etatKanban.getEtatKanbanSuivant();
        if ( etatKanbanSuivant == null ) {
            return null;
        }
        Long id = etatKanbanSuivant.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
