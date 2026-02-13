package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierDevisFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.FichierDevisFournisseur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierDevisFournisseurMapper extends GenericMapper<FichierDevisFournisseur, FichierDevisFournisseurDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "devisFournisseur.id", target = "devisFournisseurId")
    FichierDevisFournisseurDTO toDTO(FichierDevisFournisseur entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "devisFournisseur", ignore = true)
    FichierDevisFournisseur toEntity(FichierDevisFournisseurDTO dto);
}
