package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PrestationAssureeParUnCoproprietaireDTO;
import fr.d4immobilier.visionapirest.entities.PrestationAssureeParUnCoproprietaire;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PrestationAssureeParUnCoproprietaireMapper extends GenericMapper<PrestationAssureeParUnCoproprietaire, PrestationAssureeParUnCoproprietaireDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "coproprietaire.id", target = "coproprietaireId")
    @Mapping(source = "prestationContrat.id", target = "prestationContratId")
    PrestationAssureeParUnCoproprietaireDTO toDTO(PrestationAssureeParUnCoproprietaire entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "coproprietaire", ignore = true)
    @Mapping(target = "prestationContrat", ignore = true)
    PrestationAssureeParUnCoproprietaire toEntity(PrestationAssureeParUnCoproprietaireDTO dto);
}
