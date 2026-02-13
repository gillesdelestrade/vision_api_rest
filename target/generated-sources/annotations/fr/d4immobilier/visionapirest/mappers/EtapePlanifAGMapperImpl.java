package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EtapePlanifAGDTO;
import fr.d4immobilier.visionapirest.entities.Assemblee;
import fr.d4immobilier.visionapirest.entities.EtapePlanifAG;
import fr.d4immobilier.visionapirest.entities.EtapePlanifAGModele;
import fr.d4immobilier.visionapirest.entities.Gestionnaire;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-12T18:34:53+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class EtapePlanifAGMapperImpl implements EtapePlanifAGMapper {

    @Override
    public List<EtapePlanifAGDTO> toDTOList(List<EtapePlanifAG> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EtapePlanifAGDTO> list = new ArrayList<EtapePlanifAGDTO>( entities.size() );
        for ( EtapePlanifAG etapePlanifAG : entities ) {
            list.add( toDTO( etapePlanifAG ) );
        }

        return list;
    }

    @Override
    public EtapePlanifAGDTO toDTO(EtapePlanifAG entity) {
        if ( entity == null ) {
            return null;
        }

        EtapePlanifAGDTO etapePlanifAGDTO = new EtapePlanifAGDTO();

        etapePlanifAGDTO.setAssembleeId( entityAssembleeId( entity ) );
        etapePlanifAGDTO.setEtapePlanifAGModeleId( entityEtapePlanifAGModeleId( entity ) );
        etapePlanifAGDTO.setActeurId( entityActeurId( entity ) );
        etapePlanifAGDTO.setDateCible( dateCibleToString( entity.getDateCible() ) );
        etapePlanifAGDTO.setDateRealisation( dateRealisationToString( entity.getDateRealisation() ) );
        etapePlanifAGDTO.setDateDebut( dateDebutToString( entity.getDateDebut() ) );
        etapePlanifAGDTO.setId( entity.getId() );
        etapePlanifAGDTO.setPourcentageAvancement( entity.getPourcentageAvancement() );
        etapePlanifAGDTO.setDureeReelle( entity.getDureeReelle() );

        return etapePlanifAGDTO;
    }

    @Override
    public EtapePlanifAG toEntity(EtapePlanifAGDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EtapePlanifAG etapePlanifAG = new EtapePlanifAG();

        etapePlanifAG.setId( dto.getId() );
        if ( dto.getDateCible() != null ) {
            etapePlanifAG.setDateCible( Instant.parse( dto.getDateCible() ) );
        }
        if ( dto.getDateRealisation() != null ) {
            etapePlanifAG.setDateRealisation( Instant.parse( dto.getDateRealisation() ) );
        }
        if ( dto.getDateDebut() != null ) {
            etapePlanifAG.setDateDebut( Instant.parse( dto.getDateDebut() ) );
        }
        etapePlanifAG.setPourcentageAvancement( dto.getPourcentageAvancement() );
        etapePlanifAG.setDureeReelle( dto.getDureeReelle() );

        return etapePlanifAG;
    }

    private Long entityAssembleeId(EtapePlanifAG etapePlanifAG) {
        if ( etapePlanifAG == null ) {
            return null;
        }
        Assemblee assemblee = etapePlanifAG.getAssemblee();
        if ( assemblee == null ) {
            return null;
        }
        Long id = assemblee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityEtapePlanifAGModeleId(EtapePlanifAG etapePlanifAG) {
        if ( etapePlanifAG == null ) {
            return null;
        }
        EtapePlanifAGModele etapePlanifAGModele = etapePlanifAG.getEtapePlanifAGModele();
        if ( etapePlanifAGModele == null ) {
            return null;
        }
        Long id = etapePlanifAGModele.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityActeurId(EtapePlanifAG etapePlanifAG) {
        if ( etapePlanifAG == null ) {
            return null;
        }
        Gestionnaire acteur = etapePlanifAG.getActeur();
        if ( acteur == null ) {
            return null;
        }
        Long id = acteur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
