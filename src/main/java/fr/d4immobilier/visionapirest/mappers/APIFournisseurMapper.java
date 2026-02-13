package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.APIFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.APIFournisseur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface APIFournisseurMapper extends GenericMapper<APIFournisseur, APIFournisseurDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "fournisseur.id", target = "fournisseurId")
    APIFournisseurDTO toDTO(APIFournisseur entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "fournisseur", ignore = true)
    APIFournisseur toEntity(APIFournisseurDTO dto);
}
