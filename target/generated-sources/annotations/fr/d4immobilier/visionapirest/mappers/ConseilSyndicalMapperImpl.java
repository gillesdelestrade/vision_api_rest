package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ConseilSyndicalDTO;
import fr.d4immobilier.visionapirest.entities.ConseilSyndical;
import fr.d4immobilier.visionapirest.entities.Personne;
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
public class ConseilSyndicalMapperImpl implements ConseilSyndicalMapper {

    @Override
    public ConseilSyndicalDTO toDTO(ConseilSyndical entity) {
        if ( entity == null ) {
            return null;
        }

        Long id = null;
        ConseilSyndicalDTO.MembreConseilDTO president = null;
        List<ConseilSyndicalDTO.MembreConseilDTO> membres = null;

        id = entity.getId();
        president = personneToMembreConseilDTO( entity.getPresident() );
        membres = personneListToMembreConseilDTOList( entity.getMembres() );

        ConseilSyndicalDTO conseilSyndicalDTO = new ConseilSyndicalDTO( id, president, membres );

        return conseilSyndicalDTO;
    }

    @Override
    public List<ConseilSyndicalDTO> toDTOList(List<ConseilSyndical> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ConseilSyndicalDTO> list = new ArrayList<ConseilSyndicalDTO>( entities.size() );
        for ( ConseilSyndical conseilSyndical : entities ) {
            list.add( toDTO( conseilSyndical ) );
        }

        return list;
    }

    @Override
    public ConseilSyndical toEntity(ConseilSyndicalDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ConseilSyndical conseilSyndical = new ConseilSyndical();

        conseilSyndical.setId( dto.id() );

        return conseilSyndical;
    }

    protected ConseilSyndicalDTO.MembreConseilDTO personneToMembreConseilDTO(Personne personne) {
        if ( personne == null ) {
            return null;
        }

        Long id = null;
        String nom = null;

        id = personne.getId();
        nom = personne.getNom();

        String type = null;
        List<ConseilSyndicalDTO.BatimentDTO> batiments = null;

        ConseilSyndicalDTO.MembreConseilDTO membreConseilDTO = new ConseilSyndicalDTO.MembreConseilDTO( id, nom, type, batiments );

        return membreConseilDTO;
    }

    protected List<ConseilSyndicalDTO.MembreConseilDTO> personneListToMembreConseilDTOList(List<Personne> list) {
        if ( list == null ) {
            return null;
        }

        List<ConseilSyndicalDTO.MembreConseilDTO> list1 = new ArrayList<ConseilSyndicalDTO.MembreConseilDTO>( list.size() );
        for ( Personne personne : list ) {
            list1.add( personneToMembreConseilDTO( personne ) );
        }

        return list1;
    }
}
