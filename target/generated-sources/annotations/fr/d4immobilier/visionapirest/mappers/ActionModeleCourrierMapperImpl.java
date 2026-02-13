package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ActionModeleCourrierDTO;
import fr.d4immobilier.visionapirest.entities.ActionModeleCourrier;
import fr.d4immobilier.visionapirest.entities.ModeleCourrier;
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
public class ActionModeleCourrierMapperImpl implements ActionModeleCourrierMapper {

    @Override
    public List<ActionModeleCourrierDTO> toDTOList(List<ActionModeleCourrier> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ActionModeleCourrierDTO> list = new ArrayList<ActionModeleCourrierDTO>( entities.size() );
        for ( ActionModeleCourrier actionModeleCourrier : entities ) {
            list.add( toDTO( actionModeleCourrier ) );
        }

        return list;
    }

    @Override
    public ActionModeleCourrierDTO toDTO(ActionModeleCourrier entity) {
        if ( entity == null ) {
            return null;
        }

        ActionModeleCourrierDTO actionModeleCourrierDTO = new ActionModeleCourrierDTO();

        actionModeleCourrierDTO.setModeleCourrierId( entityModeleCourrierId( entity ) );
        actionModeleCourrierDTO.setId( entity.getId() );
        actionModeleCourrierDTO.setLibelle( entity.getLibelle() );
        actionModeleCourrierDTO.setDelaiEnJours( entity.getDelaiEnJours() );

        return actionModeleCourrierDTO;
    }

    @Override
    public ActionModeleCourrier toEntity(ActionModeleCourrierDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ActionModeleCourrier actionModeleCourrier = new ActionModeleCourrier();

        actionModeleCourrier.setId( dto.getId() );
        actionModeleCourrier.setLibelle( dto.getLibelle() );
        actionModeleCourrier.setDelaiEnJours( dto.getDelaiEnJours() );

        return actionModeleCourrier;
    }

    private Long entityModeleCourrierId(ActionModeleCourrier actionModeleCourrier) {
        if ( actionModeleCourrier == null ) {
            return null;
        }
        ModeleCourrier modeleCourrier = actionModeleCourrier.getModeleCourrier();
        if ( modeleCourrier == null ) {
            return null;
        }
        Long id = modeleCourrier.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
