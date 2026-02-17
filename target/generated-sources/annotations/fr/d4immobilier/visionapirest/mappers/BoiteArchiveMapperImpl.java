package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.BoiteArchiveDTO;
import fr.d4immobilier.visionapirest.entities.BoiteArchive;
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
public class BoiteArchiveMapperImpl implements BoiteArchiveMapper {

    @Override
    public List<BoiteArchiveDTO> toDTOList(List<BoiteArchive> entities) {
        if ( entities == null ) {
            return null;
        }

        List<BoiteArchiveDTO> list = new ArrayList<BoiteArchiveDTO>( entities.size() );
        for ( BoiteArchive boiteArchive : entities ) {
            list.add( toDTO( boiteArchive ) );
        }

        return list;
    }

    @Override
    public BoiteArchiveDTO toDTO(BoiteArchive entity) {
        if ( entity == null ) {
            return null;
        }

        BoiteArchiveDTO boiteArchiveDTO = new BoiteArchiveDTO();

        boiteArchiveDTO.setId( entity.getId() );
        boiteArchiveDTO.setNom( entity.getNom() );

        return boiteArchiveDTO;
    }

    @Override
    public BoiteArchive toEntity(BoiteArchiveDTO dto) {
        if ( dto == null ) {
            return null;
        }

        BoiteArchive boiteArchive = new BoiteArchive();

        boiteArchive.setId( dto.getId() );
        boiteArchive.setNom( dto.getNom() );

        return boiteArchive;
    }
}
