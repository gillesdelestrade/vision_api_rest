package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierDemandeDevisDTO;
import fr.d4immobilier.visionapirest.entities.DemandeDevis;
import fr.d4immobilier.visionapirest.entities.FichierDemandeDevis;
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
public class FichierDemandeDevisMapperImpl implements FichierDemandeDevisMapper {

    @Override
    public List<FichierDemandeDevisDTO> toDTOList(List<FichierDemandeDevis> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierDemandeDevisDTO> list = new ArrayList<FichierDemandeDevisDTO>( entities.size() );
        for ( FichierDemandeDevis fichierDemandeDevis : entities ) {
            list.add( toDTO( fichierDemandeDevis ) );
        }

        return list;
    }

    @Override
    public FichierDemandeDevisDTO toDTO(FichierDemandeDevis entity) {
        if ( entity == null ) {
            return null;
        }

        FichierDemandeDevisDTO fichierDemandeDevisDTO = new FichierDemandeDevisDTO();

        fichierDemandeDevisDTO.setDemandeDevisId( entityDemandeDevisId( entity ) );
        fichierDemandeDevisDTO.setId( entity.getId() );

        return fichierDemandeDevisDTO;
    }

    @Override
    public FichierDemandeDevis toEntity(FichierDemandeDevisDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierDemandeDevis fichierDemandeDevis = new FichierDemandeDevis();

        fichierDemandeDevis.setId( dto.getId() );

        return fichierDemandeDevis;
    }

    private Long entityDemandeDevisId(FichierDemandeDevis fichierDemandeDevis) {
        if ( fichierDemandeDevis == null ) {
            return null;
        }
        DemandeDevis demandeDevis = fichierDemandeDevis.getDemandeDevis();
        if ( demandeDevis == null ) {
            return null;
        }
        Long id = demandeDevis.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
