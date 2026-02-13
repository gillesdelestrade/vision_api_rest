package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ADFCoproDTO;
import fr.d4immobilier.visionapirest.entities.ADFCopro;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ADFCoproMapper extends GenericMapper<ADFCopro, ADFCoproDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "campagneADF.id", target = "campagneADFId")
    @Mapping(source = "sessionTraitementADF.id", target = "sessionTraitementADFId")
    ADFCoproDTO toDTO(ADFCopro entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "campagneADF", ignore = true)
    @Mapping(target = "fichiersADF", ignore = true)
    @Mapping(target = "fichiersAnnexes", ignore = true)
    @Mapping(target = "sessionTraitementADF", ignore = true)
    ADFCopro toEntity(ADFCoproDTO dto);
}
