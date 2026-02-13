package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierDemandeDevisFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.FichierDemandeDevisFournisseur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierDemandeDevisFournisseurMapper extends GenericMapper<FichierDemandeDevisFournisseur, FichierDemandeDevisFournisseurDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "demandeDevisFournisseur.id", target = "demandeDevisFournisseurId")
    FichierDemandeDevisFournisseurDTO toDTO(FichierDemandeDevisFournisseur entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "demandeDevisFournisseur", ignore = true)
    FichierDemandeDevisFournisseur toEntity(FichierDemandeDevisFournisseurDTO dto);
}
