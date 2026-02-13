package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DemandeCourrielDTO;
import fr.d4immobilier.visionapirest.entities.DemandeCourriel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DemandeCourrielMapper extends GenericMapper<DemandeCourriel, DemandeCourrielDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "courriel.id", target = "courrielId")
    DemandeCourrielDTO toDTO(DemandeCourriel entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "courriel", ignore = true)
    DemandeCourriel toEntity(DemandeCourrielDTO dto);
}
