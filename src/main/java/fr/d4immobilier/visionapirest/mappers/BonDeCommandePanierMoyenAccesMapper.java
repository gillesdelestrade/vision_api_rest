package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BonDeCommandePanierMoyenAccesDTO;
import fr.d4immobilier.visionapirest.entities.BonDeCommandePanierMoyenAcces;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface BonDeCommandePanierMoyenAccesMapper extends GenericMapper<BonDeCommandePanierMoyenAcces, BonDeCommandePanierMoyenAccesDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "panierCommandeMoyenAcces.id", target = "panierCommandeMoyenAccesId")
    BonDeCommandePanierMoyenAccesDTO toDTO(BonDeCommandePanierMoyenAcces entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "panierCommandeMoyenAcces", ignore = true)
    BonDeCommandePanierMoyenAcces toEntity(BonDeCommandePanierMoyenAccesDTO dto);
}
