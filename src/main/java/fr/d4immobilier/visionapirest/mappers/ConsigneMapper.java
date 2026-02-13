package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ConsigneDTO;
import fr.d4immobilier.visionapirest.entities.Consigne;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ConsigneMapper extends GenericMapper<Consigne, ConsigneDTO> {
    
    // Mapping de l'entité vers le DTO
    ConsigneDTO toDTO(Consigne entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "expressionsCles", ignore = true)
    @Mapping(target = "etapesConsigne", ignore = true)
    Consigne toEntity(ConsigneDTO dto);
}
