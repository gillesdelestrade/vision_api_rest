package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.IbanDTO;
import fr.d4immobilier.visionapirest.entities.Iban;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface IbanMapper extends GenericMapper<Iban, IbanDTO> {
    
    // Mapping de l'entité vers le DTO
        IbanDTO toDTO(Iban entity);

    // Mapping du DTO vers l'entité
        Iban toEntity(IbanDTO dto);
}
