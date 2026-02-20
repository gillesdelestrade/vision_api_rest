package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FactureD4DTO;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.entities.FactureD4;
import fr.d4immobilier.visionapirest.entities.Societe;
import fr.d4immobilier.visionapirest.entities.TypeFactureD4;
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
public class FactureD4MapperImpl implements FactureD4Mapper {

    @Override
    public List<FactureD4DTO> toDTOList(List<FactureD4> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FactureD4DTO> list = new ArrayList<FactureD4DTO>( entities.size() );
        for ( FactureD4 factureD4 : entities ) {
            list.add( toDTO( factureD4 ) );
        }

        return list;
    }

    @Override
    public FactureD4DTO toDTO(FactureD4 entity) {
        if ( entity == null ) {
            return null;
        }

        FactureD4DTO factureD4DTO = new FactureD4DTO();

        factureD4DTO.setCoproprietaireId( entityCoproprietaireId( entity ) );
        factureD4DTO.setSocieteId( entitySocieteId( entity ) );
        factureD4DTO.setTypeFactureD4( typeFactureD4ToString( entity.getTypeFactureD4() ) );
        factureD4DTO.setDateValidation( dateValidationToString( entity.getDateValidation() ) );
        factureD4DTO.setDateEdition( dateEditionToString( entity.getDateEdition() ) );
        factureD4DTO.setId( entity.getId() );
        factureD4DTO.setReference( entity.getReference() );
        factureD4DTO.setDateFacture( entity.getDateFacture() );
        factureD4DTO.setMontantTotalHT( entity.getMontantTotalHT() );
        factureD4DTO.setMontantTotalTTC( entity.getMontantTotalTTC() );
        factureD4DTO.setDateDebutPeriode( entity.getDateDebutPeriode() );
        factureD4DTO.setDateFinPeriode( entity.getDateFinPeriode() );

        return factureD4DTO;
    }

    @Override
    public FactureD4 toEntity(FactureD4DTO dto) {
        if ( dto == null ) {
            return null;
        }

        FactureD4 factureD4 = new FactureD4();

        factureD4.setId( dto.getId() );
        factureD4.setReference( dto.getReference() );
        factureD4.setDateFacture( dto.getDateFacture() );
        factureD4.setMontantTotalHT( dto.getMontantTotalHT() );
        factureD4.setMontantTotalTTC( dto.getMontantTotalTTC() );
        if ( dto.getTypeFactureD4() != null ) {
            factureD4.setTypeFactureD4( Enum.valueOf( TypeFactureD4.class, dto.getTypeFactureD4() ) );
        }
        if ( dto.getDateValidation() != null ) {
            factureD4.setDateValidation( Instant.parse( dto.getDateValidation() ) );
        }
        if ( dto.getDateEdition() != null ) {
            factureD4.setDateEdition( Instant.parse( dto.getDateEdition() ) );
        }
        factureD4.setDateDebutPeriode( dto.getDateDebutPeriode() );
        factureD4.setDateFinPeriode( dto.getDateFinPeriode() );

        return factureD4;
    }

    private Long entityCoproprietaireId(FactureD4 factureD4) {
        if ( factureD4 == null ) {
            return null;
        }
        Coproprietaire coproprietaire = factureD4.getCoproprietaire();
        if ( coproprietaire == null ) {
            return null;
        }
        Long id = coproprietaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entitySocieteId(FactureD4 factureD4) {
        if ( factureD4 == null ) {
            return null;
        }
        Societe societe = factureD4.getSociete();
        if ( societe == null ) {
            return null;
        }
        Long id = societe.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
