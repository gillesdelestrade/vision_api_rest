package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DossierContentieuxFactureDTO;
import fr.d4immobilier.visionapirest.entities.DossierContentieuxFacture;
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
public class DossierContentieuxFactureMapperImpl implements DossierContentieuxFactureMapper {

    @Override
    public List<DossierContentieuxFactureDTO> toDTOList(List<DossierContentieuxFacture> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DossierContentieuxFactureDTO> list = new ArrayList<DossierContentieuxFactureDTO>( entities.size() );
        for ( DossierContentieuxFacture dossierContentieuxFacture : entities ) {
            list.add( toDTO( dossierContentieuxFacture ) );
        }

        return list;
    }

    @Override
    public DossierContentieuxFactureDTO toDTO(DossierContentieuxFacture entity) {
        if ( entity == null ) {
            return null;
        }

        DossierContentieuxFactureDTO dossierContentieuxFactureDTO = new DossierContentieuxFactureDTO();

        dossierContentieuxFactureDTO.setId( entity.getId() );

        return dossierContentieuxFactureDTO;
    }

    @Override
    public DossierContentieuxFacture toEntity(DossierContentieuxFactureDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DossierContentieuxFacture dossierContentieuxFacture = new DossierContentieuxFacture();

        dossierContentieuxFacture.setId( dto.getId() );

        return dossierContentieuxFacture;
    }
}
