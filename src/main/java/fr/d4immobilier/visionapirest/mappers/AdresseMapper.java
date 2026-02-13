package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AdresseDTO;
import fr.d4immobilier.visionapirest.entities.Adresse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface AdresseMapper extends GenericMapper<Adresse, AdresseDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "typeDeVoie", target = "typeDeVoie", qualifiedByName = "typeDeVoieToString")
    AdresseDTO toDTO(Adresse entity);

    // Mapping du DTO vers l'entité
        Adresse toEntity(AdresseDTO dto);

    // Méthodes helper pour les enums

    @Named("typeDeVoieToString")
    default String typeDeVoieToString(fr.d4immobilier.visionapirest.entities.TypeDeVoie value) {
        return value != null ? value.name() : null;
    }
}
