package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PanierCommandeMoyenAccesDTO;
import fr.d4immobilier.visionapirest.entities.PanierCommandeMoyenAcces;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PanierCommandeMoyenAccesMapper extends GenericMapper<PanierCommandeMoyenAcces, PanierCommandeMoyenAccesDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "coproprietaire.id", target = "coproprietaireId")
    @Mapping(source = "demandeOrigine.id", target = "demandeOrigineId")
    PanierCommandeMoyenAccesDTO toDTO(PanierCommandeMoyenAcces entity);

    // Mapping du DTO vers l'entité
                @Mapping(target = "coproprietaire", ignore = true)
    @Mapping(target = "moyensAccesASortirDuStock", ignore = true)
    @Mapping(target = "moyensAccesCatalogueQuantiteACommander", ignore = true)
    @Mapping(target = "demandeOrigine", ignore = true)
    PanierCommandeMoyenAcces toEntity(PanierCommandeMoyenAccesDTO dto);
}
