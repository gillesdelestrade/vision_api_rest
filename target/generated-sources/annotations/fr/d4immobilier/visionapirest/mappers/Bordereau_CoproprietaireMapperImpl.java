package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.Bordereau_CoproprietaireDTO;
import fr.d4immobilier.visionapirest.entities.Bordereau;
import fr.d4immobilier.visionapirest.entities.Bordereau_Coproprietaire;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
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
public class Bordereau_CoproprietaireMapperImpl implements Bordereau_CoproprietaireMapper {

    @Override
    public List<Bordereau_CoproprietaireDTO> toDTOList(List<Bordereau_Coproprietaire> entities) {
        if ( entities == null ) {
            return null;
        }

        List<Bordereau_CoproprietaireDTO> list = new ArrayList<Bordereau_CoproprietaireDTO>( entities.size() );
        for ( Bordereau_Coproprietaire bordereau_Coproprietaire : entities ) {
            list.add( toDTO( bordereau_Coproprietaire ) );
        }

        return list;
    }

    @Override
    public Bordereau_CoproprietaireDTO toDTO(Bordereau_Coproprietaire entity) {
        if ( entity == null ) {
            return null;
        }

        Bordereau_CoproprietaireDTO bordereau_CoproprietaireDTO = new Bordereau_CoproprietaireDTO();

        bordereau_CoproprietaireDTO.setBordereauId( entityBordereauId( entity ) );
        bordereau_CoproprietaireDTO.setCoproprietaireId( entityCoproprietaireId( entity ) );
        bordereau_CoproprietaireDTO.setCreated_at( created_atToString( entity.getCreated_at() ) );
        bordereau_CoproprietaireDTO.setId( entity.getId() );
        bordereau_CoproprietaireDTO.setNumero( entity.getNumero() );
        bordereau_CoproprietaireDTO.setAdresse( entity.getAdresse() );
        bordereau_CoproprietaireDTO.setNom( entity.getNom() );
        bordereau_CoproprietaireDTO.setNom_stockage_rar( entity.getNom_stockage_rar() );

        return bordereau_CoproprietaireDTO;
    }

    @Override
    public Bordereau_Coproprietaire toEntity(Bordereau_CoproprietaireDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Bordereau_Coproprietaire bordereau_Coproprietaire = new Bordereau_Coproprietaire();

        bordereau_Coproprietaire.setId( dto.getId() );
        bordereau_Coproprietaire.setNumero( dto.getNumero() );
        if ( dto.getCreated_at() != null ) {
            bordereau_Coproprietaire.setCreated_at( Instant.parse( dto.getCreated_at() ) );
        }
        bordereau_Coproprietaire.setAdresse( dto.getAdresse() );
        bordereau_Coproprietaire.setNom( dto.getNom() );
        bordereau_Coproprietaire.setNom_stockage_rar( dto.getNom_stockage_rar() );

        return bordereau_Coproprietaire;
    }

    private Long entityBordereauId(Bordereau_Coproprietaire bordereau_Coproprietaire) {
        if ( bordereau_Coproprietaire == null ) {
            return null;
        }
        Bordereau bordereau = bordereau_Coproprietaire.getBordereau();
        if ( bordereau == null ) {
            return null;
        }
        Long id = bordereau.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityCoproprietaireId(Bordereau_Coproprietaire bordereau_Coproprietaire) {
        if ( bordereau_Coproprietaire == null ) {
            return null;
        }
        Coproprietaire coproprietaire = bordereau_Coproprietaire.getCoproprietaire();
        if ( coproprietaire == null ) {
            return null;
        }
        Long id = coproprietaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
