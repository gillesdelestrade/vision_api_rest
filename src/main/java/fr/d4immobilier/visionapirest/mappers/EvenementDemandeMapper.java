package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EvenementDemandeDTO;
import fr.d4immobilier.visionapirest.entities.EvenementDemande;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface EvenementDemandeMapper extends GenericMapper<EvenementDemande, EvenementDemandeDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "courriel.id", target = "courrielId")
    @Mapping(source = "reunionV2.id", target = "reunionV2Id")
    @Mapping(source = "demande.id", target = "demandeId")
    @Mapping(source = "auteur.id", target = "auteurId")
    @Mapping(source = "etapeDemande.id", target = "etapeDemandeId")
    @Mapping(source = "dateEvenement", target = "dateEvenement", qualifiedByName = "dateEvenementToString")
    EvenementDemandeDTO toDTO(EvenementDemande entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "courriel", ignore = true)
    @Mapping(target = "reunionV2", ignore = true)
    @Mapping(target = "demande", ignore = true)
    @Mapping(target = "auteur", ignore = true)
    @Mapping(target = "etapeDemande", ignore = true)
    EvenementDemande toEntity(EvenementDemandeDTO dto);

    // Méthodes helper pour les enums

    @Named("dateEvenementToString")
    default String dateEvenementToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
