package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MandatSyndicDTO;
import fr.d4immobilier.visionapirest.entities.MandatSyndic;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface MandatSyndicMapper extends GenericMapper<MandatSyndic, MandatSyndicDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "pvag.id", target = "pvagId")
    @Mapping(source = "contratFournisseur.id", target = "contratFournisseurId")
    MandatSyndicDTO toDTO(MandatSyndic entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "pvag", ignore = true)
    @Mapping(target = "contratFournisseur", ignore = true)
    MandatSyndic toEntity(MandatSyndicDTO dto);
}
