package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.LigneFacturationDTO;
import fr.d4immobilier.visionapirest.entities.LigneFacturation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface LigneFacturationMapper extends GenericMapper<LigneFacturation, LigneFacturationDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "produitCatalogue.id", target = "produitCatalogueId")
    @Mapping(source = "tarif.id", target = "tarifId")
    @Mapping(source = "regroupementLignesFacturation.id", target = "regroupementLignesFacturationId")
    LigneFacturationDTO toDTO(LigneFacturation entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "produitCatalogue", ignore = true)
    @Mapping(target = "tarif", ignore = true)
    @Mapping(target = "regroupementLignesFacturation", ignore = true)
    LigneFacturation toEntity(LigneFacturationDTO dto);
}
