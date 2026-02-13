package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DocumentDemandeDevisDTO;
import fr.d4immobilier.visionapirest.entities.DocumentDemandeDevis;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DocumentDemandeDevisMapper extends GenericMapper<DocumentDemandeDevis, DocumentDemandeDevisDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "demandeDevisFournisseur.id", target = "demandeDevisFournisseurId")
    DocumentDemandeDevisDTO toDTO(DocumentDemandeDevis entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "demandeDevisFournisseur", ignore = true)
    DocumentDemandeDevis toEntity(DocumentDemandeDevisDTO dto);
}
