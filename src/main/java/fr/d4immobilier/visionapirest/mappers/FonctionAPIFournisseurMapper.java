package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FonctionAPIFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.FonctionAPIFournisseur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FonctionAPIFournisseurMapper extends GenericMapper<FonctionAPIFournisseur, FonctionAPIFournisseurDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "aPIFournisseur.id", target = "APIFournisseurId")
    @Mapping(source = "lexiqueAPID4.id", target = "lexiqueAPID4Id")
    FonctionAPIFournisseurDTO toDTO(FonctionAPIFournisseur entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "aPIFournisseur", ignore = true)
    @Mapping(target = "lexiqueAPID4", ignore = true)
    FonctionAPIFournisseur toEntity(FonctionAPIFournisseurDTO dto);
}
