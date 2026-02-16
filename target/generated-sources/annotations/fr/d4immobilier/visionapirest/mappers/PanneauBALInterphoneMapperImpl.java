package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.PanneauBALInterphoneDTO;
import fr.d4immobilier.visionapirest.entities.Batiment;
import fr.d4immobilier.visionapirest.entities.PanneauBALInterphone;
import fr.d4immobilier.visionapirest.entities.TypePanneau;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-16T17:26:49+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class PanneauBALInterphoneMapperImpl implements PanneauBALInterphoneMapper {

    @Override
    public List<PanneauBALInterphoneDTO> toDTOList(List<PanneauBALInterphone> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PanneauBALInterphoneDTO> list = new ArrayList<PanneauBALInterphoneDTO>( entities.size() );
        for ( PanneauBALInterphone panneauBALInterphone : entities ) {
            list.add( toDTO( panneauBALInterphone ) );
        }

        return list;
    }

    @Override
    public PanneauBALInterphoneDTO toDTO(PanneauBALInterphone entity) {
        if ( entity == null ) {
            return null;
        }

        PanneauBALInterphoneDTO panneauBALInterphoneDTO = new PanneauBALInterphoneDTO();

        panneauBALInterphoneDTO.setBatimentId( entityBatimentId( entity ) );
        panneauBALInterphoneDTO.setTypePanneau( typePanneauToString( entity.getTypePanneau() ) );
        panneauBALInterphoneDTO.setId( entity.getId() );
        panneauBALInterphoneDTO.setNbColonnes( entity.getNbColonnes() );
        panneauBALInterphoneDTO.setNbLignes( entity.getNbLignes() );
        panneauBALInterphoneDTO.setLibelle( entity.getLibelle() );

        return panneauBALInterphoneDTO;
    }

    @Override
    public PanneauBALInterphone toEntity(PanneauBALInterphoneDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PanneauBALInterphone panneauBALInterphone = new PanneauBALInterphone();

        panneauBALInterphone.setId( dto.getId() );
        if ( dto.getTypePanneau() != null ) {
            panneauBALInterphone.setTypePanneau( Enum.valueOf( TypePanneau.class, dto.getTypePanneau() ) );
        }
        panneauBALInterphone.setNbColonnes( dto.getNbColonnes() );
        panneauBALInterphone.setNbLignes( dto.getNbLignes() );
        panneauBALInterphone.setLibelle( dto.getLibelle() );

        return panneauBALInterphone;
    }

    private Long entityBatimentId(PanneauBALInterphone panneauBALInterphone) {
        if ( panneauBALInterphone == null ) {
            return null;
        }
        Batiment batiment = panneauBALInterphone.getBatiment();
        if ( batiment == null ) {
            return null;
        }
        Long id = batiment.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
