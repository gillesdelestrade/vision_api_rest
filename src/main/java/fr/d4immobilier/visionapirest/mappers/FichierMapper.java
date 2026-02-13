package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierDTO;
import fr.d4immobilier.visionapirest.entities.Fichier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierMapper extends GenericMapper<Fichier, FichierDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "courrierPourPieceJointe.id", target = "courrierPourPieceJointeId")
    @Mapping(source = "auteur.id", target = "auteurId")
    @Mapping(source = "dateCreation", target = "dateCreation", qualifiedByName = "dateCreationToString")
    FichierDTO toDTO(Fichier entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "courrierPourPieceJointe", ignore = true)
    @Mapping(target = "auteur", ignore = true)
    Fichier toEntity(FichierDTO dto);

    // Méthodes helper pour les enums

    @Named("dateCreationToString")
    default String dateCreationToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
