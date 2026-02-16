package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PropositionSondageDTO;
import fr.d4immobilier.visionapirest.entities.Fichier;
import fr.d4immobilier.visionapirest.entities.PropositionSondage;
import fr.d4immobilier.visionapirest.entities.Sondage;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T17:26:49+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class PropositionSondageMapperImpl implements PropositionSondageMapper {

    @Override
    public List<PropositionSondageDTO> toDTOList(List<PropositionSondage> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PropositionSondageDTO> list = new ArrayList<PropositionSondageDTO>( entities.size() );
        for ( PropositionSondage propositionSondage : entities ) {
            list.add( toDTO( propositionSondage ) );
        }

        return list;
    }

    @Override
    public PropositionSondageDTO toDTO(PropositionSondage entity) {
        if ( entity == null ) {
            return null;
        }

        PropositionSondageDTO propositionSondageDTO = new PropositionSondageDTO();

        propositionSondageDTO.setFichierId( entityFichierId( entity ) );
        propositionSondageDTO.setSondageId( entitySondageId( entity ) );
        propositionSondageDTO.setId( entity.getId() );
        propositionSondageDTO.setTexte( entity.getTexte() );

        return propositionSondageDTO;
    }

    @Override
    public PropositionSondage toEntity(PropositionSondageDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PropositionSondage propositionSondage = new PropositionSondage();

        propositionSondage.setId( dto.getId() );
        propositionSondage.setTexte( dto.getTexte() );

        return propositionSondage;
    }

    private Long entityFichierId(PropositionSondage propositionSondage) {
        if ( propositionSondage == null ) {
            return null;
        }
        Fichier fichier = propositionSondage.getFichier();
        if ( fichier == null ) {
            return null;
        }
        Long id = fichier.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entitySondageId(PropositionSondage propositionSondage) {
        if ( propositionSondage == null ) {
            return null;
        }
        Sondage sondage = propositionSondage.getSondage();
        if ( sondage == null ) {
            return null;
        }
        Long id = sondage.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
