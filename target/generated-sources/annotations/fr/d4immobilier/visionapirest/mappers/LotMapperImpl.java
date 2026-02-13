package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.LotDTO;
import fr.d4immobilier.visionapirest.entities.Batiment;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.entities.Lot;
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
public class LotMapperImpl implements LotMapper {

    @Override
    public List<LotDTO> toDTOList(List<Lot> entities) {
        if ( entities == null ) {
            return null;
        }

        List<LotDTO> list = new ArrayList<LotDTO>( entities.size() );
        for ( Lot lot : entities ) {
            list.add( toDTO( lot ) );
        }

        return list;
    }

    @Override
    public LotDTO toDTO(Lot entity) {
        if ( entity == null ) {
            return null;
        }

        LotDTO lotDTO = new LotDTO();

        lotDTO.setBatimentId( entityBatimentId( entity ) );
        lotDTO.setRepresentantAGId( entityRepresentantAGId( entity ) );
        lotDTO.setId( entity.getId() );
        lotDTO.setNumeroDeLot( entity.getNumeroDeLot() );
        lotDTO.setEtage( entity.getEtage() );
        lotDTO.setNumeroAppartement( entity.getNumeroAppartement() );
        lotDTO.setSurface( entity.getSurface() );
        lotDTO.setNature( entity.getNature() );

        return lotDTO;
    }

    @Override
    public Lot toEntity(LotDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Lot lot = new Lot();

        lot.setId( dto.getId() );
        lot.setNumeroDeLot( dto.getNumeroDeLot() );
        lot.setEtage( dto.getEtage() );
        lot.setNumeroAppartement( dto.getNumeroAppartement() );
        lot.setSurface( dto.getSurface() );
        lot.setNature( dto.getNature() );

        return lot;
    }

    private Long entityBatimentId(Lot lot) {
        if ( lot == null ) {
            return null;
        }
        Batiment batiment = lot.getBatiment();
        if ( batiment == null ) {
            return null;
        }
        Long id = batiment.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityRepresentantAGId(Lot lot) {
        if ( lot == null ) {
            return null;
        }
        Coproprietaire representantAG = lot.getRepresentantAG();
        if ( representantAG == null ) {
            return null;
        }
        Long id = representantAG.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
