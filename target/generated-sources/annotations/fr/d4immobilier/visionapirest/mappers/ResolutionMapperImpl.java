package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ResolutionDTO;
import fr.d4immobilier.visionapirest.entities.Assemblee;
import fr.d4immobilier.visionapirest.entities.Majorite;
import fr.d4immobilier.visionapirest.entities.RegroupementResolutions;
import fr.d4immobilier.visionapirest.entities.Resolution;
import fr.d4immobilier.visionapirest.entities.TypeTantieme;
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
public class ResolutionMapperImpl implements ResolutionMapper {

    @Override
    public List<ResolutionDTO> toDTOList(List<Resolution> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ResolutionDTO> list = new ArrayList<ResolutionDTO>( entities.size() );
        for ( Resolution resolution : entities ) {
            list.add( toDTO( resolution ) );
        }

        return list;
    }

    @Override
    public ResolutionDTO toDTO(Resolution entity) {
        if ( entity == null ) {
            return null;
        }

        ResolutionDTO resolutionDTO = new ResolutionDTO();

        resolutionDTO.setRegroupementResolutionsId( entityRegroupementResolutionsId( entity ) );
        resolutionDTO.setTypeTantiemeId( entityTypeTantiemeId( entity ) );
        resolutionDTO.setAssembleeId( entityAssembleeId( entity ) );
        resolutionDTO.setMajoriteRequise( majoriteRequiseToString( entity.getMajoriteRequise() ) );
        resolutionDTO.setId( entity.getId() );
        resolutionDTO.setIntitule( entity.getIntitule() );
        resolutionDTO.setNumero( entity.getNumero() );
        resolutionDTO.setDetail( entity.getDetail() );
        resolutionDTO.setNumeroNiveau2( entity.getNumeroNiveau2() );
        resolutionDTO.setNumeroNiveau3( entity.getNumeroNiveau3() );
        resolutionDTO.setDetailModifie( entity.getDetailModifie() );
        resolutionDTO.setPhraseConclusion( entity.getPhraseConclusion() );

        return resolutionDTO;
    }

    @Override
    public Resolution toEntity(ResolutionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Resolution resolution = new Resolution();

        resolution.setId( dto.getId() );
        resolution.setIntitule( dto.getIntitule() );
        if ( dto.getMajoriteRequise() != null ) {
            resolution.setMajoriteRequise( Enum.valueOf( Majorite.class, dto.getMajoriteRequise() ) );
        }
        resolution.setNumero( dto.getNumero() );
        resolution.setDetail( dto.getDetail() );
        resolution.setNumeroNiveau2( dto.getNumeroNiveau2() );
        resolution.setNumeroNiveau3( dto.getNumeroNiveau3() );
        resolution.setDetailModifie( dto.getDetailModifie() );
        resolution.setPhraseConclusion( dto.getPhraseConclusion() );

        return resolution;
    }

    private Long entityRegroupementResolutionsId(Resolution resolution) {
        if ( resolution == null ) {
            return null;
        }
        RegroupementResolutions regroupementResolutions = resolution.getRegroupementResolutions();
        if ( regroupementResolutions == null ) {
            return null;
        }
        Long id = regroupementResolutions.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityTypeTantiemeId(Resolution resolution) {
        if ( resolution == null ) {
            return null;
        }
        TypeTantieme typeTantieme = resolution.getTypeTantieme();
        if ( typeTantieme == null ) {
            return null;
        }
        Long id = typeTantieme.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAssembleeId(Resolution resolution) {
        if ( resolution == null ) {
            return null;
        }
        Assemblee assemblee = resolution.getAssemblee();
        if ( assemblee == null ) {
            return null;
        }
        Long id = assemblee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
