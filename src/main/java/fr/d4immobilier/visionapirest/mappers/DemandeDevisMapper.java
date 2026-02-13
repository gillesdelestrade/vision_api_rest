package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DemandeDevisDTO;
import fr.d4immobilier.visionapirest.entities.DemandeDevis;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DemandeDevisMapper extends GenericMapper<DemandeDevis, DemandeDevisDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "demande.id", target = "demandeId")
    @Mapping(source = "interventionDemande.id", target = "interventionDemandeId")
    @Mapping(source = "motifClotureDemandeDevis", target = "motifClotureDemandeDevis", qualifiedByName = "motifClotureDemandeDevisToString")
    DemandeDevisDTO toDTO(DemandeDevis entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "fichiersDemandeDevis", ignore = true)
    @Mapping(target = "demandeDevisFournisseurs", ignore = true)
    @Mapping(target = "demande", ignore = true)
    @Mapping(target = "contactsSurPlace", ignore = true)
    @Mapping(target = "interventionDemande", ignore = true)
    DemandeDevis toEntity(DemandeDevisDTO dto);

    // Méthodes helper pour les enums

    @Named("motifClotureDemandeDevisToString")
    default String motifClotureDemandeDevisToString(fr.d4immobilier.visionapirest.entities.MotifClotureDemandeDevis value) {
        return value != null ? value.name() : null;
    }
}
