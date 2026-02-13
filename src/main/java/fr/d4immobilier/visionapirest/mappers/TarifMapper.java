package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TarifDTO;
import fr.d4immobilier.visionapirest.entities.Tarif;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface TarifMapper extends GenericMapper<Tarif, TarifDTO> {
    
    // Mapping de l'entité vers le DTO
    TarifDTO toDTO(Tarif entity);

    // Mapping du DTO vers l'entité
    Tarif toEntity(TarifDTO dto);
}
