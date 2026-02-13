package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FinancementTravauxDTO;
import fr.d4immobilier.visionapirest.entities.FinancementTravaux;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FinancementTravauxMapper extends GenericMapper<FinancementTravaux, FinancementTravauxDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "resolution.id", target = "resolutionId")
    FinancementTravauxDTO toDTO(FinancementTravaux entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "echeancesFinancement", ignore = true)
    @Mapping(target = "resolution", ignore = true)
    FinancementTravaux toEntity(FinancementTravauxDTO dto);
}
