package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.DestinataireCourrierDTO;
import fr.d4immobilier.visionapirest.entities.Bordereau_Coproprietaire;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.entities.DestinataireCourrier;
import fr.d4immobilier.visionapirest.entities.Publipostage;
import fr.d4immobilier.visionapirest.entities.RetourRecommandeAR;
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
public class DestinataireCourrierMapperImpl implements DestinataireCourrierMapper {

    @Override
    public List<DestinataireCourrierDTO> toDTOList(List<DestinataireCourrier> entities) {
        if ( entities == null ) {
            return null;
        }

        List<DestinataireCourrierDTO> list = new ArrayList<DestinataireCourrierDTO>( entities.size() );
        for ( DestinataireCourrier destinataireCourrier : entities ) {
            list.add( toDTO( destinataireCourrier ) );
        }

        return list;
    }

    @Override
    public DestinataireCourrierDTO toDTO(DestinataireCourrier entity) {
        if ( entity == null ) {
            return null;
        }

        DestinataireCourrierDTO destinataireCourrierDTO = new DestinataireCourrierDTO();

        destinataireCourrierDTO.setPublipostageId( entityPublipostageId( entity ) );
        destinataireCourrierDTO.setBordereau_CoproprietaireId( entityBordereau_CoproprietaireId( entity ) );
        destinataireCourrierDTO.setCoproprietaireId( entityCoproprietaireId( entity ) );
        destinataireCourrierDTO.setRetourRecommandeAR( retourRecommandeARToString( entity.getRetourRecommandeAR() ) );
        destinataireCourrierDTO.setId( entity.getId() );
        destinataireCourrierDTO.setAdresseDestinataire( entity.getAdresseDestinataire() );
        destinataireCourrierDTO.setNumeroRAR( entity.getNumeroRAR() );
        destinataireCourrierDTO.setDateReceptionAR( entity.getDateReceptionAR() );

        return destinataireCourrierDTO;
    }

    @Override
    public DestinataireCourrier toEntity(DestinataireCourrierDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DestinataireCourrier destinataireCourrier = new DestinataireCourrier();

        destinataireCourrier.setId( dto.getId() );
        destinataireCourrier.setAdresseDestinataire( dto.getAdresseDestinataire() );
        destinataireCourrier.setNumeroRAR( dto.getNumeroRAR() );
        destinataireCourrier.setDateReceptionAR( dto.getDateReceptionAR() );
        if ( dto.getRetourRecommandeAR() != null ) {
            destinataireCourrier.setRetourRecommandeAR( Enum.valueOf( RetourRecommandeAR.class, dto.getRetourRecommandeAR() ) );
        }

        return destinataireCourrier;
    }

    private Long entityPublipostageId(DestinataireCourrier destinataireCourrier) {
        if ( destinataireCourrier == null ) {
            return null;
        }
        Publipostage publipostage = destinataireCourrier.getPublipostage();
        if ( publipostage == null ) {
            return null;
        }
        Long id = publipostage.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityBordereau_CoproprietaireId(DestinataireCourrier destinataireCourrier) {
        if ( destinataireCourrier == null ) {
            return null;
        }
        Bordereau_Coproprietaire bordereau_Coproprietaire = destinataireCourrier.getBordereau_Coproprietaire();
        if ( bordereau_Coproprietaire == null ) {
            return null;
        }
        Long id = bordereau_Coproprietaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityCoproprietaireId(DestinataireCourrier destinataireCourrier) {
        if ( destinataireCourrier == null ) {
            return null;
        }
        Coproprietaire coproprietaire = destinataireCourrier.getCoproprietaire();
        if ( coproprietaire == null ) {
            return null;
        }
        Long id = coproprietaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
