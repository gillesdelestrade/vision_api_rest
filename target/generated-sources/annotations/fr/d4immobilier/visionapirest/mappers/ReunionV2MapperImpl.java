package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ReunionV2DTO;
import fr.d4immobilier.visionapirest.entities.ReunionV2;
import fr.d4immobilier.visionapirest.entities.TypeReunion;
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
public class ReunionV2MapperImpl implements ReunionV2Mapper {

    @Override
    public List<ReunionV2DTO> toDTOList(List<ReunionV2> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ReunionV2DTO> list = new ArrayList<ReunionV2DTO>( entities.size() );
        for ( ReunionV2 reunionV2 : entities ) {
            list.add( toDTO( reunionV2 ) );
        }

        return list;
    }

    @Override
    public ReunionV2DTO toDTO(ReunionV2 entity) {
        if ( entity == null ) {
            return null;
        }

        ReunionV2DTO reunionV2DTO = new ReunionV2DTO();

        reunionV2DTO.setTypeReunion( typeReunionToString( entity.getTypeReunion() ) );
        reunionV2DTO.setId( entity.getId() );

        return reunionV2DTO;
    }

    @Override
    public ReunionV2 toEntity(ReunionV2DTO dto) {
        if ( dto == null ) {
            return null;
        }

        ReunionV2 reunionV2 = new ReunionV2();

        reunionV2.setId( dto.getId() );
        if ( dto.getTypeReunion() != null ) {
            reunionV2.setTypeReunion( Enum.valueOf( TypeReunion.class, dto.getTypeReunion() ) );
        }

        return reunionV2;
    }
}
