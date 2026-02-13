package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MandataireSocieteDTO;
import fr.d4immobilier.visionapirest.entities.MandataireSociete;
import fr.d4immobilier.visionapirest.entities.Societe;
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
public class MandataireSocieteMapperImpl implements MandataireSocieteMapper {

    @Override
    public List<MandataireSocieteDTO> toDTOList(List<MandataireSociete> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MandataireSocieteDTO> list = new ArrayList<MandataireSocieteDTO>( entities.size() );
        for ( MandataireSociete mandataireSociete : entities ) {
            list.add( toDTO( mandataireSociete ) );
        }

        return list;
    }

    @Override
    public MandataireSocieteDTO toDTO(MandataireSociete entity) {
        if ( entity == null ) {
            return null;
        }

        MandataireSocieteDTO mandataireSocieteDTO = new MandataireSocieteDTO();

        mandataireSocieteDTO.setSocieteId( entitySocieteId( entity ) );
        mandataireSocieteDTO.setId( entity.getId() );

        return mandataireSocieteDTO;
    }

    @Override
    public MandataireSociete toEntity(MandataireSocieteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MandataireSociete mandataireSociete = new MandataireSociete();

        mandataireSociete.setId( dto.getId() );

        return mandataireSociete;
    }

    private Long entitySocieteId(MandataireSociete mandataireSociete) {
        if ( mandataireSociete == null ) {
            return null;
        }
        Societe societe = mandataireSociete.getSociete();
        if ( societe == null ) {
            return null;
        }
        Long id = societe.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
