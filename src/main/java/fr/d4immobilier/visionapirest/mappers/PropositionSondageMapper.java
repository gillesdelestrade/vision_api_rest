package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PropositionSondageDTO;
import fr.d4immobilier.visionapirest.entities.PropositionSondage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PropositionSondageMapper extends GenericMapper<PropositionSondage, PropositionSondageDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "fichier.id", target = "fichierId")
    @Mapping(source = "sondage.id", target = "sondageId")
    PropositionSondageDTO toDTO(PropositionSondage entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "fichier", ignore = true)
    @Mapping(target = "sondage", ignore = true)
    PropositionSondage toEntity(PropositionSondageDTO dto);
}
