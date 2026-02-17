package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CourrierDTO;
import fr.d4immobilier.visionapirest.entities.Bordereau;
import fr.d4immobilier.visionapirest.entities.Courrier;
import fr.d4immobilier.visionapirest.entities.Fichier;
import fr.d4immobilier.visionapirest.entities.ModeleCourrier;
import fr.d4immobilier.visionapirest.entities.PreuveDeDepotALaPoste;
import fr.d4immobilier.visionapirest.entities.Publipostage;
import fr.d4immobilier.visionapirest.entities.RappelCourrier;
import fr.d4immobilier.visionapirest.entities.RegroupementLignesFacturation;
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
public class CourrierMapperImpl implements CourrierMapper {

    @Override
    public List<CourrierDTO> toDTOList(List<Courrier> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CourrierDTO> list = new ArrayList<CourrierDTO>( entities.size() );
        for ( Courrier courrier : entities ) {
            list.add( toDTO( courrier ) );
        }

        return list;
    }

    @Override
    public CourrierDTO toDTO(Courrier entity) {
        if ( entity == null ) {
            return null;
        }

        CourrierDTO courrierDTO = new CourrierDTO();

        courrierDTO.setRappelCourrierId( entityRappelCourrierId( entity ) );
        courrierDTO.setPublipostageId( entityPublipostageId( entity ) );
        courrierDTO.setModeleCourrierId( entityModeleCourrierId( entity ) );
        courrierDTO.setPreuveDeDepotALaPosteId( entityPreuveDeDepotALaPosteId( entity ) );
        courrierDTO.setRegroupementLignesFacturationId( entityRegroupementLignesFacturationId( entity ) );
        courrierDTO.setBordereauId( entityBordereauId( entity ) );
        courrierDTO.setFichierId( entityFichierId( entity ) );
        courrierDTO.setId( entity.getId() );
        courrierDTO.setFormuleDePolitesse( entity.getFormuleDePolitesse() );
        courrierDTO.setAdresseSaisie( entity.getAdresseSaisie() );
        courrierDTO.setReference( entity.getReference() );
        courrierDTO.setRecommandeAR( entity.getRecommandeAR() );
        courrierDTO.setTexteRecommandeAR( entity.getTexteRecommandeAR() );
        courrierDTO.setVosReferences( entity.getVosReferences() );
        courrierDTO.setAutre( entity.getAutre() );
        courrierDTO.setNombreDePiecesJointes( entity.getNombreDePiecesJointes() );

        return courrierDTO;
    }

    @Override
    public Courrier toEntity(CourrierDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Courrier courrier = new Courrier();

        courrier.setId( dto.getId() );
        courrier.setFormuleDePolitesse( dto.getFormuleDePolitesse() );
        courrier.setAdresseSaisie( dto.getAdresseSaisie() );
        courrier.setReference( dto.getReference() );
        courrier.setRecommandeAR( dto.getRecommandeAR() );
        courrier.setVosReferences( dto.getVosReferences() );
        courrier.setAutre( dto.getAutre() );
        courrier.setNombreDePiecesJointes( dto.getNombreDePiecesJointes() );
        courrier.setTexteRecommandeAR( dto.getTexteRecommandeAR() );

        return courrier;
    }

    private Long entityRappelCourrierId(Courrier courrier) {
        if ( courrier == null ) {
            return null;
        }
        RappelCourrier rappelCourrier = courrier.getRappelCourrier();
        if ( rappelCourrier == null ) {
            return null;
        }
        Long id = rappelCourrier.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityPublipostageId(Courrier courrier) {
        if ( courrier == null ) {
            return null;
        }
        Publipostage publipostage = courrier.getPublipostage();
        if ( publipostage == null ) {
            return null;
        }
        Long id = publipostage.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityModeleCourrierId(Courrier courrier) {
        if ( courrier == null ) {
            return null;
        }
        ModeleCourrier modeleCourrier = courrier.getModeleCourrier();
        if ( modeleCourrier == null ) {
            return null;
        }
        Long id = modeleCourrier.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityPreuveDeDepotALaPosteId(Courrier courrier) {
        if ( courrier == null ) {
            return null;
        }
        PreuveDeDepotALaPoste preuveDeDepotALaPoste = courrier.getPreuveDeDepotALaPoste();
        if ( preuveDeDepotALaPoste == null ) {
            return null;
        }
        Long id = preuveDeDepotALaPoste.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityRegroupementLignesFacturationId(Courrier courrier) {
        if ( courrier == null ) {
            return null;
        }
        RegroupementLignesFacturation regroupementLignesFacturation = courrier.getRegroupementLignesFacturation();
        if ( regroupementLignesFacturation == null ) {
            return null;
        }
        Long id = regroupementLignesFacturation.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityBordereauId(Courrier courrier) {
        if ( courrier == null ) {
            return null;
        }
        Bordereau bordereau = courrier.getBordereau();
        if ( bordereau == null ) {
            return null;
        }
        Long id = bordereau.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFichierId(Courrier courrier) {
        if ( courrier == null ) {
            return null;
        }
        Fichier fichier = courrier.getFichier();
        if ( fichier == null ) {
            return null;
        }
        Long id = fichier.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
