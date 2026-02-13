package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ModeleCourrierDTO;
import fr.d4immobilier.visionapirest.entities.ModeleCourrier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ModeleCourrierMapper extends GenericMapper<ModeleCourrier, ModeleCourrierDTO> {
    
    // Mapping de l'entité vers le DTO
    ModeleCourrierDTO toDTO(ModeleCourrier entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "courriers", ignore = true)
    @Mapping(target = "actionsModeleCourrier", ignore = true)
    ModeleCourrier toEntity(ModeleCourrierDTO dto);
}
