package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BonDeCommandeDTO;
import fr.d4immobilier.visionapirest.entities.BonDeCommande;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface BonDeCommandeMapper extends GenericMapper<BonDeCommande, BonDeCommandeDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "documentBonDeCommande.id", target = "documentBonDeCommandeId")
    BonDeCommandeDTO toDTO(BonDeCommande entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "documentBonDeCommande", ignore = true)
    @Mapping(target = "contactsSurPlace", ignore = true)
    BonDeCommande toEntity(BonDeCommandeDTO dto);
}
