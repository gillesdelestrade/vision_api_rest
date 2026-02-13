package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PreuveDeDepotALaPosteDTO;
import fr.d4immobilier.visionapirest.entities.PreuveDeDepotALaPoste;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-13T14:09:30+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class PreuveDeDepotALaPosteMapperImpl implements PreuveDeDepotALaPosteMapper {

    @Override
    public List<PreuveDeDepotALaPosteDTO> toDTOList(List<PreuveDeDepotALaPoste> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PreuveDeDepotALaPosteDTO> list = new ArrayList<PreuveDeDepotALaPosteDTO>( entities.size() );
        for ( PreuveDeDepotALaPoste preuveDeDepotALaPoste : entities ) {
            list.add( toDTO( preuveDeDepotALaPoste ) );
        }

        return list;
    }

    @Override
    public PreuveDeDepotALaPosteDTO toDTO(PreuveDeDepotALaPoste entity) {
        if ( entity == null ) {
            return null;
        }

        PreuveDeDepotALaPosteDTO preuveDeDepotALaPosteDTO = new PreuveDeDepotALaPosteDTO();

        preuveDeDepotALaPosteDTO.setId( entity.getId() );
        preuveDeDepotALaPosteDTO.setDateDepot( entity.getDateDepot() );

        return preuveDeDepotALaPosteDTO;
    }

    @Override
    public PreuveDeDepotALaPoste toEntity(PreuveDeDepotALaPosteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PreuveDeDepotALaPoste preuveDeDepotALaPoste = new PreuveDeDepotALaPoste();

        preuveDeDepotALaPoste.setId( dto.getId() );
        preuveDeDepotALaPoste.setDateDepot( dto.getDateDepot() );

        return preuveDeDepotALaPoste;
    }
}
