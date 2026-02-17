package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EtapeDemandeDTO;
import fr.d4immobilier.visionapirest.entities.ActionEtapeDemande;
import fr.d4immobilier.visionapirest.entities.EtapeDemande;
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
public class EtapeDemandeMapperImpl implements EtapeDemandeMapper {

    @Override
    public List<EtapeDemandeDTO> toDTOList(List<EtapeDemande> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EtapeDemandeDTO> list = new ArrayList<EtapeDemandeDTO>( entities.size() );
        for ( EtapeDemande etapeDemande : entities ) {
            list.add( toDTO( etapeDemande ) );
        }

        return list;
    }

    @Override
    public EtapeDemandeDTO toDTO(EtapeDemande entity) {
        if ( entity == null ) {
            return null;
        }

        EtapeDemandeDTO etapeDemandeDTO = new EtapeDemandeDTO();

        etapeDemandeDTO.setActionEtapeDemande( actionEtapeDemandeToString( entity.getActionEtapeDemande() ) );
        etapeDemandeDTO.setId( entity.getId() );
        etapeDemandeDTO.setLibelleEnCours( entity.getLibelleEnCours() );
        etapeDemandeDTO.setLibelleTermine( entity.getLibelleTermine() );
        etapeDemandeDTO.setClasseConcernee( entity.getClasseConcernee() );
        etapeDemandeDTO.setLibelleEtape( entity.getLibelleEtape() );
        etapeDemandeDTO.setOrdre( entity.getOrdre() );
        etapeDemandeDTO.setClotureManuelleNecessaire( entity.getClotureManuelleNecessaire() );

        return etapeDemandeDTO;
    }

    @Override
    public EtapeDemande toEntity(EtapeDemandeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EtapeDemande etapeDemande = new EtapeDemande();

        etapeDemande.setId( dto.getId() );
        etapeDemande.setClasseConcernee( dto.getClasseConcernee() );
        etapeDemande.setOrdre( dto.getOrdre() );
        etapeDemande.setLibelleEnCours( dto.getLibelleEnCours() );
        etapeDemande.setLibelleTermine( dto.getLibelleTermine() );
        if ( dto.getActionEtapeDemande() != null ) {
            etapeDemande.setActionEtapeDemande( Enum.valueOf( ActionEtapeDemande.class, dto.getActionEtapeDemande() ) );
        }
        etapeDemande.setLibelleEtape( dto.getLibelleEtape() );
        etapeDemande.setClotureManuelleNecessaire( dto.getClotureManuelleNecessaire() );

        return etapeDemande;
    }
}
