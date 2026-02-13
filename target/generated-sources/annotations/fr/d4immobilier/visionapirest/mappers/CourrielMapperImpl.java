package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CourrielDTO;
import fr.d4immobilier.visionapirest.entities.BoiteMail;
import fr.d4immobilier.visionapirest.entities.Courriel;
import jakarta.enterprise.context.ApplicationScoped;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-13T14:09:30+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class CourrielMapperImpl implements CourrielMapper {

    @Override
    public List<CourrielDTO> toDTOList(List<Courriel> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CourrielDTO> list = new ArrayList<CourrielDTO>( entities.size() );
        for ( Courriel courriel : entities ) {
            list.add( toDTO( courriel ) );
        }

        return list;
    }

    @Override
    public CourrielDTO toDTO(Courriel entity) {
        if ( entity == null ) {
            return null;
        }

        CourrielDTO courrielDTO = new CourrielDTO();

        courrielDTO.setBoiteMailId( entityBoiteMailId( entity ) );
        courrielDTO.setDateReception( dateReceptionToString( entity.getDateReception() ) );
        courrielDTO.setId( entity.getId() );
        courrielDTO.setMessageId( entity.getMessageId() );
        courrielDTO.setEmetteur( entity.getEmetteur() );
        courrielDTO.setSujet( entity.getSujet() );
        courrielDTO.setDejaClasse( entity.getDejaClasse() );
        courrielDTO.setFromD4( entity.getFromD4() );
        courrielDTO.setDestinataireTO( entity.getDestinataireTO() );
        courrielDTO.setDestinataireCC( entity.getDestinataireCC() );
        courrielDTO.setCorps( entity.getCorps() );

        return courrielDTO;
    }

    @Override
    public Courriel toEntity(CourrielDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Courriel courriel = new Courriel();

        courriel.setId( dto.getId() );
        courriel.setMessageId( dto.getMessageId() );
        courriel.setEmetteur( dto.getEmetteur() );
        courriel.setSujet( dto.getSujet() );
        if ( dto.getDateReception() != null ) {
            courriel.setDateReception( Instant.parse( dto.getDateReception() ) );
        }
        courriel.setDejaClasse( dto.getDejaClasse() );
        courriel.setFromD4( dto.getFromD4() );
        courriel.setDestinataireTO( dto.getDestinataireTO() );
        courriel.setDestinataireCC( dto.getDestinataireCC() );
        courriel.setCorps( dto.getCorps() );

        return courriel;
    }

    private Long entityBoiteMailId(Courriel courriel) {
        if ( courriel == null ) {
            return null;
        }
        BoiteMail boiteMail = courriel.getBoiteMail();
        if ( boiteMail == null ) {
            return null;
        }
        Long id = boiteMail.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
