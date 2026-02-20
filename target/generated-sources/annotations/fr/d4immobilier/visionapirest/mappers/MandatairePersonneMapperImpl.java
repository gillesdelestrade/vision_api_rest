package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MandatairePersonneDTO;
import fr.d4immobilier.visionapirest.entities.MandatairePersonne;
import fr.d4immobilier.visionapirest.entities.Personne;
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
public class MandatairePersonneMapperImpl implements MandatairePersonneMapper {

    @Override
    public List<MandatairePersonneDTO> toDTOList(List<MandatairePersonne> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MandatairePersonneDTO> list = new ArrayList<MandatairePersonneDTO>( entities.size() );
        for ( MandatairePersonne mandatairePersonne : entities ) {
            list.add( toDTO( mandatairePersonne ) );
        }

        return list;
    }

    @Override
    public MandatairePersonneDTO toDTO(MandatairePersonne entity) {
        if ( entity == null ) {
            return null;
        }

        MandatairePersonneDTO mandatairePersonneDTO = new MandatairePersonneDTO();

        mandatairePersonneDTO.setPersonneId( entityPersonneId( entity ) );
        mandatairePersonneDTO.setId( entity.getId() );

        return mandatairePersonneDTO;
    }

    @Override
    public MandatairePersonne toEntity(MandatairePersonneDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MandatairePersonne mandatairePersonne = new MandatairePersonne();

        mandatairePersonne.setId( dto.getId() );

        return mandatairePersonne;
    }

    private Long entityPersonneId(MandatairePersonne mandatairePersonne) {
        if ( mandatairePersonne == null ) {
            return null;
        }
        Personne personne = mandatairePersonne.getPersonne();
        if ( personne == null ) {
            return null;
        }
        Long id = personne.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
