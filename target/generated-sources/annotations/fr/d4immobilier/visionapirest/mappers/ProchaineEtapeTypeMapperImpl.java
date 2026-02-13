package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ProchaineEtapeTypeDTO;
import fr.d4immobilier.visionapirest.entities.ProchaineEtapeType;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-13T14:09:30+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class ProchaineEtapeTypeMapperImpl implements ProchaineEtapeTypeMapper {

    @Override
    public List<ProchaineEtapeTypeDTO> toDTOList(List<ProchaineEtapeType> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ProchaineEtapeTypeDTO> list = new ArrayList<ProchaineEtapeTypeDTO>( entities.size() );
        for ( ProchaineEtapeType prochaineEtapeType : entities ) {
            list.add( toDTO( prochaineEtapeType ) );
        }

        return list;
    }

    @Override
    public ProchaineEtapeTypeDTO toDTO(ProchaineEtapeType entity) {
        if ( entity == null ) {
            return null;
        }

        ProchaineEtapeTypeDTO prochaineEtapeTypeDTO = new ProchaineEtapeTypeDTO();

        prochaineEtapeTypeDTO.setId( entity.getId() );
        prochaineEtapeTypeDTO.setLibelle( entity.getLibelle() );
        prochaineEtapeTypeDTO.setTexteRealise( entity.getTexteRealise() );
        prochaineEtapeTypeDTO.setPriorite( entity.getPriorite() );
        prochaineEtapeTypeDTO.setTexteNonRealise( entity.getTexteNonRealise() );

        return prochaineEtapeTypeDTO;
    }

    @Override
    public ProchaineEtapeType toEntity(ProchaineEtapeTypeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ProchaineEtapeType prochaineEtapeType = new ProchaineEtapeType();

        prochaineEtapeType.setId( dto.getId() );
        prochaineEtapeType.setLibelle( dto.getLibelle() );
        prochaineEtapeType.setTexteRealise( dto.getTexteRealise() );
        prochaineEtapeType.setPriorite( dto.getPriorite() );
        prochaineEtapeType.setTexteNonRealise( dto.getTexteNonRealise() );

        return prochaineEtapeType;
    }
}
