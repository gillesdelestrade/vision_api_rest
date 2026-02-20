package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.IbanDTO;
import fr.d4immobilier.visionapirest.entities.Iban;
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
public class IbanMapperImpl implements IbanMapper {

    @Override
    public List<IbanDTO> toDTOList(List<Iban> entities) {
        if ( entities == null ) {
            return null;
        }

        List<IbanDTO> list = new ArrayList<IbanDTO>( entities.size() );
        for ( Iban iban : entities ) {
            list.add( toDTO( iban ) );
        }

        return list;
    }

    @Override
    public IbanDTO toDTO(Iban entity) {
        if ( entity == null ) {
            return null;
        }

        IbanDTO ibanDTO = new IbanDTO();

        ibanDTO.setId( entity.getId() );
        ibanDTO.setBloc1( entity.getBloc1() );
        ibanDTO.setBloc2( entity.getBloc2() );
        ibanDTO.setBloc3( entity.getBloc3() );
        ibanDTO.setBloc4( entity.getBloc4() );
        ibanDTO.setBloc5( entity.getBloc5() );
        ibanDTO.setBloc6( entity.getBloc6() );
        ibanDTO.setBloc7( entity.getBloc7() );

        return ibanDTO;
    }

    @Override
    public Iban toEntity(IbanDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Iban iban = new Iban();

        iban.setId( dto.getId() );
        iban.setBloc1( dto.getBloc1() );
        iban.setBloc2( dto.getBloc2() );
        iban.setBloc3( dto.getBloc3() );
        iban.setBloc4( dto.getBloc4() );
        iban.setBloc5( dto.getBloc5() );
        iban.setBloc6( dto.getBloc6() );
        iban.setBloc7( dto.getBloc7() );

        return iban;
    }
}
