package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MandataireDTO;
import fr.d4immobilier.visionapirest.entities.Mandataire;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface MandataireMapper extends GenericMapper<Mandataire, MandataireDTO> {
    
    // Mapping de l'entité vers le DTO
    MandataireDTO toDTO(Mandataire entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "lotsGeres", ignore = true)
    Mandataire toEntity(MandataireDTO dto);
}
