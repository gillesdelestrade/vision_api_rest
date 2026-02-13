package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierMutationDTO;
import fr.d4immobilier.visionapirest.entities.FichierMutation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierMutationMapper extends GenericMapper<FichierMutation, FichierMutationDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "typeFichierMutation", target = "typeFichierMutation", qualifiedByName = "typeFichierMutationToString")
    FichierMutationDTO toDTO(FichierMutation entity);

    // Mapping du DTO vers l'entité
        FichierMutation toEntity(FichierMutationDTO dto);

    // Méthodes helper pour les enums

    @Named("typeFichierMutationToString")
    default String typeFichierMutationToString(fr.d4immobilier.visionapirest.entities.TypeFichierMutation value) {
        return value != null ? value.name() : null;
    }
}
