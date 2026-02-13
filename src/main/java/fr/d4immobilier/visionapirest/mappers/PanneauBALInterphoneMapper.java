package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PanneauBALInterphoneDTO;
import fr.d4immobilier.visionapirest.entities.PanneauBALInterphone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PanneauBALInterphoneMapper extends GenericMapper<PanneauBALInterphone, PanneauBALInterphoneDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "batiment.id", target = "batimentId")
    @Mapping(source = "typePanneau", target = "typePanneau", qualifiedByName = "typePanneauToString")
    PanneauBALInterphoneDTO toDTO(PanneauBALInterphone entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "emplacements", ignore = true)
        @Mapping(target = "batiment", ignore = true)
    PanneauBALInterphone toEntity(PanneauBALInterphoneDTO dto);

    // Méthodes helper pour les enums

    @Named("typePanneauToString")
    default String typePanneauToString(fr.d4immobilier.visionapirest.entities.TypePanneau value) {
        return value != null ? value.name() : null;
    }
}
