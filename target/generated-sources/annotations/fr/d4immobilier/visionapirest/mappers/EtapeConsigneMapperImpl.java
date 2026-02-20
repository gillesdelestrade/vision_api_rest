package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EtapeConsigneDTO;
import fr.d4immobilier.visionapirest.entities.Consigne;
import fr.d4immobilier.visionapirest.entities.EtapeConsigne;
import fr.d4immobilier.visionapirest.entities.Fichier;
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
public class EtapeConsigneMapperImpl implements EtapeConsigneMapper {

    @Override
    public List<EtapeConsigneDTO> toDTOList(List<EtapeConsigne> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EtapeConsigneDTO> list = new ArrayList<EtapeConsigneDTO>( entities.size() );
        for ( EtapeConsigne etapeConsigne : entities ) {
            list.add( toDTO( etapeConsigne ) );
        }

        return list;
    }

    @Override
    public EtapeConsigneDTO toDTO(EtapeConsigne entity) {
        if ( entity == null ) {
            return null;
        }

        EtapeConsigneDTO etapeConsigneDTO = new EtapeConsigneDTO();

        etapeConsigneDTO.setConsigneId( entityConsigneId( entity ) );
        etapeConsigneDTO.setFichierEtapeId( entityFichierEtapeId( entity ) );
        etapeConsigneDTO.setId( entity.getId() );
        etapeConsigneDTO.setNumeroOrdre( entity.getNumeroOrdre() );
        etapeConsigneDTO.setTexteEtape( entity.getTexteEtape() );

        return etapeConsigneDTO;
    }

    @Override
    public EtapeConsigne toEntity(EtapeConsigneDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EtapeConsigne etapeConsigne = new EtapeConsigne();

        etapeConsigne.setId( dto.getId() );
        etapeConsigne.setNumeroOrdre( dto.getNumeroOrdre() );
        etapeConsigne.setTexteEtape( dto.getTexteEtape() );

        return etapeConsigne;
    }

    private Long entityConsigneId(EtapeConsigne etapeConsigne) {
        if ( etapeConsigne == null ) {
            return null;
        }
        Consigne consigne = etapeConsigne.getConsigne();
        if ( consigne == null ) {
            return null;
        }
        Long id = consigne.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierEtapeId(EtapeConsigne etapeConsigne) {
        if ( etapeConsigne == null ) {
            return null;
        }
        Fichier fichierEtape = etapeConsigne.getFichierEtape();
        if ( fichierEtape == null ) {
            return null;
        }
        Long id = fichierEtape.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
