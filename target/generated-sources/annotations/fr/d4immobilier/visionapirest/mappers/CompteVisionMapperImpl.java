package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CompteVisionDTO;
import fr.d4immobilier.visionapirest.entities.CompteVision;
import fr.d4immobilier.visionapirest.entities.ProfilCompteVision;
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
public class CompteVisionMapperImpl implements CompteVisionMapper {

    @Override
    public List<CompteVisionDTO> toDTOList(List<CompteVision> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CompteVisionDTO> list = new ArrayList<CompteVisionDTO>( entities.size() );
        for ( CompteVision compteVision : entities ) {
            list.add( toDTO( compteVision ) );
        }

        return list;
    }

    @Override
    public CompteVisionDTO toDTO(CompteVision entity) {
        if ( entity == null ) {
            return null;
        }

        CompteVisionDTO compteVisionDTO = new CompteVisionDTO();

        compteVisionDTO.setProfil( profilToString( entity.getProfil() ) );
        compteVisionDTO.setId( entity.getId() );
        compteVisionDTO.setLogin( entity.getLogin() );
        compteVisionDTO.setMotDePasse( entity.getMotDePasse() );
        compteVisionDTO.setActif( entity.getActif() );
        compteVisionDTO.setCodeActivation( entity.getCodeActivation() );

        return compteVisionDTO;
    }

    @Override
    public CompteVision toEntity(CompteVisionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CompteVision compteVision = new CompteVision();

        compteVision.setId( dto.getId() );
        compteVision.setLogin( dto.getLogin() );
        compteVision.setMotDePasse( dto.getMotDePasse() );
        if ( dto.getProfil() != null ) {
            compteVision.setProfil( Enum.valueOf( ProfilCompteVision.class, dto.getProfil() ) );
        }
        compteVision.setActif( dto.getActif() );
        compteVision.setCodeActivation( dto.getCodeActivation() );

        return compteVision;
    }
}
