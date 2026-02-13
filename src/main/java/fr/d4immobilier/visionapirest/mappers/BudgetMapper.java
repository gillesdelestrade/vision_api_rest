package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BudgetDTO;
import fr.d4immobilier.visionapirest.entities.Budget;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface BudgetMapper extends GenericMapper<Budget, BudgetDTO> {
    
    // Mapping de l'entité vers le DTO
        BudgetDTO toDTO(Budget entity);

    // Mapping du DTO vers l'entité
        Budget toEntity(BudgetDTO dto);
}
