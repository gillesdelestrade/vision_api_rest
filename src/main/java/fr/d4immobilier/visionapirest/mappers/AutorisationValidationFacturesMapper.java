package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AutorisationValidationFacturesDTO;
import fr.d4immobilier.visionapirest.entities.AutorisationValidationFactures;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface AutorisationValidationFacturesMapper extends GenericMapper<AutorisationValidationFactures, AutorisationValidationFacturesDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "conseilSyndical.id", target = "conseilSyndicalId")
    @Mapping(source = "personne.id", target = "personneId")
    @Mapping(source = "societe.id", target = "societeId")
    AutorisationValidationFacturesDTO toDTO(AutorisationValidationFactures entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "conseilSyndical", ignore = true)
    @Mapping(target = "personne", ignore = true)
    @Mapping(target = "societe", ignore = true)
    AutorisationValidationFactures toEntity(AutorisationValidationFacturesDTO dto);
}
