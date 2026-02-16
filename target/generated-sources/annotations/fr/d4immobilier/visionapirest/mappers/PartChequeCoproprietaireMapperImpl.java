package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PartChequeCoproprietaireDTO;
import fr.d4immobilier.visionapirest.entities.Cheque;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.entities.PartChequeCoproprietaire;
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
public class PartChequeCoproprietaireMapperImpl implements PartChequeCoproprietaireMapper {

    @Override
    public List<PartChequeCoproprietaireDTO> toDTOList(List<PartChequeCoproprietaire> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PartChequeCoproprietaireDTO> list = new ArrayList<PartChequeCoproprietaireDTO>( entities.size() );
        for ( PartChequeCoproprietaire partChequeCoproprietaire : entities ) {
            list.add( toDTO( partChequeCoproprietaire ) );
        }

        return list;
    }

    @Override
    public PartChequeCoproprietaireDTO toDTO(PartChequeCoproprietaire entity) {
        if ( entity == null ) {
            return null;
        }

        PartChequeCoproprietaireDTO partChequeCoproprietaireDTO = new PartChequeCoproprietaireDTO();

        partChequeCoproprietaireDTO.setChequeId( entityChequeId( entity ) );
        partChequeCoproprietaireDTO.setCoproprietaireId( entityCoproprietaireId( entity ) );
        partChequeCoproprietaireDTO.setId( entity.getId() );
        partChequeCoproprietaireDTO.setMontantPart( entity.getMontantPart() );

        return partChequeCoproprietaireDTO;
    }

    @Override
    public PartChequeCoproprietaire toEntity(PartChequeCoproprietaireDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PartChequeCoproprietaire partChequeCoproprietaire = new PartChequeCoproprietaire();

        partChequeCoproprietaire.setId( dto.getId() );
        partChequeCoproprietaire.setMontantPart( dto.getMontantPart() );

        return partChequeCoproprietaire;
    }

    private Long entityChequeId(PartChequeCoproprietaire partChequeCoproprietaire) {
        if ( partChequeCoproprietaire == null ) {
            return null;
        }
        Cheque cheque = partChequeCoproprietaire.getCheque();
        if ( cheque == null ) {
            return null;
        }
        Long id = cheque.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityCoproprietaireId(PartChequeCoproprietaire partChequeCoproprietaire) {
        if ( partChequeCoproprietaire == null ) {
            return null;
        }
        Coproprietaire coproprietaire = partChequeCoproprietaire.getCoproprietaire();
        if ( coproprietaire == null ) {
            return null;
        }
        Long id = coproprietaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
