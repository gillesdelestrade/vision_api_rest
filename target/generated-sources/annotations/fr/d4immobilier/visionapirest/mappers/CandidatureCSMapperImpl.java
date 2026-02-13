package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CandidatureCSDTO;
import fr.d4immobilier.visionapirest.entities.Assemblee;
import fr.d4immobilier.visionapirest.entities.CandidatureCS;
import fr.d4immobilier.visionapirest.entities.Coproprietaire;
import fr.d4immobilier.visionapirest.entities.Resolution;
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
public class CandidatureCSMapperImpl implements CandidatureCSMapper {

    @Override
    public List<CandidatureCSDTO> toDTOList(List<CandidatureCS> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CandidatureCSDTO> list = new ArrayList<CandidatureCSDTO>( entities.size() );
        for ( CandidatureCS candidatureCS : entities ) {
            list.add( toDTO( candidatureCS ) );
        }

        return list;
    }

    @Override
    public CandidatureCSDTO toDTO(CandidatureCS entity) {
        if ( entity == null ) {
            return null;
        }

        CandidatureCSDTO candidatureCSDTO = new CandidatureCSDTO();

        candidatureCSDTO.setAssembleeId( entityAssembleeId( entity ) );
        candidatureCSDTO.setCoproprietaireId( entityCoproprietaireId( entity ) );
        candidatureCSDTO.setResolutionId( entityResolutionId( entity ) );
        candidatureCSDTO.setId( entity.getId() );
        candidatureCSDTO.setNom( entity.getNom() );
        candidatureCSDTO.setPrenom( entity.getPrenom() );
        candidatureCSDTO.setEstCandidat( entity.getEstCandidat() );

        return candidatureCSDTO;
    }

    @Override
    public CandidatureCS toEntity(CandidatureCSDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CandidatureCS candidatureCS = new CandidatureCS();

        candidatureCS.setId( dto.getId() );
        candidatureCS.setNom( dto.getNom() );
        candidatureCS.setPrenom( dto.getPrenom() );
        candidatureCS.setEstCandidat( dto.getEstCandidat() );

        return candidatureCS;
    }

    private Long entityAssembleeId(CandidatureCS candidatureCS) {
        if ( candidatureCS == null ) {
            return null;
        }
        Assemblee assemblee = candidatureCS.getAssemblee();
        if ( assemblee == null ) {
            return null;
        }
        Long id = assemblee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityCoproprietaireId(CandidatureCS candidatureCS) {
        if ( candidatureCS == null ) {
            return null;
        }
        Coproprietaire coproprietaire = candidatureCS.getCoproprietaire();
        if ( coproprietaire == null ) {
            return null;
        }
        Long id = coproprietaire.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityResolutionId(CandidatureCS candidatureCS) {
        if ( candidatureCS == null ) {
            return null;
        }
        Resolution resolution = candidatureCS.getResolution();
        if ( resolution == null ) {
            return null;
        }
        Long id = resolution.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
