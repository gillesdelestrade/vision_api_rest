package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.OptionTravauxDTO;
import fr.d4immobilier.visionapirest.entities.DevisFournisseur;
import fr.d4immobilier.visionapirest.entities.OptionTravaux;
import fr.d4immobilier.visionapirest.entities.Resolution;
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
public class OptionTravauxMapperImpl implements OptionTravauxMapper {

    @Override
    public List<OptionTravauxDTO> toDTOList(List<OptionTravaux> entities) {
        if ( entities == null ) {
            return null;
        }

        List<OptionTravauxDTO> list = new ArrayList<OptionTravauxDTO>( entities.size() );
        for ( OptionTravaux optionTravaux : entities ) {
            list.add( toDTO( optionTravaux ) );
        }

        return list;
    }

    @Override
    public OptionTravauxDTO toDTO(OptionTravaux entity) {
        if ( entity == null ) {
            return null;
        }

        OptionTravauxDTO optionTravauxDTO = new OptionTravauxDTO();

        optionTravauxDTO.setResolutionId( entityResolutionId( entity ) );
        optionTravauxDTO.setDevisFournisseurId( entityDevisFournisseurId( entity ) );
        optionTravauxDTO.setId( entity.getId() );
        optionTravauxDTO.setDescription( entity.getDescription() );
        optionTravauxDTO.setMontant( entity.getMontant() );

        return optionTravauxDTO;
    }

    @Override
    public OptionTravaux toEntity(OptionTravauxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OptionTravaux optionTravaux = new OptionTravaux();

        optionTravaux.setId( dto.getId() );
        optionTravaux.setDescription( dto.getDescription() );
        optionTravaux.setMontant( dto.getMontant() );

        return optionTravaux;
    }

    private Long entityResolutionId(OptionTravaux optionTravaux) {
        if ( optionTravaux == null ) {
            return null;
        }
        Resolution resolution = optionTravaux.getResolution();
        if ( resolution == null ) {
            return null;
        }
        Long id = resolution.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDevisFournisseurId(OptionTravaux optionTravaux) {
        if ( optionTravaux == null ) {
            return null;
        }
        DevisFournisseur devisFournisseur = optionTravaux.getDevisFournisseur();
        if ( devisFournisseur == null ) {
            return null;
        }
        Long id = devisFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
