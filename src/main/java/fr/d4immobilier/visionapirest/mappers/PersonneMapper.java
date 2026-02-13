package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PersonneDTO;
import fr.d4immobilier.visionapirest.entities.Personne;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PersonneMapper extends GenericMapper<Personne, PersonneDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "adresse.id", target = "adresseId")
    @Mapping(source = "compteVision.id", target = "compteVisionId")
    PersonneDTO toDTO(Personne entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "adresse", ignore = true)
    @Mapping(target = "compteVision", ignore = true)
    @Mapping(target = "agences", ignore = true)
    @Mapping(target = "actionsEmises", ignore = true)
    @Mapping(target = "actionsRecues", ignore = true)
    @Mapping(target = "documents", ignore = true)
    @Mapping(target = "demandes", ignore = true)
        @Mapping(target = "compteEnBanquePersonnes", ignore = true)
            @Mapping(target = "appelsEntrants", ignore = true)
    @Mapping(target = "cheques", ignore = true)
        @Mapping(target = "autorisationsValidationFactures", ignore = true)
    @Mapping(target = "societesRepresentees", ignore = true)
    @Mapping(target = "demandesAttribuees", ignore = true)
    @Mapping(target = "historiqueDemandesAttribuees", ignore = true)
    Personne toEntity(PersonneDTO dto);
}
