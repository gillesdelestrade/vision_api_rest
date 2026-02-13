package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ExpressionCleDTO;
import fr.d4immobilier.visionapirest.entities.ExpressionCle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ExpressionCleMapper extends GenericMapper<ExpressionCle, ExpressionCleDTO> {
    
    // Mapping de l'entité vers le DTO
    ExpressionCleDTO toDTO(ExpressionCle entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "consignes", ignore = true)
    ExpressionCle toEntity(ExpressionCleDTO dto);
}
