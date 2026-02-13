package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.SuppressionFraisDeRelanceDTO;
import fr.d4immobilier.visionapirest.entities.SuppressionFraisDeRelance;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface SuppressionFraisDeRelanceMapper extends GenericMapper<SuppressionFraisDeRelance, SuppressionFraisDeRelanceDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "coproprietaire.id", target = "coproprietaireId")
        SuppressionFraisDeRelanceDTO toDTO(SuppressionFraisDeRelance entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "coproprietaire", ignore = true)
        SuppressionFraisDeRelance toEntity(SuppressionFraisDeRelanceDTO dto);
}
