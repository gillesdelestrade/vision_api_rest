package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CompteEnBanquePersonneDTO;
import fr.d4immobilier.visionapirest.entities.CompteEnBanquePersonne;
import fr.d4immobilier.visionapirest.entities.Personne;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-20T08:40:20+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class CompteEnBanquePersonneMapperImpl implements CompteEnBanquePersonneMapper {

    @Override
    public List<CompteEnBanquePersonneDTO> toDTOList(List<CompteEnBanquePersonne> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CompteEnBanquePersonneDTO> list = new ArrayList<CompteEnBanquePersonneDTO>( entities.size() );
        for ( CompteEnBanquePersonne compteEnBanquePersonne : entities ) {
            list.add( toDTO( compteEnBanquePersonne ) );
        }

        return list;
    }

    @Override
    public CompteEnBanquePersonneDTO toDTO(CompteEnBanquePersonne entity) {
        if ( entity == null ) {
            return null;
        }

        CompteEnBanquePersonneDTO compteEnBanquePersonneDTO = new CompteEnBanquePersonneDTO();

        compteEnBanquePersonneDTO.setPersonneId( entityPersonneId( entity ) );
        compteEnBanquePersonneDTO.setId( entity.getId() );

        return compteEnBanquePersonneDTO;
    }

    @Override
    public CompteEnBanquePersonne toEntity(CompteEnBanquePersonneDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CompteEnBanquePersonne compteEnBanquePersonne = new CompteEnBanquePersonne();

        compteEnBanquePersonne.setId( dto.getId() );

        return compteEnBanquePersonne;
    }

    private Long entityPersonneId(CompteEnBanquePersonne compteEnBanquePersonne) {
        if ( compteEnBanquePersonne == null ) {
            return null;
        }
        Personne personne = compteEnBanquePersonne.getPersonne();
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
