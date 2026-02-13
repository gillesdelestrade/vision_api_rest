package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AssembleeDTO;
import fr.d4immobilier.visionapirest.entities.Assemblee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface AssembleeMapper extends GenericMapper<Assemblee, AssembleeDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "pvag.id", target = "pvagId")
    @Mapping(source = "typeTantieme.id", target = "typeTantiemeId")
    @Mapping(source = "fichierMaquette.id", target = "fichierMaquetteId")
    @Mapping(source = "fichierTrameRARConvoc.id", target = "fichierTrameRARConvocId")
    @Mapping(source = "bordereauConvoc.id", target = "bordereauConvocId")
    @Mapping(source = "bordereauDiffusion.id", target = "bordereauDiffusionId")
    @Mapping(source = "fichierRARCSVConvoc.id", target = "fichierRARCSVConvocId")
    @Mapping(source = "fichierRARCSVDiffusion.id", target = "fichierRARCSVDiffusionId")
    @Mapping(source = "fichierTrameRARDiffusion.id", target = "fichierTrameRARDiffusionId")
    @Mapping(source = "fichierTableExterneConvocation.id", target = "fichierTableExterneConvocationId")
    @Mapping(source = "fichierTableExterneDiffusion.id", target = "fichierTableExterneDiffusionId")
    @Mapping(source = "fichierFicheTravaux.id", target = "fichierFicheTravauxId")
    @Mapping(source = "dateAssemblee", target = "dateAssemblee", qualifiedByName = "dateAssembleeToString")
    @Mapping(source = "dateFinAssemblee", target = "dateFinAssemblee", qualifiedByName = "dateFinAssembleeToString")
    AssembleeDTO toDTO(Assemblee entity);

    // Mapping du DTO vers l'entité
            @Mapping(target = "presences", ignore = true)
    @Mapping(target = "pvag", ignore = true)
            @Mapping(target = "typeTantieme", ignore = true)
    @Mapping(target = "batiments", ignore = true)
    @Mapping(target = "fichierMaquette", ignore = true)
    @Mapping(target = "fichierTrameRARConvoc", ignore = true)
    @Mapping(target = "bordereauConvoc", ignore = true)
    @Mapping(target = "bordereauDiffusion", ignore = true)
    @Mapping(target = "fichierRARCSVConvoc", ignore = true)
    @Mapping(target = "fichierRARCSVDiffusion", ignore = true)
    @Mapping(target = "fichierTrameRARDiffusion", ignore = true)
    @Mapping(target = "fichierTableExterneConvocation", ignore = true)
    @Mapping(target = "fichierTableExterneDiffusion", ignore = true)
    @Mapping(target = "fichiersProjetRepartition", ignore = true)
    @Mapping(target = "fichiersDecompteCharge", ignore = true)
    @Mapping(target = "fichierFicheTravaux", ignore = true)
    Assemblee toEntity(AssembleeDTO dto);

    // Méthodes helper pour les enums

    @Named("dateAssembleeToString")
    default String dateAssembleeToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("dateFinAssembleeToString")
    default String dateFinAssembleeToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }
}
