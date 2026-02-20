package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ProchaineEtapeDemandeDTO;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.entities.ProchaineEtapeDemande;
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
public class ProchaineEtapeDemandeMapperImpl implements ProchaineEtapeDemandeMapper {

    @Override
    public List<ProchaineEtapeDemandeDTO> toDTOList(List<ProchaineEtapeDemande> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ProchaineEtapeDemandeDTO> list = new ArrayList<ProchaineEtapeDemandeDTO>( entities.size() );
        for ( ProchaineEtapeDemande prochaineEtapeDemande : entities ) {
            list.add( toDTO( prochaineEtapeDemande ) );
        }

        return list;
    }

    @Override
    public ProchaineEtapeDemandeDTO toDTO(ProchaineEtapeDemande entity) {
        if ( entity == null ) {
            return null;
        }

        ProchaineEtapeDemandeDTO prochaineEtapeDemandeDTO = new ProchaineEtapeDemandeDTO();

        prochaineEtapeDemandeDTO.setDemandeId( entityDemandeId( entity ) );
        prochaineEtapeDemandeDTO.setId( entity.getId() );

        return prochaineEtapeDemandeDTO;
    }

    @Override
    public ProchaineEtapeDemande toEntity(ProchaineEtapeDemandeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ProchaineEtapeDemande prochaineEtapeDemande = new ProchaineEtapeDemande();

        prochaineEtapeDemande.setId( dto.getId() );

        return prochaineEtapeDemande;
    }

    private Long entityDemandeId(ProchaineEtapeDemande prochaineEtapeDemande) {
        if ( prochaineEtapeDemande == null ) {
            return null;
        }
        Demande demande = prochaineEtapeDemande.getDemande();
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
