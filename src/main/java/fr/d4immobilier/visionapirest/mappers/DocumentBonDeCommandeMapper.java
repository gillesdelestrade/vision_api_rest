package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DocumentBonDeCommandeDTO;
import fr.d4immobilier.visionapirest.entities.DocumentBonDeCommande;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DocumentBonDeCommandeMapper extends GenericMapper<DocumentBonDeCommande, DocumentBonDeCommandeDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "bonDeCommande.id", target = "bonDeCommandeId")
    DocumentBonDeCommandeDTO toDTO(DocumentBonDeCommande entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "bonDeCommande", ignore = true)
    DocumentBonDeCommande toEntity(DocumentBonDeCommandeDTO dto);
}
