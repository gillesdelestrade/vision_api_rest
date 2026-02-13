package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PointAbordeDTO;
import fr.d4immobilier.visionapirest.entities.PointAborde;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PointAbordeMapper extends GenericMapper<PointAborde, PointAbordeDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "reunion.id", target = "reunionId")
    @Mapping(source = "demande.id", target = "demandeId")
    PointAbordeDTO toDTO(PointAborde entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "fichiersReunion", ignore = true)
    @Mapping(target = "actionsPointAborde", ignore = true)
    @Mapping(target = "reunion", ignore = true)
    @Mapping(target = "demande", ignore = true)
    PointAborde toEntity(PointAbordeDTO dto);
}
