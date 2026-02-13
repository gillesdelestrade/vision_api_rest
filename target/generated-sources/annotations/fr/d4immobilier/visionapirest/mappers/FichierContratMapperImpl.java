package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierContratDTO;
import fr.d4immobilier.visionapirest.entities.ContratFournisseur;
import fr.d4immobilier.visionapirest.entities.FichierContrat;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-12T18:34:52+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 24.0.2 (Azul Systems, Inc.)"
)
@ApplicationScoped
public class FichierContratMapperImpl implements FichierContratMapper {

    @Override
    public List<FichierContratDTO> toDTOList(List<FichierContrat> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierContratDTO> list = new ArrayList<FichierContratDTO>( entities.size() );
        for ( FichierContrat fichierContrat : entities ) {
            list.add( toDTO( fichierContrat ) );
        }

        return list;
    }

    @Override
    public FichierContratDTO toDTO(FichierContrat entity) {
        if ( entity == null ) {
            return null;
        }

        FichierContratDTO fichierContratDTO = new FichierContratDTO();

        fichierContratDTO.setContratFournisseurId( entityContratFournisseurId( entity ) );
        fichierContratDTO.setId( entity.getId() );

        return fichierContratDTO;
    }

    @Override
    public FichierContrat toEntity(FichierContratDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierContrat fichierContrat = new FichierContrat();

        fichierContrat.setId( dto.getId() );

        return fichierContrat;
    }

    private Long entityContratFournisseurId(FichierContrat fichierContrat) {
        if ( fichierContrat == null ) {
            return null;
        }
        ContratFournisseur contratFournisseur = fichierContrat.getContratFournisseur();
        if ( contratFournisseur == null ) {
            return null;
        }
        Long id = contratFournisseur.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
