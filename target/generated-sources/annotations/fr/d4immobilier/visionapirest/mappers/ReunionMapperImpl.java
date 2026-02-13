package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ReunionDTO;
import fr.d4immobilier.visionapirest.entities.Reunion;
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
public class ReunionMapperImpl implements ReunionMapper {

    @Override
    public List<ReunionDTO> toDTOList(List<Reunion> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ReunionDTO> list = new ArrayList<ReunionDTO>( entities.size() );
        for ( Reunion reunion : entities ) {
            list.add( toDTO( reunion ) );
        }

        return list;
    }

    @Override
    public ReunionDTO toDTO(Reunion entity) {
        if ( entity == null ) {
            return null;
        }

        ReunionDTO reunionDTO = new ReunionDTO();

        reunionDTO.setDateReunion( dateReunionToString( entity.getDateReunion() ) );
        reunionDTO.setId( entity.getId() );
        reunionDTO.setObjet( entity.getObjet() );
        reunionDTO.setParticipants( entity.getParticipants() );
        reunionDTO.setDiffusion( entity.getDiffusion() );
        reunionDTO.setDateProchaineReunion( entity.getDateProchaineReunion() );
        reunionDTO.setDetailProchaineReunion( entity.getDetailProchaineReunion() );
        reunionDTO.setBrouillon( entity.getBrouillon() );
        reunionDTO.setReunionSansSyndic( entity.getReunionSansSyndic() );
        reunionDTO.setDateProvisoire( entity.getDateProvisoire() );

        return reunionDTO;
    }

    @Override
    public Reunion toEntity(ReunionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Reunion reunion = new Reunion();

        reunion.setId( dto.getId() );
        if ( dto.getDateReunion() != null ) {
            reunion.setDateReunion( Instant.parse( dto.getDateReunion() ) );
        }
        reunion.setObjet( dto.getObjet() );
        reunion.setParticipants( dto.getParticipants() );
        reunion.setDiffusion( dto.getDiffusion() );
        reunion.setDateProchaineReunion( dto.getDateProchaineReunion() );
        reunion.setDetailProchaineReunion( dto.getDetailProchaineReunion() );
        reunion.setBrouillon( dto.getBrouillon() );
        reunion.setReunionSansSyndic( dto.getReunionSansSyndic() );
        reunion.setDateProvisoire( dto.getDateProvisoire() );

        return reunion;
    }
}
