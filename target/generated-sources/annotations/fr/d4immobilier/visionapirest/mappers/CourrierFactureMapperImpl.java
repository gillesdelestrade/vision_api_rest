package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CourrierFactureDTO;
import fr.d4immobilier.visionapirest.entities.CourrierFacture;
import fr.d4immobilier.visionapirest.entities.FactureFournisseur;
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
public class CourrierFactureMapperImpl implements CourrierFactureMapper {

    @Override
    public List<CourrierFactureDTO> toDTOList(List<CourrierFacture> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CourrierFactureDTO> list = new ArrayList<CourrierFactureDTO>( entities.size() );
        for ( CourrierFacture courrierFacture : entities ) {
            list.add( toDTO( courrierFacture ) );
        }

        return list;
    }

    @Override
    public CourrierFactureDTO toDTO(CourrierFacture entity) {
        if ( entity == null ) {
            return null;
        }

        CourrierFactureDTO courrierFactureDTO = new CourrierFactureDTO();

        courrierFactureDTO.setFactureFournisseurId( entityFactureFournisseurId( entity ) );
        courrierFactureDTO.setId( entity.getId() );

        return courrierFactureDTO;
    }

    @Override
    public CourrierFacture toEntity(CourrierFactureDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CourrierFacture courrierFacture = new CourrierFacture();

        courrierFacture.setId( dto.getId() );

        return courrierFacture;
    }

    private Long entityFactureFournisseurId(CourrierFacture courrierFacture) {
        if ( courrierFacture == null ) {
            return null;
        }
        FactureFournisseur factureFournisseur = courrierFacture.getFactureFournisseur();
        if ( factureFournisseur == null ) {
            return null;
        }
        Long id = factureFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
