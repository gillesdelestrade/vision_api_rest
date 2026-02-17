package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierInterventionDemandeDTO;
import fr.d4immobilier.visionapirest.entities.FichierInterventionDemande;
import fr.d4immobilier.visionapirest.entities.InterventionDemande;
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
public class FichierInterventionDemandeMapperImpl implements FichierInterventionDemandeMapper {

    @Override
    public List<FichierInterventionDemandeDTO> toDTOList(List<FichierInterventionDemande> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierInterventionDemandeDTO> list = new ArrayList<FichierInterventionDemandeDTO>( entities.size() );
        for ( FichierInterventionDemande fichierInterventionDemande : entities ) {
            list.add( toDTO( fichierInterventionDemande ) );
        }

        return list;
    }

    @Override
    public FichierInterventionDemandeDTO toDTO(FichierInterventionDemande entity) {
        if ( entity == null ) {
            return null;
        }

        FichierInterventionDemandeDTO fichierInterventionDemandeDTO = new FichierInterventionDemandeDTO();

        fichierInterventionDemandeDTO.setInterventionDemandeId( entityInterventionDemandeId( entity ) );
        fichierInterventionDemandeDTO.setId( entity.getId() );

        return fichierInterventionDemandeDTO;
    }

    @Override
    public FichierInterventionDemande toEntity(FichierInterventionDemandeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierInterventionDemande fichierInterventionDemande = new FichierInterventionDemande();

        fichierInterventionDemande.setId( dto.getId() );

        return fichierInterventionDemande;
    }

    private Long entityInterventionDemandeId(FichierInterventionDemande fichierInterventionDemande) {
        if ( fichierInterventionDemande == null ) {
            return null;
        }
        InterventionDemande interventionDemande = fichierInterventionDemande.getInterventionDemande();
        if ( interventionDemande == null ) {
            return null;
        }
        Long id = interventionDemande.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
