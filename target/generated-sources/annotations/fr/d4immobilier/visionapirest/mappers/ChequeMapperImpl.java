package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ChequeDTO;
import fr.d4immobilier.visionapirest.entities.Banque;
import fr.d4immobilier.visionapirest.entities.BordereauDeRemiseDeCheque;
import fr.d4immobilier.visionapirest.entities.Cheque;
import fr.d4immobilier.visionapirest.entities.Copropriete;
import fr.d4immobilier.visionapirest.entities.Personne;
import fr.d4immobilier.visionapirest.entities.Societe;
import fr.d4immobilier.visionapirest.entities.TireurCheque;
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
public class ChequeMapperImpl implements ChequeMapper {

    @Override
    public List<ChequeDTO> toDTOList(List<Cheque> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ChequeDTO> list = new ArrayList<ChequeDTO>( entities.size() );
        for ( Cheque cheque : entities ) {
            list.add( toDTO( cheque ) );
        }

        return list;
    }

    @Override
    public ChequeDTO toDTO(Cheque entity) {
        if ( entity == null ) {
            return null;
        }

        ChequeDTO chequeDTO = new ChequeDTO();

        chequeDTO.setBanqueId( entityBanqueId( entity ) );
        chequeDTO.setEmetteurPersonneId( entityEmetteurPersonneId( entity ) );
        chequeDTO.setEmetteurSocieteId( entityEmetteurSocieteId( entity ) );
        chequeDTO.setBordereauDeRemiseDeChequeId( entityBordereauDeRemiseDeChequeId( entity ) );
        chequeDTO.setEmetteurCoproprieteId( entityEmetteurCoproprieteId( entity ) );
        chequeDTO.setTireurChequeId( entityTireurChequeId( entity ) );
        chequeDTO.setId( entity.getId() );
        chequeDTO.setNumero( entity.getNumero() );
        chequeDTO.setMontant( entity.getMontant() );
        chequeDTO.setDateEncaissementSouhaite( entity.getDateEncaissementSouhaite() );

        return chequeDTO;
    }

    @Override
    public Cheque toEntity(ChequeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Cheque cheque = new Cheque();

        cheque.setId( dto.getId() );
        cheque.setNumero( dto.getNumero() );
        cheque.setMontant( dto.getMontant() );
        cheque.setDateEncaissementSouhaite( dto.getDateEncaissementSouhaite() );

        return cheque;
    }

    private Long entityBanqueId(Cheque cheque) {
        if ( cheque == null ) {
            return null;
        }
        Banque banque = cheque.getBanque();
        if ( banque == null ) {
            return null;
        }
        Long id = banque.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityEmetteurPersonneId(Cheque cheque) {
        if ( cheque == null ) {
            return null;
        }
        Personne emetteurPersonne = cheque.getEmetteurPersonne();
        if ( emetteurPersonne == null ) {
            return null;
        }
        Long id = emetteurPersonne.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityEmetteurSocieteId(Cheque cheque) {
        if ( cheque == null ) {
            return null;
        }
        Societe emetteurSociete = cheque.getEmetteurSociete();
        if ( emetteurSociete == null ) {
            return null;
        }
        Long id = emetteurSociete.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityBordereauDeRemiseDeChequeId(Cheque cheque) {
        if ( cheque == null ) {
            return null;
        }
        BordereauDeRemiseDeCheque bordereauDeRemiseDeCheque = cheque.getBordereauDeRemiseDeCheque();
        if ( bordereauDeRemiseDeCheque == null ) {
            return null;
        }
        Long id = bordereauDeRemiseDeCheque.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityEmetteurCoproprieteId(Cheque cheque) {
        if ( cheque == null ) {
            return null;
        }
        Copropriete emetteurCopropriete = cheque.getEmetteurCopropriete();
        if ( emetteurCopropriete == null ) {
            return null;
        }
        Long id = emetteurCopropriete.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityTireurChequeId(Cheque cheque) {
        if ( cheque == null ) {
            return null;
        }
        TireurCheque tireurCheque = cheque.getTireurCheque();
        if ( tireurCheque == null ) {
            return null;
        }
        Long id = tireurCheque.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
