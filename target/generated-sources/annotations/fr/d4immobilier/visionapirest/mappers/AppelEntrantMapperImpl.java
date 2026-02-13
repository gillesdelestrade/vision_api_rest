package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AppelEntrantDTO;
import fr.d4immobilier.visionapirest.entities.AppelEntrant;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.entities.Gestionnaire;
import fr.d4immobilier.visionapirest.entities.Personne;
import fr.d4immobilier.visionapirest.entities.Societe;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-13T14:09:30+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class AppelEntrantMapperImpl implements AppelEntrantMapper {

    @Override
    public List<AppelEntrantDTO> toDTOList(List<AppelEntrant> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AppelEntrantDTO> list = new ArrayList<AppelEntrantDTO>( entities.size() );
        for ( AppelEntrant appelEntrant : entities ) {
            list.add( toDTO( appelEntrant ) );
        }

        return list;
    }

    @Override
    public AppelEntrantDTO toDTO(AppelEntrant entity) {
        if ( entity == null ) {
            return null;
        }

        AppelEntrantDTO appelEntrantDTO = new AppelEntrantDTO();

        appelEntrantDTO.setAppelantPersonneId( entityAppelantPersonneId( entity ) );
        appelEntrantDTO.setAppelantSocieteId( entityAppelantSocieteId( entity ) );
        appelEntrantDTO.setInterlocuteurD4Id( entityInterlocuteurD4Id( entity ) );
        appelEntrantDTO.setDemandeId( entityDemandeId( entity ) );
        appelEntrantDTO.setDateDebutAppel( dateDebutAppelToString( entity.getDateDebutAppel() ) );
        appelEntrantDTO.setDateFinAppel( dateFinAppelToString( entity.getDateFinAppel() ) );
        appelEntrantDTO.setId( entity.getId() );
        appelEntrantDTO.setContenuAppel( entity.getContenuAppel() );

        return appelEntrantDTO;
    }

    @Override
    public AppelEntrant toEntity(AppelEntrantDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AppelEntrant appelEntrant = new AppelEntrant();

        appelEntrant.setId( dto.getId() );
        if ( dto.getDateDebutAppel() != null ) {
            appelEntrant.setDateDebutAppel( Instant.parse( dto.getDateDebutAppel() ) );
        }
        if ( dto.getDateFinAppel() != null ) {
            appelEntrant.setDateFinAppel( Instant.parse( dto.getDateFinAppel() ) );
        }
        appelEntrant.setContenuAppel( dto.getContenuAppel() );

        return appelEntrant;
    }

    private Long entityAppelantPersonneId(AppelEntrant appelEntrant) {
        if ( appelEntrant == null ) {
            return null;
        }
        Personne appelantPersonne = appelEntrant.getAppelantPersonne();
        if ( appelantPersonne == null ) {
            return null;
        }
        Long id = appelantPersonne.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAppelantSocieteId(AppelEntrant appelEntrant) {
        if ( appelEntrant == null ) {
            return null;
        }
        Societe appelantSociete = appelEntrant.getAppelantSociete();
        if ( appelantSociete == null ) {
            return null;
        }
        Long id = appelantSociete.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityInterlocuteurD4Id(AppelEntrant appelEntrant) {
        if ( appelEntrant == null ) {
            return null;
        }
        Gestionnaire interlocuteurD4 = appelEntrant.getInterlocuteurD4();
        if ( interlocuteurD4 == null ) {
            return null;
        }
        Long id = interlocuteurD4.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDemandeId(AppelEntrant appelEntrant) {
        if ( appelEntrant == null ) {
            return null;
        }
        Demande demande = appelEntrant.getDemande();
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
