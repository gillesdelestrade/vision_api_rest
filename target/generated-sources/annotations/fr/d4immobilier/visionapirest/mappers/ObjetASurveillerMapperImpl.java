package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ObjetASurveillerDTO;
import fr.d4immobilier.visionapirest.entities.ObjetASurveiller;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-12T18:34:53+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class ObjetASurveillerMapperImpl implements ObjetASurveillerMapper {

    @Override
    public List<ObjetASurveillerDTO> toDTOList(List<ObjetASurveiller> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ObjetASurveillerDTO> list = new ArrayList<ObjetASurveillerDTO>( entities.size() );
        for ( ObjetASurveiller objetASurveiller : entities ) {
            list.add( toDTO( objetASurveiller ) );
        }

        return list;
    }

    @Override
    public ObjetASurveillerDTO toDTO(ObjetASurveiller entity) {
        if ( entity == null ) {
            return null;
        }

        ObjetASurveillerDTO objetASurveillerDTO = new ObjetASurveillerDTO();

        objetASurveillerDTO.setDateDerniereMiseAJour( dateDerniereMiseAJourToString( entity.getDateDerniereMiseAJour() ) );
        objetASurveillerDTO.setId( entity.getId() );
        objetASurveillerDTO.setIdObjetASurveiller( entity.getIdObjetASurveiller() );
        objetASurveillerDTO.setClasseObjet( entity.getClasseObjet() );
        objetASurveillerDTO.setIdCopropriete( entity.getIdCopropriete() );
        objetASurveillerDTO.setIdPersonneModifiant( entity.getIdPersonneModifiant() );
        objetASurveillerDTO.setIdAuteur( entity.getIdAuteur() );
        objetASurveillerDTO.setVisibleParTous( entity.getVisibleParTous() );

        return objetASurveillerDTO;
    }

    @Override
    public ObjetASurveiller toEntity(ObjetASurveillerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ObjetASurveiller objetASurveiller = new ObjetASurveiller();

        objetASurveiller.setId( dto.getId() );
        objetASurveiller.setIdObjetASurveiller( dto.getIdObjetASurveiller() );
        objetASurveiller.setClasseObjet( dto.getClasseObjet() );
        if ( dto.getDateDerniereMiseAJour() != null ) {
            objetASurveiller.setDateDerniereMiseAJour( Instant.parse( dto.getDateDerniereMiseAJour() ) );
        }
        objetASurveiller.setIdCopropriete( dto.getIdCopropriete() );
        objetASurveiller.setIdPersonneModifiant( dto.getIdPersonneModifiant() );
        objetASurveiller.setIdAuteur( dto.getIdAuteur() );
        objetASurveiller.setVisibleParTous( dto.getVisibleParTous() );

        return objetASurveiller;
    }
}
