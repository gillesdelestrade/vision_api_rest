package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EtapePlanifAGModeleDTO;
import fr.d4immobilier.visionapirest.entities.EtapePlanifAGModele;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface EtapePlanifAGModeleMapper extends GenericMapper<EtapePlanifAGModele, EtapePlanifAGModeleDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "responsableEtapePlanifAGModele", target = "responsableEtapePlanifAGModele", qualifiedByName = "responsableEtapePlanifAGModeleToString")
    EtapePlanifAGModeleDTO toDTO(EtapePlanifAGModele entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "predecesseurs", ignore = true)
    EtapePlanifAGModele toEntity(EtapePlanifAGModeleDTO dto);

    // Méthodes helper pour les enums

    @Named("responsableEtapePlanifAGModeleToString")
    default String responsableEtapePlanifAGModeleToString(fr.d4immobilier.visionapirest.entities.ResponsableEtapePlanifAGModele value) {
        return value != null ? value.name() : null;
    }
}
