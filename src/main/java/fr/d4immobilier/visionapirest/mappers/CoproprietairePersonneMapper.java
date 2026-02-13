package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CoproprietairePersonneDTO;
import fr.d4immobilier.visionapirest.entities.CoproprietairePersonne;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CoproprietairePersonneMapper extends GenericMapper<CoproprietairePersonne, CoproprietairePersonneDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "personne.id", target = "personneId")
    CoproprietairePersonneDTO toDTO(CoproprietairePersonne entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "personne", ignore = true)
    CoproprietairePersonne toEntity(CoproprietairePersonneDTO dto);
}
