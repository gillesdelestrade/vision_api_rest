package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ModeleMoyenAccesDTO;
import fr.d4immobilier.visionapirest.entities.FichierModeleMoyenAcces;
import fr.d4immobilier.visionapirest.entities.ModeleMoyenAcces;
import fr.d4immobilier.visionapirest.entities.TypeMoyenAcces;
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
public class ModeleMoyenAccesMapperImpl implements ModeleMoyenAccesMapper {

    @Override
    public List<ModeleMoyenAccesDTO> toDTOList(List<ModeleMoyenAcces> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ModeleMoyenAccesDTO> list = new ArrayList<ModeleMoyenAccesDTO>( entities.size() );
        for ( ModeleMoyenAcces modeleMoyenAcces : entities ) {
            list.add( toDTO( modeleMoyenAcces ) );
        }

        return list;
    }

    @Override
    public ModeleMoyenAccesDTO toDTO(ModeleMoyenAcces entity) {
        if ( entity == null ) {
            return null;
        }

        ModeleMoyenAccesDTO modeleMoyenAccesDTO = new ModeleMoyenAccesDTO();

        modeleMoyenAccesDTO.setFichierModeleMoyenAccesId( entityFichierModeleMoyenAccesId( entity ) );
        modeleMoyenAccesDTO.setTypeMoyenAcces( typeMoyenAccesToString( entity.getTypeMoyenAcces() ) );
        modeleMoyenAccesDTO.setId( entity.getId() );
        modeleMoyenAccesDTO.setMarque( entity.getMarque() );
        modeleMoyenAccesDTO.setModele( entity.getModele() );
        modeleMoyenAccesDTO.setDescription( entity.getDescription() );

        return modeleMoyenAccesDTO;
    }

    @Override
    public ModeleMoyenAcces toEntity(ModeleMoyenAccesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ModeleMoyenAcces modeleMoyenAcces = new ModeleMoyenAcces();

        modeleMoyenAcces.setId( dto.getId() );
        modeleMoyenAcces.setMarque( dto.getMarque() );
        modeleMoyenAcces.setModele( dto.getModele() );
        modeleMoyenAcces.setDescription( dto.getDescription() );
        if ( dto.getTypeMoyenAcces() != null ) {
            modeleMoyenAcces.setTypeMoyenAcces( Enum.valueOf( TypeMoyenAcces.class, dto.getTypeMoyenAcces() ) );
        }

        return modeleMoyenAcces;
    }

    private Long entityFichierModeleMoyenAccesId(ModeleMoyenAcces modeleMoyenAcces) {
        if ( modeleMoyenAcces == null ) {
            return null;
        }
        FichierModeleMoyenAcces fichierModeleMoyenAcces = modeleMoyenAcces.getFichierModeleMoyenAcces();
        if ( fichierModeleMoyenAcces == null ) {
            return null;
        }
        Long id = fichierModeleMoyenAcces.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
