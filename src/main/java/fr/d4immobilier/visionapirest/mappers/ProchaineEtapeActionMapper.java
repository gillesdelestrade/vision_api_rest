package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ProchaineEtapeActionDTO;
import fr.d4immobilier.visionapirest.entities.ProchaineEtapeAction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ProchaineEtapeActionMapper extends GenericMapper<ProchaineEtapeAction, ProchaineEtapeActionDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "action.id", target = "actionId")
    ProchaineEtapeActionDTO toDTO(ProchaineEtapeAction entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "action", ignore = true)
    ProchaineEtapeAction toEntity(ProchaineEtapeActionDTO dto);
}
