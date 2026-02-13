package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DemandeDTO;
import fr.d4immobilier.visionapirest.entities.Demande;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DemandeMapper extends GenericMapper<Demande, DemandeDTO> {
    
    // Mapping de l'entité vers le DTO
            @Mapping(source = "emetteur.id", target = "emetteurId")
        @Mapping(source = "equipement.id", target = "equipementId")
    @Mapping(source = "attributaire.id", target = "attributaireId")
    @Mapping(source = "boiteArchive.id", target = "boiteArchiveId")
    @Mapping(source = "dateConstat", target = "dateConstat", qualifiedByName = "dateConstatToString")
    @Mapping(source = "etatDemande", target = "etatDemande", qualifiedByName = "etatDemandeToString")
    @Mapping(source = "importance", target = "importance", qualifiedByName = "importanceToString")
    @Mapping(source = "urgence", target = "urgence", qualifiedByName = "urgenceToString")
    @Mapping(source = "dateDernierImportMailAtraiter", target = "dateDernierImportMailAtraiter", qualifiedByName = "dateDernierImportMailAtraiterToString")
    DemandeDTO toDTO(Demande entity);

    // Mapping du DTO vers l'entité
                    @Mapping(target = "pointsAbordes", ignore = true)
    @Mapping(target = "demandeDevis", ignore = true)
    @Mapping(target = "courriersDemandes", ignore = true)
    @Mapping(target = "appelsEntrant", ignore = true)
    @Mapping(target = "actionDemandes", ignore = true)
    @Mapping(target = "interventionDemandes", ignore = true)
    @Mapping(target = "fichierDemandes", ignore = true)
    @Mapping(target = "evenementsDemande", ignore = true)
    @Mapping(target = "emetteur", ignore = true)
        @Mapping(target = "equipement", ignore = true)
    @Mapping(target = "attributaire", ignore = true)
    @Mapping(target = "historiqueAttributaire", ignore = true)
    @Mapping(target = "boiteArchive", ignore = true)
    @Mapping(target = "personnesAbonnees", ignore = true)
    @Mapping(target = "societesAbonnees", ignore = true)
    Demande toEntity(DemandeDTO dto);

    // Méthodes helper pour les enums

    @Named("dateConstatToString")
    default String dateConstatToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("etatDemandeToString")
    default String etatDemandeToString(fr.d4immobilier.visionapirest.entities.EtatDemande value) {
        return value != null ? value.name() : null;
    }

    @Named("importanceToString")
    default String importanceToString(fr.d4immobilier.visionapirest.entities.Importance value) {
        return value != null ? value.name() : null;
    }

    @Named("urgenceToString")
    default String urgenceToString(fr.d4immobilier.visionapirest.entities.Urgence value) {
        return value != null ? value.name() : null;
    }

    @Named("dateDernierImportMailAtraiterToString")
    default String dateDernierImportMailAtraiterToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
