package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DossierDTO;
import fr.d4immobilier.visionapirest.entities.Dossier;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-12T18:34:53+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class DossierMapperImpl implements DossierMapper {

    @Override
    public List<DossierDTO> toDTOList(List<Dossier> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DossierDTO> list = new ArrayList<DossierDTO>( entities.size() );
        for ( Dossier dossier : entities ) {
            list.add( toDTO( dossier ) );
        }

        return list;
    }

    @Override
    public DossierDTO toDTO(Dossier entity) {
        if ( entity == null ) {
            return null;
        }

        DossierDTO dossierDTO = new DossierDTO();

        dossierDTO.setId( entity.getId() );
        dossierDTO.setTitre( entity.getTitre() );

        return dossierDTO;
    }

    @Override
    public Dossier toEntity(DossierDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Dossier dossier = new Dossier();

        dossier.setId( dto.getId() );
        dossier.setTitre( dto.getTitre() );

        return dossier;
    }
}
