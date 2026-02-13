package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DocumentBonDeLivraisonDTO;
import fr.d4immobilier.visionapirest.entities.DocumentBonDeLivraison;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DocumentBonDeLivraisonMapper extends GenericMapper<DocumentBonDeLivraison, DocumentBonDeLivraisonDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "livraison.id", target = "livraisonId")
    DocumentBonDeLivraisonDTO toDTO(DocumentBonDeLivraison entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "livraison", ignore = true)
    DocumentBonDeLivraison toEntity(DocumentBonDeLivraisonDTO dto);
}
