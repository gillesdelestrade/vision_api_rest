package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PointODJReunionDTO;
import fr.d4immobilier.visionapirest.entities.PointODJReunion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PointODJReunionMapper extends GenericMapper<PointODJReunion, PointODJReunionDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "oDJReunion.id", target = "ODJReunionId")
    @Mapping(source = "demande.id", target = "demandeId")
    @Mapping(source = "attenduCS.id", target = "attenduCSId")
    PointODJReunionDTO toDTO(PointODJReunion entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "oDJReunion", ignore = true)
    @Mapping(target = "demande", ignore = true)
    @Mapping(target = "attenduCS", ignore = true)
    PointODJReunion toEntity(PointODJReunionDTO dto);
}
