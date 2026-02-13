package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EcheanceFinancementDTO;
import fr.d4immobilier.visionapirest.entities.EcheanceFinancement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface EcheanceFinancementMapper extends GenericMapper<EcheanceFinancement, EcheanceFinancementDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "financementTravaux.id", target = "financementTravauxId")
    @Mapping(source = "typeEcheance", target = "typeEcheance", qualifiedByName = "typeEcheanceToString")
    EcheanceFinancementDTO toDTO(EcheanceFinancement entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "financementTravaux", ignore = true)
    EcheanceFinancement toEntity(EcheanceFinancementDTO dto);

    // Méthodes helper pour les enums

    @Named("typeEcheanceToString")
    default String typeEcheanceToString(fr.d4immobilier.visionapirest.entities.TypeEcheance value) {
        return value != null ? value.name() : null;
    }
}
