package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CompteEnBanqueFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.CompteEnBanqueFournisseur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CompteEnBanqueFournisseurMapper extends GenericMapper<CompteEnBanqueFournisseur, CompteEnBanqueFournisseurDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "fournisseur.id", target = "fournisseurId")
    CompteEnBanqueFournisseurDTO toDTO(CompteEnBanqueFournisseur entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "fournisseur", ignore = true)
    CompteEnBanqueFournisseur toEntity(CompteEnBanqueFournisseurDTO dto);
}
