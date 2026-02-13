package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TantiemeDTO;
import fr.d4immobilier.visionapirest.entities.Tantieme;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface TantiemeMapper extends GenericMapper<Tantieme, TantiemeDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "typeTantieme.id", target = "typeTantiemeId")
    @Mapping(source = "batiment.id", target = "batimentId")
    TantiemeDTO toDTO(Tantieme entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "typeTantieme", ignore = true)
    @Mapping(target = "batiment", ignore = true)
    Tantieme toEntity(TantiemeDTO dto);
}
