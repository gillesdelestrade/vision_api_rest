package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ResolutionTypeDTO;
import fr.d4immobilier.visionapirest.entities.Majorite;
import fr.d4immobilier.visionapirest.entities.ResolutionType;
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
public class ResolutionTypeMapperImpl implements ResolutionTypeMapper {

    @Override
    public List<ResolutionTypeDTO> toDTOList(List<ResolutionType> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ResolutionTypeDTO> list = new ArrayList<ResolutionTypeDTO>( entities.size() );
        for ( ResolutionType resolutionType : entities ) {
            list.add( toDTO( resolutionType ) );
        }

        return list;
    }

    @Override
    public ResolutionTypeDTO toDTO(ResolutionType entity) {
        if ( entity == null ) {
            return null;
        }

        ResolutionTypeDTO resolutionTypeDTO = new ResolutionTypeDTO();

        resolutionTypeDTO.setMajorite( majoriteToString( entity.getMajorite() ) );
        resolutionTypeDTO.setId( entity.getId() );
        resolutionTypeDTO.setIntitule( entity.getIntitule() );
        resolutionTypeDTO.setDetail( entity.getDetail() );
        resolutionTypeDTO.setNumero( entity.getNumero() );
        resolutionTypeDTO.setParDefaut( entity.getParDefaut() );

        return resolutionTypeDTO;
    }

    @Override
    public ResolutionType toEntity(ResolutionTypeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ResolutionType resolutionType = new ResolutionType();

        resolutionType.setId( dto.getId() );
        resolutionType.setIntitule( dto.getIntitule() );
        resolutionType.setDetail( dto.getDetail() );
        resolutionType.setNumero( dto.getNumero() );
        if ( dto.getMajorite() != null ) {
            resolutionType.setMajorite( Enum.valueOf( Majorite.class, dto.getMajorite() ) );
        }
        resolutionType.setParDefaut( dto.getParDefaut() );

        return resolutionType;
    }
}
