package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.UtilisateurDTO;
import fr.d4immobilier.visionapirest.entities.Utilisateur;
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
public class UtilisateurMapperImpl implements UtilisateurMapper {

    @Override
    public List<UtilisateurDTO> toDTOList(List<Utilisateur> entities) {
        if ( entities == null ) {
            return null;
        }

        List<UtilisateurDTO> list = new ArrayList<UtilisateurDTO>( entities.size() );
        for ( Utilisateur utilisateur : entities ) {
            list.add( toDTO( utilisateur ) );
        }

        return list;
    }

    @Override
    public UtilisateurDTO toDTO(Utilisateur entity) {
        if ( entity == null ) {
            return null;
        }

        UtilisateurDTO utilisateurDTO = new UtilisateurDTO();

        utilisateurDTO.setId( entity.getId() );

        return utilisateurDTO;
    }

    @Override
    public Utilisateur toEntity(UtilisateurDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Utilisateur utilisateur = new Utilisateur();

        utilisateur.setId( dto.getId() );

        return utilisateur;
    }
}
