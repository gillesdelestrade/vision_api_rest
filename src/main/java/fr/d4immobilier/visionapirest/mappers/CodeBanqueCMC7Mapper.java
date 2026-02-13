package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CodeBanqueCMC7DTO;
import fr.d4immobilier.visionapirest.entities.CodeBanqueCMC7;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CodeBanqueCMC7Mapper extends GenericMapper<CodeBanqueCMC7, CodeBanqueCMC7DTO> {
    
    // Mapping de l'entité vers le DTO
    CodeBanqueCMC7DTO toDTO(CodeBanqueCMC7 entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "banques", ignore = true)
    CodeBanqueCMC7 toEntity(CodeBanqueCMC7DTO dto);
}
