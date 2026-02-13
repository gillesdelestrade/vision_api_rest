package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.UtilisateurDTO;
import fr.d4immobilier.visionapirest.entities.Utilisateur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface UtilisateurMapper extends GenericMapper<Utilisateur, UtilisateurDTO> {
    
    // Mapping de l'entité vers le DTO
    UtilisateurDTO toDTO(Utilisateur entity);

    // Mapping du DTO vers l'entité
    Utilisateur toEntity(UtilisateurDTO dto);
}
