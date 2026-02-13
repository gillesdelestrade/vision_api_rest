package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EmplacementStockDTO;
import fr.d4immobilier.visionapirest.entities.EmplacementStock;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface EmplacementStockMapper extends GenericMapper<EmplacementStock, EmplacementStockDTO> {
    
    // Mapping de l'entité vers le DTO
    EmplacementStockDTO toDTO(EmplacementStock entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "moyensAcces", ignore = true)
    EmplacementStock toEntity(EmplacementStockDTO dto);
}
