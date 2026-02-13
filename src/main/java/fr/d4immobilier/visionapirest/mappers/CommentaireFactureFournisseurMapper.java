package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CommentaireFactureFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.CommentaireFactureFournisseur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CommentaireFactureFournisseurMapper extends GenericMapper<CommentaireFactureFournisseur, CommentaireFactureFournisseurDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "factureFournisseur.id", target = "factureFournisseurId")
    @Mapping(source = "auteurPersonne.id", target = "auteurPersonneId")
    @Mapping(source = "auteurSociete.id", target = "auteurSocieteId")
    @Mapping(source = "dateCommentaire", target = "dateCommentaire", qualifiedByName = "dateCommentaireToString")
    CommentaireFactureFournisseurDTO toDTO(CommentaireFactureFournisseur entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "factureFournisseur", ignore = true)
    @Mapping(target = "auteurPersonne", ignore = true)
    @Mapping(target = "auteurSociete", ignore = true)
    CommentaireFactureFournisseur toEntity(CommentaireFactureFournisseurDTO dto);

    // Méthodes helper pour les enums

    @Named("dateCommentaireToString")
    default String dateCommentaireToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
