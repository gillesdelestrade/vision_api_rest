package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ComplementProcedureDTO;
import fr.d4immobilier.visionapirest.entities.ComplementProcedure;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ComplementProcedureMapper extends GenericMapper<ComplementProcedure, ComplementProcedureDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "fichierCertificatDeNonAppel.id", target = "fichierCertificatDeNonAppelId")
    @Mapping(source = "fichierOrdonnance.id", target = "fichierOrdonnanceId")
    @Mapping(source = "avocat.id", target = "avocatId")
    @Mapping(source = "procedure.id", target = "procedureId")
    @Mapping(source = "fichierAssignation.id", target = "fichierAssignationId")
    @Mapping(source = "statutProcedure", target = "statutProcedure", qualifiedByName = "statutProcedureToString")
    ComplementProcedureDTO toDTO(ComplementProcedure entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "audiences", ignore = true)
    @Mapping(target = "fichierCertificatDeNonAppel", ignore = true)
    @Mapping(target = "fichierOrdonnance", ignore = true)
        @Mapping(target = "avocat", ignore = true)
    @Mapping(target = "procedure", ignore = true)
    @Mapping(target = "fichierAssignation", ignore = true)
    ComplementProcedure toEntity(ComplementProcedureDTO dto);

    // Méthodes helper pour les enums

    @Named("statutProcedureToString")
    default String statutProcedureToString(fr.d4immobilier.visionapirest.entities.StatutProcedure value) {
        return value != null ? value.name() : null;
    }
}
