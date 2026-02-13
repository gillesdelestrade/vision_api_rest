package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FournisseurDTO;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FournisseurMapper extends GenericMapper<Fournisseur, FournisseurDTO> {
    
    // Mapping de l'entité vers le DTO
        FournisseurDTO toDTO(Fournisseur entity);

    // Mapping du DTO vers l'entité
                @Mapping(target = "demandeDevisFournisseurs", ignore = true)
        @Mapping(target = "contratsFournisseur", ignore = true)
    @Mapping(target = "facturesFournisseurs", ignore = true)
    @Mapping(target = "compteEnBanqueFournisseur", ignore = true)
    @Mapping(target = "metiers", ignore = true)
    @Mapping(target = "coproprietesSurLesquellesReferencees", ignore = true)
    @Mapping(target = "interventionDemandes", ignore = true)
    Fournisseur toEntity(FournisseurDTO dto);
}
