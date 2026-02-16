package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CourrierDeclarationSinistreDTO;
import fr.d4immobilier.visionapirest.entities.CourrierDeclarationSinistre;
import fr.d4immobilier.visionapirest.entities.Sinistre;
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
public class CourrierDeclarationSinistreMapperImpl implements CourrierDeclarationSinistreMapper {

    @Override
    public List<CourrierDeclarationSinistreDTO> toDTOList(List<CourrierDeclarationSinistre> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CourrierDeclarationSinistreDTO> list = new ArrayList<CourrierDeclarationSinistreDTO>( entities.size() );
        for ( CourrierDeclarationSinistre courrierDeclarationSinistre : entities ) {
            list.add( toDTO( courrierDeclarationSinistre ) );
        }

        return list;
    }

    @Override
    public CourrierDeclarationSinistreDTO toDTO(CourrierDeclarationSinistre entity) {
        if ( entity == null ) {
            return null;
        }

        CourrierDeclarationSinistreDTO courrierDeclarationSinistreDTO = new CourrierDeclarationSinistreDTO();

        courrierDeclarationSinistreDTO.setSinistreId( entitySinistreId( entity ) );
        courrierDeclarationSinistreDTO.setId( entity.getId() );

        return courrierDeclarationSinistreDTO;
    }

    @Override
    public CourrierDeclarationSinistre toEntity(CourrierDeclarationSinistreDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CourrierDeclarationSinistre courrierDeclarationSinistre = new CourrierDeclarationSinistre();

        courrierDeclarationSinistre.setId( dto.getId() );

        return courrierDeclarationSinistre;
    }

    private Long entitySinistreId(CourrierDeclarationSinistre courrierDeclarationSinistre) {
        if ( courrierDeclarationSinistre == null ) {
            return null;
        }
        Sinistre sinistre = courrierDeclarationSinistre.getSinistre();
        if ( sinistre == null ) {
            return null;
        }
        Long id = sinistre.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
