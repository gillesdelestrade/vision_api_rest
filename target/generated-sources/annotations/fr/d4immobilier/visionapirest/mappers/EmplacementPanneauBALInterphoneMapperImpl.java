package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EmplacementPanneauBALInterphoneDTO;
import fr.d4immobilier.visionapirest.entities.EmplacementPanneauBALInterphone;
import fr.d4immobilier.visionapirest.entities.PanneauBALInterphone;
import fr.d4immobilier.visionapirest.entities.StatutEmplacementPlaqueBAL;
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
public class EmplacementPanneauBALInterphoneMapperImpl implements EmplacementPanneauBALInterphoneMapper {

    @Override
    public List<EmplacementPanneauBALInterphoneDTO> toDTOList(List<EmplacementPanneauBALInterphone> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EmplacementPanneauBALInterphoneDTO> list = new ArrayList<EmplacementPanneauBALInterphoneDTO>( entities.size() );
        for ( EmplacementPanneauBALInterphone emplacementPanneauBALInterphone : entities ) {
            list.add( toDTO( emplacementPanneauBALInterphone ) );
        }

        return list;
    }

    @Override
    public EmplacementPanneauBALInterphoneDTO toDTO(EmplacementPanneauBALInterphone entity) {
        if ( entity == null ) {
            return null;
        }

        EmplacementPanneauBALInterphoneDTO emplacementPanneauBALInterphoneDTO = new EmplacementPanneauBALInterphoneDTO();

        emplacementPanneauBALInterphoneDTO.setPanneauBALInterphoneId( entityPanneauBALInterphoneId( entity ) );
        emplacementPanneauBALInterphoneDTO.setStatutEmplacementPlaqueBAL( statutEmplacementPlaqueBALToString( entity.getStatutEmplacementPlaqueBAL() ) );
        emplacementPanneauBALInterphoneDTO.setId( entity.getId() );
        emplacementPanneauBALInterphoneDTO.setActif( entity.getActif() );
        emplacementPanneauBALInterphoneDTO.setLigne1( entity.getLigne1() );
        emplacementPanneauBALInterphoneDTO.setLigne2( entity.getLigne2() );
        emplacementPanneauBALInterphoneDTO.setLigne3( entity.getLigne3() );
        emplacementPanneauBALInterphoneDTO.setLigne( entity.getLigne() );
        emplacementPanneauBALInterphoneDTO.setColonne( entity.getColonne() );
        emplacementPanneauBALInterphoneDTO.setDateCommandePrevisionnelle( entity.getDateCommandePrevisionnelle() );

        return emplacementPanneauBALInterphoneDTO;
    }

    @Override
    public EmplacementPanneauBALInterphone toEntity(EmplacementPanneauBALInterphoneDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EmplacementPanneauBALInterphone emplacementPanneauBALInterphone = new EmplacementPanneauBALInterphone();

        emplacementPanneauBALInterphone.setId( dto.getId() );
        emplacementPanneauBALInterphone.setActif( dto.getActif() );
        emplacementPanneauBALInterphone.setLigne1( dto.getLigne1() );
        emplacementPanneauBALInterphone.setLigne2( dto.getLigne2() );
        emplacementPanneauBALInterphone.setLigne3( dto.getLigne3() );
        emplacementPanneauBALInterphone.setLigne( dto.getLigne() );
        emplacementPanneauBALInterphone.setColonne( dto.getColonne() );
        if ( dto.getStatutEmplacementPlaqueBAL() != null ) {
            emplacementPanneauBALInterphone.setStatutEmplacementPlaqueBAL( Enum.valueOf( StatutEmplacementPlaqueBAL.class, dto.getStatutEmplacementPlaqueBAL() ) );
        }
        emplacementPanneauBALInterphone.setDateCommandePrevisionnelle( dto.getDateCommandePrevisionnelle() );

        return emplacementPanneauBALInterphone;
    }

    private Long entityPanneauBALInterphoneId(EmplacementPanneauBALInterphone emplacementPanneauBALInterphone) {
        if ( emplacementPanneauBALInterphone == null ) {
            return null;
        }
        PanneauBALInterphone panneauBALInterphone = emplacementPanneauBALInterphone.getPanneauBALInterphone();
        if ( panneauBALInterphone == null ) {
            return null;
        }
        Long id = panneauBALInterphone.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
