package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DemandeCourrielDTO;
import fr.d4immobilier.visionapirest.entities.Courriel;
import fr.d4immobilier.visionapirest.entities.DemandeCourriel;
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
public class DemandeCourrielMapperImpl implements DemandeCourrielMapper {

    @Override
    public List<DemandeCourrielDTO> toDTOList(List<DemandeCourriel> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DemandeCourrielDTO> list = new ArrayList<DemandeCourrielDTO>( entities.size() );
        for ( DemandeCourriel demandeCourriel : entities ) {
            list.add( toDTO( demandeCourriel ) );
        }

        return list;
    }

    @Override
    public DemandeCourrielDTO toDTO(DemandeCourriel entity) {
        if ( entity == null ) {
            return null;
        }

        DemandeCourrielDTO demandeCourrielDTO = new DemandeCourrielDTO();

        demandeCourrielDTO.setCourrielId( entityCourrielId( entity ) );
        demandeCourrielDTO.setId( entity.getId() );

        return demandeCourrielDTO;
    }

    @Override
    public DemandeCourriel toEntity(DemandeCourrielDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DemandeCourriel demandeCourriel = new DemandeCourriel();

        demandeCourriel.setId( dto.getId() );

        return demandeCourriel;
    }

    private Long entityCourrielId(DemandeCourriel demandeCourriel) {
        if ( demandeCourriel == null ) {
            return null;
        }
        Courriel courriel = demandeCourriel.getCourriel();
        if ( courriel == null ) {
            return null;
        }
        Long id = courriel.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
