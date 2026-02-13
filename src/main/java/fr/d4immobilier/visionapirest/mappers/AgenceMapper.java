package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AgenceDTO;
import fr.d4immobilier.visionapirest.entities.Agence;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface AgenceMapper extends GenericMapper<Agence, AgenceDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "responsable.id", target = "responsableId")
    @Mapping(source = "adresse.id", target = "adresseId")
    AgenceDTO toDTO(Agence entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "responsable", ignore = true)
    @Mapping(target = "adresse", ignore = true)
    @Mapping(target = "gestionnaires", ignore = true)
    Agence toEntity(AgenceDTO dto);
}
