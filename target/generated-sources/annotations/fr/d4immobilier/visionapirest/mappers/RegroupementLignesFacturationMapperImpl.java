package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.RegroupementLignesFacturationDTO;
import fr.d4immobilier.visionapirest.entities.Courrier;
import fr.d4immobilier.visionapirest.entities.FactureD4;
import fr.d4immobilier.visionapirest.entities.RegroupementLignesFacturation;
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
public class RegroupementLignesFacturationMapperImpl implements RegroupementLignesFacturationMapper {

    @Override
    public List<RegroupementLignesFacturationDTO> toDTOList(List<RegroupementLignesFacturation> entities) {
        if ( entities == null ) {
            return null;
        }

        List<RegroupementLignesFacturationDTO> list = new ArrayList<RegroupementLignesFacturationDTO>( entities.size() );
        for ( RegroupementLignesFacturation regroupementLignesFacturation : entities ) {
            list.add( toDTO( regroupementLignesFacturation ) );
        }

        return list;
    }

    @Override
    public RegroupementLignesFacturationDTO toDTO(RegroupementLignesFacturation entity) {
        if ( entity == null ) {
            return null;
        }

        RegroupementLignesFacturationDTO regroupementLignesFacturationDTO = new RegroupementLignesFacturationDTO();

        regroupementLignesFacturationDTO.setCourrierId( entityCourrierId( entity ) );
        regroupementLignesFacturationDTO.setFactureD4Id( entityFactureD4Id( entity ) );
        regroupementLignesFacturationDTO.setId( entity.getId() );
        regroupementLignesFacturationDTO.setIntitule( entity.getIntitule() );

        return regroupementLignesFacturationDTO;
    }

    @Override
    public RegroupementLignesFacturation toEntity(RegroupementLignesFacturationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        RegroupementLignesFacturation regroupementLignesFacturation = new RegroupementLignesFacturation();

        regroupementLignesFacturation.setId( dto.getId() );
        regroupementLignesFacturation.setIntitule( dto.getIntitule() );

        return regroupementLignesFacturation;
    }

    private Long entityCourrierId(RegroupementLignesFacturation regroupementLignesFacturation) {
        if ( regroupementLignesFacturation == null ) {
            return null;
        }
        Courrier courrier = regroupementLignesFacturation.getCourrier();
        if ( courrier == null ) {
            return null;
        }
        Long id = courrier.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFactureD4Id(RegroupementLignesFacturation regroupementLignesFacturation) {
        if ( regroupementLignesFacturation == null ) {
            return null;
        }
        FactureD4 factureD4 = regroupementLignesFacturation.getFactureD4();
        if ( factureD4 == null ) {
            return null;
        }
        Long id = factureD4.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
