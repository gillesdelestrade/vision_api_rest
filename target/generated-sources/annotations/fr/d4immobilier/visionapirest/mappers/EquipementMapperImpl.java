package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.EquipementDTO;
import fr.d4immobilier.visionapirest.entities.Batiment;
import fr.d4immobilier.visionapirest.entities.Equipement;
import fr.d4immobilier.visionapirest.entities.Fournisseur;
import fr.d4immobilier.visionapirest.entities.TypeEquipement;
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
public class EquipementMapperImpl implements EquipementMapper {

    @Override
    public List<EquipementDTO> toDTOList(List<Equipement> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EquipementDTO> list = new ArrayList<EquipementDTO>( entities.size() );
        for ( Equipement equipement : entities ) {
            list.add( toDTO( equipement ) );
        }

        return list;
    }

    @Override
    public EquipementDTO toDTO(Equipement entity) {
        if ( entity == null ) {
            return null;
        }

        Long batimentId = null;
        Long typeEquipementId = null;
        String typeEquipement = null;
        Long fournisseurId = null;
        String fournisseur = null;
        Long id = null;
        String libelle = null;

        batimentId = entityBatimentId( entity );
        typeEquipementId = entityTypeEquipementId( entity );
        typeEquipement = entityTypeEquipementTypeEquipement( entity );
        fournisseurId = entityFournisseurId( entity );
        fournisseur = entityFournisseurRaisonSociale( entity );
        id = entity.getId();
        libelle = entity.getLibelle();

        EquipementDTO equipementDTO = new EquipementDTO( id, libelle, batimentId, typeEquipementId, fournisseurId, typeEquipement, fournisseur );

        return equipementDTO;
    }

    @Override
    public Equipement toEntity(EquipementDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Equipement equipement = new Equipement();

        equipement.setId( dto.id() );
        equipement.setLibelle( dto.libelle() );

        return equipement;
    }

    private Long entityBatimentId(Equipement equipement) {
        if ( equipement == null ) {
            return null;
        }
        Batiment batiment = equipement.getBatiment();
        if ( batiment == null ) {
            return null;
        }
        Long id = batiment.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityTypeEquipementId(Equipement equipement) {
        if ( equipement == null ) {
            return null;
        }
        TypeEquipement typeEquipement = equipement.getTypeEquipement();
        if ( typeEquipement == null ) {
            return null;
        }
        Long id = typeEquipement.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String entityTypeEquipementTypeEquipement(Equipement equipement) {
        if ( equipement == null ) {
            return null;
        }
        TypeEquipement typeEquipement = equipement.getTypeEquipement();
        if ( typeEquipement == null ) {
            return null;
        }
        String typeEquipement1 = typeEquipement.getTypeEquipement();
        if ( typeEquipement1 == null ) {
            return null;
        }
        return typeEquipement1;
    }

    private Long entityFournisseurId(Equipement equipement) {
        if ( equipement == null ) {
            return null;
        }
        Fournisseur fournisseur = equipement.getFournisseur();
        if ( fournisseur == null ) {
            return null;
        }
        Long id = fournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String entityFournisseurRaisonSociale(Equipement equipement) {
        if ( equipement == null ) {
            return null;
        }
        Fournisseur fournisseur = equipement.getFournisseur();
        if ( fournisseur == null ) {
            return null;
        }
        String raisonSociale = fournisseur.getRaisonSociale();
        if ( raisonSociale == null ) {
            return null;
        }
        return raisonSociale;
    }
}
