package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ReunionV2DTO;
import fr.d4immobilier.visionapirest.entities.ReunionV2;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ReunionV2Mapper extends GenericMapper<ReunionV2, ReunionV2DTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "typeReunion", target = "typeReunion", qualifiedByName = "typeReunionToString")
    ReunionV2DTO toDTO(ReunionV2 entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "evenementsDemande", ignore = true)
    @Mapping(target = "fichiersDemande", ignore = true)
    @Mapping(target = "actionsDemande", ignore = true)
    ReunionV2 toEntity(ReunionV2DTO dto);

    // Méthodes helper pour les enums

    @Named("typeReunionToString")
    default String typeReunionToString(fr.d4immobilier.visionapirest.entities.TypeReunion value) {
        return value != null ? value.name() : null;
    }
}
