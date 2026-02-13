package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DemandeDevisFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.DemandeDevisFournisseur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DemandeDevisFournisseurMapper extends GenericMapper<DemandeDevisFournisseur, DemandeDevisFournisseurDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "documentDemandeDevis.id", target = "documentDemandeDevisId")
    @Mapping(source = "fichierDemandeDevisFournisseur.id", target = "fichierDemandeDevisFournisseurId")
    @Mapping(source = "fournisseur.id", target = "fournisseurId")
    @Mapping(source = "demandeDevis.id", target = "demandeDevisId")
    @Mapping(source = "datePriseEnCompteFournisseur", target = "datePriseEnCompteFournisseur", qualifiedByName = "datePriseEnCompteFournisseurToString")
    DemandeDevisFournisseurDTO toDTO(DemandeDevisFournisseur entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "documentDemandeDevis", ignore = true)
    @Mapping(target = "fichierDemandeDevisFournisseur", ignore = true)
    @Mapping(target = "fournisseur", ignore = true)
    @Mapping(target = "demandeDevis", ignore = true)
    @Mapping(target = "devisFournisseurs", ignore = true)
    DemandeDevisFournisseur toEntity(DemandeDevisFournisseurDTO dto);

    // Méthodes helper pour les enums

    @Named("datePriseEnCompteFournisseurToString")
    default String datePriseEnCompteFournisseurToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
