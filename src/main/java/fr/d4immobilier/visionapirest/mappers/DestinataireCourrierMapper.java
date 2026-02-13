package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DestinataireCourrierDTO;
import fr.d4immobilier.visionapirest.entities.DestinataireCourrier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DestinataireCourrierMapper extends GenericMapper<DestinataireCourrier, DestinataireCourrierDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "publipostage.id", target = "publipostageId")
    @Mapping(source = "bordereau_Coproprietaire.id", target = "bordereau_CoproprietaireId")
    @Mapping(source = "coproprietaire.id", target = "coproprietaireId")
    @Mapping(source = "retourRecommandeAR", target = "retourRecommandeAR", qualifiedByName = "retourRecommandeARToString")
    DestinataireCourrierDTO toDTO(DestinataireCourrier entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "publipostage", ignore = true)
    @Mapping(target = "bordereau_Coproprietaire", ignore = true)
    @Mapping(target = "coproprietaire", ignore = true)
    DestinataireCourrier toEntity(DestinataireCourrierDTO dto);

    // Méthodes helper pour les enums

    @Named("retourRecommandeARToString")
    default String retourRecommandeARToString(fr.d4immobilier.visionapirest.entities.RetourRecommandeAR value) {
        return value != null ? value.name() : null;
    }
}
