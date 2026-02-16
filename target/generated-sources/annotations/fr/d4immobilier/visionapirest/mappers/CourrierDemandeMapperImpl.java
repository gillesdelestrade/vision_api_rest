package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CourrierDemandeDTO;
import fr.d4immobilier.visionapirest.entities.CourrierDemande;
import fr.d4immobilier.visionapirest.entities.Demande;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T17:26:50+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class CourrierDemandeMapperImpl implements CourrierDemandeMapper {

    @Override
    public List<CourrierDemandeDTO> toDTOList(List<CourrierDemande> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CourrierDemandeDTO> list = new ArrayList<CourrierDemandeDTO>( entities.size() );
        for ( CourrierDemande courrierDemande : entities ) {
            list.add( toDTO( courrierDemande ) );
        }

        return list;
    }

    @Override
    public CourrierDemandeDTO toDTO(CourrierDemande entity) {
        if ( entity == null ) {
            return null;
        }

        CourrierDemandeDTO courrierDemandeDTO = new CourrierDemandeDTO();

        courrierDemandeDTO.setDemandeId( entityDemandeId( entity ) );
        courrierDemandeDTO.setId( entity.getId() );

        return courrierDemandeDTO;
    }

    @Override
    public CourrierDemande toEntity(CourrierDemandeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CourrierDemande courrierDemande = new CourrierDemande();

        courrierDemande.setId( dto.getId() );

        return courrierDemande;
    }

    private Long entityDemandeId(CourrierDemande courrierDemande) {
        if ( courrierDemande == null ) {
            return null;
        }
        Demande demande = courrierDemande.getDemande();
        if ( demande == null ) {
            return null;
        }
        Long id = demande.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
