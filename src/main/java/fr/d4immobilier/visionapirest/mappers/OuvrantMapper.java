package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.OuvrantDTO;
import fr.d4immobilier.visionapirest.entities.Ouvrant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface OuvrantMapper extends GenericMapper<Ouvrant, OuvrantDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "typeOuvrant", target = "typeOuvrant", qualifiedByName = "typeOuvrantToString")
    OuvrantDTO toDTO(Ouvrant entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "moyensAccesCatalogues", ignore = true)
        Ouvrant toEntity(OuvrantDTO dto);

    // Méthodes helper pour les enums

    @Named("typeOuvrantToString")
    default String typeOuvrantToString(fr.d4immobilier.visionapirest.entities.TypeOuvrant value) {
        return value != null ? value.name() : null;
    }
}
