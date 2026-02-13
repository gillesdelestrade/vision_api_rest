package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EnvoiMailDTO;
import fr.d4immobilier.visionapirest.entities.EnvoiMail;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface EnvoiMailMapper extends GenericMapper<EnvoiMail, EnvoiMailDTO> {
    
    // Mapping de l'entité vers le DTO
        @Mapping(source = "demande.id", target = "demandeId")
    @Mapping(source = "dossier.id", target = "dossierId")
    @Mapping(source = "sinistre.id", target = "sinistreId")
        @Mapping(source = "reunion.id", target = "reunionId")
    @Mapping(source = "fichier.id", target = "fichierId")
    EnvoiMailDTO toDTO(EnvoiMail entity);

    // Mapping du DTO vers l'entité
    @Mapping(target = "aRappelerEnvoiMail", ignore = true)
    @Mapping(target = "destinataires", ignore = true)
    @Mapping(target = "demande", ignore = true)
    @Mapping(target = "dossier", ignore = true)
    @Mapping(target = "sinistre", ignore = true)
        @Mapping(target = "reunion", ignore = true)
    @Mapping(target = "fichier", ignore = true)
    EnvoiMail toEntity(EnvoiMailDTO dto);
}
