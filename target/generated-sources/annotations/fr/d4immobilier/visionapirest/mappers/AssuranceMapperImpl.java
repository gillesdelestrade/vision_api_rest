package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AssuranceDTO;
import fr.d4immobilier.visionapirest.entities.Assurance;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
import fr.d4immobilier.visionapirest.entities.TypeAssurance;
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
public class AssuranceMapperImpl implements AssuranceMapper {

    @Override
    public List<AssuranceDTO> toDTOList(List<Assurance> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AssuranceDTO> list = new ArrayList<AssuranceDTO>( entities.size() );
        for ( Assurance assurance : entities ) {
            list.add( toDTO( assurance ) );
        }

        return list;
    }

    @Override
    public AssuranceDTO toDTO(Assurance entity) {
        if ( entity == null ) {
            return null;
        }

        AssuranceDTO assuranceDTO = new AssuranceDTO();

        assuranceDTO.setCourtierId( entityCourtierId( entity ) );
        assuranceDTO.setCompagnieDAssuranceId( entityCompagnieDAssuranceId( entity ) );
        assuranceDTO.setTypeAssurance( typeAssuranceToString( entity.getTypeAssurance() ) );
        assuranceDTO.setId( entity.getId() );
        assuranceDTO.setPolice( entity.getPolice() );

        return assuranceDTO;
    }

    @Override
    public Assurance toEntity(AssuranceDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Assurance assurance = new Assurance();

        assurance.setId( dto.getId() );
        assurance.setPolice( dto.getPolice() );
        if ( dto.getTypeAssurance() != null ) {
            assurance.setTypeAssurance( Enum.valueOf( TypeAssurance.class, dto.getTypeAssurance() ) );
        }

        return assurance;
    }

    private Long entityCourtierId(Assurance assurance) {
        if ( assurance == null ) {
            return null;
        }
        Fournisseur courtier = assurance.getCourtier();
        if ( courtier == null ) {
            return null;
        }
        Long id = courtier.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityCompagnieDAssuranceId(Assurance assurance) {
        if ( assurance == null ) {
            return null;
        }
        Fournisseur compagnieDAssurance = assurance.getCompagnieDAssurance();
        if ( compagnieDAssurance == null ) {
            return null;
        }
        Long id = compagnieDAssurance.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
