package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DocumentDTO;
import fr.d4immobilier.visionapirest.entities.Document;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DocumentMapper extends GenericMapper<Document, DocumentDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "auteur.id", target = "auteurId")
    @Mapping(source = "destinatairePersonne.id", target = "destinatairePersonneId")
    @Mapping(source = "destinataireSociete.id", target = "destinataireSocieteId")
    @Mapping(source = "dateCreation", target = "dateCreation", qualifiedByName = "dateCreationToString")
    DocumentDTO toDTO(Document entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "auteur", ignore = true)
    @Mapping(target = "destinatairePersonne", ignore = true)
    @Mapping(target = "destinataireSociete", ignore = true)
    Document toEntity(DocumentDTO dto);

    // Méthodes helper pour les enums

    @Named("dateCreationToString")
    default String dateCreationToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
