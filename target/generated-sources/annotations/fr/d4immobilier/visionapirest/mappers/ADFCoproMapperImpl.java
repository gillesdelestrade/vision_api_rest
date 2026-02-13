package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ADFCoproDTO;
import fr.d4immobilier.visionapirest.entities.ADFCopro;
import fr.d4immobilier.visionapirest.entities.CampagneADF;
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
public class ADFCoproMapperImpl implements ADFCoproMapper {

    @Override
    public List<ADFCoproDTO> toDTOList(List<ADFCopro> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ADFCoproDTO> list = new ArrayList<ADFCoproDTO>( entities.size() );
        for ( ADFCopro aDFCopro : entities ) {
            list.add( toDTO( aDFCopro ) );
        }

        return list;
    }

    @Override
    public ADFCoproDTO toDTO(ADFCopro entity) {
        if ( entity == null ) {
            return null;
        }

        ADFCoproDTO aDFCoproDTO = new ADFCoproDTO();

        aDFCoproDTO.setCampagneADFId( entityCampagneADFId( entity ) );
        aDFCoproDTO.setSessionTraitementADFId( entitySessionTraitementADFId( entity ) );
        aDFCoproDTO.setId( entity.getId() );
        aDFCoproDTO.setDateDepotFichierADF( entity.getDateDepotFichierADF() );
        aDFCoproDTO.setDateDepotFichierAnnexe( entity.getDateDepotFichierAnnexe() );
        aDFCoproDTO.setDateFichierADFTraite( entity.getDateFichierADFTraite() );

        return aDFCoproDTO;
    }

    @Override
    public ADFCopro toEntity(ADFCoproDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ADFCopro aDFCopro = new ADFCopro();

        aDFCopro.setId( dto.getId() );
        aDFCopro.setDateDepotFichierADF( dto.getDateDepotFichierADF() );
        aDFCopro.setDateDepotFichierAnnexe( dto.getDateDepotFichierAnnexe() );
        aDFCopro.setDateFichierADFTraite( dto.getDateFichierADFTraite() );

        return aDFCopro;
    }

    private Long entityCampagneADFId(ADFCopro aDFCopro) {
        if ( aDFCopro == null ) {
            return null;
        }
        CampagneADF campagneADF = aDFCopro.getCampagneADF();
        if ( campagneADF == null ) {
            return null;
        }
        Long id = campagneADF.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entitySessionTraitementADFId(ADFCopro aDFCopro) {
        if ( aDFCopro == null ) {
            return null;
        }
        SessionTraitementADF sessionTraitementADF = aDFCopro.getSessionTraitementADF();
        if ( sessionTraitementADF == null ) {
            return null;
        }
        Long id = sessionTraitementADF.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
