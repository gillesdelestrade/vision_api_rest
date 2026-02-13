package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TireurChequeDTO;
import fr.d4immobilier.visionapirest.entities.TireurCheque;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface TireurChequeMapper extends GenericMapper<TireurCheque, TireurChequeDTO> {
    
    // Mapping de l'entité vers le DTO
    TireurChequeDTO toDTO(TireurCheque entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "cheques", ignore = true)
    @Mapping(target = "coproprietairesConcernes", ignore = true)
    TireurCheque toEntity(TireurChequeDTO dto);
}
