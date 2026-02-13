package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TireurChequeDTO;
import fr.d4immobilier.visionapirest.entities.TireurCheque;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-13T14:09:30+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class TireurChequeMapperImpl implements TireurChequeMapper {

    @Override
    public List<TireurChequeDTO> toDTOList(List<TireurCheque> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TireurChequeDTO> list = new ArrayList<TireurChequeDTO>( entities.size() );
        for ( TireurCheque tireurCheque : entities ) {
            list.add( toDTO( tireurCheque ) );
        }

        return list;
    }

    @Override
    public TireurChequeDTO toDTO(TireurCheque entity) {
        if ( entity == null ) {
            return null;
        }

        TireurChequeDTO tireurChequeDTO = new TireurChequeDTO();

        tireurChequeDTO.setId( entity.getId() );
        tireurChequeDTO.setNomTireurCheque( entity.getNomTireurCheque() );
        tireurChequeDTO.setNumeroBanque( entity.getNumeroBanque() );
        tireurChequeDTO.setNumeroCompte( entity.getNumeroCompte() );

        return tireurChequeDTO;
    }

    @Override
    public TireurCheque toEntity(TireurChequeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TireurCheque tireurCheque = new TireurCheque();

        tireurCheque.setId( dto.getId() );
        tireurCheque.setNomTireurCheque( dto.getNomTireurCheque() );
        tireurCheque.setNumeroBanque( dto.getNumeroBanque() );
        tireurCheque.setNumeroCompte( dto.getNumeroCompte() );

        return tireurCheque;
    }
}
