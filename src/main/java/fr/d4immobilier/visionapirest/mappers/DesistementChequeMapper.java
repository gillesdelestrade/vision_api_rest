package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DesistementChequeDTO;
import fr.d4immobilier.visionapirest.entities.DesistementCheque;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface DesistementChequeMapper extends GenericMapper<DesistementCheque, DesistementChequeDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "coproprietaire.id", target = "coproprietaireId")
    @Mapping(source = "banque.id", target = "banqueId")
    @Mapping(source = "courrierDesistement.id", target = "courrierDesistementId")
    @Mapping(source = "courrierChequeRetrouve.id", target = "courrierChequeRetrouveId")
        DesistementChequeDTO toDTO(DesistementCheque entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "coproprietaire", ignore = true)
    @Mapping(target = "banque", ignore = true)
    @Mapping(target = "courrierDesistement", ignore = true)
    @Mapping(target = "courrierChequeRetrouve", ignore = true)
        DesistementCheque toEntity(DesistementChequeDTO dto);
}
