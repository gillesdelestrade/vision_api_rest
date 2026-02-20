package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.RegroupementResolutionTypeDTO;
import fr.d4immobilier.visionapirest.entities.RegroupementResolutionType;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-20T08:40:21+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class RegroupementResolutionTypeMapperImpl implements RegroupementResolutionTypeMapper {

    @Override
    public List<RegroupementResolutionTypeDTO> toDTOList(List<RegroupementResolutionType> entities) {
        if ( entities == null ) {
            return null;
        }

        List<RegroupementResolutionTypeDTO> list = new ArrayList<RegroupementResolutionTypeDTO>( entities.size() );
        for ( RegroupementResolutionType regroupementResolutionType : entities ) {
            list.add( toDTO( regroupementResolutionType ) );
        }

        return list;
    }

    @Override
    public RegroupementResolutionTypeDTO toDTO(RegroupementResolutionType entity) {
        if ( entity == null ) {
            return null;
        }

        RegroupementResolutionTypeDTO regroupementResolutionTypeDTO = new RegroupementResolutionTypeDTO();

        regroupementResolutionTypeDTO.setId( entity.getId() );
        regroupementResolutionTypeDTO.setNumero( entity.getNumero() );
        regroupementResolutionTypeDTO.setIntitule( entity.getIntitule() );
        regroupementResolutionTypeDTO.setDetail( entity.getDetail() );

        return regroupementResolutionTypeDTO;
    }

    @Override
    public RegroupementResolutionType toEntity(RegroupementResolutionTypeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        RegroupementResolutionType regroupementResolutionType = new RegroupementResolutionType();

        regroupementResolutionType.setId( dto.getId() );
        regroupementResolutionType.setNumero( dto.getNumero() );
        regroupementResolutionType.setIntitule( dto.getIntitule() );
        regroupementResolutionType.setDetail( dto.getDetail() );

        return regroupementResolutionType;
    }
}
