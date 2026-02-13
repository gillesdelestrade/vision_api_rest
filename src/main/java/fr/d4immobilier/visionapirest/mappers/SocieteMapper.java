package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.SocieteDTO;
import fr.d4immobilier.visionapirest.entities.Societe;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface SocieteMapper extends GenericMapper<Societe, SocieteDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "compteVision.id", target = "compteVisionId")
    @Mapping(source = "adresse.id", target = "adresseId")
    @Mapping(source = "representant.id", target = "representantId")
    SocieteDTO toDTO(Societe entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "autorisationsValidationFactures", ignore = true)
                @Mapping(target = "compteVision", ignore = true)
    @Mapping(target = "compteEnBanqueSocietes", ignore = true)
    @Mapping(target = "cheques", ignore = true)
    @Mapping(target = "appelsEntrants", ignore = true)
        @Mapping(target = "adresse", ignore = true)
    @Mapping(target = "representant", ignore = true)
    Societe toEntity(SocieteDTO dto);
}
