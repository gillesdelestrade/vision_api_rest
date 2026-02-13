package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ChequeDTO;
import fr.d4immobilier.visionapirest.entities.Cheque;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "cdi")
public interface ChequeMapper extends GenericMapper<Cheque, ChequeDTO> {
    
    // Mapping de l'entité vers le DTO
    @Mapping(source = "banque.id", target = "banqueId")
    @Mapping(source = "emetteurPersonne.id", target = "emetteurPersonneId")
    @Mapping(source = "emetteurSociete.id", target = "emetteurSocieteId")
    @Mapping(source = "bordereauDeRemiseDeCheque.id", target = "bordereauDeRemiseDeChequeId")
    @Mapping(source = "emetteurCopropriete.id", target = "emetteurCoproprieteId")
    @Mapping(source = "tireurCheque.id", target = "tireurChequeId")
    ChequeDTO toDTO(Cheque entity);

    // Mapping du DTO vers l'entité
        @Mapping(target = "banque", ignore = true)
    @Mapping(target = "emetteurPersonne", ignore = true)
    @Mapping(target = "emetteurSociete", ignore = true)
    @Mapping(target = "bordereauDeRemiseDeCheque", ignore = true)
    @Mapping(target = "emetteurCopropriete", ignore = true)
    @Mapping(target = "tireurCheque", ignore = true)
    Cheque toEntity(ChequeDTO dto);
}
