package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BonDeCommandeEmplacementBALInterphoneDTO;
import fr.d4immobilier.visionapirest.entities.BonDeCommandeEmplacementBALInterphone;
import fr.d4immobilier.visionapirest.entities.EmplacementPanneauBALInterphone;
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
public class BonDeCommandeEmplacementBALInterphoneMapperImpl implements BonDeCommandeEmplacementBALInterphoneMapper {

    @Override
    public List<BonDeCommandeEmplacementBALInterphoneDTO> toDTOList(List<BonDeCommandeEmplacementBALInterphone> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BonDeCommandeEmplacementBALInterphoneDTO> list = new ArrayList<BonDeCommandeEmplacementBALInterphoneDTO>( entities.size() );
        for ( BonDeCommandeEmplacementBALInterphone bonDeCommandeEmplacementBALInterphone : entities ) {
            list.add( toDTO( bonDeCommandeEmplacementBALInterphone ) );
        }

        return list;
    }

    @Override
    public BonDeCommandeEmplacementBALInterphoneDTO toDTO(BonDeCommandeEmplacementBALInterphone entity) {
        if ( entity == null ) {
            return null;
        }

        BonDeCommandeEmplacementBALInterphoneDTO bonDeCommandeEmplacementBALInterphoneDTO = new BonDeCommandeEmplacementBALInterphoneDTO();

        bonDeCommandeEmplacementBALInterphoneDTO.setEmplacementPanneauBALInterphoneId( entityEmplacementPanneauBALInterphoneId( entity ) );
        bonDeCommandeEmplacementBALInterphoneDTO.setId( entity.getId() );

        return bonDeCommandeEmplacementBALInterphoneDTO;
    }

    @Override
    public BonDeCommandeEmplacementBALInterphone toEntity(BonDeCommandeEmplacementBALInterphoneDTO dto) {
        if ( dto == null ) {
            return null;
        }

        BonDeCommandeEmplacementBALInterphone bonDeCommandeEmplacementBALInterphone = new BonDeCommandeEmplacementBALInterphone();

        bonDeCommandeEmplacementBALInterphone.setId( dto.getId() );

        return bonDeCommandeEmplacementBALInterphone;
    }

    private Long entityEmplacementPanneauBALInterphoneId(BonDeCommandeEmplacementBALInterphone bonDeCommandeEmplacementBALInterphone) {
        if ( bonDeCommandeEmplacementBALInterphone == null ) {
            return null;
        }
        EmplacementPanneauBALInterphone emplacementPanneauBALInterphone = bonDeCommandeEmplacementBALInterphone.getEmplacementPanneauBALInterphone();
        if ( emplacementPanneauBALInterphone == null ) {
            return null;
        }
        Long id = emplacementPanneauBALInterphone.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
