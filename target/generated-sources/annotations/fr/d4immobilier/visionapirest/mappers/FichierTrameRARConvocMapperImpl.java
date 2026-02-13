package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierTrameRARConvocDTO;
import fr.d4immobilier.visionapirest.entities.Assemblee;
import fr.d4immobilier.visionapirest.entities.FichierTrameRARConvoc;
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
public class FichierTrameRARConvocMapperImpl implements FichierTrameRARConvocMapper {

    @Override
    public List<FichierTrameRARConvocDTO> toDTOList(List<FichierTrameRARConvoc> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierTrameRARConvocDTO> list = new ArrayList<FichierTrameRARConvocDTO>( entities.size() );
        for ( FichierTrameRARConvoc fichierTrameRARConvoc : entities ) {
            list.add( toDTO( fichierTrameRARConvoc ) );
        }

        return list;
    }

    @Override
    public FichierTrameRARConvocDTO toDTO(FichierTrameRARConvoc entity) {
        if ( entity == null ) {
            return null;
        }

        FichierTrameRARConvocDTO fichierTrameRARConvocDTO = new FichierTrameRARConvocDTO();

        fichierTrameRARConvocDTO.setAssembleeId( entityAssembleeId( entity ) );
        fichierTrameRARConvocDTO.setId( entity.getId() );

        return fichierTrameRARConvocDTO;
    }

    @Override
    public FichierTrameRARConvoc toEntity(FichierTrameRARConvocDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierTrameRARConvoc fichierTrameRARConvoc = new FichierTrameRARConvoc();

        fichierTrameRARConvoc.setId( dto.getId() );

        return fichierTrameRARConvoc;
    }

    private Long entityAssembleeId(FichierTrameRARConvoc fichierTrameRARConvoc) {
        if ( fichierTrameRARConvoc == null ) {
            return null;
        }
        Assemblee assemblee = fichierTrameRARConvoc.getAssemblee();
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
