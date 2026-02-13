package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AudienceDTO;
import fr.d4immobilier.visionapirest.entities.Audience;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface AudienceMapper extends GenericMapper<Audience, AudienceDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "complementProcedure.id", target = "complementProcedureId")
    @Mapping(source = "typeAudience", target = "typeAudience", qualifiedByName = "typeAudienceToString")
    AudienceDTO toDTO(Audience entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "complementProcedure", ignore = true)
    @Mapping(target = "fichiers", ignore = true)
    Audience toEntity(AudienceDTO dto);

    // Méthodes helper pour les enums

    @Named("typeAudienceToString")
    default String typeAudienceToString(fr.d4immobilier.visionapirest.entities.TypeAudience value) {
        return value != null ? value.name() : null;
    }
}
