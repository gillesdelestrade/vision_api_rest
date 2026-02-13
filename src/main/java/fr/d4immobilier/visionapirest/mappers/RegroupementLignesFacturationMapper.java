package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.RegroupementLignesFacturationDTO;
import fr.d4immobilier.visionapirest.entities.RegroupementLignesFacturation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface RegroupementLignesFacturationMapper extends GenericMapper<RegroupementLignesFacturation, RegroupementLignesFacturationDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "courrier.id", target = "courrierId")
    @Mapping(source = "factureD4.id", target = "factureD4Id")
    RegroupementLignesFacturationDTO toDTO(RegroupementLignesFacturation entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "courrier", ignore = true)
    @Mapping(target = "lignesFacturation", ignore = true)
    @Mapping(target = "factureD4", ignore = true)
    RegroupementLignesFacturation toEntity(RegroupementLignesFacturationDTO dto);
}
