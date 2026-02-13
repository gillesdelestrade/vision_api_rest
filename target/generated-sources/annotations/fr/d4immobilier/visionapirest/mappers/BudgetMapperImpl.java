package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BudgetDTO;
import fr.d4immobilier.visionapirest.entities.Budget;
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
public class BudgetMapperImpl implements BudgetMapper {

    @Override
    public List<BudgetDTO> toDTOList(List<Budget> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BudgetDTO> list = new ArrayList<BudgetDTO>( entities.size() );
        for ( Budget budget : entities ) {
            list.add( toDTO( budget ) );
        }

        return list;
    }

    @Override
    public BudgetDTO toDTO(Budget entity) {
        if ( entity == null ) {
            return null;
        }

        BudgetDTO budgetDTO = new BudgetDTO();

        budgetDTO.setId( entity.getId() );
        budgetDTO.setDateDebut( entity.getDateDebut() );
        budgetDTO.setDateFin( entity.getDateFin() );
        budgetDTO.setEnCours( entity.getEnCours() );
        budgetDTO.setBudgetFonctionnement( entity.getBudgetFonctionnement() );
        budgetDTO.setBudgetTravaux( entity.getBudgetTravaux() );

        return budgetDTO;
    }

    @Override
    public Budget toEntity(BudgetDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Budget budget = new Budget();

        budget.setId( dto.getId() );
        budget.setDateDebut( dto.getDateDebut() );
        budget.setDateFin( dto.getDateFin() );
        budget.setEnCours( dto.getEnCours() );
        budget.setBudgetFonctionnement( dto.getBudgetFonctionnement() );
        budget.setBudgetTravaux( dto.getBudgetTravaux() );

        return budget;
    }
}
