package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DemandeDeRappelDTO;
import fr.d4immobilier.visionapirest.entities.DemandeDeRappel;
import fr.d4immobilier.visionapirest.entities.Gestionnaire;
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
public class DemandeDeRappelMapperImpl implements DemandeDeRappelMapper {

    @Override
    public List<DemandeDeRappelDTO> toDTOList(List<DemandeDeRappel> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DemandeDeRappelDTO> list = new ArrayList<DemandeDeRappelDTO>( entities.size() );
        for ( DemandeDeRappel demandeDeRappel : entities ) {
            list.add( toDTO( demandeDeRappel ) );
        }

        return list;
    }

    @Override
    public DemandeDeRappelDTO toDTO(DemandeDeRappel entity) {
        if ( entity == null ) {
            return null;
        }

        DemandeDeRappelDTO demandeDeRappelDTO = new DemandeDeRappelDTO();

        demandeDeRappelDTO.setGestionnaireQuiDoitRappelerId( entityGestionnaireQuiDoitRappelerId( entity ) );
        demandeDeRappelDTO.setDateAppel( dateAppelToString( entity.getDateAppel() ) );
        demandeDeRappelDTO.setId( entity.getId() );

        return demandeDeRappelDTO;
    }

    @Override
    public DemandeDeRappel toEntity(DemandeDeRappelDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DemandeDeRappel demandeDeRappel = new DemandeDeRappel();

        demandeDeRappel.setId( dto.getId() );
        if ( dto.getDateAppel() != null ) {
            demandeDeRappel.setDateAppel( Instant.parse( dto.getDateAppel() ) );
        }

        return demandeDeRappel;
    }

    private Long entityGestionnaireQuiDoitRappelerId(DemandeDeRappel demandeDeRappel) {
        if ( demandeDeRappel == null ) {
            return null;
        }
        Gestionnaire gestionnaireQuiDoitRappeler = demandeDeRappel.getGestionnaireQuiDoitRappeler();
        if ( gestionnaireQuiDoitRappeler == null ) {
            return null;
        }
        Long id = gestionnaireQuiDoitRappeler.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
