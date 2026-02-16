package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.SinistreDTO;
import fr.d4immobilier.visionapirest.entities.Assurance;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.entities.CourrierDeclarationSinistre;
import fr.d4immobilier.visionapirest.entities.MotifClotureSinistre;
import fr.d4immobilier.visionapirest.entities.NatureSinistre;
import fr.d4immobilier.visionapirest.entities.Sinistre;
import fr.d4immobilier.visionapirest.entities.TypeLeseSinistre;
import fr.d4immobilier.visionapirest.entities.TypeOrigineSinistre;
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
public class SinistreMapperImpl implements SinistreMapper {

    @Override
    public List<SinistreDTO> toDTOList(List<Sinistre> entities) {
        if ( entities == null ) {
            return null;
        }

        List<SinistreDTO> list = new ArrayList<SinistreDTO>( entities.size() );
        for ( Sinistre sinistre : entities ) {
            list.add( toDTO( sinistre ) );
        }

        return list;
    }

    @Override
    public SinistreDTO toDTO(Sinistre entity) {
        if ( entity == null ) {
            return null;
        }

        SinistreDTO sinistreDTO = new SinistreDTO();

        sinistreDTO.setCourrierDeclarationSinistreId( entityCourrierDeclarationSinistreId( entity ) );
        sinistreDTO.setAssuranceId( entityAssuranceId( entity ) );
        sinistreDTO.setCoproprietaireLeseId( entityCoproprietaireLeseId( entity ) );
        sinistreDTO.setCoproprietaireOrigineId( entityCoproprietaireOrigineId( entity ) );
        sinistreDTO.setNatureSinistre( natureSinistreToString( entity.getNatureSinistre() ) );
        sinistreDTO.setTypeLeseSinistre( typeLeseSinistreToString( entity.getTypeLeseSinistre() ) );
        sinistreDTO.setTypeOrigineSinistre( typeOrigineSinistreToString( entity.getTypeOrigineSinistre() ) );
        sinistreDTO.setMotifClotureSinistre( motifClotureSinistreToString( entity.getMotifClotureSinistre() ) );
        sinistreDTO.setId( entity.getId() );
        sinistreDTO.setLieu( entity.getLieu() );
        sinistreDTO.setDetailLeseSinistre( entity.getDetailLeseSinistre() );
        sinistreDTO.setDetailOrigineSinistre( entity.getDetailOrigineSinistre() );
        sinistreDTO.setReferenceChezAssureur( entity.getReferenceChezAssureur() );
        sinistreDTO.setReferenceExpert( entity.getReferenceExpert() );
        sinistreDTO.setPostIt( entity.getPostIt() );
        sinistreDTO.setStatutSinistre( entity.getStatutSinistre() );

        return sinistreDTO;
    }

    @Override
    public Sinistre toEntity(SinistreDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Sinistre sinistre = new Sinistre();

        sinistre.setId( dto.getId() );
        if ( dto.getNatureSinistre() != null ) {
            sinistre.setNatureSinistre( Enum.valueOf( NatureSinistre.class, dto.getNatureSinistre() ) );
        }
        sinistre.setLieu( dto.getLieu() );
        if ( dto.getTypeLeseSinistre() != null ) {
            sinistre.setTypeLeseSinistre( Enum.valueOf( TypeLeseSinistre.class, dto.getTypeLeseSinistre() ) );
        }
        if ( dto.getTypeOrigineSinistre() != null ) {
            sinistre.setTypeOrigineSinistre( Enum.valueOf( TypeOrigineSinistre.class, dto.getTypeOrigineSinistre() ) );
        }
        sinistre.setDetailLeseSinistre( dto.getDetailLeseSinistre() );
        sinistre.setDetailOrigineSinistre( dto.getDetailOrigineSinistre() );
        sinistre.setReferenceChezAssureur( dto.getReferenceChezAssureur() );
        sinistre.setReferenceExpert( dto.getReferenceExpert() );
        sinistre.setPostIt( dto.getPostIt() );
        if ( dto.getMotifClotureSinistre() != null ) {
            sinistre.setMotifClotureSinistre( Enum.valueOf( MotifClotureSinistre.class, dto.getMotifClotureSinistre() ) );
        }
        sinistre.setStatutSinistre( dto.getStatutSinistre() );

        return sinistre;
    }

    private Long entityCourrierDeclarationSinistreId(Sinistre sinistre) {
        if ( sinistre == null ) {
            return null;
        }
        CourrierDeclarationSinistre courrierDeclarationSinistre = sinistre.getCourrierDeclarationSinistre();
        if ( courrierDeclarationSinistre == null ) {
            return null;
        }
        Long id = courrierDeclarationSinistre.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityAssuranceId(Sinistre sinistre) {
        if ( sinistre == null ) {
            return null;
        }
        Assurance assurance = sinistre.getAssurance();
        if ( assurance == null ) {
            return null;
        }
        Long id = assurance.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityCoproprietaireLeseId(Sinistre sinistre) {
        if ( sinistre == null ) {
            return null;
        }
        Coproprietaire coproprietaireLese = sinistre.getCoproprietaireLese();
        if ( coproprietaireLese == null ) {
            return null;
        }
        Long id = coproprietaireLese.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityCoproprietaireOrigineId(Sinistre sinistre) {
        if ( sinistre == null ) {
            return null;
        }
        Coproprietaire coproprietaireOrigine = sinistre.getCoproprietaireOrigine();
        if ( coproprietaireOrigine == null ) {
            return null;
        }
        Long id = coproprietaireOrigine.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
