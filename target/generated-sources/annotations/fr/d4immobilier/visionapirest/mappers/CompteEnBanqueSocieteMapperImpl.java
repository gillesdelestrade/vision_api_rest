package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.CompteEnBanqueSocieteDTO;
import fr.d4immobilier.visionapirest.entities.CompteEnBanqueSociete;
import fr.d4immobilier.visionapirest.entities.Societe;
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
public class CompteEnBanqueSocieteMapperImpl implements CompteEnBanqueSocieteMapper {

    @Override
    public List<CompteEnBanqueSocieteDTO> toDTOList(List<CompteEnBanqueSociete> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CompteEnBanqueSocieteDTO> list = new ArrayList<CompteEnBanqueSocieteDTO>( entities.size() );
        for ( CompteEnBanqueSociete compteEnBanqueSociete : entities ) {
            list.add( toDTO( compteEnBanqueSociete ) );
        }

        return list;
    }

    @Override
    public CompteEnBanqueSocieteDTO toDTO(CompteEnBanqueSociete entity) {
        if ( entity == null ) {
            return null;
        }

        CompteEnBanqueSocieteDTO compteEnBanqueSocieteDTO = new CompteEnBanqueSocieteDTO();

        compteEnBanqueSocieteDTO.setSocieteId( entitySocieteId( entity ) );
        compteEnBanqueSocieteDTO.setId( entity.getId() );

        return compteEnBanqueSocieteDTO;
    }

    @Override
    public CompteEnBanqueSociete toEntity(CompteEnBanqueSocieteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CompteEnBanqueSociete compteEnBanqueSociete = new CompteEnBanqueSociete();

        compteEnBanqueSociete.setId( dto.getId() );

        return compteEnBanqueSociete;
    }

    private Long entitySocieteId(CompteEnBanqueSociete compteEnBanqueSociete) {
        if ( compteEnBanqueSociete == null ) {
            return null;
        }
        Societe societe = compteEnBanqueSociete.getSociete();
        if ( societe == null ) {
            return null;
        }
        Long id = societe.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
