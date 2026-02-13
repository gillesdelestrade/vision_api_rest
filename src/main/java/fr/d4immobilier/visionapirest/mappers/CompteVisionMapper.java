package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CompteVisionDTO;
import fr.d4immobilier.visionapirest.entities.CompteVision;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CompteVisionMapper extends GenericMapper<CompteVision, CompteVisionDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "profil", target = "profil", qualifiedByName = "profilToString")
    CompteVisionDTO toDTO(CompteVision entity);

    // Mapping du DTO vers l'entité
    CompteVision toEntity(CompteVisionDTO dto);

    // Méthodes helper pour les enums

    @Named("profilToString")
    default String profilToString(fr.d4immobilier.visionapirest.entities.ProfilCompteVision value) {
        return value != null ? value.name() : null;
    }
}
