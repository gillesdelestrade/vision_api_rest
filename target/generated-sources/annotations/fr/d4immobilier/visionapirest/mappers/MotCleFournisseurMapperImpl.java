package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.MotCleFournisseurDTO;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
import fr.d4immobilier.visionapirest.entities.MotCleFournisseur;
import fr.d4immobilier.visionapirest.entities.MotPertinent;
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
public class MotCleFournisseurMapperImpl implements MotCleFournisseurMapper {

    @Override
    public List<MotCleFournisseurDTO> toDTOList(List<MotCleFournisseur> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MotCleFournisseurDTO> list = new ArrayList<MotCleFournisseurDTO>( entities.size() );
        for ( MotCleFournisseur motCleFournisseur : entities ) {
            list.add( toDTO( motCleFournisseur ) );
        }

        return list;
    }

    @Override
    public MotCleFournisseurDTO toDTO(MotCleFournisseur entity) {
        if ( entity == null ) {
            return null;
        }

        MotCleFournisseurDTO motCleFournisseurDTO = new MotCleFournisseurDTO();

        motCleFournisseurDTO.setMotPertinentId( entityMotPertinentId( entity ) );
        motCleFournisseurDTO.setFournisseurId( entityFournisseurId( entity ) );
        motCleFournisseurDTO.setId( entity.getId() );
        motCleFournisseurDTO.setPoids( entity.getPoids() );

        return motCleFournisseurDTO;
    }

    @Override
    public MotCleFournisseur toEntity(MotCleFournisseurDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MotCleFournisseur motCleFournisseur = new MotCleFournisseur();

        motCleFournisseur.setId( dto.getId() );
        motCleFournisseur.setPoids( dto.getPoids() );

        return motCleFournisseur;
    }

    private Long entityMotPertinentId(MotCleFournisseur motCleFournisseur) {
        if ( motCleFournisseur == null ) {
            return null;
        }
        MotPertinent motPertinent = motCleFournisseur.getMotPertinent();
        if ( motPertinent == null ) {
            return null;
        }
        Long id = motPertinent.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityFournisseurId(MotCleFournisseur motCleFournisseur) {
        if ( motCleFournisseur == null ) {
            return null;
        }
        Fournisseur fournisseur = motCleFournisseur.getFournisseur();
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
