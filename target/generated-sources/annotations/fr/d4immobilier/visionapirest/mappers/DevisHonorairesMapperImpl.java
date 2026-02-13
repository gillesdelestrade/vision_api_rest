package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DevisHonorairesDTO;
import fr.d4immobilier.visionapirest.entities.DevisHonoraires;
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
public class DevisHonorairesMapperImpl implements DevisHonorairesMapper {

    @Override
    public List<DevisHonorairesDTO> toDTOList(List<DevisHonoraires> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DevisHonorairesDTO> list = new ArrayList<DevisHonorairesDTO>( entities.size() );
        for ( DevisHonoraires devisHonoraires : entities ) {
            list.add( toDTO( devisHonoraires ) );
        }

        return list;
    }

    @Override
    public DevisHonorairesDTO toDTO(DevisHonoraires entity) {
        if ( entity == null ) {
            return null;
        }

        DevisHonorairesDTO devisHonorairesDTO = new DevisHonorairesDTO();

        devisHonorairesDTO.setId( entity.getId() );
        devisHonorairesDTO.setDateDebut( entity.getDateDebut() );
        devisHonorairesDTO.setDateFin( entity.getDateFin() );
        devisHonorairesDTO.setMontant( entity.getMontant() );

        return devisHonorairesDTO;
    }

    @Override
    public DevisHonoraires toEntity(DevisHonorairesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DevisHonoraires devisHonoraires = new DevisHonoraires();

        devisHonoraires.setId( dto.getId() );
        devisHonoraires.setDateDebut( dto.getDateDebut() );
        devisHonoraires.setDateFin( dto.getDateFin() );
        devisHonoraires.setMontant( dto.getMontant() );

        return devisHonoraires;
    }
}
