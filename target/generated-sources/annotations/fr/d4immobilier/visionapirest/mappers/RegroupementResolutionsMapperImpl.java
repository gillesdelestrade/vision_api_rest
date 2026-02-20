package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.RegroupementResolutionsDTO;
import fr.d4immobilier.visionapirest.entities.Assemblee;
import fr.d4immobilier.visionapirest.entities.Majorite;
import fr.d4immobilier.visionapirest.entities.RegroupementResolutions;
import fr.d4immobilier.visionapirest.entities.TypeTantieme;
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
public class RegroupementResolutionsMapperImpl implements RegroupementResolutionsMapper {

    @Override
    public List<RegroupementResolutionsDTO> toDTOList(List<RegroupementResolutions> entities) {
        if ( entities == null ) {
            return null;
        }

        List<RegroupementResolutionsDTO> list = new ArrayList<RegroupementResolutionsDTO>( entities.size() );
        for ( RegroupementResolutions regroupementResolutions : entities ) {
            list.add( toDTO( regroupementResolutions ) );
        }

        return list;
    }

    @Override
    public RegroupementResolutionsDTO toDTO(RegroupementResolutions entity) {
        if ( entity == null ) {
            return null;
        }

        RegroupementResolutionsDTO regroupementResolutionsDTO = new RegroupementResolutionsDTO();

        regroupementResolutionsDTO.setAssembleeId( entityAssembleeId( entity ) );
        regroupementResolutionsDTO.setTypeTantiemeId( entityTypeTantiemeId( entity ) );
        regroupementResolutionsDTO.setMajorite( majoriteToString( entity.getMajorite() ) );
        regroupementResolutionsDTO.setId( entity.getId() );
        regroupementResolutionsDTO.setNumero( entity.getNumero() );
        regroupementResolutionsDTO.setIntitule( entity.getIntitule() );
        regroupementResolutionsDTO.setDetail( entity.getDetail() );

        return regroupementResolutionsDTO;
    }

    @Override
    public RegroupementResolutions toEntity(RegroupementResolutionsDTO dto) {
        if ( dto == null ) {
            return null;
        }

        RegroupementResolutions regroupementResolutions = new RegroupementResolutions();

        regroupementResolutions.setId( dto.getId() );
        regroupementResolutions.setNumero( dto.getNumero() );
        regroupementResolutions.setIntitule( dto.getIntitule() );
        regroupementResolutions.setDetail( dto.getDetail() );
        if ( dto.getMajorite() != null ) {
            regroupementResolutions.setMajorite( Enum.valueOf( Majorite.class, dto.getMajorite() ) );
        }

        return regroupementResolutions;
    }

    private Long entityAssembleeId(RegroupementResolutions regroupementResolutions) {
        if ( regroupementResolutions == null ) {
            return null;
        }
        Assemblee assemblee = regroupementResolutions.getAssemblee();
        if ( assemblee == null ) {
            return null;
        }
        Long id = assemblee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityTypeTantiemeId(RegroupementResolutions regroupementResolutions) {
        if ( regroupementResolutions == null ) {
            return null;
        }
        TypeTantieme typeTantieme = regroupementResolutions.getTypeTantieme();
        if ( typeTantieme == null ) {
            return null;
        }
        Long id = typeTantieme.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
