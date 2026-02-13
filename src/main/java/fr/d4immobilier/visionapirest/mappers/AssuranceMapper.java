package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AssuranceDTO;
import fr.d4immobilier.visionapirest.entities.Assurance;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface AssuranceMapper extends GenericMapper<Assurance, AssuranceDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "courtier.id", target = "courtierId")
    @Mapping(source = "compagnieDAssurance.id", target = "compagnieDAssuranceId")
        @Mapping(source = "typeAssurance", target = "typeAssurance", qualifiedByName = "typeAssuranceToString")
    AssuranceDTO toDTO(Assurance entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "sinistres", ignore = true)
    @Mapping(target = "courtier", ignore = true)
    @Mapping(target = "compagnieDAssurance", ignore = true)
        Assurance toEntity(AssuranceDTO dto);

    // Méthodes helper pour les enums

    @Named("typeAssuranceToString")
    default String typeAssuranceToString(fr.d4immobilier.visionapirest.entities.TypeAssurance value) {
        return value != null ? value.name() : null;
    }
}
