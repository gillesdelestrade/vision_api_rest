package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.LivraisonDTO;
import fr.d4immobilier.visionapirest.entities.Livraison;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface LivraisonMapper extends GenericMapper<Livraison, LivraisonDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "documentBonDeLivraison.id", target = "documentBonDeLivraisonId")
    @Mapping(source = "fichierBonDeLivraison.id", target = "fichierBonDeLivraisonId")
    @Mapping(source = "panierCommandeMoyenAcces.id", target = "panierCommandeMoyenAccesId")
    @Mapping(source = "dateExpedition", target = "dateExpedition", qualifiedByName = "dateExpeditionToString")
    @Mapping(source = "typeEnvoi", target = "typeEnvoi", qualifiedByName = "typeEnvoiToString")
    @Mapping(source = "dateLivraison", target = "dateLivraison", qualifiedByName = "dateLivraisonToString")
    @Mapping(source = "destinationLivraison", target = "destinationLivraison", qualifiedByName = "destinationLivraisonToString")
    LivraisonDTO toDTO(Livraison entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "documentBonDeLivraison", ignore = true)
    @Mapping(target = "moyensAcces", ignore = true)
    @Mapping(target = "fichierBonDeLivraison", ignore = true)
    @Mapping(target = "panierCommandeMoyenAcces", ignore = true)
    Livraison toEntity(LivraisonDTO dto);

    // Méthodes helper pour les enums

    @Named("dateExpeditionToString")
    default String dateExpeditionToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("typeEnvoiToString")
    default String typeEnvoiToString(fr.d4immobilier.visionapirest.entities.TypeEnvoi value) {
        return value != null ? value.name() : null;
    }

    @Named("dateLivraisonToString")
    default String dateLivraisonToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("destinationLivraisonToString")
    default String destinationLivraisonToString(fr.d4immobilier.visionapirest.entities.DestinationLivraison value) {
        return value != null ? value.name() : null;
    }
}
