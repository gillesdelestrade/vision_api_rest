package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MandataireDTO;
import fr.d4immobilier.visionapirest.entities.Mandataire;
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
public class MandataireMapperImpl implements MandataireMapper {

    @Override
    public List<MandataireDTO> toDTOList(List<Mandataire> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MandataireDTO> list = new ArrayList<MandataireDTO>( entities.size() );
        for ( Mandataire mandataire : entities ) {
            list.add( toDTO( mandataire ) );
        }

        return list;
    }

    @Override
    public MandataireDTO toDTO(Mandataire entity) {
        if ( entity == null ) {
            return null;
        }

        MandataireDTO mandataireDTO = new MandataireDTO();

        mandataireDTO.setId( entity.getId() );

        return mandataireDTO;
    }

    @Override
    public Mandataire toEntity(MandataireDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Mandataire mandataire = new Mandataire();

        mandataire.setId( dto.getId() );

        return mandataire;
    }
}
