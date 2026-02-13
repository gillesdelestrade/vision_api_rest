package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BordereauDeRemiseDeChequeDTO;
import fr.d4immobilier.visionapirest.entities.BordereauDeRemiseDeCheque;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface BordereauDeRemiseDeChequeMapper extends GenericMapper<BordereauDeRemiseDeCheque, BordereauDeRemiseDeChequeDTO> {
    
    // Mapping de l'entité vers le DTO
            @Mapping(source = "dateImpression", target = "dateImpression", qualifiedByName = "dateImpressionToString")
    @Mapping(source = "etatBordereauCheques", target = "etatBordereauCheques", qualifiedByName = "etatBordereauChequesToString")
    BordereauDeRemiseDeChequeDTO toDTO(BordereauDeRemiseDeCheque entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "cheques", ignore = true)
        @Mapping(target = "compteEnBanqueCopropriete", ignore = true)
    BordereauDeRemiseDeCheque toEntity(BordereauDeRemiseDeChequeDTO dto);

    // Méthodes helper pour les enums

    @Named("dateImpressionToString")
    default String dateImpressionToString(java.time.Instant value) {
        if (value == null) return null;
    // Format ISO-8601 (par défaut)
    return value.toString();
    }

    @Named("etatBordereauChequesToString")
    default String etatBordereauChequesToString(fr.d4immobilier.visionapirest.entities.EtatBordereauCheques value) {
        return value != null ? value.name() : null;
    }
}
