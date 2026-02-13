package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MotCleMetierDTO;
import fr.d4immobilier.visionapirest.entities.MotCleMetier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface MotCleMetierMapper extends GenericMapper<MotCleMetier, MotCleMetierDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "motPertinent.id", target = "motPertinentId")
    @Mapping(source = "metier.id", target = "metierId")
    @Mapping(source = "importanceMotCle", target = "importanceMotCle", qualifiedByName = "importanceMotCleToString")
    MotCleMetierDTO toDTO(MotCleMetier entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "motPertinent", ignore = true)
    @Mapping(target = "metier", ignore = true)
    MotCleMetier toEntity(MotCleMetierDTO dto);

    // Méthodes helper pour les enums

    @Named("importanceMotCleToString")
    default String importanceMotCleToString(fr.d4immobilier.visionapirest.entities.ImportanceMotCle value) {
        return value != null ? value.name() : null;
    }
}
