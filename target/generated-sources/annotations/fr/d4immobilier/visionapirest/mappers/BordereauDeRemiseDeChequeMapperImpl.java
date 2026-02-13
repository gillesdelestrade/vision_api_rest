package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BordereauDeRemiseDeChequeDTO;
import fr.d4immobilier.visionapirest.entities.BordereauDeRemiseDeCheque;
import fr.d4immobilier.visionapirest.entities.EtatBordereauCheques;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-13T14:09:30+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class BordereauDeRemiseDeChequeMapperImpl implements BordereauDeRemiseDeChequeMapper {

    @Override
    public List<BordereauDeRemiseDeChequeDTO> toDTOList(List<BordereauDeRemiseDeCheque> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BordereauDeRemiseDeChequeDTO> list = new ArrayList<BordereauDeRemiseDeChequeDTO>( entities.size() );
        for ( BordereauDeRemiseDeCheque bordereauDeRemiseDeCheque : entities ) {
            list.add( toDTO( bordereauDeRemiseDeCheque ) );
        }

        return list;
    }

    @Override
    public BordereauDeRemiseDeChequeDTO toDTO(BordereauDeRemiseDeCheque entity) {
        if ( entity == null ) {
            return null;
        }

        BordereauDeRemiseDeChequeDTO bordereauDeRemiseDeChequeDTO = new BordereauDeRemiseDeChequeDTO();

        bordereauDeRemiseDeChequeDTO.setDateImpression( dateImpressionToString( entity.getDateImpression() ) );
        bordereauDeRemiseDeChequeDTO.setEtatBordereauCheques( etatBordereauChequesToString( entity.getEtatBordereauCheques() ) );
        bordereauDeRemiseDeChequeDTO.setId( entity.getId() );
        bordereauDeRemiseDeChequeDTO.setNom( entity.getNom() );
        bordereauDeRemiseDeChequeDTO.setNumeroRemise( entity.getNumeroRemise() );

        return bordereauDeRemiseDeChequeDTO;
    }

    @Override
    public BordereauDeRemiseDeCheque toEntity(BordereauDeRemiseDeChequeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        BordereauDeRemiseDeCheque bordereauDeRemiseDeCheque = new BordereauDeRemiseDeCheque();

        bordereauDeRemiseDeCheque.setId( dto.getId() );
        if ( dto.getDateImpression() != null ) {
            bordereauDeRemiseDeCheque.setDateImpression( Instant.parse( dto.getDateImpression() ) );
        }
        if ( dto.getEtatBordereauCheques() != null ) {
            bordereauDeRemiseDeCheque.setEtatBordereauCheques( Enum.valueOf( EtatBordereauCheques.class, dto.getEtatBordereauCheques() ) );
        }
        bordereauDeRemiseDeCheque.setNom( dto.getNom() );
        bordereauDeRemiseDeCheque.setNumeroRemise( dto.getNumeroRemise() );

        return bordereauDeRemiseDeCheque;
    }
}
