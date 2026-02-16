package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AudienceDTO;
import fr.d4immobilier.visionapirest.entities.Audience;
import fr.d4immobilier.visionapirest.entities.ComplementProcedure;
import fr.d4immobilier.visionapirest.entities.TypeAudience;
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
public class AudienceMapperImpl implements AudienceMapper {

    @Override
    public List<AudienceDTO> toDTOList(List<Audience> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AudienceDTO> list = new ArrayList<AudienceDTO>( entities.size() );
        for ( Audience audience : entities ) {
            list.add( toDTO( audience ) );
        }

        return list;
    }

    @Override
    public AudienceDTO toDTO(Audience entity) {
        if ( entity == null ) {
            return null;
        }

        AudienceDTO audienceDTO = new AudienceDTO();

        audienceDTO.setComplementProcedureId( entityComplementProcedureId( entity ) );
        audienceDTO.setTypeAudience( typeAudienceToString( entity.getTypeAudience() ) );
        audienceDTO.setId( entity.getId() );
        audienceDTO.setDateAudience( entity.getDateAudience() );
        audienceDTO.setCommentaire( entity.getCommentaire() );

        return audienceDTO;
    }

    @Override
    public Audience toEntity(AudienceDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Audience audience = new Audience();

        audience.setId( dto.getId() );
        if ( dto.getTypeAudience() != null ) {
            audience.setTypeAudience( Enum.valueOf( TypeAudience.class, dto.getTypeAudience() ) );
        }
        audience.setDateAudience( dto.getDateAudience() );
        audience.setCommentaire( dto.getCommentaire() );

        return audience;
    }

    private Long entityComplementProcedureId(Audience audience) {
        if ( audience == null ) {
            return null;
        }
        ComplementProcedure complementProcedure = audience.getComplementProcedure();
        if ( complementProcedure == null ) {
            return null;
        }
        Long id = complementProcedure.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
