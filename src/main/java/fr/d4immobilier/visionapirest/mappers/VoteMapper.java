package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.VoteDTO;
import fr.d4immobilier.visionapirest.entities.Vote;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface VoteMapper extends GenericMapper<Vote, VoteDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "resolution.id", target = "resolutionId")
    @Mapping(source = "affectation.id", target = "affectationId")
    @Mapping(source = "choixVote", target = "choixVote", qualifiedByName = "choixVoteToString")
    VoteDTO toDTO(Vote entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "resolution", ignore = true)
    @Mapping(target = "affectation", ignore = true)
    Vote toEntity(VoteDTO dto);

    // Méthodes helper pour les enums

    @Named("choixVoteToString")
    default String choixVoteToString(fr.d4immobilier.visionapirest.entities.ChoixVote value) {
        return value != null ? value.name() : null;
    }
}
