package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AffectationDTO;
import fr.d4immobilier.visionapirest.entities.Affectation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface AffectationMapper extends GenericMapper<Affectation, AffectationDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "presence.id", target = "presenceId")
    @Mapping(source = "tag.id", target = "tagId")
    AffectationDTO toDTO(Affectation entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "presence", ignore = true)
    @Mapping(target = "tag", ignore = true)
    Affectation toEntity(AffectationDTO dto);
}
