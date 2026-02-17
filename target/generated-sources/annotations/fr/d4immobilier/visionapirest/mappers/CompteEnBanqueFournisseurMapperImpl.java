package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CompteEnBanqueFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.CompteEnBanqueFournisseur;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
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
public class CompteEnBanqueFournisseurMapperImpl implements CompteEnBanqueFournisseurMapper {

    @Override
    public List<CompteEnBanqueFournisseurDTO> toDTOList(List<CompteEnBanqueFournisseur> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CompteEnBanqueFournisseurDTO> list = new ArrayList<CompteEnBanqueFournisseurDTO>( entities.size() );
        for ( CompteEnBanqueFournisseur compteEnBanqueFournisseur : entities ) {
            list.add( toDTO( compteEnBanqueFournisseur ) );
        }

        return list;
    }

    @Override
    public CompteEnBanqueFournisseurDTO toDTO(CompteEnBanqueFournisseur entity) {
        if ( entity == null ) {
            return null;
        }

        CompteEnBanqueFournisseurDTO compteEnBanqueFournisseurDTO = new CompteEnBanqueFournisseurDTO();

        compteEnBanqueFournisseurDTO.setFournisseurId( entityFournisseurId( entity ) );
        compteEnBanqueFournisseurDTO.setId( entity.getId() );

        return compteEnBanqueFournisseurDTO;
    }

    @Override
    public CompteEnBanqueFournisseur toEntity(CompteEnBanqueFournisseurDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CompteEnBanqueFournisseur compteEnBanqueFournisseur = new CompteEnBanqueFournisseur();

        compteEnBanqueFournisseur.setId( dto.getId() );

        return compteEnBanqueFournisseur;
    }

    private Long entityFournisseurId(CompteEnBanqueFournisseur compteEnBanqueFournisseur) {
        if ( compteEnBanqueFournisseur == null ) {
            return null;
        }
        Fournisseur fournisseur = compteEnBanqueFournisseur.getFournisseur();
        if ( fournisseur == null ) {
            return null;
        }
        Long id = fournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
