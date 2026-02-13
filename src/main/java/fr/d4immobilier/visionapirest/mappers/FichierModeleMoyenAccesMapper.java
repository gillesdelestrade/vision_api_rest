package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierModeleMoyenAccesDTO;
import fr.d4immobilier.visionapirest.entities.FichierModeleMoyenAcces;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierModeleMoyenAccesMapper extends GenericMapper<FichierModeleMoyenAcces, FichierModeleMoyenAccesDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "modeleMoyenAcces.id", target = "modeleMoyenAccesId")
    FichierModeleMoyenAccesDTO toDTO(FichierModeleMoyenAcces entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "modeleMoyenAcces", ignore = true)
    FichierModeleMoyenAcces toEntity(FichierModeleMoyenAccesDTO dto);
}
