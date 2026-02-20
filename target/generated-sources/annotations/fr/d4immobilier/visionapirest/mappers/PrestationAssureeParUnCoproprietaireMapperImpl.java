package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PrestationAssureeParUnCoproprietaireDTO;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.entities.PrestationAssureeParUnCoproprietaire;
import fr.d4immobilier.visionapirest.entities.PrestationContrat;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-20T08:40:20+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class PrestationAssureeParUnCoproprietaireMapperImpl implements PrestationAssureeParUnCoproprietaireMapper {

    @Override
    public List<PrestationAssureeParUnCoproprietaireDTO> toDTOList(List<PrestationAssureeParUnCoproprietaire> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PrestationAssureeParUnCoproprietaireDTO> list = new ArrayList<PrestationAssureeParUnCoproprietaireDTO>( entities.size() );
        for ( PrestationAssureeParUnCoproprietaire prestationAssureeParUnCoproprietaire : entities ) {
            list.add( toDTO( prestationAssureeParUnCoproprietaire ) );
        }

        return list;
    }

    @Override
    public PrestationAssureeParUnCoproprietaireDTO toDTO(PrestationAssureeParUnCoproprietaire entity) {
        if ( entity == null ) {
            return null;
        }

        PrestationAssureeParUnCoproprietaireDTO prestationAssureeParUnCoproprietaireDTO = new PrestationAssureeParUnCoproprietaireDTO();

        prestationAssureeParUnCoproprietaireDTO.setCoproprietaireId( entityCoproprietaireId( entity ) );
        prestationAssureeParUnCoproprietaireDTO.setPrestationContratId( entityPrestationContratId( entity ) );
        prestationAssureeParUnCoproprietaireDTO.setId( entity.getId() );

        return prestationAssureeParUnCoproprietaireDTO;
    }

    @Override
    public PrestationAssureeParUnCoproprietaire toEntity(PrestationAssureeParUnCoproprietaireDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PrestationAssureeParUnCoproprietaire prestationAssureeParUnCoproprietaire = new PrestationAssureeParUnCoproprietaire();

        prestationAssureeParUnCoproprietaire.setId( dto.getId() );

        return prestationAssureeParUnCoproprietaire;
    }

    private Long entityCoproprietaireId(PrestationAssureeParUnCoproprietaire prestationAssureeParUnCoproprietaire) {
        if ( prestationAssureeParUnCoproprietaire == null ) {
            return null;
        }
        Coproprietaire coproprietaire = prestationAssureeParUnCoproprietaire.getCoproprietaire();
        if ( coproprietaire == null ) {
            return null;
        }
        Long id = coproprietaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityPrestationContratId(PrestationAssureeParUnCoproprietaire prestationAssureeParUnCoproprietaire) {
        if ( prestationAssureeParUnCoproprietaire == null ) {
            return null;
        }
        PrestationContrat prestationContrat = prestationAssureeParUnCoproprietaire.getPrestationContrat();
        if ( prestationContrat == null ) {
            return null;
        }
        Long id = prestationContrat.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
