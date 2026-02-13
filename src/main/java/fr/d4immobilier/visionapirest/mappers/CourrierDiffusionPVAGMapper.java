package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CourrierDiffusionPVAGDTO;
import fr.d4immobilier.visionapirest.entities.CourrierDiffusionPVAG;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CourrierDiffusionPVAGMapper extends GenericMapper<CourrierDiffusionPVAG, CourrierDiffusionPVAGDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "pvag.id", target = "pvagId")
    CourrierDiffusionPVAGDTO toDTO(CourrierDiffusionPVAG entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "pvag", ignore = true)
    CourrierDiffusionPVAG toEntity(CourrierDiffusionPVAGDTO dto);
}
