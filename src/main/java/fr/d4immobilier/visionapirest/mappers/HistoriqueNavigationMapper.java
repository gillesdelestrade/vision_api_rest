package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.HistoriqueNavigationDTO;
import fr.d4immobilier.visionapirest.entities.HistoriqueNavigation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface HistoriqueNavigationMapper extends GenericMapper<HistoriqueNavigation, HistoriqueNavigationDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "personneConnectee.id", target = "personneConnecteeId")
    @Mapping(source = "societeConnectee.id", target = "societeConnecteeId")
    @Mapping(source = "dateConnexion", target = "dateConnexion", qualifiedByName = "dateConnexionToString")
    HistoriqueNavigationDTO toDTO(HistoriqueNavigation entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "personneConnectee", ignore = true)
    @Mapping(target = "societeConnectee", ignore = true)
    HistoriqueNavigation toEntity(HistoriqueNavigationDTO dto);

    // Méthodes helper pour les enums

    @Named("dateConnexionToString")
    default String dateConnexionToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
