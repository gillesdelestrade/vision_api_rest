package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TypeDocumentCourrierEntrantDTO;
import fr.d4immobilier.visionapirest.entities.TypeDocumentCourrierEntrant;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-17T10:51:57+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class TypeDocumentCourrierEntrantMapperImpl implements TypeDocumentCourrierEntrantMapper {

    @Override
    public List<TypeDocumentCourrierEntrantDTO> toDTOList(List<TypeDocumentCourrierEntrant> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TypeDocumentCourrierEntrantDTO> list = new ArrayList<TypeDocumentCourrierEntrantDTO>( entities.size() );
        for ( TypeDocumentCourrierEntrant typeDocumentCourrierEntrant : entities ) {
            list.add( toDTO( typeDocumentCourrierEntrant ) );
        }

        return list;
    }

    @Override
    public TypeDocumentCourrierEntrantDTO toDTO(TypeDocumentCourrierEntrant entity) {
        if ( entity == null ) {
            return null;
        }

        TypeDocumentCourrierEntrantDTO typeDocumentCourrierEntrantDTO = new TypeDocumentCourrierEntrantDTO();

        typeDocumentCourrierEntrantDTO.setId( entity.getId() );
        typeDocumentCourrierEntrantDTO.setTypeDocument( entity.getTypeDocument() );
        typeDocumentCourrierEntrantDTO.setAbrege( entity.getAbrege() );

        return typeDocumentCourrierEntrantDTO;
    }

    @Override
    public TypeDocumentCourrierEntrant toEntity(TypeDocumentCourrierEntrantDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TypeDocumentCourrierEntrant typeDocumentCourrierEntrant = new TypeDocumentCourrierEntrant();

        typeDocumentCourrierEntrant.setId( dto.getId() );
        typeDocumentCourrierEntrant.setTypeDocument( dto.getTypeDocument() );
        typeDocumentCourrierEntrant.setAbrege( dto.getAbrege() );

        return typeDocumentCourrierEntrant;
    }
}
