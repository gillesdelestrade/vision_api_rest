package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PartChequeCoproprietaireDTO;
import fr.d4immobilier.visionapirest.entities.PartChequeCoproprietaire;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface PartChequeCoproprietaireMapper extends GenericMapper<PartChequeCoproprietaire, PartChequeCoproprietaireDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "cheque.id", target = "chequeId")
    @Mapping(source = "coproprietaire.id", target = "coproprietaireId")
    PartChequeCoproprietaireDTO toDTO(PartChequeCoproprietaire entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "cheque", ignore = true)
    @Mapping(target = "coproprietaire", ignore = true)
    PartChequeCoproprietaire toEntity(PartChequeCoproprietaireDTO dto);
}
