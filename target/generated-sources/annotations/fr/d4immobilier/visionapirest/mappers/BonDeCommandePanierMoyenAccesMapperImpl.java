package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BonDeCommandePanierMoyenAccesDTO;
import fr.d4immobilier.visionapirest.entities.BonDeCommandePanierMoyenAcces;
import fr.d4immobilier.visionapirest.entities.PanierCommandeMoyenAcces;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-13T14:09:30+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class BonDeCommandePanierMoyenAccesMapperImpl implements BonDeCommandePanierMoyenAccesMapper {

    @Override
    public List<BonDeCommandePanierMoyenAccesDTO> toDTOList(List<BonDeCommandePanierMoyenAcces> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BonDeCommandePanierMoyenAccesDTO> list = new ArrayList<BonDeCommandePanierMoyenAccesDTO>( entities.size() );
        for ( BonDeCommandePanierMoyenAcces bonDeCommandePanierMoyenAcces : entities ) {
            list.add( toDTO( bonDeCommandePanierMoyenAcces ) );
        }

        return list;
    }

    @Override
    public BonDeCommandePanierMoyenAccesDTO toDTO(BonDeCommandePanierMoyenAcces entity) {
        if ( entity == null ) {
            return null;
        }

        BonDeCommandePanierMoyenAccesDTO bonDeCommandePanierMoyenAccesDTO = new BonDeCommandePanierMoyenAccesDTO();

        bonDeCommandePanierMoyenAccesDTO.setPanierCommandeMoyenAccesId( entityPanierCommandeMoyenAccesId( entity ) );
        bonDeCommandePanierMoyenAccesDTO.setId( entity.getId() );

        return bonDeCommandePanierMoyenAccesDTO;
    }

    @Override
    public BonDeCommandePanierMoyenAcces toEntity(BonDeCommandePanierMoyenAccesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        BonDeCommandePanierMoyenAcces bonDeCommandePanierMoyenAcces = new BonDeCommandePanierMoyenAcces();

        bonDeCommandePanierMoyenAcces.setId( dto.getId() );

        return bonDeCommandePanierMoyenAcces;
    }

    private Long entityPanierCommandeMoyenAccesId(BonDeCommandePanierMoyenAcces bonDeCommandePanierMoyenAcces) {
        if ( bonDeCommandePanierMoyenAcces == null ) {
            return null;
        }
        PanierCommandeMoyenAcces panierCommandeMoyenAcces = bonDeCommandePanierMoyenAcces.getPanierCommandeMoyenAcces();
        if ( panierCommandeMoyenAcces == null ) {
            return null;
        }
        Long id = panierCommandeMoyenAcces.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
