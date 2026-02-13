package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CompteEnBanqueDTO;
import fr.d4immobilier.visionapirest.entities.CompteEnBanque;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface CompteEnBanqueMapper extends GenericMapper<CompteEnBanque, CompteEnBanqueDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "banque.id", target = "banqueId")
    @Mapping(source = "rib.id", target = "ribId")
    @Mapping(source = "iban.id", target = "ibanId")
    @Mapping(source = "typeCompteEnBanque", target = "typeCompteEnBanque", qualifiedByName = "typeCompteEnBanqueToString")
    CompteEnBanqueDTO toDTO(CompteEnBanque entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "positionsCompteEnBanque", ignore = true)
    @Mapping(target = "mouvementsBancaires", ignore = true)
    @Mapping(target = "banque", ignore = true)
    @Mapping(target = "rib", ignore = true)
    @Mapping(target = "iban", ignore = true)
    CompteEnBanque toEntity(CompteEnBanqueDTO dto);

    // Méthodes helper pour les enums

    @Named("typeCompteEnBanqueToString")
    default String typeCompteEnBanqueToString(fr.d4immobilier.visionapirest.entities.TypeCompteEnBanque value) {
        return value != null ? value.name() : null;
    }
}
