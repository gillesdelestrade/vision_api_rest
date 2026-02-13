package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ProchaineEtapeDemandeDTO;
import fr.d4immobilier.visionapirest.entities.ProchaineEtapeDemande;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ProchaineEtapeDemandeMapper extends GenericMapper<ProchaineEtapeDemande, ProchaineEtapeDemandeDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "demande.id", target = "demandeId")
    ProchaineEtapeDemandeDTO toDTO(ProchaineEtapeDemande entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "demande", ignore = true)
    ProchaineEtapeDemande toEntity(ProchaineEtapeDemandeDTO dto);
}
