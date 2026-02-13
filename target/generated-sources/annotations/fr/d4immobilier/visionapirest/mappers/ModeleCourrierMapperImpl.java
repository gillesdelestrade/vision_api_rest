package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ModeleCourrierDTO;
import fr.d4immobilier.visionapirest.entities.ModeleCourrier;
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
public class ModeleCourrierMapperImpl implements ModeleCourrierMapper {

    @Override
    public List<ModeleCourrierDTO> toDTOList(List<ModeleCourrier> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ModeleCourrierDTO> list = new ArrayList<ModeleCourrierDTO>( entities.size() );
        for ( ModeleCourrier modeleCourrier : entities ) {
            list.add( toDTO( modeleCourrier ) );
        }

        return list;
    }

    @Override
    public ModeleCourrierDTO toDTO(ModeleCourrier entity) {
        if ( entity == null ) {
            return null;
        }

        ModeleCourrierDTO modeleCourrierDTO = new ModeleCourrierDTO();

        modeleCourrierDTO.setId( entity.getId() );
        modeleCourrierDTO.setObjet( entity.getObjet() );
        modeleCourrierDTO.setCorpsDeTexte( entity.getCorpsDeTexte() );
        modeleCourrierDTO.setFormuleDePolitesse( entity.getFormuleDePolitesse() );

        return modeleCourrierDTO;
    }

    @Override
    public ModeleCourrier toEntity(ModeleCourrierDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ModeleCourrier modeleCourrier = new ModeleCourrier();

        modeleCourrier.setId( dto.getId() );
        modeleCourrier.setObjet( dto.getObjet() );
        modeleCourrier.setCorpsDeTexte( dto.getCorpsDeTexte() );
        modeleCourrier.setFormuleDePolitesse( dto.getFormuleDePolitesse() );

        return modeleCourrier;
    }
}
