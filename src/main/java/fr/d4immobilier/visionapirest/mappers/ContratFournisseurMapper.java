package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ContratFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.ContratFournisseur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ContratFournisseurMapper extends GenericMapper<ContratFournisseur, ContratFournisseurDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "fournisseur.id", target = "fournisseurId")
        @Mapping(source = "prestationContrat.id", target = "prestationContratId")
    @Mapping(source = "momentPaiementFacturesContrat", target = "momentPaiementFacturesContrat", qualifiedByName = "momentPaiementFacturesContratToString")
    @Mapping(source = "frequenceFactures", target = "frequenceFactures", qualifiedByName = "frequenceFacturesToString")
    ContratFournisseurDTO toDTO(ContratFournisseur entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "fichiersContrat", ignore = true)
    @Mapping(target = "fournisseur", ignore = true)
        @Mapping(target = "prestationContrat", ignore = true)
    ContratFournisseur toEntity(ContratFournisseurDTO dto);

    // Méthodes helper pour les enums

    @Named("momentPaiementFacturesContratToString")
    default String momentPaiementFacturesContratToString(fr.d4immobilier.visionapirest.entities.MomentPaiementFacturesContrat value) {
        return value != null ? value.name() : null;
    }

    @Named("frequenceFacturesToString")
    default String frequenceFacturesToString(fr.d4immobilier.visionapirest.entities.FrequenceFactures value) {
        return value != null ? value.name() : null;
    }
}
