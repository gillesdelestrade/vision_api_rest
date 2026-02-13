package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CoproprietaireDTO;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CoproprietaireMapper extends GenericMapper<Coproprietaire, CoproprietaireDTO> {
    
    // Mapping de l'entité vers le DTO
            CoproprietaireDTO toDTO(Coproprietaire entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "matriculesICS", ignore = true)
        @Mapping(target = "suppressionFraisDeRelances", ignore = true)
                    @Mapping(target = "lotsARepresenterEnAG", ignore = true)
    @Mapping(target = "lots", ignore = true)
    @Mapping(target = "coproprietePourPhaseImport", ignore = true)
        Coproprietaire toEntity(CoproprietaireDTO dto);
}
