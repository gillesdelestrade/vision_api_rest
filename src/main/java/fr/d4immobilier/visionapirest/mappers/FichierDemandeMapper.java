package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierDemandeDTO;
import fr.d4immobilier.visionapirest.entities.FichierDemande;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierDemandeMapper extends GenericMapper<FichierDemande, FichierDemandeDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "reunionV2.id", target = "reunionV2Id")
    @Mapping(source = "demande.id", target = "demandeId")
    @Mapping(source = "etapeDemande.id", target = "etapeDemandeId")
    @Mapping(source = "natureFichierSinistre.id", target = "natureFichierSinistreId")
    FichierDemandeDTO toDTO(FichierDemande entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "reunionV2", ignore = true)
    @Mapping(target = "demande", ignore = true)
    @Mapping(target = "etapeDemande", ignore = true)
    @Mapping(target = "natureFichierSinistre", ignore = true)
    FichierDemande toEntity(FichierDemandeDTO dto);
}
