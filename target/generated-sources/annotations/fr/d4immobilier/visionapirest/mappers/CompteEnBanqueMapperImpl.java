package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CompteEnBanqueDTO;
import fr.d4immobilier.visionapirest.entities.Banque;
import fr.d4immobilier.visionapirest.entities.CompteEnBanque;
import fr.d4immobilier.visionapirest.entities.Iban;
import fr.d4immobilier.visionapirest.entities.Rib;
import fr.d4immobilier.visionapirest.entities.TypeCompteEnBanque;
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
public class CompteEnBanqueMapperImpl implements CompteEnBanqueMapper {

    @Override
    public List<CompteEnBanqueDTO> toDTOList(List<CompteEnBanque> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CompteEnBanqueDTO> list = new ArrayList<CompteEnBanqueDTO>( entities.size() );
        for ( CompteEnBanque compteEnBanque : entities ) {
            list.add( toDTO( compteEnBanque ) );
        }

        return list;
    }

    @Override
    public CompteEnBanqueDTO toDTO(CompteEnBanque entity) {
        if ( entity == null ) {
            return null;
        }

        CompteEnBanqueDTO compteEnBanqueDTO = new CompteEnBanqueDTO();

        compteEnBanqueDTO.setBanqueId( entityBanqueId( entity ) );
        compteEnBanqueDTO.setRibId( entityRibId( entity ) );
        compteEnBanqueDTO.setIbanId( entityIbanId( entity ) );
        compteEnBanqueDTO.setTypeCompteEnBanque( typeCompteEnBanqueToString( entity.getTypeCompteEnBanque() ) );
        compteEnBanqueDTO.setId( entity.getId() );
        compteEnBanqueDTO.setIntituleCompte( entity.getIntituleCompte() );
        compteEnBanqueDTO.setBic( entity.getBic() );

        return compteEnBanqueDTO;
    }

    @Override
    public CompteEnBanque toEntity(CompteEnBanqueDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CompteEnBanque compteEnBanque = new CompteEnBanque();

        compteEnBanque.setId( dto.getId() );
        compteEnBanque.setIntituleCompte( dto.getIntituleCompte() );
        compteEnBanque.setBic( dto.getBic() );
        if ( dto.getTypeCompteEnBanque() != null ) {
            compteEnBanque.setTypeCompteEnBanque( Enum.valueOf( TypeCompteEnBanque.class, dto.getTypeCompteEnBanque() ) );
        }

        return compteEnBanque;
    }

    private Long entityBanqueId(CompteEnBanque compteEnBanque) {
        if ( compteEnBanque == null ) {
            return null;
        }
        Banque banque = compteEnBanque.getBanque();
        if ( banque == null ) {
            return null;
        }
        Long id = banque.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityRibId(CompteEnBanque compteEnBanque) {
        if ( compteEnBanque == null ) {
            return null;
        }
        Rib rib = compteEnBanque.getRib();
        if ( rib == null ) {
            return null;
        }
        Long id = rib.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityIbanId(CompteEnBanque compteEnBanque) {
        if ( compteEnBanque == null ) {
            return null;
        }
        Iban iban = compteEnBanque.getIban();
        if ( iban == null ) {
            return null;
        }
        Long id = iban.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
