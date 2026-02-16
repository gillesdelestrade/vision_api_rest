package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AffectationEtiquetteDTO;
import fr.d4immobilier.visionapirest.entities.AffectationEtiquette;
import fr.d4immobilier.visionapirest.entities.Etiquette;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T17:26:49+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class AffectationEtiquetteMapperImpl implements AffectationEtiquetteMapper {

    @Override
    public List<AffectationEtiquetteDTO> toDTOList(List<AffectationEtiquette> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AffectationEtiquetteDTO> list = new ArrayList<AffectationEtiquetteDTO>( entities.size() );
        for ( AffectationEtiquette affectationEtiquette : entities ) {
            list.add( toDTO( affectationEtiquette ) );
        }

        return list;
    }

    @Override
    public AffectationEtiquetteDTO toDTO(AffectationEtiquette entity) {
        if ( entity == null ) {
            return null;
        }

        AffectationEtiquetteDTO affectationEtiquetteDTO = new AffectationEtiquetteDTO();

        affectationEtiquetteDTO.setEtiquetteId( entityEtiquetteId( entity ) );
        affectationEtiquetteDTO.setId( entity.getId() );
        affectationEtiquetteDTO.setIdObjet( entity.getIdObjet() );
        affectationEtiquetteDTO.setClasseObjet( entity.getClasseObjet() );

        return affectationEtiquetteDTO;
    }

    @Override
    public AffectationEtiquette toEntity(AffectationEtiquetteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AffectationEtiquette affectationEtiquette = new AffectationEtiquette();

        affectationEtiquette.setId( dto.getId() );
        affectationEtiquette.setIdObjet( dto.getIdObjet() );
        affectationEtiquette.setClasseObjet( dto.getClasseObjet() );

        return affectationEtiquette;
    }

    private Long entityEtiquetteId(AffectationEtiquette affectationEtiquette) {
        if ( affectationEtiquette == null ) {
            return null;
        }
        Etiquette etiquette = affectationEtiquette.getEtiquette();
        if ( etiquette == null ) {
            return null;
        }
        Long id = etiquette.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
