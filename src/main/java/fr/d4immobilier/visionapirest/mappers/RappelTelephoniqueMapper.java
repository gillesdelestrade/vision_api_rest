package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.RappelTelephoniqueDTO;
import fr.d4immobilier.visionapirest.entities.RappelTelephonique;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface RappelTelephoniqueMapper extends GenericMapper<RappelTelephonique, RappelTelephoniqueDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "auteur.id", target = "auteurId")
    @Mapping(source = "demandeDeRappel.id", target = "demandeDeRappelId")
    @Mapping(source = "dateRappel", target = "dateRappel", qualifiedByName = "dateRappelToString")
    @Mapping(source = "etatRappelTelephonique", target = "etatRappelTelephonique", qualifiedByName = "etatRappelTelephoniqueToString")
    RappelTelephoniqueDTO toDTO(RappelTelephonique entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "auteur", ignore = true)
    @Mapping(target = "demandeDeRappel", ignore = true)
    RappelTelephonique toEntity(RappelTelephoniqueDTO dto);

    // Méthodes helper pour les enums

    @Named("dateRappelToString")
    default String dateRappelToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("etatRappelTelephoniqueToString")
    default String etatRappelTelephoniqueToString(fr.d4immobilier.visionapirest.entities.EtatRappelTelephonique value) {
        return value != null ? value.name() : null;
    }
}
