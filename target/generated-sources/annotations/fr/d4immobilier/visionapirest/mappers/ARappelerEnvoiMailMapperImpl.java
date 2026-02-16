package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ARappelerEnvoiMailDTO;
import fr.d4immobilier.visionapirest.entities.ARappelerEnvoiMail;
import fr.d4immobilier.visionapirest.entities.EnvoiMail;
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
public class ARappelerEnvoiMailMapperImpl implements ARappelerEnvoiMailMapper {

    @Override
    public List<ARappelerEnvoiMailDTO> toDTOList(List<ARappelerEnvoiMail> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ARappelerEnvoiMailDTO> list = new ArrayList<ARappelerEnvoiMailDTO>( entities.size() );
        for ( ARappelerEnvoiMail aRappelerEnvoiMail : entities ) {
            list.add( toDTO( aRappelerEnvoiMail ) );
        }

        return list;
    }

    @Override
    public ARappelerEnvoiMailDTO toDTO(ARappelerEnvoiMail entity) {
        if ( entity == null ) {
            return null;
        }

        ARappelerEnvoiMailDTO aRappelerEnvoiMailDTO = new ARappelerEnvoiMailDTO();

        aRappelerEnvoiMailDTO.setEnvoiMailId( entityEnvoiMailId( entity ) );
        aRappelerEnvoiMailDTO.setId( entity.getId() );

        return aRappelerEnvoiMailDTO;
    }

    @Override
    public ARappelerEnvoiMail toEntity(ARappelerEnvoiMailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ARappelerEnvoiMail aRappelerEnvoiMail = new ARappelerEnvoiMail();

        aRappelerEnvoiMail.setId( dto.getId() );

        return aRappelerEnvoiMail;
    }

    private Long entityEnvoiMailId(ARappelerEnvoiMail aRappelerEnvoiMail) {
        if ( aRappelerEnvoiMail == null ) {
            return null;
        }
        EnvoiMail envoiMail = aRappelerEnvoiMail.getEnvoiMail();
        if ( envoiMail == null ) {
            return null;
        }
        Long id = envoiMail.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
