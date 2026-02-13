package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ProcedureDTO;
import fr.d4immobilier.visionapirest.entities.Procedure;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ProcedureMapper extends GenericMapper<Procedure, ProcedureDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "complementProcedure.id", target = "complementProcedureId")
    @Mapping(source = "typeProcedure", target = "typeProcedure", qualifiedByName = "typeProcedureToString")
    ProcedureDTO toDTO(Procedure entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "complementProcedure", ignore = true)
    Procedure toEntity(ProcedureDTO dto);

    // Méthodes helper pour les enums

    @Named("typeProcedureToString")
    default String typeProcedureToString(fr.d4immobilier.visionapirest.entities.TypeProcedure value) {
        return value != null ? value.name() : null;
    }
}
