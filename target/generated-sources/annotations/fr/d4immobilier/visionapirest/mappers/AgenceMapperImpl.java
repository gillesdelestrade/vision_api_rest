package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AgenceDTO;
import fr.d4immobilier.visionapirest.entities.Adresse;
import fr.d4immobilier.visionapirest.entities.Agence;
import fr.d4immobilier.visionapirest.entities.Personne;
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
public class AgenceMapperImpl implements AgenceMapper {

    @Override
    public List<AgenceDTO> toDTOList(List<Agence> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AgenceDTO> list = new ArrayList<AgenceDTO>( entities.size() );
        for ( Agence agence : entities ) {
            list.add( toDTO( agence ) );
        }

        return list;
    }

    @Override
    public AgenceDTO toDTO(Agence entity) {
        if ( entity == null ) {
            return null;
        }

        AgenceDTO agenceDTO = new AgenceDTO();

        agenceDTO.setResponsableId( entityResponsableId( entity ) );
        agenceDTO.setAdresseId( entityAdresseId( entity ) );
        agenceDTO.setId( entity.getId() );
        agenceDTO.setNom( entity.getNom() );

        return agenceDTO;
    }

    @Override
    public Agence toEntity(AgenceDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Agence agence = new Agence();

        agence.setId( dto.getId() );
        agence.setNom( dto.getNom() );

        return agence;
    }

    private Long entityResponsableId(Agence agence) {
        if ( agence == null ) {
            return null;
        }
        Personne responsable = agence.getResponsable();
        if ( responsable == null ) {
            return null;
        }
        Long id = responsable.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAdresseId(Agence agence) {
        if ( agence == null ) {
            return null;
        }
        Adresse adresse = agence.getAdresse();
        if ( adresse == null ) {
            return null;
        }
        Long id = adresse.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
