package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.OptionTravauxDTO;
import fr.d4immobilier.visionapirest.entities.OptionTravaux;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface OptionTravauxMapper extends GenericMapper<OptionTravaux, OptionTravauxDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "resolution.id", target = "resolutionId")
    @Mapping(source = "devisFournisseur.id", target = "devisFournisseurId")
    OptionTravauxDTO toDTO(OptionTravaux entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "resolution", ignore = true)
    @Mapping(target = "devisFournisseur", ignore = true)
    OptionTravaux toEntity(OptionTravauxDTO dto);
}
