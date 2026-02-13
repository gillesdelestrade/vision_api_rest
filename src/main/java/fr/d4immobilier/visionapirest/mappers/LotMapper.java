package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.LotDTO;
import fr.d4immobilier.visionapirest.entities.Lot;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface LotMapper extends GenericMapper<Lot, LotDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "batiment.id", target = "batimentId")
            @Mapping(source = "representantAG.id", target = "representantAGId")
    LotDTO toDTO(Lot entity);

    // Mapping du DTO vers l'entité
            @Mapping(target = "batiment", ignore = true)
        @Mapping(target = "coproprietaires", ignore = true)
        @Mapping(target = "representantAG", ignore = true)
    @Mapping(target = "tantiemes", ignore = true)
    Lot toEntity(LotDTO dto);
}
