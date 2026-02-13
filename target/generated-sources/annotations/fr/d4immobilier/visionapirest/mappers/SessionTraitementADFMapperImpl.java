package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.SessionTraitementADFDTO;
import fr.d4immobilier.visionapirest.entities.Fichier;
import fr.d4immobilier.visionapirest.entities.SessionTraitementADF;
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
public class SessionTraitementADFMapperImpl implements SessionTraitementADFMapper {

    @Override
    public List<SessionTraitementADFDTO> toDTOList(List<SessionTraitementADF> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SessionTraitementADFDTO> list = new ArrayList<SessionTraitementADFDTO>( entities.size() );
        for ( SessionTraitementADF sessionTraitementADF : entities ) {
            list.add( toDTO( sessionTraitementADF ) );
        }

        return list;
    }

    @Override
    public SessionTraitementADFDTO toDTO(SessionTraitementADF entity) {
        if ( entity == null ) {
            return null;
        }

        SessionTraitementADFDTO sessionTraitementADFDTO = new SessionTraitementADFDTO();

        sessionTraitementADFDTO.setFichierZipId( entityFichierZipId( entity ) );
        sessionTraitementADFDTO.setId( entity.getId() );
        sessionTraitementADFDTO.setDateCreation( entity.getDateCreation() );
        sessionTraitementADFDTO.setDateTraitement( entity.getDateTraitement() );
        sessionTraitementADFDTO.setLibelle( entity.getLibelle() );

        return sessionTraitementADFDTO;
    }

    @Override
    public SessionTraitementADF toEntity(SessionTraitementADFDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SessionTraitementADF sessionTraitementADF = new SessionTraitementADF();

        sessionTraitementADF.setId( dto.getId() );
        sessionTraitementADF.setDateCreation( dto.getDateCreation() );
        sessionTraitementADF.setDateTraitement( dto.getDateTraitement() );
        sessionTraitementADF.setLibelle( dto.getLibelle() );

        return sessionTraitementADF;
    }

    private Long entityFichierZipId(SessionTraitementADF sessionTraitementADF) {
        if ( sessionTraitementADF == null ) {
            return null;
        }
        Fichier fichierZip = sessionTraitementADF.getFichierZip();
        if ( fichierZip == null ) {
            return null;
        }
        Long id = fichierZip.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
