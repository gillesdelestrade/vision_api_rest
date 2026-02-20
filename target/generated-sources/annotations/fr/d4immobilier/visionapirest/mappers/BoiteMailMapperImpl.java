package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BoiteMailDTO;
import fr.d4immobilier.visionapirest.entities.BoiteMail;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-20T08:40:21+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class BoiteMailMapperImpl implements BoiteMailMapper {

    @Override
    public List<BoiteMailDTO> toDTOList(List<BoiteMail> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BoiteMailDTO> list = new ArrayList<BoiteMailDTO>( entities.size() );
        for ( BoiteMail boiteMail : entities ) {
            list.add( toDTO( boiteMail ) );
        }

        return list;
    }

    @Override
    public BoiteMailDTO toDTO(BoiteMail entity) {
        if ( entity == null ) {
            return null;
        }

        BoiteMailDTO boiteMailDTO = new BoiteMailDTO();

        boiteMailDTO.setId( entity.getId() );
        boiteMailDTO.setNomBoite( entity.getNomBoite() );
        boiteMailDTO.setServeur( entity.getServeur() );
        boiteMailDTO.setLogin( entity.getLogin() );
        boiteMailDTO.setPassword( entity.getPassword() );

        return boiteMailDTO;
    }

    @Override
    public BoiteMail toEntity(BoiteMailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        BoiteMail boiteMail = new BoiteMail();

        boiteMail.setId( dto.getId() );
        boiteMail.setNomBoite( dto.getNomBoite() );
        boiteMail.setServeur( dto.getServeur() );
        boiteMail.setLogin( dto.getLogin() );
        boiteMail.setPassword( dto.getPassword() );

        return boiteMail;
    }
}
