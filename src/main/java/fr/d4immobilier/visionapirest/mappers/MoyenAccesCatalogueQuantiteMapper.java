package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MoyenAccesCatalogueQuantiteDTO;
import fr.d4immobilier.visionapirest.entities.MoyenAccesCatalogueQuantite;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface MoyenAccesCatalogueQuantiteMapper extends GenericMapper<MoyenAccesCatalogueQuantite, MoyenAccesCatalogueQuantiteDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "moyenAccesCatalogue.id", target = "moyenAccesCatalogueId")
    MoyenAccesCatalogueQuantiteDTO toDTO(MoyenAccesCatalogueQuantite entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "moyenAccesCatalogue", ignore = true)
    MoyenAccesCatalogueQuantite toEntity(MoyenAccesCatalogueQuantiteDTO dto);
}
