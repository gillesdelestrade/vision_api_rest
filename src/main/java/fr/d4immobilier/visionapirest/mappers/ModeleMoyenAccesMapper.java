package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ModeleMoyenAccesDTO;
import fr.d4immobilier.visionapirest.entities.ModeleMoyenAcces;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ModeleMoyenAccesMapper extends GenericMapper<ModeleMoyenAcces, ModeleMoyenAccesDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "fichierModeleMoyenAcces.id", target = "fichierModeleMoyenAccesId")
    @Mapping(source = "typeMoyenAcces", target = "typeMoyenAcces", qualifiedByName = "typeMoyenAccesToString")
    ModeleMoyenAccesDTO toDTO(ModeleMoyenAcces entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "moyensAccesCatalogues", ignore = true)
    @Mapping(target = "fichierModeleMoyenAcces", ignore = true)
    ModeleMoyenAcces toEntity(ModeleMoyenAccesDTO dto);

    // Méthodes helper pour les enums

    @Named("typeMoyenAccesToString")
    default String typeMoyenAccesToString(fr.d4immobilier.visionapirest.entities.TypeMoyenAcces value) {
        return value != null ? value.name() : null;
    }
}
