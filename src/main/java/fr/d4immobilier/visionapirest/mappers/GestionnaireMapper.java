package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.GestionnaireDTO;
import fr.d4immobilier.visionapirest.entities.Gestionnaire;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface GestionnaireMapper extends GenericMapper<Gestionnaire, GestionnaireDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "agence.id", target = "agenceId")
    GestionnaireDTO toDTO(Gestionnaire entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "coproprietesGereesEnTantQueSedentaire", ignore = true)
    @Mapping(target = "agence", ignore = true)
    @Mapping(target = "coproprietes", ignore = true)
    Gestionnaire toEntity(GestionnaireDTO dto);
}
