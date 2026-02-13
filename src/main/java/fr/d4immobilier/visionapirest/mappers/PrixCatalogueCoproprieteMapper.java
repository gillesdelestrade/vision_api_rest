package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PrixCatalogueCoproprieteDTO;
import fr.d4immobilier.visionapirest.entities.PrixCatalogueCopropriete;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PrixCatalogueCoproprieteMapper extends GenericMapper<PrixCatalogueCopropriete, PrixCatalogueCoproprieteDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "tarif.id", target = "tarifId")
    @Mapping(source = "produitCatalogue.id", target = "produitCatalogueId")
        PrixCatalogueCoproprieteDTO toDTO(PrixCatalogueCopropriete entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "tarif", ignore = true)
    @Mapping(target = "produitCatalogue", ignore = true)
        PrixCatalogueCopropriete toEntity(PrixCatalogueCoproprieteDTO dto);
}
