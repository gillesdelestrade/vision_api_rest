package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TypeTantiemeDTO;
import fr.d4immobilier.visionapirest.entities.TypeTantieme;
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
public class TypeTantiemeMapperImpl implements TypeTantiemeMapper {

    @Override
    public List<TypeTantiemeDTO> toDTOList(List<TypeTantieme> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TypeTantiemeDTO> list = new ArrayList<TypeTantiemeDTO>( entities.size() );
        for ( TypeTantieme typeTantieme : entities ) {
            list.add( toDTO( typeTantieme ) );
        }

        return list;
    }

    @Override
    public TypeTantiemeDTO toDTO(TypeTantieme entity) {
        if ( entity == null ) {
            return null;
        }

        TypeTantiemeDTO typeTantiemeDTO = new TypeTantiemeDTO();

        typeTantiemeDTO.setId( entity.getId() );
        typeTantiemeDTO.setType( entity.getType() );

        return typeTantiemeDTO;
    }

    @Override
    public TypeTantieme toEntity(TypeTantiemeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TypeTantieme typeTantieme = new TypeTantieme();

        typeTantieme.setId( dto.getId() );
        typeTantieme.setType( dto.getType() );

        return typeTantieme;
    }
}
