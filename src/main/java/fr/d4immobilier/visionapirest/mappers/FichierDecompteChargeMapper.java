package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierDecompteChargeDTO;
import fr.d4immobilier.visionapirest.entities.FichierDecompteCharge;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface FichierDecompteChargeMapper extends GenericMapper<FichierDecompteCharge, FichierDecompteChargeDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "assemblee.id", target = "assembleeId")
    FichierDecompteChargeDTO toDTO(FichierDecompteCharge entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "assemblee", ignore = true)
    FichierDecompteCharge toEntity(FichierDecompteChargeDTO dto);
}
