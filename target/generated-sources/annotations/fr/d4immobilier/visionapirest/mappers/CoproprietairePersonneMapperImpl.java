package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CoproprietairePersonneDTO;
import fr.d4immobilier.visionapirest.entities.CoproprietairePersonne;
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
public class CoproprietairePersonneMapperImpl implements CoproprietairePersonneMapper {

    @Override
    public List<CoproprietairePersonneDTO> toDTOList(List<CoproprietairePersonne> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CoproprietairePersonneDTO> list = new ArrayList<CoproprietairePersonneDTO>( entities.size() );
        for ( CoproprietairePersonne coproprietairePersonne : entities ) {
            list.add( toDTO( coproprietairePersonne ) );
        }

        return list;
    }

    @Override
    public CoproprietairePersonneDTO toDTO(CoproprietairePersonne entity) {
        if ( entity == null ) {
            return null;
        }

        CoproprietairePersonneDTO coproprietairePersonneDTO = new CoproprietairePersonneDTO();

        coproprietairePersonneDTO.setPersonneId( entityPersonneId( entity ) );
        coproprietairePersonneDTO.setId( entity.getId() );

        return coproprietairePersonneDTO;
    }

    @Override
    public CoproprietairePersonne toEntity(CoproprietairePersonneDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CoproprietairePersonne coproprietairePersonne = new CoproprietairePersonne();

        coproprietairePersonne.setId( dto.getId() );

        return coproprietairePersonne;
    }

    private Long entityPersonneId(CoproprietairePersonne coproprietairePersonne) {
        if ( coproprietairePersonne == null ) {
            return null;
        }
        Personne personne = coproprietairePersonne.getPersonne();
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
