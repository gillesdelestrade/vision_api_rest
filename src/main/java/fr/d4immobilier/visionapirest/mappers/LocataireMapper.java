package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.LocataireDTO;
import fr.d4immobilier.visionapirest.entities.Locataire;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface LocataireMapper extends GenericMapper<Locataire, LocataireDTO> {
    
    // Mapping de l'entité vers le DTO
        LocataireDTO toDTO(Locataire entity);

    // Mapping du DTO vers l'entité
    Locataire toEntity(LocataireDTO dto);

    // Méthodes helper pour les enums

    @Named("lotToString")
    default String lotToString(fr.d4immobilier.visionapirest.entities.Lot value) {
        return value != null ? value.getNumeroDeLot(): null;
    }
}
