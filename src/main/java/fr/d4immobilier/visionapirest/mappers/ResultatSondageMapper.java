package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ResultatSondageDTO;
import fr.d4immobilier.visionapirest.entities.ResultatSondage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ResultatSondageMapper extends GenericMapper<ResultatSondage, ResultatSondageDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "coproprietaire.id", target = "coproprietaireId")
    @Mapping(source = "propositionSondage.id", target = "propositionSondageId")
    ResultatSondageDTO toDTO(ResultatSondage entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "coproprietaire", ignore = true)
    @Mapping(target = "propositionSondage", ignore = true)
    ResultatSondage toEntity(ResultatSondageDTO dto);
}
