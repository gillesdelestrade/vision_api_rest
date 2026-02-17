package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AutorisationDematerialisationDTO;
import fr.d4immobilier.visionapirest.entities.AutorisationDematerialisation;
import fr.d4immobilier.visionapirest.entities.ContenuDematerialisation;
import fr.d4immobilier.visionapirest.entities.MatriculeICS;
import fr.d4immobilier.visionapirest.entities.StatutAutorisationDematerialisation;
import fr.d4immobilier.visionapirest.entities.SupportDematerialisation;
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
public class AutorisationDematerialisationMapperImpl implements AutorisationDematerialisationMapper {

    @Override
    public List<AutorisationDematerialisationDTO> toDTOList(List<AutorisationDematerialisation> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AutorisationDematerialisationDTO> list = new ArrayList<AutorisationDematerialisationDTO>( entities.size() );
        for ( AutorisationDematerialisation autorisationDematerialisation : entities ) {
            list.add( toDTO( autorisationDematerialisation ) );
        }

        return list;
    }

    @Override
    public AutorisationDematerialisationDTO toDTO(AutorisationDematerialisation entity) {
        if ( entity == null ) {
            return null;
        }

        AutorisationDematerialisationDTO autorisationDematerialisationDTO = new AutorisationDematerialisationDTO();

        autorisationDematerialisationDTO.setMatriculeICSId( entityMatriculeICSId( entity ) );
        autorisationDematerialisationDTO.setContenuDematerialisation( contenuDematerialisationToString( entity.getContenuDematerialisation() ) );
        autorisationDematerialisationDTO.setSupportDematerialisation( supportDematerialisationToString( entity.getSupportDematerialisation() ) );
        autorisationDematerialisationDTO.setStatutAutorisationDematerialisation( statutAutorisationDematerialisationToString( entity.getStatutAutorisationDematerialisation() ) );
        autorisationDematerialisationDTO.setId( entity.getId() );

        return autorisationDematerialisationDTO;
    }

    @Override
    public AutorisationDematerialisation toEntity(AutorisationDematerialisationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AutorisationDematerialisation autorisationDematerialisation = new AutorisationDematerialisation();

        autorisationDematerialisation.setId( dto.getId() );
        if ( dto.getContenuDematerialisation() != null ) {
            autorisationDematerialisation.setContenuDematerialisation( Enum.valueOf( ContenuDematerialisation.class, dto.getContenuDematerialisation() ) );
        }
        if ( dto.getSupportDematerialisation() != null ) {
            autorisationDematerialisation.setSupportDematerialisation( Enum.valueOf( SupportDematerialisation.class, dto.getSupportDematerialisation() ) );
        }
        if ( dto.getStatutAutorisationDematerialisation() != null ) {
            autorisationDematerialisation.setStatutAutorisationDematerialisation( Enum.valueOf( StatutAutorisationDematerialisation.class, dto.getStatutAutorisationDematerialisation() ) );
        }

        return autorisationDematerialisation;
    }

    private Long entityMatriculeICSId(AutorisationDematerialisation autorisationDematerialisation) {
        if ( autorisationDematerialisation == null ) {
            return null;
        }
        MatriculeICS matriculeICS = autorisationDematerialisation.getMatriculeICS();
        if ( matriculeICS == null ) {
            return null;
        }
        Long id = matriculeICS.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
