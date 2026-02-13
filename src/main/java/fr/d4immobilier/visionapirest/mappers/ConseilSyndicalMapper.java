package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ConseilSyndicalDTO;
import fr.d4immobilier.visionapirest.entities.ConseilSyndical;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ConseilSyndicalMapper extends GenericMapper<ConseilSyndical, ConseilSyndicalDTO> {
    
    // Mapping de l'entité vers le DTO
//        @Mapping(source = "president.id", target = "presidentId")
//    @Mapping(source = "presidentSociete.id", target = "presidentSocieteId")
//    ConseilSyndicalDTO toDTO(ConseilSyndical entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "autorisationsValidationFactures", ignore = true)
        @Mapping(target = "president", ignore = true)
    @Mapping(target = "membres", ignore = true)
    @Mapping(target = "presidentSociete", ignore = true)
    @Mapping(target = "membresSocietes", ignore = true)
    ConseilSyndical toEntity(ConseilSyndicalDTO dto);
}
