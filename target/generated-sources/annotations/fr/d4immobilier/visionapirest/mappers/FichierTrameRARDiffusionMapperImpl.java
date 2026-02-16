package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierTrameRARDiffusionDTO;
import fr.d4immobilier.visionapirest.entities.Assemblee;
import fr.d4immobilier.visionapirest.entities.FichierTrameRARDiffusion;
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
public class FichierTrameRARDiffusionMapperImpl implements FichierTrameRARDiffusionMapper {

    @Override
    public List<FichierTrameRARDiffusionDTO> toDTOList(List<FichierTrameRARDiffusion> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierTrameRARDiffusionDTO> list = new ArrayList<FichierTrameRARDiffusionDTO>( entities.size() );
        for ( FichierTrameRARDiffusion fichierTrameRARDiffusion : entities ) {
            list.add( toDTO( fichierTrameRARDiffusion ) );
        }

        return list;
    }

    @Override
    public FichierTrameRARDiffusionDTO toDTO(FichierTrameRARDiffusion entity) {
        if ( entity == null ) {
            return null;
        }

        FichierTrameRARDiffusionDTO fichierTrameRARDiffusionDTO = new FichierTrameRARDiffusionDTO();

        fichierTrameRARDiffusionDTO.setAssembleeId( entityAssembleeId( entity ) );
        fichierTrameRARDiffusionDTO.setId( entity.getId() );

        return fichierTrameRARDiffusionDTO;
    }

    @Override
    public FichierTrameRARDiffusion toEntity(FichierTrameRARDiffusionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierTrameRARDiffusion fichierTrameRARDiffusion = new FichierTrameRARDiffusion();

        fichierTrameRARDiffusion.setId( dto.getId() );

        return fichierTrameRARDiffusion;
    }

    private Long entityAssembleeId(FichierTrameRARDiffusion fichierTrameRARDiffusion) {
        if ( fichierTrameRARDiffusion == null ) {
            return null;
        }
        Assemblee assemblee = fichierTrameRARDiffusion.getAssemblee();
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
