package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CommentaireDevisFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.CommentaireDevisFournisseur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CommentaireDevisFournisseurMapper extends GenericMapper<CommentaireDevisFournisseur, CommentaireDevisFournisseurDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "devisFournisseur.id", target = "devisFournisseurId")
    @Mapping(source = "auteurPersonne.id", target = "auteurPersonneId")
    @Mapping(source = "auteurSociete.id", target = "auteurSocieteId")
    @Mapping(source = "dateCommentaire", target = "dateCommentaire", qualifiedByName = "dateCommentaireToString")
    CommentaireDevisFournisseurDTO toDTO(CommentaireDevisFournisseur entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "devisFournisseur", ignore = true)
    @Mapping(target = "auteurPersonne", ignore = true)
    @Mapping(target = "auteurSociete", ignore = true)
    CommentaireDevisFournisseur toEntity(CommentaireDevisFournisseurDTO dto);

    // Méthodes helper pour les enums

    @Named("dateCommentaireToString")
    default String dateCommentaireToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
