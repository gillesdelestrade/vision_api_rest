package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BoiteArchiveDTO;
import fr.d4immobilier.visionapirest.entities.BoiteArchive;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface BoiteArchiveMapper extends GenericMapper<BoiteArchive, BoiteArchiveDTO> {
    
    // Mapping de l'entité vers le DTO
        BoiteArchiveDTO toDTO(BoiteArchive entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "demandes", ignore = true)
        BoiteArchive toEntity(BoiteArchiveDTO dto);
}
