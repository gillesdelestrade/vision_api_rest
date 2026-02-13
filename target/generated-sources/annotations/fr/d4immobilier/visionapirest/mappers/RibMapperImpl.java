package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.RibDTO;
import fr.d4immobilier.visionapirest.entities.Rib;
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
public class RibMapperImpl implements RibMapper {

    @Override
    public List<RibDTO> toDTOList(List<Rib> entities) {
        if ( entities == null ) {
            return null;
        }

        List<RibDTO> list = new ArrayList<RibDTO>( entities.size() );
        for ( Rib rib : entities ) {
            list.add( toDTO( rib ) );
        }

        return list;
    }

    @Override
    public RibDTO toDTO(Rib entity) {
        if ( entity == null ) {
            return null;
        }

        RibDTO ribDTO = new RibDTO();

        ribDTO.setId( entity.getId() );
        ribDTO.setCodeEtablissement( entity.getCodeEtablissement() );
        ribDTO.setCodeGuichet( entity.getCodeGuichet() );
        ribDTO.setNumeroCompte( entity.getNumeroCompte() );
        ribDTO.setCleRib( entity.getCleRib() );
        ribDTO.setDomiciliation( entity.getDomiciliation() );

        return ribDTO;
    }

    @Override
    public Rib toEntity(RibDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Rib rib = new Rib();

        rib.setId( dto.getId() );
        rib.setCodeEtablissement( dto.getCodeEtablissement() );
        rib.setCodeGuichet( dto.getCodeGuichet() );
        rib.setNumeroCompte( dto.getNumeroCompte() );
        rib.setCleRib( dto.getCleRib() );
        rib.setDomiciliation( dto.getDomiciliation() );

        return rib;
    }
}
