package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.HistoriqueModificationEtapePlanifAGDTO;
import fr.d4immobilier.visionapirest.entities.EtapePlanifAG;
import fr.d4immobilier.visionapirest.entities.Gestionnaire;
import fr.d4immobilier.visionapirest.entities.HistoriqueModificationEtapePlanifAG;
import fr.d4immobilier.visionapirest.entities.ModeModificationEtapePlanifAG;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-20T08:40:21+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class HistoriqueModificationEtapePlanifAGMapperImpl implements HistoriqueModificationEtapePlanifAGMapper {

    @Override
    public List<HistoriqueModificationEtapePlanifAGDTO> toDTOList(List<HistoriqueModificationEtapePlanifAG> entities) {
        if ( entities == null ) {
            return null;
        }

        List<HistoriqueModificationEtapePlanifAGDTO> list = new ArrayList<HistoriqueModificationEtapePlanifAGDTO>( entities.size() );
        for ( HistoriqueModificationEtapePlanifAG historiqueModificationEtapePlanifAG : entities ) {
            list.add( toDTO( historiqueModificationEtapePlanifAG ) );
        }

        return list;
    }

    @Override
    public HistoriqueModificationEtapePlanifAGDTO toDTO(HistoriqueModificationEtapePlanifAG entity) {
        if ( entity == null ) {
            return null;
        }

        HistoriqueModificationEtapePlanifAGDTO historiqueModificationEtapePlanifAGDTO = new HistoriqueModificationEtapePlanifAGDTO();

        historiqueModificationEtapePlanifAGDTO.setEtapePlanifAGId( entityEtapePlanifAGId( entity ) );
        historiqueModificationEtapePlanifAGDTO.setAncienActeurId( entityAncienActeurId( entity ) );
        historiqueModificationEtapePlanifAGDTO.setNouvelActeurId( entityNouvelActeurId( entity ) );
        historiqueModificationEtapePlanifAGDTO.setDateModification( dateModificationToString( entity.getDateModification() ) );
        historiqueModificationEtapePlanifAGDTO.setAncienneDateCible( ancienneDateCibleToString( entity.getAncienneDateCible() ) );
        historiqueModificationEtapePlanifAGDTO.setNouvelleDateCible( nouvelleDateCibleToString( entity.getNouvelleDateCible() ) );
        historiqueModificationEtapePlanifAGDTO.setModeModification( modeModificationToString( entity.getModeModification() ) );
        historiqueModificationEtapePlanifAGDTO.setId( entity.getId() );

        return historiqueModificationEtapePlanifAGDTO;
    }

    @Override
    public HistoriqueModificationEtapePlanifAG toEntity(HistoriqueModificationEtapePlanifAGDTO dto) {
        if ( dto == null ) {
            return null;
        }

        HistoriqueModificationEtapePlanifAG historiqueModificationEtapePlanifAG = new HistoriqueModificationEtapePlanifAG();

        historiqueModificationEtapePlanifAG.setId( dto.getId() );
        if ( dto.getDateModification() != null ) {
            historiqueModificationEtapePlanifAG.setDateModification( Instant.parse( dto.getDateModification() ) );
        }
        if ( dto.getAncienneDateCible() != null ) {
            historiqueModificationEtapePlanifAG.setAncienneDateCible( Instant.parse( dto.getAncienneDateCible() ) );
        }
        if ( dto.getNouvelleDateCible() != null ) {
            historiqueModificationEtapePlanifAG.setNouvelleDateCible( Instant.parse( dto.getNouvelleDateCible() ) );
        }
        if ( dto.getModeModification() != null ) {
            historiqueModificationEtapePlanifAG.setModeModification( Enum.valueOf( ModeModificationEtapePlanifAG.class, dto.getModeModification() ) );
        }

        return historiqueModificationEtapePlanifAG;
    }

    private Long entityEtapePlanifAGId(HistoriqueModificationEtapePlanifAG historiqueModificationEtapePlanifAG) {
        if ( historiqueModificationEtapePlanifAG == null ) {
            return null;
        }
        EtapePlanifAG etapePlanifAG = historiqueModificationEtapePlanifAG.getEtapePlanifAG();
        if ( etapePlanifAG == null ) {
            return null;
        }
        Long id = etapePlanifAG.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAncienActeurId(HistoriqueModificationEtapePlanifAG historiqueModificationEtapePlanifAG) {
        if ( historiqueModificationEtapePlanifAG == null ) {
            return null;
        }
        Gestionnaire ancienActeur = historiqueModificationEtapePlanifAG.getAncienActeur();
        if ( ancienActeur == null ) {
            return null;
        }
        Long id = ancienActeur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityNouvelActeurId(HistoriqueModificationEtapePlanifAG historiqueModificationEtapePlanifAG) {
        if ( historiqueModificationEtapePlanifAG == null ) {
            return null;
        }
        Gestionnaire nouvelActeur = historiqueModificationEtapePlanifAG.getNouvelActeur();
        if ( nouvelActeur == null ) {
            return null;
        }
        Long id = nouvelActeur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
