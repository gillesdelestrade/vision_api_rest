package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EquipementDTO;
import fr.d4immobilier.visionapirest.entities.Equipement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface EquipementMapper extends GenericMapper<Equipement, EquipementDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "batiment.id", target = "batimentId")
    @Mapping(source = "typeEquipement.id", target = "typeEquipementId")
    @Mapping(source = "typeEquipement.typeEquipement", target = "typeEquipement")
    @Mapping(source = "fournisseur.id", target = "fournisseurId")
    @Mapping(source = "fournisseur.raisonSociale", target = "fournisseur")
    EquipementDTO toDTO(Equipement entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "demandes", ignore = true)
    @Mapping(target = "batiment", ignore = true)
    @Mapping(target = "typeEquipement", ignore = true)
    @Mapping(target = "fournisseur", ignore = true)
    Equipement toEntity(EquipementDTO dto);
}
