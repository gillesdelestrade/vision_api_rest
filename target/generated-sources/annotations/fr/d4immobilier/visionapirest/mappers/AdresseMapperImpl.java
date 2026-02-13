package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.AdresseDTO;
import fr.d4immobilier.visionapirest.entities.Adresse;
import fr.d4immobilier.visionapirest.entities.TypeDeVoie;
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
public class AdresseMapperImpl implements AdresseMapper {

    @Override
    public List<AdresseDTO> toDTOList(List<Adresse> entities) {
        if ( entities == null ) {
            return null;
        }

        List<AdresseDTO> list = new ArrayList<AdresseDTO>( entities.size() );
        for ( Adresse adresse : entities ) {
            list.add( toDTO( adresse ) );
        }

        return list;
    }

    @Override
    public AdresseDTO toDTO(Adresse entity) {
        if ( entity == null ) {
            return null;
        }

        AdresseDTO adresseDTO = new AdresseDTO();

        adresseDTO.setTypeDeVoie( typeDeVoieToString( entity.getTypeDeVoie() ) );
        adresseDTO.setId( entity.getId() );
        adresseDTO.setNumeroDansLaVoie( entity.getNumeroDansLaVoie() );
        adresseDTO.setVoie( entity.getVoie() );
        adresseDTO.setComplementAdresse( entity.getComplementAdresse() );
        adresseDTO.setBatiment( entity.getBatiment() );
        adresseDTO.setEtage( entity.getEtage() );
        adresseDTO.setCodePostal( entity.getCodePostal() );
        adresseDTO.setVille( entity.getVille() );
        adresseDTO.setLatitude( entity.getLatitude() );
        adresseDTO.setLongitude( entity.getLongitude() );

        return adresseDTO;
    }

    @Override
    public Adresse toEntity(AdresseDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Adresse adresse = new Adresse();

        adresse.setId( dto.getId() );
        adresse.setVoie( dto.getVoie() );
        adresse.setComplementAdresse( dto.getComplementAdresse() );
        adresse.setCodePostal( dto.getCodePostal() );
        adresse.setVille( dto.getVille() );
        adresse.setNumeroDansLaVoie( dto.getNumeroDansLaVoie() );
        if ( dto.getTypeDeVoie() != null ) {
            adresse.setTypeDeVoie( Enum.valueOf( TypeDeVoie.class, dto.getTypeDeVoie() ) );
        }
        adresse.setBatiment( dto.getBatiment() );
        adresse.setEtage( dto.getEtage() );
        adresse.setLatitude( dto.getLatitude() );
        adresse.setLongitude( dto.getLongitude() );

        return adresse;
    }
}
