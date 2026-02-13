package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MouvementBancaireDTO;
import fr.d4immobilier.visionapirest.entities.MouvementBancaire;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface MouvementBancaireMapper extends GenericMapper<MouvementBancaire, MouvementBancaireDTO> {
    
    // Mapping de l'entité vers le DTO
        MouvementBancaireDTO toDTO(MouvementBancaire entity);

    // Mapping du DTO vers l'entité
        MouvementBancaire toEntity(MouvementBancaireDTO dto);
}
