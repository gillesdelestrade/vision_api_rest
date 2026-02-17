package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CampagneADFDTO;
import fr.d4immobilier.visionapirest.entities.CampagneADF;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-17T10:51:57+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class CampagneADFMapperImpl implements CampagneADFMapper {

    @Override
    public List<CampagneADFDTO> toDTOList(List<CampagneADF> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CampagneADFDTO> list = new ArrayList<CampagneADFDTO>( entities.size() );
        for ( CampagneADF campagneADF : entities ) {
            list.add( toDTO( campagneADF ) );
        }

        return list;
    }

    @Override
    public CampagneADFDTO toDTO(CampagneADF entity) {
        if ( entity == null ) {
            return null;
        }

        CampagneADFDTO campagneADFDTO = new CampagneADFDTO();

        campagneADFDTO.setId( entity.getId() );
        campagneADFDTO.setLibelle( entity.getLibelle() );
        campagneADFDTO.setDateCreation( entity.getDateCreation() );
        campagneADFDTO.setTrimestriel( entity.getTrimestriel() );
        campagneADFDTO.setDateCloture( entity.getDateCloture() );

        return campagneADFDTO;
    }

    @Override
    public CampagneADF toEntity(CampagneADFDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CampagneADF campagneADF = new CampagneADF();

        campagneADF.setId( dto.getId() );
        campagneADF.setLibelle( dto.getLibelle() );
        campagneADF.setDateCreation( dto.getDateCreation() );
        campagneADF.setTrimestriel( dto.getTrimestriel() );
        campagneADF.setDateCloture( dto.getDateCloture() );

        return campagneADF;
    }
}
