package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BonDeCommandeMaterielDTO;
import fr.d4immobilier.visionapirest.entities.BonDeCommandeMateriel;
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
public class BonDeCommandeMaterielMapperImpl implements BonDeCommandeMaterielMapper {

    @Override
    public List<BonDeCommandeMaterielDTO> toDTOList(List<BonDeCommandeMateriel> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BonDeCommandeMaterielDTO> list = new ArrayList<BonDeCommandeMaterielDTO>( entities.size() );
        for ( BonDeCommandeMateriel bonDeCommandeMateriel : entities ) {
            list.add( toDTO( bonDeCommandeMateriel ) );
        }

        return list;
    }

    @Override
    public BonDeCommandeMaterielDTO toDTO(BonDeCommandeMateriel entity) {
        if ( entity == null ) {
            return null;
        }

        BonDeCommandeMaterielDTO bonDeCommandeMaterielDTO = new BonDeCommandeMaterielDTO();

        bonDeCommandeMaterielDTO.setId( entity.getId() );

        return bonDeCommandeMaterielDTO;
    }

    @Override
    public BonDeCommandeMateriel toEntity(BonDeCommandeMaterielDTO dto) {
        if ( dto == null ) {
            return null;
        }

        BonDeCommandeMateriel bonDeCommandeMateriel = new BonDeCommandeMateriel();

        bonDeCommandeMateriel.setId( dto.getId() );

        return bonDeCommandeMateriel;
    }
}
