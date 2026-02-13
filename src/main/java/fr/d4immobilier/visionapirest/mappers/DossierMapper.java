package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DossierDTO;
import fr.d4immobilier.visionapirest.entities.Dossier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DossierMapper extends GenericMapper<Dossier, DossierDTO> {
    
    // Mapping de l'entité vers le DTO
        DossierDTO toDTO(Dossier entity);

    // Mapping du DTO vers l'entité
    Dossier toEntity(DossierDTO dto);

    // Méthodes helper pour les enums

    @Named("coproprieteToString")
    default String coproprieteToString(fr.d4immobilier.visionapirest.entities.Copropriete value) {
        return value != null ? value.getNom(): null;
    }
}
