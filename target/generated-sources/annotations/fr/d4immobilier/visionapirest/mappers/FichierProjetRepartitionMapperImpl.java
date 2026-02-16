package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierProjetRepartitionDTO;
import fr.d4immobilier.visionapirest.entities.Assemblee;
import fr.d4immobilier.visionapirest.entities.FichierProjetRepartition;
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
public class FichierProjetRepartitionMapperImpl implements FichierProjetRepartitionMapper {

    @Override
    public List<FichierProjetRepartitionDTO> toDTOList(List<FichierProjetRepartition> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierProjetRepartitionDTO> list = new ArrayList<FichierProjetRepartitionDTO>( entities.size() );
        for ( FichierProjetRepartition fichierProjetRepartition : entities ) {
            list.add( toDTO( fichierProjetRepartition ) );
        }

        return list;
    }

    @Override
    public FichierProjetRepartitionDTO toDTO(FichierProjetRepartition entity) {
        if ( entity == null ) {
            return null;
        }

        FichierProjetRepartitionDTO fichierProjetRepartitionDTO = new FichierProjetRepartitionDTO();

        fichierProjetRepartitionDTO.setAssembleeId( entityAssembleeId( entity ) );
        fichierProjetRepartitionDTO.setId( entity.getId() );

        return fichierProjetRepartitionDTO;
    }

    @Override
    public FichierProjetRepartition toEntity(FichierProjetRepartitionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierProjetRepartition fichierProjetRepartition = new FichierProjetRepartition();

        fichierProjetRepartition.setId( dto.getId() );

        return fichierProjetRepartition;
    }

    private Long entityAssembleeId(FichierProjetRepartition fichierProjetRepartition) {
        if ( fichierProjetRepartition == null ) {
            return null;
        }
        Assemblee assemblee = fichierProjetRepartition.getAssemblee();
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
