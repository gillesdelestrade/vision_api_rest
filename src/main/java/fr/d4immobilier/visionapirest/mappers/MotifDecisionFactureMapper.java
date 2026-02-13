package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MotifDecisionFactureDTO;
import fr.d4immobilier.visionapirest.entities.MotifDecisionFacture;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface MotifDecisionFactureMapper extends GenericMapper<MotifDecisionFacture, MotifDecisionFactureDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "avisD4", target = "avisD4", qualifiedByName = "avisD4ToString")
    MotifDecisionFactureDTO toDTO(MotifDecisionFacture entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "factureFournisseurs", ignore = true)
    MotifDecisionFacture toEntity(MotifDecisionFactureDTO dto);

    // Méthodes helper pour les enums

    @Named("avisD4ToString")
    default String avisD4ToString(fr.d4immobilier.visionapirest.entities.AvisD4Facture value) {
        return value != null ? value.name() : null;
    }
}
