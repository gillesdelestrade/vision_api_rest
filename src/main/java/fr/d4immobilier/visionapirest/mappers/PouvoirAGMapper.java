package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PouvoirAGDTO;
import fr.d4immobilier.visionapirest.entities.PouvoirAG;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PouvoirAGMapper extends GenericMapper<PouvoirAG, PouvoirAGDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "coproprietaireReceveur.id", target = "coproprietaireReceveurId")
    @Mapping(source = "coproprietaireDonneur.id", target = "coproprietaireDonneurId")
    @Mapping(source = "assemblee.id", target = "assembleeId")
    PouvoirAGDTO toDTO(PouvoirAG entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "coproprietaireReceveur", ignore = true)
    @Mapping(target = "coproprietaireDonneur", ignore = true)
    @Mapping(target = "assemblee", ignore = true)
    PouvoirAG toEntity(PouvoirAGDTO dto);
}
