package fr.d4immobilier.visionapirest.mappers;

import fr.d4immobilier.visionapirest.dto.FichierDecompteChargeDTO;
import fr.d4immobilier.visionapirest.entities.Assemblee;
import fr.d4immobilier.visionapirest.entities.FichierDecompteCharge;
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
public class FichierDecompteChargeMapperImpl implements FichierDecompteChargeMapper {

    @Override
    public List<FichierDecompteChargeDTO> toDTOList(List<FichierDecompteCharge> entities) {
        if ( entities == null ) {
            return null;
        }

        List<FichierDecompteChargeDTO> list = new ArrayList<FichierDecompteChargeDTO>( entities.size() );
        for ( FichierDecompteCharge fichierDecompteCharge : entities ) {
            list.add( toDTO( fichierDecompteCharge ) );
        }

        return list;
    }

    @Override
    public FichierDecompteChargeDTO toDTO(FichierDecompteCharge entity) {
        if ( entity == null ) {
            return null;
        }

        FichierDecompteChargeDTO fichierDecompteChargeDTO = new FichierDecompteChargeDTO();

        fichierDecompteChargeDTO.setAssembleeId( entityAssembleeId( entity ) );
        fichierDecompteChargeDTO.setId( entity.getId() );

        return fichierDecompteChargeDTO;
    }

    @Override
    public FichierDecompteCharge toEntity(FichierDecompteChargeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        FichierDecompteCharge fichierDecompteCharge = new FichierDecompteCharge();

        fichierDecompteCharge.setId( dto.getId() );

        return fichierDecompteCharge;
    }

    private Long entityAssembleeId(FichierDecompteCharge fichierDecompteCharge) {
        if ( fichierDecompteCharge == null ) {
            return null;
        }
        Assemblee assemblee = fichierDecompteCharge.getAssemblee();
        if ( assemblee == null ) {
            return null;
        }
        Long id = assemblee.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
