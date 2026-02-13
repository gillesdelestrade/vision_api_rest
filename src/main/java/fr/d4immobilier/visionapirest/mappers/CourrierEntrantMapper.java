package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CourrierEntrantDTO;
import fr.d4immobilier.visionapirest.entities.CourrierEntrant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CourrierEntrantMapper extends GenericMapper<CourrierEntrant, CourrierEntrantDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "typeDocumentCourrierEntrant.id", target = "typeDocumentCourrierEntrantId")
    @Mapping(source = "fichierCourrierEntrant.id", target = "fichierCourrierEntrantId")
    @Mapping(source = "coproprietaireProvenance.id", target = "coproprietaireProvenanceId")
    @Mapping(source = "fournisseurProvenance.id", target = "fournisseurProvenanceId")
    @Mapping(source = "provenanceCourrierEntrant", target = "provenanceCourrierEntrant", qualifiedByName = "provenanceCourrierEntrantToString")
    CourrierEntrantDTO toDTO(CourrierEntrant entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "typeDocumentCourrierEntrant", ignore = true)
    @Mapping(target = "fichierCourrierEntrant", ignore = true)
    @Mapping(target = "coproprietaireProvenance", ignore = true)
    @Mapping(target = "fournisseurProvenance", ignore = true)
    CourrierEntrant toEntity(CourrierEntrantDTO dto);

    // Méthodes helper pour les enums

    @Named("provenanceCourrierEntrantToString")
    default String provenanceCourrierEntrantToString(fr.d4immobilier.visionapirest.entities.ProvenanceCourrierEntrant value) {
        return value != null ? value.name() : null;
    }
}
