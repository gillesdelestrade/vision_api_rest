package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ConsigneDTO;
import fr.d4immobilier.visionapirest.entities.Consigne;
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
public class ConsigneMapperImpl implements ConsigneMapper {

    @Override
    public List<ConsigneDTO> toDTOList(List<Consigne> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ConsigneDTO> list = new ArrayList<ConsigneDTO>( entities.size() );
        for ( Consigne consigne : entities ) {
            list.add( toDTO( consigne ) );
        }

        return list;
    }

    @Override
    public ConsigneDTO toDTO(Consigne entity) {
        if ( entity == null ) {
            return null;
        }

        ConsigneDTO consigneDTO = new ConsigneDTO();

        consigneDTO.setId( entity.getId() );
        consigneDTO.setTitre( entity.getTitre() );

        return consigneDTO;
    }

    @Override
    public Consigne toEntity(ConsigneDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Consigne consigne = new Consigne();

        consigne.setId( dto.getId() );
        consigne.setTitre( dto.getTitre() );

        return consigne;
    }
}
