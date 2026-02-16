package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.LigneFacturationDTO;
import fr.d4immobilier.visionapirest.entities.LigneFacturation;
import fr.d4immobilier.visionapirest.entities.ProduitCatalogue;
import fr.d4immobilier.visionapirest.entities.RegroupementLignesFacturation;
import fr.d4immobilier.visionapirest.entities.Tarif;
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
public class LigneFacturationMapperImpl implements LigneFacturationMapper {

    @Override
    public List<LigneFacturationDTO> toDTOList(List<LigneFacturation> entities) {
        if ( entities == null ) {
            return null;
        }

        List<LigneFacturationDTO> list = new ArrayList<LigneFacturationDTO>( entities.size() );
        for ( LigneFacturation ligneFacturation : entities ) {
            list.add( toDTO( ligneFacturation ) );
        }

        return list;
    }

    @Override
    public LigneFacturationDTO toDTO(LigneFacturation entity) {
        if ( entity == null ) {
            return null;
        }

        LigneFacturationDTO ligneFacturationDTO = new LigneFacturationDTO();

        ligneFacturationDTO.setProduitCatalogueId( entityProduitCatalogueId( entity ) );
        ligneFacturationDTO.setTarifId( entityTarifId( entity ) );
        ligneFacturationDTO.setRegroupementLignesFacturationId( entityRegroupementLignesFacturationId( entity ) );
        ligneFacturationDTO.setId( entity.getId() );
        ligneFacturationDTO.setQuantite( entity.getQuantite() );
        ligneFacturationDTO.setQuantiteAffichee( entity.getQuantiteAffichee() );
        ligneFacturationDTO.setRemise( entity.getRemise() );
        ligneFacturationDTO.setPrix( entity.getPrix() );

        return ligneFacturationDTO;
    }

    @Override
    public LigneFacturation toEntity(LigneFacturationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        LigneFacturation ligneFacturation = new LigneFacturation();

        ligneFacturation.setId( dto.getId() );
        ligneFacturation.setQuantite( dto.getQuantite() );
        ligneFacturation.setRemise( dto.getRemise() );
        ligneFacturation.setPrix( dto.getPrix() );
        ligneFacturation.setQuantiteAffichee( dto.getQuantiteAffichee() );

        return ligneFacturation;
    }

    private Long entityProduitCatalogueId(LigneFacturation ligneFacturation) {
        if ( ligneFacturation == null ) {
            return null;
        }
        ProduitCatalogue produitCatalogue = ligneFacturation.getProduitCatalogue();
        if ( produitCatalogue == null ) {
            return null;
        }
        Long id = produitCatalogue.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityTarifId(LigneFacturation ligneFacturation) {
        if ( ligneFacturation == null ) {
            return null;
        }
        Tarif tarif = ligneFacturation.getTarif();
        if ( tarif == null ) {
            return null;
        }
        Long id = tarif.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityRegroupementLignesFacturationId(LigneFacturation ligneFacturation) {
        if ( ligneFacturation == null ) {
            return null;
        }
        RegroupementLignesFacturation regroupementLignesFacturation = ligneFacturation.getRegroupementLignesFacturation();
        if ( regroupementLignesFacturation == null ) {
            return null;
        }
        Long id = regroupementLignesFacturation.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
