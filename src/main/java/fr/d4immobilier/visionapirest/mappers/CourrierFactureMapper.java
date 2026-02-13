package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CourrierFactureDTO;
import fr.d4immobilier.visionapirest.entities.CourrierFacture;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CourrierFactureMapper extends GenericMapper<CourrierFacture, CourrierFactureDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "factureFournisseur.id", target = "factureFournisseurId")
    CourrierFactureDTO toDTO(CourrierFacture entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "factureFournisseur", ignore = true)
    CourrierFacture toEntity(CourrierFactureDTO dto);
}
