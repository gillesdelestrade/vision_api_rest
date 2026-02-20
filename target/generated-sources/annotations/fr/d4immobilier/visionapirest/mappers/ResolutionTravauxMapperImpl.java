package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.ResolutionTravauxDTO;
import fr.d4immobilier.visionapirest.entities.Demande;
import fr.d4immobilier.visionapirest.entities.HonorairesSurTravaux;
import fr.d4immobilier.visionapirest.entities.RegroupementResolutions;
import fr.d4immobilier.visionapirest.entities.Resolution;
import fr.d4immobilier.visionapirest.entities.ResolutionTravaux;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-20T08:40:21+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class ResolutionTravauxMapperImpl implements ResolutionTravauxMapper {

    @Override
    public List<ResolutionTravauxDTO> toDTOList(List<ResolutionTravaux> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ResolutionTravauxDTO> list = new ArrayList<ResolutionTravauxDTO>( entities.size() );
        for ( ResolutionTravaux resolutionTravaux : entities ) {
            list.add( toDTO( resolutionTravaux ) );
        }

        return list;
    }

    @Override
    public ResolutionTravauxDTO toDTO(ResolutionTravaux entity) {
        if ( entity == null ) {
            return null;
        }

        ResolutionTravauxDTO resolutionTravauxDTO = new ResolutionTravauxDTO();

        resolutionTravauxDTO.setRegroupementResolutionsId( entityRegroupementResolutionsId( entity ) );
        resolutionTravauxDTO.setHonorairesSurTravauxId( entityHonorairesSurTravauxId( entity ) );
        resolutionTravauxDTO.setDemandeId( entityDemandeId( entity ) );
        resolutionTravauxDTO.setResolutionEnveloppeId( entityResolutionEnveloppeId( entity ) );
        resolutionTravauxDTO.setId( entity.getId() );
        resolutionTravauxDTO.setEnveloppeCSSyndic( entity.getEnveloppeCSSyndic() );

        return resolutionTravauxDTO;
    }

    @Override
    public ResolutionTravaux toEntity(ResolutionTravauxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ResolutionTravaux resolutionTravaux = new ResolutionTravaux();

        resolutionTravaux.setId( dto.getId() );
        resolutionTravaux.setEnveloppeCSSyndic( dto.getEnveloppeCSSyndic() );

        return resolutionTravaux;
    }

    private Long entityRegroupementResolutionsId(ResolutionTravaux resolutionTravaux) {
        if ( resolutionTravaux == null ) {
            return null;
        }
        RegroupementResolutions regroupementResolutions = resolutionTravaux.getRegroupementResolutions();
        if ( regroupementResolutions == null ) {
            return null;
        }
        Long id = regroupementResolutions.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityHonorairesSurTravauxId(ResolutionTravaux resolutionTravaux) {
        if ( resolutionTravaux == null ) {
            return null;
        }
        HonorairesSurTravaux honorairesSurTravaux = resolutionTravaux.getHonorairesSurTravaux();
        if ( honorairesSurTravaux == null ) {
            return null;
        }
        Long id = honorairesSurTravaux.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDemandeId(ResolutionTravaux resolutionTravaux) {
        if ( resolutionTravaux == null ) {
            return null;
        }
        Demande demande = resolutionTravaux.getDemande();
        if ( demande == null ) {
            return null;
        }
        Long id = demande.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityResolutionEnveloppeId(ResolutionTravaux resolutionTravaux) {
        if ( resolutionTravaux == null ) {
            return null;
        }
        Resolution resolutionEnveloppe = resolutionTravaux.getResolutionEnveloppe();
        if ( resolutionEnveloppe == null ) {
            return null;
        }
        Long id = resolutionEnveloppe.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
