package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.HistoriqueNavigationDTO;
import fr.d4immobilier.visionapirest.entities.HistoriqueNavigation;
import fr.d4immobilier.visionapirest.entities.Personne;
import fr.d4immobilier.visionapirest.entities.Societe;
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
public class HistoriqueNavigationMapperImpl implements HistoriqueNavigationMapper {

    @Override
    public List<HistoriqueNavigationDTO> toDTOList(List<HistoriqueNavigation> entities) {
        if ( entities == null ) {
            return null;
        }

        List<HistoriqueNavigationDTO> list = new ArrayList<HistoriqueNavigationDTO>( entities.size() );
        for ( HistoriqueNavigation historiqueNavigation : entities ) {
            list.add( toDTO( historiqueNavigation ) );
        }

        return list;
    }

    @Override
    public HistoriqueNavigationDTO toDTO(HistoriqueNavigation entity) {
        if ( entity == null ) {
            return null;
        }

        HistoriqueNavigationDTO historiqueNavigationDTO = new HistoriqueNavigationDTO();

        historiqueNavigationDTO.setPersonneConnecteeId( entityPersonneConnecteeId( entity ) );
        historiqueNavigationDTO.setSocieteConnecteeId( entitySocieteConnecteeId( entity ) );
        historiqueNavigationDTO.setDateConnexion( dateConnexionToString( entity.getDateConnexion() ) );
        historiqueNavigationDTO.setId( entity.getId() );
        historiqueNavigationDTO.setAdresseIP( entity.getAdresseIP() );
        historiqueNavigationDTO.setPageDemandee( entity.getPageDemandee() );

        return historiqueNavigationDTO;
    }

    @Override
    public HistoriqueNavigation toEntity(HistoriqueNavigationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        HistoriqueNavigation historiqueNavigation = new HistoriqueNavigation();

        historiqueNavigation.setId( dto.getId() );
        if ( dto.getDateConnexion() != null ) {
            historiqueNavigation.setDateConnexion( Instant.parse( dto.getDateConnexion() ) );
        }
        historiqueNavigation.setAdresseIP( dto.getAdresseIP() );
        historiqueNavigation.setPageDemandee( dto.getPageDemandee() );

        return historiqueNavigation;
    }

    private Long entityPersonneConnecteeId(HistoriqueNavigation historiqueNavigation) {
        if ( historiqueNavigation == null ) {
            return null;
        }
        Personne personneConnectee = historiqueNavigation.getPersonneConnectee();
        if ( personneConnectee == null ) {
            return null;
        }
        Long id = personneConnectee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entitySocieteConnecteeId(HistoriqueNavigation historiqueNavigation) {
        if ( historiqueNavigation == null ) {
            return null;
        }
        Societe societeConnectee = historiqueNavigation.getSocieteConnectee();
        if ( societeConnectee == null ) {
            return null;
        }
        Long id = societeConnectee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
