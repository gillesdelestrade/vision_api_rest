package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.SessionTraitementADFDTO;
import fr.d4immobilier.visionapirest.entities.SessionTraitementADF;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface SessionTraitementADFMapper extends GenericMapper<SessionTraitementADF, SessionTraitementADFDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "fichierZip.id", target = "fichierZipId")
    SessionTraitementADFDTO toDTO(SessionTraitementADF entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "aDFsCopro", ignore = true)
    SessionTraitementADF toEntity(SessionTraitementADFDTO dto);

    // Méthodes helper pour les enums

    @Named("fichierZipToString")
    default String fichierZipToString(fr.d4immobilier.visionapirest.entities.Fichier value) {
        return value != null ? value.getId().toString(): null;
    }
}
