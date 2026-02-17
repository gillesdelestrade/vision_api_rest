package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DemandeSansCompteVisionDTO;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.entities.DemandeSansCompteVision;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-17T10:51:57+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class DemandeSansCompteVisionMapperImpl implements DemandeSansCompteVisionMapper {

    @Override
    public List<DemandeSansCompteVisionDTO> toDTOList(List<DemandeSansCompteVision> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DemandeSansCompteVisionDTO> list = new ArrayList<DemandeSansCompteVisionDTO>( entities.size() );
        for ( DemandeSansCompteVision demandeSansCompteVision : entities ) {
            list.add( toDTO( demandeSansCompteVision ) );
        }

        return list;
    }

    @Override
    public DemandeSansCompteVisionDTO toDTO(DemandeSansCompteVision entity) {
        if ( entity == null ) {
            return null;
        }

        DemandeSansCompteVisionDTO demandeSansCompteVisionDTO = new DemandeSansCompteVisionDTO();

        demandeSansCompteVisionDTO.setDemandeId( entityDemandeId( entity ) );
        demandeSansCompteVisionDTO.setDateCreation( dateCreationToString( entity.getDateCreation() ) );
        demandeSansCompteVisionDTO.setId( entity.getId() );
        demandeSansCompteVisionDTO.setNom( entity.getNom() );
        demandeSansCompteVisionDTO.setAdresseMail( entity.getAdresseMail() );
        demandeSansCompteVisionDTO.setAdresse( entity.getAdresse() );
        demandeSansCompteVisionDTO.setComplementAdresse( entity.getComplementAdresse() );
        demandeSansCompteVisionDTO.setCodePostal( entity.getCodePostal() );
        demandeSansCompteVisionDTO.setVille( entity.getVille() );
        demandeSansCompteVisionDTO.setLieuDemande( entity.getLieuDemande() );
        demandeSansCompteVisionDTO.setDetailDemande( entity.getDetailDemande() );
        demandeSansCompteVisionDTO.setReference( entity.getReference() );
        demandeSansCompteVisionDTO.setNomCopropriete( entity.getNomCopropriete() );
        demandeSansCompteVisionDTO.setCorbeille( entity.getCorbeille() );

        return demandeSansCompteVisionDTO;
    }

    @Override
    public DemandeSansCompteVision toEntity(DemandeSansCompteVisionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DemandeSansCompteVision demandeSansCompteVision = new DemandeSansCompteVision();

        demandeSansCompteVision.setId( dto.getId() );
        if ( dto.getDateCreation() != null ) {
            demandeSansCompteVision.setDateCreation( Instant.parse( dto.getDateCreation() ) );
        }
        demandeSansCompteVision.setNom( dto.getNom() );
        demandeSansCompteVision.setAdresseMail( dto.getAdresseMail() );
        demandeSansCompteVision.setAdresse( dto.getAdresse() );
        demandeSansCompteVision.setComplementAdresse( dto.getComplementAdresse() );
        demandeSansCompteVision.setCodePostal( dto.getCodePostal() );
        demandeSansCompteVision.setVille( dto.getVille() );
        demandeSansCompteVision.setLieuDemande( dto.getLieuDemande() );
        demandeSansCompteVision.setDetailDemande( dto.getDetailDemande() );
        demandeSansCompteVision.setReference( dto.getReference() );
        demandeSansCompteVision.setNomCopropriete( dto.getNomCopropriete() );
        demandeSansCompteVision.setCorbeille( dto.getCorbeille() );

        return demandeSansCompteVision;
    }

    private Long entityDemandeId(DemandeSansCompteVision demandeSansCompteVision) {
        if ( demandeSansCompteVision == null ) {
            return null;
        }
        Demande demande = demandeSansCompteVision.getDemande();
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
