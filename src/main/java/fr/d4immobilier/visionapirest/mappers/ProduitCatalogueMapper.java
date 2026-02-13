package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ProduitCatalogueDTO;
import fr.d4immobilier.visionapirest.entities.ProduitCatalogue;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ProduitCatalogueMapper extends GenericMapper<ProduitCatalogue, ProduitCatalogueDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "tva.id", target = "tvaId")
    ProduitCatalogueDTO toDTO(ProduitCatalogue entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "prixCatalogueCoproprietes", ignore = true)
    @Mapping(target = "prixCatalogues", ignore = true)
    @Mapping(target = "tva", ignore = true)
    ProduitCatalogue toEntity(ProduitCatalogueDTO dto);
}
