package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.LocataireDTO;
import fr.d4immobilier.visionapirest.entities.Locataire;
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
public class LocataireMapperImpl implements LocataireMapper {

    @Override
    public List<LocataireDTO> toDTOList(List<Locataire> entities) {
        if ( entities == null ) {
            return null;
        }

        List<LocataireDTO> list = new ArrayList<LocataireDTO>( entities.size() );
        for ( Locataire locataire : entities ) {
            list.add( toDTO( locataire ) );
        }

        return list;
    }

    @Override
    public LocataireDTO toDTO(Locataire entity) {
        if ( entity == null ) {
            return null;
        }

        LocataireDTO locataireDTO = new LocataireDTO();

        locataireDTO.setId( entity.getId() );

        return locataireDTO;
    }

    @Override
    public Locataire toEntity(LocataireDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Locataire locataire = new Locataire();

        locataire.setId( dto.getId() );

        return locataire;
    }
}
