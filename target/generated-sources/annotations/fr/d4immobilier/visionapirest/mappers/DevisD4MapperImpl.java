package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DevisD4DTO;
import fr.d4immobilier.visionapirest.entities.DevisD4;
import fr.d4immobilier.visionapirest.entities.StatutDevis;
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
public class DevisD4MapperImpl implements DevisD4Mapper {

    @Override
    public List<DevisD4DTO> toDTOList(List<DevisD4> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DevisD4DTO> list = new ArrayList<DevisD4DTO>( entities.size() );
        for ( DevisD4 devisD4 : entities ) {
            list.add( toDTO( devisD4 ) );
        }

        return list;
    }

    @Override
    public DevisD4DTO toDTO(DevisD4 entity) {
        if ( entity == null ) {
            return null;
        }

        DevisD4DTO devisD4DTO = new DevisD4DTO();

        devisD4DTO.setStatutDevis( statutDevisToString( entity.getStatutDevis() ) );
        devisD4DTO.setId( entity.getId() );

        return devisD4DTO;
    }

    @Override
    public DevisD4 toEntity(DevisD4DTO dto) {
        if ( dto == null ) {
            return null;
        }

        DevisD4 devisD4 = new DevisD4();

        devisD4.setId( dto.getId() );
        if ( dto.getStatutDevis() != null ) {
            devisD4.setStatutDevis( Enum.valueOf( StatutDevis.class, dto.getStatutDevis() ) );
        }

        return devisD4;
    }
}
