package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EtapeDemandeDTO;
import fr.d4immobilier.visionapirest.entities.EtapeDemande;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface EtapeDemandeMapper extends GenericMapper<EtapeDemande, EtapeDemandeDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "actionEtapeDemande", target = "actionEtapeDemande", qualifiedByName = "actionEtapeDemandeToString")
    EtapeDemandeDTO toDTO(EtapeDemande entity);

    // Mapping du DTO vers l'entité
    EtapeDemande toEntity(EtapeDemandeDTO dto);

    // Méthodes helper pour les enums

    @Named("actionEtapeDemandeToString")
    default String actionEtapeDemandeToString(fr.d4immobilier.visionapirest.entities.ActionEtapeDemande value) {
        return value != null ? value.name() : null;
    }
}
