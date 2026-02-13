package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BordereauDTO;
import fr.d4immobilier.visionapirest.entities.Bordereau;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface BordereauMapper extends GenericMapper<Bordereau, BordereauDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "gestionnaire.id", target = "gestionnaireId")
    @Mapping(source = "created_at", target = "created_at", qualifiedByName = "created_atToString")
    @Mapping(source = "updated_at", target = "updated_at", qualifiedByName = "updated_atToString")
    BordereauDTO toDTO(Bordereau entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "bordereaux_Coproprietaire", ignore = true)
        @Mapping(target = "gestionnaire", ignore = true)
    Bordereau toEntity(BordereauDTO dto);

    // Méthodes helper pour les enums

    @Named("created_atToString")
    default String created_atToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("updated_atToString")
    default String updated_atToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
