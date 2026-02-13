package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BatimentDTO;
import fr.d4immobilier.visionapirest.entities.Batiment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface BatimentMapper extends GenericMapper<Batiment, BatimentDTO> {
    
    // Mapping de l'entité vers le DTO
        BatimentDTO toDTO(Batiment entity);

    // Mapping du DTO vers l'entité
                    @Mapping(target = "lots", ignore = true)
    Batiment toEntity(BatimentDTO dto);
}
