package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.Bordereau_CoproprietaireDTO;
import fr.d4immobilier.visionapirest.entities.Bordereau_Coproprietaire;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface Bordereau_CoproprietaireMapper extends GenericMapper<Bordereau_Coproprietaire, Bordereau_CoproprietaireDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "bordereau.id", target = "bordereauId")
    @Mapping(source = "coproprietaire.id", target = "coproprietaireId")
    @Mapping(source = "created_at", target = "created_at", qualifiedByName = "created_atToString")
    Bordereau_CoproprietaireDTO toDTO(Bordereau_Coproprietaire entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "bordereau", ignore = true)
    @Mapping(target = "coproprietaire", ignore = true)
    Bordereau_Coproprietaire toEntity(Bordereau_CoproprietaireDTO dto);

    // Méthodes helper pour les enums

    @Named("created_atToString")
    default String created_atToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
