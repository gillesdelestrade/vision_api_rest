package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EtapePlanifAGModeleDTO;
import fr.d4immobilier.visionapirest.entities.EtapePlanifAGModele;
import fr.d4immobilier.visionapirest.entities.ResponsableEtapePlanifAGModele;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-17T10:51:57+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class EtapePlanifAGModeleMapperImpl implements EtapePlanifAGModeleMapper {

    @Override
    public List<EtapePlanifAGModeleDTO> toDTOList(List<EtapePlanifAGModele> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EtapePlanifAGModeleDTO> list = new ArrayList<EtapePlanifAGModeleDTO>( entities.size() );
        for ( EtapePlanifAGModele etapePlanifAGModele : entities ) {
            list.add( toDTO( etapePlanifAGModele ) );
        }

        return list;
    }

    @Override
    public EtapePlanifAGModeleDTO toDTO(EtapePlanifAGModele entity) {
        if ( entity == null ) {
            return null;
        }

        EtapePlanifAGModeleDTO etapePlanifAGModeleDTO = new EtapePlanifAGModeleDTO();

        etapePlanifAGModeleDTO.setResponsableEtapePlanifAGModele( responsableEtapePlanifAGModeleToString( entity.getResponsableEtapePlanifAGModele() ) );
        etapePlanifAGModeleDTO.setId( entity.getId() );
        etapePlanifAGModeleDTO.setNumeroOrdre( entity.getNumeroOrdre() );
        etapePlanifAGModeleDTO.setLibelle( entity.getLibelle() );
        etapePlanifAGModeleDTO.setDureeTacheRapide( entity.getDureeTacheRapide() );
        etapePlanifAGModeleDTO.setDureeTacheNormale( entity.getDureeTacheNormale() );
        etapePlanifAGModeleDTO.setDureeTacheLongue( entity.getDureeTacheLongue() );
        etapePlanifAGModeleDTO.setDureeTacheTresLongue( entity.getDureeTacheTresLongue() );

        return etapePlanifAGModeleDTO;
    }

    @Override
    public EtapePlanifAGModele toEntity(EtapePlanifAGModeleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EtapePlanifAGModele etapePlanifAGModele = new EtapePlanifAGModele();

        etapePlanifAGModele.setId( dto.getId() );
        etapePlanifAGModele.setNumeroOrdre( dto.getNumeroOrdre() );
        etapePlanifAGModele.setLibelle( dto.getLibelle() );
        if ( dto.getResponsableEtapePlanifAGModele() != null ) {
            etapePlanifAGModele.setResponsableEtapePlanifAGModele( Enum.valueOf( ResponsableEtapePlanifAGModele.class, dto.getResponsableEtapePlanifAGModele() ) );
        }
        etapePlanifAGModele.setDureeTacheRapide( dto.getDureeTacheRapide() );
        etapePlanifAGModele.setDureeTacheNormale( dto.getDureeTacheNormale() );
        etapePlanifAGModele.setDureeTacheLongue( dto.getDureeTacheLongue() );
        etapePlanifAGModele.setDureeTacheTresLongue( dto.getDureeTacheTresLongue() );

        return etapePlanifAGModele;
    }
}
