package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierDemandeDTO;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.entities.EtapeDemande;
import fr.d4immobilier.visionapirest.entities.FichierDemande;
import fr.d4immobilier.visionapirest.entities.NatureFichierSinistre;
import fr.d4immobilier.visionapirest.entities.ReunionV2;
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
public class FichierDemandeMapperImpl implements FichierDemandeMapper {

    @Override
    public List<FichierDemandeDTO> toDTOList(List<FichierDemande> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierDemandeDTO> list = new ArrayList<FichierDemandeDTO>( entities.size() );
        for ( FichierDemande fichierDemande : entities ) {
            list.add( toDTO( fichierDemande ) );
        }

        return list;
    }

    @Override
    public FichierDemandeDTO toDTO(FichierDemande entity) {
        if ( entity == null ) {
            return null;
        }

        FichierDemandeDTO fichierDemandeDTO = new FichierDemandeDTO();

        fichierDemandeDTO.setReunionV2Id( entityReunionV2Id( entity ) );
        fichierDemandeDTO.setDemandeId( entityDemandeId( entity ) );
        fichierDemandeDTO.setEtapeDemandeId( entityEtapeDemandeId( entity ) );
        fichierDemandeDTO.setNatureFichierSinistreId( entityNatureFichierSinistreId( entity ) );
        fichierDemandeDTO.setId( entity.getId() );
        fichierDemandeDTO.setIdDI( entity.getIdDI() );
        fichierDemandeDTO.setIdDDF( entity.getIdDDF() );

        return fichierDemandeDTO;
    }

    @Override
    public FichierDemande toEntity(FichierDemandeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierDemande fichierDemande = new FichierDemande();

        fichierDemande.setId( dto.getId() );
        fichierDemande.setIdDI( dto.getIdDI() );
        fichierDemande.setIdDDF( dto.getIdDDF() );

        return fichierDemande;
    }

    private Long entityReunionV2Id(FichierDemande fichierDemande) {
        if ( fichierDemande == null ) {
            return null;
        }
        ReunionV2 reunionV2 = fichierDemande.getReunionV2();
        if ( reunionV2 == null ) {
            return null;
        }
        Long id = reunionV2.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDemandeId(FichierDemande fichierDemande) {
        if ( fichierDemande == null ) {
            return null;
        }
        Demande demande = fichierDemande.getDemande();
        if ( demande == null ) {
            return null;
        }
        Long id = demande.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityEtapeDemandeId(FichierDemande fichierDemande) {
        if ( fichierDemande == null ) {
            return null;
        }
        EtapeDemande etapeDemande = fichierDemande.getEtapeDemande();
        if ( etapeDemande == null ) {
            return null;
        }
        Long id = etapeDemande.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityNatureFichierSinistreId(FichierDemande fichierDemande) {
        if ( fichierDemande == null ) {
            return null;
        }
        NatureFichierSinistre natureFichierSinistre = fichierDemande.getNatureFichierSinistre();
        if ( natureFichierSinistre == null ) {
            return null;
        }
        Long id = natureFichierSinistre.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
