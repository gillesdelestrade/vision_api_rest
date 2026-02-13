package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.SinistreDTO;
import fr.d4immobilier.visionapirest.entities.Sinistre;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface SinistreMapper extends GenericMapper<Sinistre, SinistreDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "courrierDeclarationSinistre.id", target = "courrierDeclarationSinistreId")
    @Mapping(source = "assurance.id", target = "assuranceId")
    @Mapping(source = "coproprietaireLese.id", target = "coproprietaireLeseId")
    @Mapping(source = "coproprietaireOrigine.id", target = "coproprietaireOrigineId")
    @Mapping(source = "natureSinistre", target = "natureSinistre", qualifiedByName = "natureSinistreToString")
    @Mapping(source = "typeLeseSinistre", target = "typeLeseSinistre", qualifiedByName = "typeLeseSinistreToString")
    @Mapping(source = "typeOrigineSinistre", target = "typeOrigineSinistre", qualifiedByName = "typeOrigineSinistreToString")
        @Mapping(source = "motifClotureSinistre", target = "motifClotureSinistre", qualifiedByName = "motifClotureSinistreToString")
    SinistreDTO toDTO(Sinistre entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "courrierDeclarationSinistre", ignore = true)
    @Mapping(target = "assurance", ignore = true)
    @Mapping(target = "coproprietaireLese", ignore = true)
    @Mapping(target = "coproprietaireOrigine", ignore = true)
    Sinistre toEntity(SinistreDTO dto);

    // Méthodes helper pour les enums

    @Named("natureSinistreToString")
    default String natureSinistreToString(fr.d4immobilier.visionapirest.entities.NatureSinistre value) {
        return value != null ? value.name() : null;
    }

    @Named("typeLeseSinistreToString")
    default String typeLeseSinistreToString(fr.d4immobilier.visionapirest.entities.TypeLeseSinistre value) {
        return value != null ? value.name() : null;
    }

    @Named("typeOrigineSinistreToString")
    default String typeOrigineSinistreToString(fr.d4immobilier.visionapirest.entities.TypeOrigineSinistre value) {
        return value != null ? value.name() : null;
    }

    @Named("coproprieteToString")
    default String coproprieteToString(fr.d4immobilier.visionapirest.entities.Copropriete value) {
        return value != null ? value.getNom(): null;
    }

    @Named("motifClotureSinistreToString")
    default String motifClotureSinistreToString(fr.d4immobilier.visionapirest.entities.MotifClotureSinistre value) {
        return value != null ? value.name() : null;
    }
}
