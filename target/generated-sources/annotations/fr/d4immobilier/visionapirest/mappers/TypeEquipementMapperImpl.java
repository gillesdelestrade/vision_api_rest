package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TypeEquipementDTO;
import fr.d4immobilier.visionapirest.entities.TypeEquipement;
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
public class TypeEquipementMapperImpl implements TypeEquipementMapper {

    @Override
    public List<TypeEquipementDTO> toDTOList(List<TypeEquipement> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TypeEquipementDTO> list = new ArrayList<TypeEquipementDTO>( entities.size() );
        for ( TypeEquipement typeEquipement : entities ) {
            list.add( toDTO( typeEquipement ) );
        }

        return list;
    }

    @Override
    public TypeEquipementDTO toDTO(TypeEquipement entity) {
        if ( entity == null ) {
            return null;
        }

        TypeEquipementDTO typeEquipementDTO = new TypeEquipementDTO();

        typeEquipementDTO.setId( entity.getId() );
        typeEquipementDTO.setTypeEquipement( entity.getTypeEquipement() );

        return typeEquipementDTO;
    }

    @Override
    public TypeEquipement toEntity(TypeEquipementDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TypeEquipement typeEquipement = new TypeEquipement();

        typeEquipement.setId( dto.getId() );
        typeEquipement.setTypeEquipement( dto.getTypeEquipement() );

        return typeEquipement;
    }
}
