package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EtapeConsigneDTO;
import fr.d4immobilier.visionapirest.entities.EtapeConsigne;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface EtapeConsigneMapper extends GenericMapper<EtapeConsigne, EtapeConsigneDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "consigne.id", target = "consigneId")
    @Mapping(source = "fichierEtape.id", target = "fichierEtapeId")
    EtapeConsigneDTO toDTO(EtapeConsigne entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "consigne", ignore = true)
    @Mapping(target = "fichierEtape", ignore = true)
    EtapeConsigne toEntity(EtapeConsigneDTO dto);
}
