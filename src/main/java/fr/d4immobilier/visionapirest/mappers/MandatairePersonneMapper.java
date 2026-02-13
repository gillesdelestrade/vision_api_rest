package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MandatairePersonneDTO;
import fr.d4immobilier.visionapirest.entities.MandatairePersonne;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface MandatairePersonneMapper extends GenericMapper<MandatairePersonne, MandatairePersonneDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "personne.id", target = "personneId")
    MandatairePersonneDTO toDTO(MandatairePersonne entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "personne", ignore = true)
    MandatairePersonne toEntity(MandatairePersonneDTO dto);
}
