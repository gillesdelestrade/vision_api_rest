package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.RejetPrelevementDTO;
import fr.d4immobilier.visionapirest.entities.RejetPrelevement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface RejetPrelevementMapper extends GenericMapper<RejetPrelevement, RejetPrelevementDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "coproprietaire.id", target = "coproprietaireId")
    @Mapping(source = "mouvementBancaire.id", target = "mouvementBancaireId")
    @Mapping(source = "fichier.id", target = "fichierId")
    RejetPrelevementDTO toDTO(RejetPrelevement entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "coproprietaire", ignore = true)
    @Mapping(target = "mouvementBancaire", ignore = true)
    @Mapping(target = "fichier", ignore = true)
    RejetPrelevement toEntity(RejetPrelevementDTO dto);
}
