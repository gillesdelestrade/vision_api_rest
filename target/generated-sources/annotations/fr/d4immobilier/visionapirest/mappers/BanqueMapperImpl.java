package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BanqueDTO;
import fr.d4immobilier.visionapirest.entities.Banque;
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
public class BanqueMapperImpl implements BanqueMapper {

    @Override
    public List<BanqueDTO> toDTOList(List<Banque> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BanqueDTO> list = new ArrayList<BanqueDTO>( entities.size() );
        for ( Banque banque : entities ) {
            list.add( toDTO( banque ) );
        }

        return list;
    }

    @Override
    public BanqueDTO toDTO(Banque entity) {
        if ( entity == null ) {
            return null;
        }

        BanqueDTO banqueDTO = new BanqueDTO();

        banqueDTO.setId( entity.getId() );
        banqueDTO.setAgence( entity.getAgence() );
        banqueDTO.setLieu( entity.getLieu() );
        banqueDTO.setCodeCMC7( entity.getCodeCMC7() );

        return banqueDTO;
    }

    @Override
    public Banque toEntity(BanqueDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Banque banque = new Banque();

        banque.setId( dto.getId() );
        banque.setAgence( dto.getAgence() );
        banque.setLieu( dto.getLieu() );
        banque.setCodeCMC7( dto.getCodeCMC7() );

        return banque;
    }
}
