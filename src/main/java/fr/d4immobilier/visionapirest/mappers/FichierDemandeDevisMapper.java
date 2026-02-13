package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierDemandeDevisDTO;
import fr.d4immobilier.visionapirest.entities.FichierDemandeDevis;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierDemandeDevisMapper extends GenericMapper<FichierDemandeDevis, FichierDemandeDevisDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "demandeDevis.id", target = "demandeDevisId")
    FichierDemandeDevisDTO toDTO(FichierDemandeDevis entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "demandeDevis", ignore = true)
    FichierDemandeDevis toEntity(FichierDemandeDevisDTO dto);
}
