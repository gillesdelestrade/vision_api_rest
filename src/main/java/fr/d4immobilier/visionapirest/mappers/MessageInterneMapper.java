package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MessageInterneDTO;
import fr.d4immobilier.visionapirest.entities.MessageInterne;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface MessageInterneMapper extends GenericMapper<MessageInterne, MessageInterneDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "auteur.id", target = "auteurId")
    @Mapping(source = "destinataire.id", target = "destinataireId")
    @Mapping(source = "dateEmission", target = "dateEmission", qualifiedByName = "dateEmissionToString")
    MessageInterneDTO toDTO(MessageInterne entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "auteur", ignore = true)
    @Mapping(target = "destinataire", ignore = true)
    MessageInterne toEntity(MessageInterneDTO dto);

    // Méthodes helper pour les enums

    @Named("dateEmissionToString")
    default String dateEmissionToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
