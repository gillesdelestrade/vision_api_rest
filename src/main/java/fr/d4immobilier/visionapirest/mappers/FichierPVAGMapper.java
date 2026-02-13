package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierPVAGDTO;
import fr.d4immobilier.visionapirest.entities.FichierPVAG;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierPVAGMapper extends GenericMapper<FichierPVAG, FichierPVAGDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "pvag.id", target = "pvagId")
    FichierPVAGDTO toDTO(FichierPVAG entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "pvag", ignore = true)
    FichierPVAG toEntity(FichierPVAGDTO dto);
}
