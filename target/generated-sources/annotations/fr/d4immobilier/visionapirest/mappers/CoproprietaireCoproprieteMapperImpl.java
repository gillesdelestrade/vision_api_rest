package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CoproprietaireCoproprieteDTO;
import fr.d4immobilier.visionapirest.entities.CoproprietaireCopropriete;
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
public class CoproprietaireCoproprieteMapperImpl implements CoproprietaireCoproprieteMapper {

    @Override
    public List<CoproprietaireCoproprieteDTO> toDTOList(List<CoproprietaireCopropriete> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CoproprietaireCoproprieteDTO> list = new ArrayList<CoproprietaireCoproprieteDTO>( entities.size() );
        for ( CoproprietaireCopropriete coproprietaireCopropriete : entities ) {
            list.add( toDTO( coproprietaireCopropriete ) );
        }

        return list;
    }

    @Override
    public CoproprietaireCoproprieteDTO toDTO(CoproprietaireCopropriete entity) {
        if ( entity == null ) {
            return null;
        }

        CoproprietaireCoproprieteDTO coproprietaireCoproprieteDTO = new CoproprietaireCoproprieteDTO();

        coproprietaireCoproprieteDTO.setId( entity.getId() );

        return coproprietaireCoproprieteDTO;
    }

    @Override
    public CoproprietaireCopropriete toEntity(CoproprietaireCoproprieteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CoproprietaireCopropriete coproprietaireCopropriete = new CoproprietaireCopropriete();

        coproprietaireCopropriete.setId( dto.getId() );

        return coproprietaireCopropriete;
    }
}
