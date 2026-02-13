package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PrestationContratDTO;
import fr.d4immobilier.visionapirest.entities.PrestationContrat;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PrestationContratMapper extends GenericMapper<PrestationContrat, PrestationContratDTO> {
    
    // Mapping de l'entité vers le DTO
    PrestationContratDTO toDTO(PrestationContrat entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "typeEquipements", ignore = true)
    PrestationContrat toEntity(PrestationContratDTO dto);
}
