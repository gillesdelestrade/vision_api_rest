package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.SondageDTO;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.entities.Sondage;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-20T08:40:21+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class SondageMapperImpl implements SondageMapper {

    @Override
    public List<SondageDTO> toDTOList(List<Sondage> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SondageDTO> list = new ArrayList<SondageDTO>( entities.size() );
        for ( Sondage sondage : entities ) {
            list.add( toDTO( sondage ) );
        }

        return list;
    }

    @Override
    public SondageDTO toDTO(Sondage entity) {
        if ( entity == null ) {
            return null;
        }

        SondageDTO sondageDTO = new SondageDTO();

        sondageDTO.setDemandeId( entityDemandeId( entity ) );
        sondageDTO.setId( entity.getId() );
        sondageDTO.setObjet( entity.getObjet() );
        sondageDTO.setTexte( entity.getTexte() );

        return sondageDTO;
    }

    @Override
    public Sondage toEntity(SondageDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Sondage sondage = new Sondage();

        sondage.setId( dto.getId() );
        sondage.setObjet( dto.getObjet() );
        sondage.setTexte( dto.getTexte() );

        return sondage;
    }

    private Long entityDemandeId(Sondage sondage) {
        if ( sondage == null ) {
            return null;
        }
        Demande demande = sondage.getDemande();
        if ( demande == null ) {
            return null;
        }
        Long id = demande.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
