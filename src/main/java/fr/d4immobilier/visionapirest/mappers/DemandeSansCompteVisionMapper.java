package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DemandeSansCompteVisionDTO;
import fr.d4immobilier.visionapirest.entities.DemandeSansCompteVision;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DemandeSansCompteVisionMapper extends GenericMapper<DemandeSansCompteVision, DemandeSansCompteVisionDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "demande.id", target = "demandeId")
    @Mapping(source = "dateCreation", target = "dateCreation", qualifiedByName = "dateCreationToString")
    DemandeSansCompteVisionDTO toDTO(DemandeSansCompteVision entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "demande", ignore = true)
    @Mapping(target = "fichiers", ignore = true)
    DemandeSansCompteVision toEntity(DemandeSansCompteVisionDTO dto);

    // Méthodes helper pour les enums

    @Named("dateCreationToString")
    default String dateCreationToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
