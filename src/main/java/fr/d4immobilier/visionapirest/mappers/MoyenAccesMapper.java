package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MoyenAccesDTO;
import fr.d4immobilier.visionapirest.entities.MoyenAcces;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface MoyenAccesMapper extends GenericMapper<MoyenAcces, MoyenAccesDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "panierCommandeMoyenAcces.id", target = "panierCommandeMoyenAccesId")
    @Mapping(source = "moyenAccesCatalogue.id", target = "moyenAccesCatalogueId")
        @Mapping(source = "emplacementStock.id", target = "emplacementStockId")
    @Mapping(source = "dateCommande", target = "dateCommande", qualifiedByName = "dateCommandeToString")
    @Mapping(source = "dateEntreeDansLeStock", target = "dateEntreeDansLeStock", qualifiedByName = "dateEntreeDansLeStockToString")
    @Mapping(source = "dateSortieDuSotck", target = "dateSortieDuSotck", qualifiedByName = "dateSortieDuSotckToString")
    @Mapping(source = "dateDeclarationPerte", target = "dateDeclarationPerte", qualifiedByName = "dateDeclarationPerteToString")
    @Mapping(source = "dateDesactivation", target = "dateDesactivation", qualifiedByName = "dateDesactivationToString")
    MoyenAccesDTO toDTO(MoyenAcces entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "panierCommandeMoyenAcces", ignore = true)
    @Mapping(target = "moyenAccesCatalogue", ignore = true)
    @Mapping(target = "lotRattache", ignore = true)
        @Mapping(target = "emplacementStock", ignore = true)
    MoyenAcces toEntity(MoyenAccesDTO dto);

    // Méthodes helper pour les enums

    @Named("dateCommandeToString")
    default String dateCommandeToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("dateEntreeDansLeStockToString")
    default String dateEntreeDansLeStockToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("dateSortieDuSotckToString")
    default String dateSortieDuSotckToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("dateDeclarationPerteToString")
    default String dateDeclarationPerteToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("dateDesactivationToString")
    default String dateDesactivationToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
