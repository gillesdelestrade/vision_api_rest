package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TypeTantiemeDTO;
import fr.d4immobilier.visionapirest.entities.TypeTantieme;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface TypeTantiemeMapper extends GenericMapper<TypeTantieme, TypeTantiemeDTO> {
    
    // Mapping de l'entité vers le DTO
    TypeTantiemeDTO toDTO(TypeTantieme entity);

    // Mapping du DTO vers l'entité
    TypeTantieme toEntity(TypeTantiemeDTO dto);
}
