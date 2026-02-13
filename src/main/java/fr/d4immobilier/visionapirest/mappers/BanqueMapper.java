package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BanqueDTO;
import fr.d4immobilier.visionapirest.entities.Banque;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface BanqueMapper extends GenericMapper<Banque, BanqueDTO> {
    
    // Mapping de l'entité vers le DTO
    BanqueDTO toDTO(Banque entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "codesBanqueCMC7", ignore = true)
    Banque toEntity(BanqueDTO dto);
}
