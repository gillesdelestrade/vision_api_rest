package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CompteEnBanquePersonneDTO;
import fr.d4immobilier.visionapirest.entities.CompteEnBanquePersonne;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CompteEnBanquePersonneMapper extends GenericMapper<CompteEnBanquePersonne, CompteEnBanquePersonneDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "personne.id", target = "personneId")
    CompteEnBanquePersonneDTO toDTO(CompteEnBanquePersonne entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "personne", ignore = true)
    CompteEnBanquePersonne toEntity(CompteEnBanquePersonneDTO dto);
}
