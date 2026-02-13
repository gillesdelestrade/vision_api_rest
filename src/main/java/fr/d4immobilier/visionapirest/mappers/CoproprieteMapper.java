package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CoproprieteDTO;
import fr.d4immobilier.visionapirest.entities.Copropriete;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CoproprieteMapper extends GenericMapper<Copropriete, CoproprieteDTO> {

    // Mapping de l'entité vers le DTO
    @Mapping(source = "adresse.id", target = "adresseId")
    @Mapping(source = "gestionnaire.id", target = "gestionnaireId")
    @Mapping(source = "gestionnaireSedentaire.id", target = "gestionnaireSedentaireId")
    @Mapping(source = "comptable.id", target = "comptableId")
    @Mapping(source = "gestionnaire", target = "gestionnaireInitiales", qualifiedByName = "getInitiales")
    @Mapping(source = "gestionnaireSedentaire", target = "gestionnaireSedentaireInitiales", qualifiedByName = "getInitiales")
    @Mapping(source = "comptable", target = "comptableInitiales", qualifiedByName = "getInitiales")
   
    @Mapping(source = "conseilSyndical.id", target = "conseilSyndicalId")
    @Mapping(source = "syndic.id", target = "syndicId")
    @Mapping(source = "typeCopropriete", target = "typeCopropriete", qualifiedByName = "typeCoproprieteToString")
    @Mapping(source = "statutCopropriete", target = "statutCopropriete", qualifiedByName = "statutCoproprieteToString")
    CoproprieteDTO toDTO(Copropriete entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "adresse", ignore = true)
    @Mapping(target = "gestionnaire", ignore = true)
    @Mapping(target = "gestionnaireSedentaire", ignore = true)
    @Mapping(target = "comptable", ignore = true)
    @Mapping(target = "lots", ignore = true)
    @Mapping(target = "devis", ignore = true)
    @Mapping(target = "coproprietairesImport", ignore = true)
    @Mapping(target = "demandes", ignore = true)
    @Mapping(target = "comptesEnBanqueCopropriete", ignore = true)
    @Mapping(target = "bordereauxDeRemiseDeCheques", ignore = true)
    @Mapping(target = "conseilSyndical", ignore = true)
    @Mapping(target = "fournisseursReferences", ignore = true)
    @Mapping(target = "actions", ignore = true)
    @Mapping(target = "dossiers", ignore = true)
    @Mapping(target = "membresASL", ignore = true)
    @Mapping(target = "syndic", ignore = true)
    @Mapping(target = "facturesFournisseurs", ignore = true)
    @Mapping(target = "concierges", ignore = true)
    @Mapping(target = "courriers", ignore = true)
    @Mapping(target = "contratsFournisseur", ignore = true)
    @Mapping(target = "sinistres", ignore = true)
    @Mapping(target = "assurances", ignore = true)
    @Mapping(target = "reunions", ignore = true)
    @Mapping(target = "pVAGs", ignore = true)
    @Mapping(target = "batiments", ignore = true)
    @Mapping(target = "budgets", ignore = true)
    Copropriete toEntity(CoproprieteDTO dto);

    // Méthode pour extraire les initiales
    @Named("getInitiales")
    default String getInitiales(fr.d4immobilier.visionapirest.entities.Gestionnaire gestionnaire) {
        if (gestionnaire == null) {
            return null;
        }

        StringBuilder initiales = new StringBuilder();

        if (gestionnaire.getPrenom() != null && !gestionnaire.getPrenom().isEmpty()) {
            initiales.append(gestionnaire.getPrenom().substring(0, 1).toUpperCase());
        }

        if (gestionnaire.getNom() != null && !gestionnaire.getNom().isEmpty()) {
            initiales.append(gestionnaire.getNom().substring(0, 1).toUpperCase());
        }

        return initiales.length() > 0 ? initiales.toString() : null;
    }

    // Méthodes helper pour les enums
    @Named("typeCoproprieteToString")
    default String typeCoproprieteToString(fr.d4immobilier.visionapirest.entities.TypeCopropriete value) {
        return value != null ? value.name() : null;
    }

    @Named("statutCoproprieteToString")
    default String statutCoproprieteToString(fr.d4immobilier.visionapirest.entities.StatutCopropriete value) {
        return value != null ? value.name() : null;
    }
}
