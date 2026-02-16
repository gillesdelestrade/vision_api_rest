package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CompteEnBanqueCoproprieteDTO;
import fr.d4immobilier.visionapirest.entities.CompteEnBanqueCopropriete;
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
public class CompteEnBanqueCoproprieteMapperImpl implements CompteEnBanqueCoproprieteMapper {

    @Override
    public List<CompteEnBanqueCoproprieteDTO> toDTOList(List<CompteEnBanqueCopropriete> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CompteEnBanqueCoproprieteDTO> list = new ArrayList<CompteEnBanqueCoproprieteDTO>( entities.size() );
        for ( CompteEnBanqueCopropriete compteEnBanqueCopropriete : entities ) {
            list.add( toDTO( compteEnBanqueCopropriete ) );
        }

        return list;
    }

    @Override
    public CompteEnBanqueCoproprieteDTO toDTO(CompteEnBanqueCopropriete entity) {
        if ( entity == null ) {
            return null;
        }

        CompteEnBanqueCoproprieteDTO compteEnBanqueCoproprieteDTO = new CompteEnBanqueCoproprieteDTO();

        compteEnBanqueCoproprieteDTO.setId( entity.getId() );

        return compteEnBanqueCoproprieteDTO;
    }

    @Override
    public CompteEnBanqueCopropriete toEntity(CompteEnBanqueCoproprieteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CompteEnBanqueCopropriete compteEnBanqueCopropriete = new CompteEnBanqueCopropriete();

        compteEnBanqueCopropriete.setId( dto.getId() );

        return compteEnBanqueCopropriete;
    }
}
