package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PrixCatalogueDTO;
import fr.d4immobilier.visionapirest.entities.PrixCatalogue;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PrixCatalogueMapper extends GenericMapper<PrixCatalogue, PrixCatalogueDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "tarif.id", target = "tarifId")
    @Mapping(source = "produitCatalogue.id", target = "produitCatalogueId")
    PrixCatalogueDTO toDTO(PrixCatalogue entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "tarif", ignore = true)
    @Mapping(target = "produitCatalogue", ignore = true)
    PrixCatalogue toEntity(PrixCatalogueDTO dto);
}
