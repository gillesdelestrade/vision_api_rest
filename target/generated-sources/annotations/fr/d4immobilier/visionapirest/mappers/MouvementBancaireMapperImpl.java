package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MouvementBancaireDTO;
import fr.d4immobilier.visionapirest.entities.MouvementBancaire;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-17T10:51:57+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class MouvementBancaireMapperImpl implements MouvementBancaireMapper {

    @Override
    public List<MouvementBancaireDTO> toDTOList(List<MouvementBancaire> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MouvementBancaireDTO> list = new ArrayList<MouvementBancaireDTO>( entities.size() );
        for ( MouvementBancaire mouvementBancaire : entities ) {
            list.add( toDTO( mouvementBancaire ) );
        }

        return list;
    }

    @Override
    public MouvementBancaireDTO toDTO(MouvementBancaire entity) {
        if ( entity == null ) {
            return null;
        }

        MouvementBancaireDTO mouvementBancaireDTO = new MouvementBancaireDTO();

        mouvementBancaireDTO.setId( entity.getId() );
        mouvementBancaireDTO.setDateMouvement( entity.getDateMouvement() );
        mouvementBancaireDTO.setNumeroOperation( entity.getNumeroOperation() );
        mouvementBancaireDTO.setLibelle( entity.getLibelle() );
        mouvementBancaireDTO.setDebit( entity.getDebit() );
        mouvementBancaireDTO.setCredit( entity.getCredit() );
        mouvementBancaireDTO.setDetail( entity.getDetail() );

        return mouvementBancaireDTO;
    }

    @Override
    public MouvementBancaire toEntity(MouvementBancaireDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MouvementBancaire mouvementBancaire = new MouvementBancaire();

        mouvementBancaire.setId( dto.getId() );
        mouvementBancaire.setDateMouvement( dto.getDateMouvement() );
        mouvementBancaire.setNumeroOperation( dto.getNumeroOperation() );
        mouvementBancaire.setLibelle( dto.getLibelle() );
        mouvementBancaire.setDebit( dto.getDebit() );
        mouvementBancaire.setCredit( dto.getCredit() );
        mouvementBancaire.setDetail( dto.getDetail() );

        return mouvementBancaire;
    }
}
