package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.SymptomeTypeEquipementDTO;
import fr.d4immobilier.visionapirest.entities.SymptomeTypeEquipement;
import fr.d4immobilier.visionapirest.entities.TypeEquipement;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-20T08:40:20+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class SymptomeTypeEquipementMapperImpl implements SymptomeTypeEquipementMapper {

    @Override
    public List<SymptomeTypeEquipementDTO> toDTOList(List<SymptomeTypeEquipement> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SymptomeTypeEquipementDTO> list = new ArrayList<SymptomeTypeEquipementDTO>( entities.size() );
        for ( SymptomeTypeEquipement symptomeTypeEquipement : entities ) {
            list.add( toDTO( symptomeTypeEquipement ) );
        }

        return list;
    }

    @Override
    public SymptomeTypeEquipementDTO toDTO(SymptomeTypeEquipement entity) {
        if ( entity == null ) {
            return null;
        }

        SymptomeTypeEquipementDTO symptomeTypeEquipementDTO = new SymptomeTypeEquipementDTO();

        symptomeTypeEquipementDTO.setTypeEquipementId( entityTypeEquipementId( entity ) );
        symptomeTypeEquipementDTO.setId( entity.getId() );
        symptomeTypeEquipementDTO.setSymptome( entity.getSymptome() );
        symptomeTypeEquipementDTO.setDirect( entity.getDirect() );

        return symptomeTypeEquipementDTO;
    }

    @Override
    public SymptomeTypeEquipement toEntity(SymptomeTypeEquipementDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SymptomeTypeEquipement symptomeTypeEquipement = new SymptomeTypeEquipement();

        symptomeTypeEquipement.setId( dto.getId() );
        symptomeTypeEquipement.setSymptome( dto.getSymptome() );
        symptomeTypeEquipement.setDirect( dto.getDirect() );

        return symptomeTypeEquipement;
    }

    private Long entityTypeEquipementId(SymptomeTypeEquipement symptomeTypeEquipement) {
        if ( symptomeTypeEquipement == null ) {
            return null;
        }
        TypeEquipement typeEquipement = symptomeTypeEquipement.getTypeEquipement();
        if ( typeEquipement == null ) {
            return null;
        }
        Long id = typeEquipement.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
