package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierMutationDTO;
import fr.d4immobilier.visionapirest.entities.FichierMutation;
import fr.d4immobilier.visionapirest.entities.TypeFichierMutation;
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
public class FichierMutationMapperImpl implements FichierMutationMapper {

    @Override
    public List<FichierMutationDTO> toDTOList(List<FichierMutation> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierMutationDTO> list = new ArrayList<FichierMutationDTO>( entities.size() );
        for ( FichierMutation fichierMutation : entities ) {
            list.add( toDTO( fichierMutation ) );
        }

        return list;
    }

    @Override
    public FichierMutationDTO toDTO(FichierMutation entity) {
        if ( entity == null ) {
            return null;
        }

        FichierMutationDTO fichierMutationDTO = new FichierMutationDTO();

        fichierMutationDTO.setTypeFichierMutation( typeFichierMutationToString( entity.getTypeFichierMutation() ) );
        fichierMutationDTO.setId( entity.getId() );

        return fichierMutationDTO;
    }

    @Override
    public FichierMutation toEntity(FichierMutationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierMutation fichierMutation = new FichierMutation();

        fichierMutation.setId( dto.getId() );
        if ( dto.getTypeFichierMutation() != null ) {
            fichierMutation.setTypeFichierMutation( Enum.valueOf( TypeFichierMutation.class, dto.getTypeFichierMutation() ) );
        }

        return fichierMutation;
    }
}
