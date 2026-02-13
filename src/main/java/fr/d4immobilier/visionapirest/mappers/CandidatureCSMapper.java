package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CandidatureCSDTO;
import fr.d4immobilier.visionapirest.entities.CandidatureCS;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CandidatureCSMapper extends GenericMapper<CandidatureCS, CandidatureCSDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "assemblee.id", target = "assembleeId")
    @Mapping(source = "coproprietaire.id", target = "coproprietaireId")
    @Mapping(source = "resolution.id", target = "resolutionId")
    CandidatureCSDTO toDTO(CandidatureCS entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "assemblee", ignore = true)
    @Mapping(target = "coproprietaire", ignore = true)
    @Mapping(target = "resolution", ignore = true)
    CandidatureCS toEntity(CandidatureCSDTO dto);
}
