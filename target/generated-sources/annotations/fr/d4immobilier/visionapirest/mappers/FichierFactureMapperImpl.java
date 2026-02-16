package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierFactureDTO;
import fr.d4immobilier.visionapirest.entities.FactureFournisseur;
import fr.d4immobilier.visionapirest.entities.FichierFacture;
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
public class FichierFactureMapperImpl implements FichierFactureMapper {

    @Override
    public List<FichierFactureDTO> toDTOList(List<FichierFacture> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierFactureDTO> list = new ArrayList<FichierFactureDTO>( entities.size() );
        for ( FichierFacture fichierFacture : entities ) {
            list.add( toDTO( fichierFacture ) );
        }

        return list;
    }

    @Override
    public FichierFactureDTO toDTO(FichierFacture entity) {
        if ( entity == null ) {
            return null;
        }

        FichierFactureDTO fichierFactureDTO = new FichierFactureDTO();

        fichierFactureDTO.setFactureFournisseurId( entityFactureFournisseurId( entity ) );
        fichierFactureDTO.setId( entity.getId() );

        return fichierFactureDTO;
    }

    @Override
    public FichierFacture toEntity(FichierFactureDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierFacture fichierFacture = new FichierFacture();

        fichierFacture.setId( dto.getId() );

        return fichierFacture;
    }

    private Long entityFactureFournisseurId(FichierFacture fichierFacture) {
        if ( fichierFacture == null ) {
            return null;
        }
        FactureFournisseur factureFournisseur = fichierFacture.getFactureFournisseur();
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
