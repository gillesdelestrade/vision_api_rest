package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DemandeDeRappelDTO;
import fr.d4immobilier.visionapirest.entities.DemandeDeRappel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DemandeDeRappelMapper extends GenericMapper<DemandeDeRappel, DemandeDeRappelDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "gestionnaireQuiDoitRappeler.id", target = "gestionnaireQuiDoitRappelerId")
    @Mapping(source = "dateAppel", target = "dateAppel", qualifiedByName = "dateAppelToString")
    DemandeDeRappelDTO toDTO(DemandeDeRappel entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "rappelsTelephoniques", ignore = true)
    @Mapping(target = "gestionnaireQuiDoitRappeler", ignore = true)
    DemandeDeRappel toEntity(DemandeDeRappelDTO dto);

    // Méthodes helper pour les enums

    @Named("dateAppelToString")
    default String dateAppelToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
