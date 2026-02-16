package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierModeleMoyenAccesDTO;
import fr.d4immobilier.visionapirest.entities.FichierModeleMoyenAcces;
import fr.d4immobilier.visionapirest.entities.ModeleMoyenAcces;
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
public class FichierModeleMoyenAccesMapperImpl implements FichierModeleMoyenAccesMapper {

    @Override
    public List<FichierModeleMoyenAccesDTO> toDTOList(List<FichierModeleMoyenAcces> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierModeleMoyenAccesDTO> list = new ArrayList<FichierModeleMoyenAccesDTO>( entities.size() );
        for ( FichierModeleMoyenAcces fichierModeleMoyenAcces : entities ) {
            list.add( toDTO( fichierModeleMoyenAcces ) );
        }

        return list;
    }

    @Override
    public FichierModeleMoyenAccesDTO toDTO(FichierModeleMoyenAcces entity) {
        if ( entity == null ) {
            return null;
        }

        FichierModeleMoyenAccesDTO fichierModeleMoyenAccesDTO = new FichierModeleMoyenAccesDTO();

        fichierModeleMoyenAccesDTO.setModeleMoyenAccesId( entityModeleMoyenAccesId( entity ) );
        fichierModeleMoyenAccesDTO.setId( entity.getId() );

        return fichierModeleMoyenAccesDTO;
    }

    @Override
    public FichierModeleMoyenAcces toEntity(FichierModeleMoyenAccesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierModeleMoyenAcces fichierModeleMoyenAcces = new FichierModeleMoyenAcces();

        fichierModeleMoyenAcces.setId( dto.getId() );

        return fichierModeleMoyenAcces;
    }

    private Long entityModeleMoyenAccesId(FichierModeleMoyenAcces fichierModeleMoyenAcces) {
        if ( fichierModeleMoyenAcces == null ) {
            return null;
        }
        ModeleMoyenAcces modeleMoyenAcces = fichierModeleMoyenAcces.getModeleMoyenAcces();
        if ( modeleMoyenAcces == null ) {
            return null;
        }
        Long id = modeleMoyenAcces.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
