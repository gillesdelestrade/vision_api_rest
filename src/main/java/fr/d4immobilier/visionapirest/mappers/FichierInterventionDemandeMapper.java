package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierInterventionDemandeDTO;
import fr.d4immobilier.visionapirest.entities.FichierInterventionDemande;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierInterventionDemandeMapper extends GenericMapper<FichierInterventionDemande, FichierInterventionDemandeDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "interventionDemande.id", target = "interventionDemandeId")
    FichierInterventionDemandeDTO toDTO(FichierInterventionDemande entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "interventionDemande", ignore = true)
    FichierInterventionDemande toEntity(FichierInterventionDemandeDTO dto);
}
