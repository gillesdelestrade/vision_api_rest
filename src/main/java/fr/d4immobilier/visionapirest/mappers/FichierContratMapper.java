package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierContratDTO;
import fr.d4immobilier.visionapirest.entities.FichierContrat;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierContratMapper extends GenericMapper<FichierContrat, FichierContratDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "contratFournisseur.id", target = "contratFournisseurId")
    FichierContratDTO toDTO(FichierContrat entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "contratFournisseur", ignore = true)
    FichierContrat toEntity(FichierContratDTO dto);
}
