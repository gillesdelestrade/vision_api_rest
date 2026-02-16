package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.TarifDTO;
import fr.d4immobilier.visionapirest.entities.Tarif;
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
public class TarifMapperImpl implements TarifMapper {

    @Override
    public List<TarifDTO> toDTOList(List<Tarif> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TarifDTO> list = new ArrayList<TarifDTO>( entities.size() );
        for ( Tarif tarif : entities ) {
            list.add( toDTO( tarif ) );
        }

        return list;
    }

    @Override
    public TarifDTO toDTO(Tarif entity) {
        if ( entity == null ) {
            return null;
        }

        TarifDTO tarifDTO = new TarifDTO();

        tarifDTO.setId( entity.getId() );
        tarifDTO.setNom( entity.getNom() );
        tarifDTO.setDateDebut( entity.getDateDebut() );
        tarifDTO.setDateFin( entity.getDateFin() );

        return tarifDTO;
    }

    @Override
    public Tarif toEntity(TarifDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Tarif tarif = new Tarif();

        tarif.setId( dto.getId() );
        tarif.setNom( dto.getNom() );
        tarif.setDateDebut( dto.getDateDebut() );
        tarif.setDateFin( dto.getDateFin() );

        return tarif;
    }
}
