package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DemandeEmplacementPanneauBALInterphoneDTO;
import fr.d4immobilier.visionapirest.entities.DemandeEmplacementPanneauBALInterphone;
import fr.d4immobilier.visionapirest.entities.EmplacementPanneauBALInterphone;
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
public class DemandeEmplacementPanneauBALInterphoneMapperImpl implements DemandeEmplacementPanneauBALInterphoneMapper {

    @Override
    public List<DemandeEmplacementPanneauBALInterphoneDTO> toDTOList(List<DemandeEmplacementPanneauBALInterphone> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DemandeEmplacementPanneauBALInterphoneDTO> list = new ArrayList<DemandeEmplacementPanneauBALInterphoneDTO>( entities.size() );
        for ( DemandeEmplacementPanneauBALInterphone demandeEmplacementPanneauBALInterphone : entities ) {
            list.add( toDTO( demandeEmplacementPanneauBALInterphone ) );
        }

        return list;
    }

    @Override
    public DemandeEmplacementPanneauBALInterphoneDTO toDTO(DemandeEmplacementPanneauBALInterphone entity) {
        if ( entity == null ) {
            return null;
        }

        DemandeEmplacementPanneauBALInterphoneDTO demandeEmplacementPanneauBALInterphoneDTO = new DemandeEmplacementPanneauBALInterphoneDTO();

        demandeEmplacementPanneauBALInterphoneDTO.setEmplacementPanneauBALInterphoneId( entityEmplacementPanneauBALInterphoneId( entity ) );
        demandeEmplacementPanneauBALInterphoneDTO.setId( entity.getId() );

        return demandeEmplacementPanneauBALInterphoneDTO;
    }

    @Override
    public DemandeEmplacementPanneauBALInterphone toEntity(DemandeEmplacementPanneauBALInterphoneDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DemandeEmplacementPanneauBALInterphone demandeEmplacementPanneauBALInterphone = new DemandeEmplacementPanneauBALInterphone();

        demandeEmplacementPanneauBALInterphone.setId( dto.getId() );

        return demandeEmplacementPanneauBALInterphone;
    }

    private Long entityEmplacementPanneauBALInterphoneId(DemandeEmplacementPanneauBALInterphone demandeEmplacementPanneauBALInterphone) {
        if ( demandeEmplacementPanneauBALInterphone == null ) {
            return null;
        }
        EmplacementPanneauBALInterphone emplacementPanneauBALInterphone = demandeEmplacementPanneauBALInterphone.getEmplacementPanneauBALInterphone();
        if ( emplacementPanneauBALInterphone == null ) {
            return null;
        }
        Long id = emplacementPanneauBALInterphone.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
