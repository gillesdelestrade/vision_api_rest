package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierProjetRepartitionDTO;
import fr.d4immobilier.visionapirest.entities.FichierProjetRepartition;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierProjetRepartitionMapper extends GenericMapper<FichierProjetRepartition, FichierProjetRepartitionDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "assemblee.id", target = "assembleeId")
    FichierProjetRepartitionDTO toDTO(FichierProjetRepartition entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "assemblee", ignore = true)
    FichierProjetRepartition toEntity(FichierProjetRepartitionDTO dto);
}
