package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DesistementChequeDTO;
import fr.d4immobilier.visionapirest.entities.Banque;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.entities.Courrier;
import fr.d4immobilier.visionapirest.entities.DesistementCheque;
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
public class DesistementChequeMapperImpl implements DesistementChequeMapper {

    @Override
    public List<DesistementChequeDTO> toDTOList(List<DesistementCheque> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DesistementChequeDTO> list = new ArrayList<DesistementChequeDTO>( entities.size() );
        for ( DesistementCheque desistementCheque : entities ) {
            list.add( toDTO( desistementCheque ) );
        }

        return list;
    }

    @Override
    public DesistementChequeDTO toDTO(DesistementCheque entity) {
        if ( entity == null ) {
            return null;
        }

        DesistementChequeDTO desistementChequeDTO = new DesistementChequeDTO();

        desistementChequeDTO.setCoproprietaireId( entityCoproprietaireId( entity ) );
        desistementChequeDTO.setBanqueId( entityBanqueId( entity ) );
        desistementChequeDTO.setCourrierDesistementId( entityCourrierDesistementId( entity ) );
        desistementChequeDTO.setCourrierChequeRetrouveId( entityCourrierChequeRetrouveId( entity ) );
        desistementChequeDTO.setId( entity.getId() );
        desistementChequeDTO.setMontant( entity.getMontant() );
        desistementChequeDTO.setDateCheque( entity.getDateCheque() );
        desistementChequeDTO.setNumeroCheque( entity.getNumeroCheque() );
        desistementChequeDTO.setNomTireurCheque( entity.getNomTireurCheque() );
        desistementChequeDTO.setDateDesistement( entity.getDateDesistement() );

        return desistementChequeDTO;
    }

    @Override
    public DesistementCheque toEntity(DesistementChequeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DesistementCheque desistementCheque = new DesistementCheque();

        desistementCheque.setId( dto.getId() );
        desistementCheque.setMontant( dto.getMontant() );
        desistementCheque.setDateCheque( dto.getDateCheque() );
        desistementCheque.setNumeroCheque( dto.getNumeroCheque() );
        desistementCheque.setNomTireurCheque( dto.getNomTireurCheque() );
        desistementCheque.setDateDesistement( dto.getDateDesistement() );

        return desistementCheque;
    }

    private Long entityCoproprietaireId(DesistementCheque desistementCheque) {
        if ( desistementCheque == null ) {
            return null;
        }
        Coproprietaire coproprietaire = desistementCheque.getCoproprietaire();
        if ( coproprietaire == null ) {
            return null;
        }
        Long id = coproprietaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityBanqueId(DesistementCheque desistementCheque) {
        if ( desistementCheque == null ) {
            return null;
        }
        Banque banque = desistementCheque.getBanque();
        if ( banque == null ) {
            return null;
        }
        Long id = banque.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityCourrierDesistementId(DesistementCheque desistementCheque) {
        if ( desistementCheque == null ) {
            return null;
        }
        Courrier courrierDesistement = desistementCheque.getCourrierDesistement();
        if ( courrierDesistement == null ) {
            return null;
        }
        Long id = courrierDesistement.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityCourrierChequeRetrouveId(DesistementCheque desistementCheque) {
        if ( desistementCheque == null ) {
            return null;
        }
        Courrier courrierChequeRetrouve = desistementCheque.getCourrierChequeRetrouve();
        if ( courrierChequeRetrouve == null ) {
            return null;
        }
        Long id = courrierChequeRetrouve.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
