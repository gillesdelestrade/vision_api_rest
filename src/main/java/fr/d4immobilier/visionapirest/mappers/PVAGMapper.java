package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PVAGDTO;
import fr.d4immobilier.visionapirest.entities.PVAG;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PVAGMapper extends GenericMapper<PVAG, PVAGDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "assemblee.id", target = "assembleeId")
    @Mapping(source = "fichierPVAG.id", target = "fichierPVAGId")
        @Mapping(source = "dateAG", target = "dateAG", qualifiedByName = "dateAGToString")
    PVAGDTO toDTO(PVAG entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "assemblee", ignore = true)
    @Mapping(target = "courrierDiffusionPVAGs", ignore = true)
    @Mapping(target = "fichierPVAG", ignore = true)
    @Mapping(target = "actionPVAGs", ignore = true)
        PVAG toEntity(PVAGDTO dto);

    // Méthodes helper pour les enums

    @Named("dateAGToString")
    default String dateAGToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
