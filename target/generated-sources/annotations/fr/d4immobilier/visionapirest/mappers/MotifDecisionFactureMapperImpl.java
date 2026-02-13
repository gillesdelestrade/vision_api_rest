package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MotifDecisionFactureDTO;
import fr.d4immobilier.visionapirest.entities.AvisD4Facture;
import fr.d4immobilier.visionapirest.entities.MotifDecisionFacture;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-12T18:34:53+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class MotifDecisionFactureMapperImpl implements MotifDecisionFactureMapper {

    @Override
    public List<MotifDecisionFactureDTO> toDTOList(List<MotifDecisionFacture> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MotifDecisionFactureDTO> list = new ArrayList<MotifDecisionFactureDTO>( entities.size() );
        for ( MotifDecisionFacture motifDecisionFacture : entities ) {
            list.add( toDTO( motifDecisionFacture ) );
        }

        return list;
    }

    @Override
    public MotifDecisionFactureDTO toDTO(MotifDecisionFacture entity) {
        if ( entity == null ) {
            return null;
        }

        MotifDecisionFactureDTO motifDecisionFactureDTO = new MotifDecisionFactureDTO();

        motifDecisionFactureDTO.setAvisD4( avisD4ToString( entity.getAvisD4() ) );
        motifDecisionFactureDTO.setId( entity.getId() );
        motifDecisionFactureDTO.setMotif( entity.getMotif() );
        motifDecisionFactureDTO.setContenuMailType( entity.getContenuMailType() );

        return motifDecisionFactureDTO;
    }

    @Override
    public MotifDecisionFacture toEntity(MotifDecisionFactureDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MotifDecisionFacture motifDecisionFacture = new MotifDecisionFacture();

        motifDecisionFacture.setId( dto.getId() );
        motifDecisionFacture.setMotif( dto.getMotif() );
        if ( dto.getAvisD4() != null ) {
            motifDecisionFacture.setAvisD4( Enum.valueOf( AvisD4Facture.class, dto.getAvisD4() ) );
        }
        motifDecisionFacture.setContenuMailType( dto.getContenuMailType() );

        return motifDecisionFacture;
    }
}
