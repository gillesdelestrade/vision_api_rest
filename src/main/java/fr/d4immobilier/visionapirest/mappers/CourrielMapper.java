package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CourrielDTO;
import fr.d4immobilier.visionapirest.entities.Courriel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CourrielMapper extends GenericMapper<Courriel, CourrielDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "boiteMail.id", target = "boiteMailId")
        @Mapping(source = "dateReception", target = "dateReception", qualifiedByName = "dateReceptionToString")
    CourrielDTO toDTO(Courriel entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "boiteMail", ignore = true)
    @Mapping(target = "coproprietes", ignore = true)
        @Mapping(target = "evenementsDemande", ignore = true)
    Courriel toEntity(CourrielDTO dto);

    // Méthodes helper pour les enums

    @Named("dateReceptionToString")
    default String dateReceptionToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
