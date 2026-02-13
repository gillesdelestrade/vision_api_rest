package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CourrierDTO;
import fr.d4immobilier.visionapirest.entities.Courrier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CourrierMapper extends GenericMapper<Courrier, CourrierDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "rappelCourrier.id", target = "rappelCourrierId")
        @Mapping(source = "publipostage.id", target = "publipostageId")
        @Mapping(source = "modeleCourrier.id", target = "modeleCourrierId")
    @Mapping(source = "preuveDeDepotALaPoste.id", target = "preuveDeDepotALaPosteId")
    @Mapping(source = "regroupementLignesFacturation.id", target = "regroupementLignesFacturationId")
    @Mapping(source = "bordereau.id", target = "bordereauId")
    @Mapping(source = "fichier.id", target = "fichierId")
    CourrierDTO toDTO(Courrier entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "rappelCourrier", ignore = true)
    @Mapping(target = "aRappelerCourrier", ignore = true)
    @Mapping(target = "publipostage", ignore = true)
        @Mapping(target = "actions", ignore = true)
    @Mapping(target = "modeleCourrier", ignore = true)
    @Mapping(target = "piecesJointes", ignore = true)
    @Mapping(target = "preuveDeDepotALaPoste", ignore = true)
    @Mapping(target = "regroupementLignesFacturation", ignore = true)
    @Mapping(target = "bordereau", ignore = true)
    @Mapping(target = "fichier", ignore = true)
    Courrier toEntity(CourrierDTO dto);
}
