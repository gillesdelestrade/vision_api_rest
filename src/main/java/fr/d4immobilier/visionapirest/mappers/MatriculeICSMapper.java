package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MatriculeICSDTO;
import fr.d4immobilier.visionapirest.entities.MatriculeICS;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface MatriculeICSMapper extends GenericMapper<MatriculeICS, MatriculeICSDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "coproprietaire.id", target = "coproprietaireId")
        MatriculeICSDTO toDTO(MatriculeICS entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "autorisationsDematerialisation", ignore = true)
    @Mapping(target = "coproprietaire", ignore = true)
        MatriculeICS toEntity(MatriculeICSDTO dto);
}
