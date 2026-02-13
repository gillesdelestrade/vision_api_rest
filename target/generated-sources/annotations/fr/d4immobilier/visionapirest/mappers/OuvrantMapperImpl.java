package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.OuvrantDTO;
import fr.d4immobilier.visionapirest.entities.Ouvrant;
import fr.d4immobilier.visionapirest.entities.TypeOuvrant;
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
public class OuvrantMapperImpl implements OuvrantMapper {

    @Override
    public List<OuvrantDTO> toDTOList(List<Ouvrant> entities) {
        if ( entities == null ) {
            return null;
        }

        List<OuvrantDTO> list = new ArrayList<OuvrantDTO>( entities.size() );
        for ( Ouvrant ouvrant : entities ) {
            list.add( toDTO( ouvrant ) );
        }

        return list;
    }

    @Override
    public OuvrantDTO toDTO(Ouvrant entity) {
        if ( entity == null ) {
            return null;
        }

        OuvrantDTO ouvrantDTO = new OuvrantDTO();

        ouvrantDTO.setTypeOuvrant( typeOuvrantToString( entity.getTypeOuvrant() ) );
        ouvrantDTO.setId( entity.getId() );
        ouvrantDTO.setLibelle( entity.getLibelle() );
        ouvrantDTO.setDescription( entity.getDescription() );
        ouvrantDTO.setCode( entity.getCode() );
        ouvrantDTO.setMoyenAccesUniqueParEmplacement( entity.getMoyenAccesUniqueParEmplacement() );

        return ouvrantDTO;
    }

    @Override
    public Ouvrant toEntity(OuvrantDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Ouvrant ouvrant = new Ouvrant();

        ouvrant.setId( dto.getId() );
        if ( dto.getTypeOuvrant() != null ) {
            ouvrant.setTypeOuvrant( Enum.valueOf( TypeOuvrant.class, dto.getTypeOuvrant() ) );
        }
        ouvrant.setLibelle( dto.getLibelle() );
        ouvrant.setDescription( dto.getDescription() );
        ouvrant.setCode( dto.getCode() );
        ouvrant.setMoyenAccesUniqueParEmplacement( dto.getMoyenAccesUniqueParEmplacement() );

        return ouvrant;
    }
}
