package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CourrierDemandeDTO;
import fr.d4immobilier.visionapirest.entities.CourrierDemande;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CourrierDemandeMapper extends GenericMapper<CourrierDemande, CourrierDemandeDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "demande.id", target = "demandeId")
    CourrierDemandeDTO toDTO(CourrierDemande entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "demande", ignore = true)
    CourrierDemande toEntity(CourrierDemandeDTO dto);
}
