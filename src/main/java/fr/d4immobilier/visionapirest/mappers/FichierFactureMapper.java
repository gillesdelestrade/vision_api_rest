package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierFactureDTO;
import fr.d4immobilier.visionapirest.entities.FichierFacture;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierFactureMapper extends GenericMapper<FichierFacture, FichierFactureDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "factureFournisseur.id", target = "factureFournisseurId")
    FichierFactureDTO toDTO(FichierFacture entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "factureFournisseur", ignore = true)
    FichierFacture toEntity(FichierFactureDTO dto);
}
