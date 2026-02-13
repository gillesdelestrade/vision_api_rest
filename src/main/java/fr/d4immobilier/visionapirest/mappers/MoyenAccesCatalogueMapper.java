package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MoyenAccesCatalogueDTO;
import fr.d4immobilier.visionapirest.entities.MoyenAccesCatalogue;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface MoyenAccesCatalogueMapper extends GenericMapper<MoyenAccesCatalogue, MoyenAccesCatalogueDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "fournisseur.id", target = "fournisseurId")
    @Mapping(source = "modeleMoyenAcces.id", target = "modeleMoyenAccesId")
    MoyenAccesCatalogueDTO toDTO(MoyenAccesCatalogue entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "fournisseur", ignore = true)
    @Mapping(target = "modeleMoyenAcces", ignore = true)
    MoyenAccesCatalogue toEntity(MoyenAccesCatalogueDTO dto);
}
