package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DemandeDevisDTO;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.entities.DemandeDevis;
import fr.d4immobilier.visionapirest.entities.InterventionDemande;
import fr.d4immobilier.visionapirest.entities.MotifClotureDemandeDevis;
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
public class DemandeDevisMapperImpl implements DemandeDevisMapper {

    @Override
    public List<DemandeDevisDTO> toDTOList(List<DemandeDevis> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DemandeDevisDTO> list = new ArrayList<DemandeDevisDTO>( entities.size() );
        for ( DemandeDevis demandeDevis : entities ) {
            list.add( toDTO( demandeDevis ) );
        }

        return list;
    }

    @Override
    public DemandeDevisDTO toDTO(DemandeDevis entity) {
        if ( entity == null ) {
            return null;
        }

        DemandeDevisDTO demandeDevisDTO = new DemandeDevisDTO();

        demandeDevisDTO.setDemandeId( entityDemandeId( entity ) );
        demandeDevisDTO.setInterventionDemandeId( entityInterventionDemandeId( entity ) );
        demandeDevisDTO.setMotifClotureDemandeDevis( motifClotureDemandeDevisToString( entity.getMotifClotureDemandeDevis() ) );
        demandeDevisDTO.setId( entity.getId() );
        demandeDevisDTO.setDateDemandeDevis( entity.getDateDemandeDevis() );
        demandeDevisDTO.setObjet( entity.getObjet() );
        demandeDevisDTO.setReference( entity.getReference() );
        demandeDevisDTO.setLieuIntervention( entity.getLieuIntervention() );
        demandeDevisDTO.setDateCloture( entity.getDateCloture() );

        return demandeDevisDTO;
    }

    @Override
    public DemandeDevis toEntity(DemandeDevisDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DemandeDevis demandeDevis = new DemandeDevis();

        demandeDevis.setId( dto.getId() );
        demandeDevis.setDateDemandeDevis( dto.getDateDemandeDevis() );
        demandeDevis.setObjet( dto.getObjet() );
        demandeDevis.setReference( dto.getReference() );
        demandeDevis.setLieuIntervention( dto.getLieuIntervention() );
        demandeDevis.setDateCloture( dto.getDateCloture() );
        if ( dto.getMotifClotureDemandeDevis() != null ) {
            demandeDevis.setMotifClotureDemandeDevis( Enum.valueOf( MotifClotureDemandeDevis.class, dto.getMotifClotureDemandeDevis() ) );
        }

        return demandeDevis;
    }

    private Long entityDemandeId(DemandeDevis demandeDevis) {
        if ( demandeDevis == null ) {
            return null;
        }
        Demande demande = demandeDevis.getDemande();
        if ( demande == null ) {
            return null;
        }
        Long id = demande.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityInterventionDemandeId(DemandeDevis demandeDevis) {
        if ( demandeDevis == null ) {
            return null;
        }
        InterventionDemande interventionDemande = demandeDevis.getInterventionDemande();
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
