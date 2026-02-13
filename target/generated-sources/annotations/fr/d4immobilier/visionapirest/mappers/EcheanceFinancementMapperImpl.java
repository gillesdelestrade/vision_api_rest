package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EcheanceFinancementDTO;
import fr.d4immobilier.visionapirest.entities.EcheanceFinancement;
import fr.d4immobilier.visionapirest.entities.FinancementTravaux;
import fr.d4immobilier.visionapirest.entities.TypeEcheance;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-13T14:09:30+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class EcheanceFinancementMapperImpl implements EcheanceFinancementMapper {

    @Override
    public List<EcheanceFinancementDTO> toDTOList(List<EcheanceFinancement> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EcheanceFinancementDTO> list = new ArrayList<EcheanceFinancementDTO>( entities.size() );
        for ( EcheanceFinancement echeanceFinancement : entities ) {
            list.add( toDTO( echeanceFinancement ) );
        }

        return list;
    }

    @Override
    public EcheanceFinancementDTO toDTO(EcheanceFinancement entity) {
        if ( entity == null ) {
            return null;
        }

        EcheanceFinancementDTO echeanceFinancementDTO = new EcheanceFinancementDTO();

        echeanceFinancementDTO.setFinancementTravauxId( entityFinancementTravauxId( entity ) );
        echeanceFinancementDTO.setTypeEcheance( typeEcheanceToString( entity.getTypeEcheance() ) );
        echeanceFinancementDTO.setId( entity.getId() );
        echeanceFinancementDTO.setDateEcheance( entity.getDateEcheance() );
        echeanceFinancementDTO.setValeurPourcentage( entity.getValeurPourcentage() );
        echeanceFinancementDTO.setValeurEuros( entity.getValeurEuros() );

        return echeanceFinancementDTO;
    }

    @Override
    public EcheanceFinancement toEntity(EcheanceFinancementDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EcheanceFinancement echeanceFinancement = new EcheanceFinancement();

        echeanceFinancement.setId( dto.getId() );
        echeanceFinancement.setDateEcheance( dto.getDateEcheance() );
        echeanceFinancement.setValeurPourcentage( dto.getValeurPourcentage() );
        echeanceFinancement.setValeurEuros( dto.getValeurEuros() );
        if ( dto.getTypeEcheance() != null ) {
            echeanceFinancement.setTypeEcheance( Enum.valueOf( TypeEcheance.class, dto.getTypeEcheance() ) );
        }

        return echeanceFinancement;
    }

    private Long entityFinancementTravauxId(EcheanceFinancement echeanceFinancement) {
        if ( echeanceFinancement == null ) {
            return null;
        }
        FinancementTravaux financementTravaux = echeanceFinancement.getFinancementTravaux();
        if ( financementTravaux == null ) {
            return null;
        }
        Long id = financementTravaux.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
